    package fhw

    import spock.lang.*
    import javax.enterprise.inject.spi.BeanManager
    import javax.enterprise.inject.spi.InjectionTarget
    import org.jboss.weld.environment.se.Weld
    import org.jboss.weld.environment.se.WeldContainer
    import javax.enterprise.context.spi.CreationalContext
    import javax.enterprise.inject.spi.AnnotatedType

    class WeldSpec
        extends Specification
    {
        def Weld weld
        def WeldContainer container
        
        def setup()
        {
            weld = new Weld()
            container = weld.initialize()
            BeanManager beanManager = container.getBeanManager()
            CreationalContext<? extends WeldSpec> creationalContext = beanManager.createCreationalContext(null)
            AnnotatedType<? extends WeldSpec> annotatedType = beanManager.createAnnotatedType((Class<? extends WeldSpec>) this.getClass())
            InjectionTarget<? extends WeldSpec> injectionTarget = beanManager.createInjectionTarget(annotatedType)
            injectionTarget.inject(this, creationalContext);            
        }

        def cleanup()
        {
            if(weld)
            {
                weld.shutdown()
            }
        }
    }
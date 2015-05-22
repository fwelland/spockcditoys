package fhw.spock;
import org.spockframework.runtime.extension.AbstractAnnotationDrivenExtension;
import org.spockframework.runtime.model.SpecInfo;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.spockframework.runtime.model.FeatureInfo;
import org.spockframework.runtime.model.MethodInfo;


public class TigExtension
    extends AbstractAnnotationDrivenExtension<Tig>
{
    private Weld weld;
    private WeldContainer container;

    @Override
    public void visitSpecAnnotation(Tig tig, SpecInfo spec)
    {
        System.out.println("visitSpecAnnotation for " + spec.getReflection().getName());
        weld = new Weld();
        container = weld.initialize();
        container.instance().select( spec.getReflection() ).get();
    }

    @Override
    public void visitFixtureAnnotation(Tig tig, MethodInfo fixtureMethod)
    {
        System.out.println("visitFixtureAnnotation for " + fixtureMethod.getName());
    }

    @Override
    public void visitFeatureAnnotation(Tig tig, FeatureInfo feature)
    {
        System.out.println("visitFeatureAnnotation for " + feature.getSpec().getReflection().getName());
        weld = new Weld();
        container = weld.initialize();
        container.instance().select( feature.getSpec().getReflection() ).get();
    }


//    @Override
//    public void visitSpec(SpecInfo spec)
//    {
//        System.out.println("visitSpec for " + spec.getName());
//        weld = new Weld();
//        container = weld.initialize();
//        container.instance().select( spec.getReflection() ).get();
//    }

}

package fhw

import org.junit.runner.RunWith
import spock.lang.Specification
import org.jboss.weld.environment.se.Weld
import org.jboss.weld.environment.se.WeldContainer

class WeldSpecification
    extends Specification
{

    def Weld weld
    def WeldContainer container
    
    def setupSpec() 
    {
        println "setupSpec"
    }       
    
    def setup()
    {
        print "WeldSpecification::setup..."
        weld = new Weld()
        container = weld.initialize()
        println(this.getClass().getName())
        //container.instance().select(this.class).get()
        container.instance().select(this.class)
    }

    def cleanup()
    {
        println "cleaning"
        if(weld)
        {
            println "calling shutdown"
            weld.shutdown()
        }
    }
}

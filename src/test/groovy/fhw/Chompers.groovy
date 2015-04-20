package fhw

import spock.lang.Specification

import javax.inject.Inject
import org.jboss.weld.environment.se.Weld
import org.jboss.weld.environment.se.WeldContainer
import spock.lang.Shared

class Chompers
    extends Specification
{
    def setupSpec() 
    {
                weld = new Weld()
        container = weld.initialize()
        println(this.getClass().getName())
        //container.instance().select(this.class).get()
        container.instance().select(this.class)        
    }     
    def cleanupSpec()
    {}  
    
    @Shared
    def Weld weld
    @Shared
    def WeldContainer container
    
    @Inject
    def SomethingToTest somethingToTest;
 
    def setup()
    {

    }
    
    def "my first Test"()
    {
        given:
            println('given I used weld wrapper spec From spock')


        when:
            println('when I do something, in this case, like just haveing @Inject annotation')

        then:
            somethingToTest
    }
    
//    @Inject
//    def setSomethingToTest(SomethingToTest stt)
//    {
//        println "setting"
//        somethingToTest = stt;
//        println "is somethingToTest null now??? " + (null == somethingToTest)
//    }

//    
//    def SomethingToTest getSomethingToTest()
//    {
//        println "setting"
//        return(somethingToTest)
//    }
}


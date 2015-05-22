package fhw

import spock.lang.Specification

import javax.inject.Inject
//import org.jboss.weld.environment.se.Weld
//import org.jboss.weld.environment.se.WeldContainer
//import spock.lang.Shared
import fhw.spock.*

@Tig
public class Chompers
    extends Specification
{
//    def Weld weld
//    def WeldContainer container

    def setup()
    {
        println "setup (instance " + this + ") and somethingToTest is null " + (null == somethingToTest)
    }

    @Inject
    def SomethingToTest somethingToTest;

//    @Inject
//    def setSomethingToTest(SomethingToTest sst)
//    {
//        somethingToTest = sst
//        println "setter fired  and somethingToTest is null?  " + (null == somethingToTest)
//    }


    def "my first Test"()
    {
        given:
            println "given I used weld wrapper spec From spock (instance " + this + ")"

        when:
            println "when I do something, in this case, like just haveing @Inject annotation"

        then:
            somethingToTest
    }
}


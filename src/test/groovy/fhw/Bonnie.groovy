    package fhw

    import spock.lang.*
    import javax.inject.Inject
    import fhw.spock.*

    public class Bonnie
        extends WeldSpec
    {
        @Inject 
        def SomethingToTest somethingToTest;

        def "my silly first cdi-spock test"()
        {        
            when:
                def s = somethingToTest.upShift("fred")

            then:
                "FRED" == s
        }
    }

//package fhw
//
//import spock.lang.Shared
//import javax.inject.Inject
//
//class Floopy
//    extends Specification
//{
//    
//    def Weld weld
//    def WeldContainer container
//    def SomethingToTest somethingToTest;
// 
//    def setup()
//    {
//        println "setup in Floopy"
//        
//        
//        println "is somethingToTest null??? " + (null == somethingToTest)
//    }
//    
//    def "my first Test"()
//    {
//        given:
//            println('given I used weld wrapper spec From spock')
//
//
//        when:
//            println('when I do something, in this case, like just haveing @Inject annotation')
//
//        then:
//            somethingToTest
//    }
//    
//    @Inject
//    def setSomethingToTest(SomethingToTest stt)
//    {
//        println "setting"
//        somethingToTest = stt;
//        println "is somethingToTest null now??? " + (null == somethingToTest)
//    }
//
////    
////    def SomethingToTest getSomethingToTest()
////    {
////        println "setting"
////        return(somethingToTest)
////    }
//}
//

//package fhw
//
//import spock.lang.*
//import javax.inject.Inject
//import org.junit.Test
//import org.junit.runner.RunWith
//import org.jglue.cdiunit.CdiRunner
//
//@RunWith(CdiRunner.class)
//class SomethingToTestSpec
//    extends Specification
//{
//    @Inject
//    SomethingToTest somethingToTest;
//
//    def setup() {}          // run before every feature method
//    def cleanup() {}        // run after every feature method
//    def setupSpec() {}     // run before the first feature method
//    def cleanupSpec() {}   // run after the last feature method
//
//    @Test
//    def "my first Test"()
//    {
//        given:
//            println('given I used CDIUnit From spock')
//
//        when:
//            println('when I do something, in this case just have @Inject do stuff')
//
//        then:
//            somethingToTest
//    }
//
////  def "minimum of #a and #b is #c"() {
////    expect:
////    Math.min(a, b) == c
////
////    where:
////    a | b || c
////    3 | 7 || 3
////    5 | 4 || 4
////    9 | 9 || 9
////  }
//}
//

package fhw

import spock.lang.*


class DifferentThingToTest
    extends Specification
{   
    def setup() {}          // run before every feature method
    def cleanup() {}        // run after every feature method
    def setupSpec() {}     // run before the first feature method
    def cleanupSpec() {}   // run after the last feature method
    
    def "another test"()
    {
        given:
            println('G: dummy')
            
        when:
            println('W:  not much')
            
        then:
            Boolean.TRUE
    }
}


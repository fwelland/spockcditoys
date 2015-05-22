package fhw

import spock.lang.Specification
import java.lang.reflect.Method
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.api.easymock.PowerMock
import org.easymock.EasyMock


@PrepareForTest(Method.class)
class Bender 
    extends Specification

{
	
    
    def "testing a java.lang.reflection.Method"()
    {
        given:
            def mock = PowerMock.createMock(Method.class)
            EasyMock.expect(mock.getName()).andReturn("fred")            
            replay(mock)
            
        when:
            println "when something"

        then:
            "fred" == mock.getName()
    }
}


//package fhw
//
//import org.junit.runner.RunWith
//import spock.lang.Specification
//import org.apache.deltaspike.cdise.api.CdiContainer
//import org.apache.deltaspike.cdise.api.CdiContainerLoader
//import org.jglue.cdiunit.CdiRunner
//
//class CDISpecification
//    extends Specification
//{
//
//    def CdiContainer cdiContainer
//
//    def setup()
//    {
//        cdiContainer = CdiContainerLoader.getCdiContainer();
//        cdiContainer.boot();
//        cdiContainer.getContextControl().startContexts();
//    }
//
//    def cleanup()
//    {
//        if(cdiContainer)
//        {
//            cdiContainer.shutdown()
//        }
//    }
//}
//

///**
// * Copyright (c) 2015 Promontory Interfinancial Network, LLC *
// */
//package fhw;
//
//import org.apache.deltaspike.cdise.api.CdiContainer;
//import org.apache.deltaspike.cdise.api.CdiContainerLoader;
//import org.apache.deltaspike.core.api.provider.BeanProvider;
//import org.junit.runners.BlockJUnit4ClassRunner;
//import org.junit.runners.model.InitializationError;
//
//public class DeltaSpikeCDIRunner
//    extends BlockJUnit4ClassRunner
//{
//
//    static
//    {
//        CdiContainer cdiContainer = CdiContainerLoader.getCdiContainer();
//        cdiContainer.boot();
//    }
//
//    public DeltaSpikeCDIRunner(Class<?> clazz) throws InitializationError
//    {
//        super(clazz);
//    }
//
//    @Override
//    protected Object createTest() throws Exception
//    {
//        return BeanProvider.getContextualReference(getTestClass().getJavaClass());
//    }
//}

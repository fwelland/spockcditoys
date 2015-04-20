///** Copyright (c) 2015 Promontory Interfinancial Network, LLC **/
//package fhw;
//
//import javax.inject.Inject;
//import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
//import org.jglue.cdiunit.CdiRunner;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertEquals;
//
//
//@RunWith(CdiRunner.class)
//public class SimpleInjectTestDSRunner
//{
//    @Inject
//    private SomethingToTest somethingToTest;
//
//    @Test
//    public void simpleExistsTest()
//    {
//        assertNotNull("looks like @Inject failed", somethingToTest);
//    }
//
//    @Test
//    public void upShiftSimple()
//    {
//        String expected  = "LOWER";
//        String s = somethingToTest.upShift("lower");
//        assertEquals(String.format("should be %s but it is %s", expected,s) , expected, s);
//    }
//}

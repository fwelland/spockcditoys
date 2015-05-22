    package fhw;

    import javax.annotation.PostConstruct;
    import javax.inject.Named;

    @Named
    public class SomethingToTest
    {
        public SomethingToTest() {}

        @PostConstruct
        private void init()
        {

        }

        public String upShift(String in)
        {
            String s = null;
            if(null != in)
            {
                s = in.toUpperCase();
            }
            return(s);
        }

    }

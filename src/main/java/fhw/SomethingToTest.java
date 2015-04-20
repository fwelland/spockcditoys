package fhw;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;


@Stateless
public class SomethingToTest
{

    public SomethingToTest() {}

    @PostConstruct
    private void init()
    {
        System.out.println("post construction");
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

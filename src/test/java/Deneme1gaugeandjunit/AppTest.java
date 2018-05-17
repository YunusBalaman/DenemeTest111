package Deneme1gaugeandjunit;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AppTest 
{   KureninAlaniveHacmi test;
    @Before
    public void Before(){
        test = new KureninAlaniveHacmi();
    }
    @After
    public void After(){
        test = null;
    }
    @Test
    public void KureAlantest1(){
        //KureninAlaniveHacmi test = new kureninAlaniveHacmi();
        double result = test.kureninAlani();
        Assert.assertEquals("Kurenin alani hatalı hesaplandi",12.56,result,0.001);

    }
    @Test
    public void KureAlantest2(){
        int result = test.kureninAlani(3);
        Assert.assertEquals("Kurenin alani hatalı hesaplandi",108,result);

    }
    @Test
    public void KureAlantest3(){
        double result = test.kureninAlani(3.2);
        Assert.assertEquals("Kurenin alani hatalı hesaplandi",128.614,result,0.001);

    }
    @Test
    public void KureHacimtest1(){
        double result = test.kureninHacmi();
        Assert.assertEquals("Kurenin hacmi hatalı hesaplandi",4.186,result,0.001);

    }

    @Test
    public void KureHacimtest2(){
        int result = test.kureninHacmi(2);
        Assert.assertEquals("Kurenin hacmi hatalı hesaplandi",32,result);

    }
    @Test
    public void KureHacimtest3(){
        double result = test.kureninHacmi(3.2);
        Assert.assertEquals("Kurenin hacmi hatalı hesaplandi",137.188,result,0.001);

    }
}

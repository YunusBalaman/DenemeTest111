package Deneme1gaugeandjunit;

import Deneme1gaugeandjunit.KureninAlaniveHacmi;
import com.thoughtworks.gauge.Step;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class Sphere {
  KureninAlaniveHacmi test;

  @Step("Create Volume and surface area service")
  public void createVService() {
    test = new KureninAlaniveHacmi();
  }

  @Step({"Volume of a sphere double radius <r> expect result <x>"})
  public void volume1(double r,double x) {
    double result = test.kureninHacmi(r);
    Assert.assertEquals(x, result, 0.001);
  }

  @Step({"Volume of a sphere integer radius <r> expect result <x>"})
  public void volume2(int r, int x) {
    int result = test.kureninHacmi(r);
    Assert.assertEquals(x, result);
  }

  @Step({"Surface area of a sphere double radius <r> expect result <x>"})
  public void area1(double r, double x) {
    double result = test.kureninAlani(r);
    Assert.assertEquals(x, result, 0.001);
  }

  @Step({"Surface area of a sphere integer radius <r> expect result <x>"})
  public void area2(int r, int x) {
    int result = test.kureninAlani(r);
    Assert.assertEquals(x, result);
  }



  @Step("Remove Volume and surface area service")
  public void removeVService() {
    test = null;
  }
}

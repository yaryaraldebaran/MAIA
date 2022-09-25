package ujian.ujiankelima;

import java.util.Iterator;

import org.testng.annotations.Test;

import ujian.ujiankelima.ifpackage.RandomDynamic;

public class RandomDynamicTest {

  @Test
  public void randomDynamicTest() {
    RandomDynamic rdc = new RandomDynamic();
    double[] b = rdc.randomDynamicDouble(1, 10, 10);
    for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
    
  }
}

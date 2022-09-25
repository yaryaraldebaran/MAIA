package ujian.ujiankelima.ifpackage;

import java.util.Random;
//file test : /src/test/ujian/ujiankelima/RandomDynamicTest.java
public class RandomDynamic {
	Random rnd = new Random();
	public double[] randomDynamicDouble(int indexAwal, int indexAkhir, int jumlahData) {
		double[] doNext= new double[jumlahData];
		for(int i=0;i<jumlahData;i++)
		{
			doNext[i] = rnd.nextDouble(indexAwal,indexAkhir);
		}
		return doNext;
	}
	public int[] randomDynamicInteger(int indexAwal, int indexAkhir, int jumlahData) {
		int[] intNext= new int[jumlahData];
		for(int i=0;i<jumlahData;i++)
		{
			intNext[i] = rnd.nextInt(indexAwal,indexAkhir);
		}
		return intNext;
	}
}

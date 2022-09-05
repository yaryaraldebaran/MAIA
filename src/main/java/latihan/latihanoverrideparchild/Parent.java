package latihan.latihanoverrideparchild;

public class Parent {
	int a =9;
	public void methodSatu(int a) {
		System.out.println("ini dari parent "+a);
	}
	public void methodDua(int b) {
		System.out.println("ini dari paent "+this.a);
	}
}

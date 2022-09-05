package latihan.latihanoverrideparchild;

public class Child extends Parent {
	int j = 1002;
	public void methodSatu(String a, int b) {
		System.out.println("ini method override "+a+b);
	}
	public void methodTiga() {
		System.out.println("ini method tiga "+super.a);
	}
	public void methodEmpat() {
		System.out.println("ini method this "+this.a);
		this.methodSatu("ini dari this",8);
	}
	
}

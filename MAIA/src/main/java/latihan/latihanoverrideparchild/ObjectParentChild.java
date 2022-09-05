package latihan.latihanoverrideparchild;


public class ObjectParentChild {

	public static void main(String[] args) {
		//object child
		Child anak = new Child();
		anak.methodSatu(9);
		anak.methodTiga();
		anak.methodEmpat();
		//object parent
		Parent ortu = new Child();
		ortu.methodSatu(79);
	}

}

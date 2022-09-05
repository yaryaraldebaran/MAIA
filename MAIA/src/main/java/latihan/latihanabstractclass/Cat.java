package latihan.latihanabstractclass;

public class Cat extends Animals {
	public Cat() {
		super ("Kucing");
		}
	
		public Cat(String nama) {
		super (nama);
		}
		
		public void suara() {
		System.out.println("Meeoooow...");
		}
		
		public void voice() {
			System.out.println("Cats have a voice!! ");
		}

		@Override
		public void jalan(int langkah) {
			System.out.println("Jalan kaki");
		}

}

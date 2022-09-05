package latihan.latihanlambda;

public class SayMain {

	public static void main(String[] args) {
		//implement the method
		Sayable s =()->{
			return "ini adalah lambda expression";
		};
		CountzAble c = (p)->{System.out.println("ini adalah countable"+p);;};
		System.out.println(s.say());
		c.count(90);

	}

}

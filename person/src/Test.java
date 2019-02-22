
public class Test {

	public static void main(String[] args) {

		Person taro =new Person();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);
		taro.talk();
		taro.walk();
		taro.run();

		Person jiro =new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person hanako =new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		System.out.println(hanako.name);
		System.out.println(hanako.age);

		Person rina =new Person();
		rina.name="小沼梨奈";
		rina.age=23;
		System.out.println(rina.name);
		System.out.println(rina.age);


		//メゾットの呼び出し
		Person abc=new Person();
		System.out.println(abc.getNumber());

		Person efg=new Person();
		System.out.println(efg.getAddress());

		Robot hij =new Robot();
		System.out.println(hij.getName());


		Robot aibo =new Robot();
		aibo.name="aibo";
		System.out.println(aibo.name);

		Robot asimo =new Robot();
		asimo.name="asimo";
		System.out.println(asimo.name);

		Robot pepper =new Robot();
		pepper.name="pepper";
		System.out.println(pepper.name);

	}
}

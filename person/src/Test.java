
public class Test{

	public static void main(String[] args){


		Person taro =new Person();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);
		taro.talk();
		taro.walk();
		taro.run();
		//演習⑥


		//演習②
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


		//演習④
		Person abc =new Person();
		System.out.println(abc.getNumber());

		Person efg =new Person();
		System.out.println(efg.getAddress());


		//演習⑧
		Robot aibo =new Robot();
		aibo.name="aibo";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo =new Robot();
		asimo.name="asimo";
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper =new Robot();
		pepper.name="pepper";
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();

	}
}
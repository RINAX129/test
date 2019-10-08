
public class Test{

	public static void main(String[] args){


		Person taro =new Person(); //Person()をインスタンス化して変数taroに代入
		taro.name="山田太郎"; //.を使ってnameを呼び出す
		taro.age=20; //ageを呼び出す

		System.out.println(taro.name); //山田太郎が出力される
		System.out.println(taro.age); //20が出力される


		//演習⑥ Personクラスのメソッドを呼び出す
		taro.talk(); //山田太郎が話すが出力される
		taro.walk(); //山田太郎が歩くが出力される
		taro.run(); //山田太郎が走るが出力される


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
		Person number =new Person();
		System.out.println(number.getNumber());

		Person address =new Person();
		System.out.println(address.getAddress());


		//演習⑧ Robotクラスのメソッドをインスタンス化して出力できるようにする
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

public class Test {

	public static void main(String[]args) {

		//コンストラクタ①を使った場合
		Person taro=new Person();
		taro.name="taro";
		taro.age=18;
		System.out.println(taro.name);
		System.out.println(taro.age);


		//コンストラクタ②を使った場合。nameにjiroをageに20をあらかじめプログラム
		Person jiro=new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);


		//コンストラクタ③を使ってインスタンス化
		Person saburo=new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);


		//コンストラクタ④を使ってインスタンス化
		Person nanasi=new Person("名前なし",25);
		System.out.println(nanasi.name);
		System.out.println(nanasi.age);


		//コンストラクタ⑤を使ってインスタンス化
		Person hanako=new Person("hanako",17);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}
}

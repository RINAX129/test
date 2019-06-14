
public class Person {

	//nameとageを初期化
	public String name=null;
	public int age=0;

	public Person(){} //コンストラクタ①。他の型のコンストラクタを宣言しない場合は要らない。

	//コンストラクタ②。初期値をあらかじめプログラムできる
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}

	//コンストラクタ③
	public Person(String name) {
		this.name=name;
		this.age=0;
	}

	//コンストラクタ④
	public Person(int age) {
		this.name="名前なし";
		this.age=age;
	}

	//コンストラクタ⑤
	public Person(int age,String name) {
		this.name=name;
		this.age=age;
	}

}

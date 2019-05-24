
public class Practice3 {

	public static void main(String[] args){

		//練習3-3
		int seibetsu =0;
		int age = 50;
		System.out.println("こんにちは");
		if(seibetsu == 0){
			System.out.println("私は男です。");
		}else{
			System.out.println("私は女です。");
		}
		if(seibetsu == 0){
			System.out.println(age+"歳です。");
		}
		System.out.println("よろしくおねがいします。");


		//練習3-4
		boolean tenki = true;
		if(tenki == true){
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		}else{
			System.out.println("DVDを見ます");
			System.out.println("寝ます");
		}


		//練習3-5
		System.out.println("[メニュー] 1:検索 2:登録 3:削除 4:変更");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch(selected){
			case 1:
				System.out.println("検索します");
				break;
			case 2:
				System.out.println("登録します");
				break;
			case 3:
				System.out.println("削除します");
				break;
			case 4:
				System.out.println("変更します");
				break;
		}


		//練習3-6
		System.out.println("【数当てゲーム】");
		int ans = new java.util.Random().nextInt(10); //0～9までの乱数
		for(int i=1; i<5; i++){ //5回までループ
			System.out.println("0～9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt(); //キーボードから受けた数字を変数numに格納
			if(num == ans){
				System.out.println("アタリ！");
				break; //アタリが出たら終了できるようbreakで繰り返しを止める
			}else{
				System.out.println("違います。");
			}
		}
		System.out.println("ゲームを終了します");
	}
}

public class Practice2 {

	public static void main(String[] args){

		//練習2-3
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine(); //キーボードからの文字入力の受付 変数nameに格納
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine(); //変数ageStringに格納
		int age = Integer.parseInt(ageString); //変数ageStringをint型に変換 変数ageに代入
		int fortune = new java.util.Random().nextInt(4); //0-3までの乱数 変数fortuneに代入
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.println(ageString+"歳の"+name+"さん、あなたの運記番号は"+fortune+"です");
		System.out.println("1:大吉 2中吉: 3:吉 4:凶");

	}
}

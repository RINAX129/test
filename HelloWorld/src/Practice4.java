
public class Practice4 {

	public static void main(String[] args){
		//練習4-1
		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];

		//練習4-2
		int[] moneyList = {121902,8302,55100};
		for(int i=0; i<moneyList.length; i++){
			System.out.println(moneyList[i]);
		}
		for(int value : moneyList){
			System.out.println(value);
		}

		//練習4-4
		int[] numbers = {3,4,9};
		System.out.println("1桁の文字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int j : numbers){
			if(j == input){ //number配列の要素を1つずつ取り出してinputとイコール関係か判定
				System.out.println("アタリ！");
			}else{
				System.out.println("ハズレ！"); //「ハズレ！」を出力するのを追加
				break; //breakでループを抜ける
			}
		}
	}
}

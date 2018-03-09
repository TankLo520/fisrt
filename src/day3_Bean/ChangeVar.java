package day3_Bean;

public class ChangeVar {

	public static void main(String[] args) {
		int s = sum(1,3,4,5,6,5,8);
		System.out.println(s);
	}

	public static int sum(int... num) {
		int sumNum = 0;
		for (int i = 0; i < num.length; i++) {
			sumNum += num[i];
		}
		return sumNum;
	}

}

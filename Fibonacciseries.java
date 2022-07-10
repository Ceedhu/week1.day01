package week1.day01.assignments;

public class Fibonacciseries {

	public static void main(String[] args) {
		
		int firstnum=1, secondnum=1;
		int sum, n=7;
		System.out.println(firstnum);
		System.out.println("");
		System.out.println(secondnum);
		for(int i=3; i<=n;i++)
		{
			sum=firstnum+secondnum;
			System.out.println(sum);
			firstnum=secondnum;
			secondnum=sum;
		}
		
		
		// TODO Auto-generated method stub

	}

}

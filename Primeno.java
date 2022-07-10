package week1.day01.assignments;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10,i;
		boolean prime=true;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				prime=false;
				break;
			}
		}
			System.out.println(prime);
		
	}

}

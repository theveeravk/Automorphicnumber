
public class Automorphicnumber {

	public static void main(String[] args)
	{
		int no =5;
		int sqr = no*no;
		int count =0;
		int tempno = no;
		while(no>0)
		{
			count++;
			no = no/10;
			
		}
		
		int lastdigit =(int) (sqr%(Math.pow(10, count)));
		
		if(tempno == lastdigit)
		{
			System.out.println("automorphic number");
		}
		else
		{
			System.out.println("not automorphic number");
		}

	}

}

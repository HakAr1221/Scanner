import java.util.Scanner;

class  ScannerDEmo1
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter students marks: ");
		for(int i=0;i<=4;i++)
		{
			a[i] = s.nextInt();
		}
		// System.out.println("array length" +a.length);
		System.out.println("Student marks are: ");
		for(int i=0;i<=4;i++)    
		{
			System.out.println(i+ " Index students mark is " + a[i]); 
		} 
		
	}
}

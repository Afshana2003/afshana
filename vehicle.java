import java.util.Scanner;
public class vehicle
{
	public static void main(String[] args)
	{
		double ab,cd,a,it,mo,em;
		Scanner input =new Scanner (System.in);
		System.out.println("amount            ");
		ab = input.nextDouble();
		System.out.println("dowm payment      ");
		cd = input.nextDouble();
		System.out.println("total            ");
		a = ab - cd;
		System.out.println("interest          ");
		it = a*4/100*3;
		System.out.println("month             ");
		em = input.nextDouble();
		System.out.println("emi                ");
		mo = (a+it)/em;
		
		
		
		
		System.out.println("=========================================================================== ");
		System.out.println("   EMI CALCULATOR     ");
		System.out.println("****************************************************************************");
		System.out.println("   AMOUNT        "+ab);
		System.out.println("  DOWNPAYMENT    "+cd);
		System.out.println("*****************************************************************************");
		System.out.println("INTEREST RATE        "+it);
		System.out.println("**************************************************************************** ");
		System.out.println("MONTH          "+em);
		System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
		System.out.println("TOTAL          "+a);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");	
		System.out.println("   E M I                    ");
		System.out.println("=============================================================================");
		
	}
}
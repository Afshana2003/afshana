        import java.util.Scanner;
		public class emi123 {
		public static void main(String[] args) { 
		double am,dp,a,it,mo,em,A,yr,itr;
		Scanner input = new Scanner (System.in);
		System.out.println("Prize amount:   ");
		am= input.nextDouble();
		System.out.println("Down payment:   ");
		dp= input.nextDouble();
		System.out.println("Total amount:   ");
		a=  am-dp;
		System.out.println("year:   ");
	    yr= input.nextDouble();
		System.out.println("interest:   ");
		it= input.nextDouble();
		System.out.println("total interest:   ");
		itr = a*it/100*yr;
		System.out.println("month:   ");
		mo = (yr*12)-1;
		System.out.println("Month interest:   "+it);
		A = itr/mo;
		System.out.println("Emi:   ");
		em = (a+itr)/mo;
		
	     System.out.println("==================================================");
	   	
	     System.out.println("==================================================");
	     	
	   	
	     System.out.println("Down payment                           "+dp);
	     	
	     System.out.println("Total amount                           "+a);
	     	
	     System.out.println("Interest                             "+it);
	     	
	     System.out.println("Year                           "+yr);
			
	     System.out.println("Month                           "+mo);
	     	
	     System.out.println("Total interest                           "+a);
	     	
	     System.out.println("Month interest                           "+A);
	     	     System.out.println("==================================================");
	     	          System.out.println("==================================================");
	     System.out.println("Emi                           "+em);
	          System.out.println("==================================================");
	               System.out.println("==================================================");
		}
}
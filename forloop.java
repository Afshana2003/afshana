import java.util.Scanner;
public class foploop {
	public static void main(String args[]){
		int i,j,input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number od rows : ");
		input = scan.nextInt();
		System.out.println("The pyramid star pattern : ");
		for (i=0; i<input; i++){
			for (j=input-i; j>1; j--){
				System.out.print("  ");
			
			}
			for(j=0; j<i; j++ ){
				System.out.print(" *  ");
			
			}
			System.out.println();
		}
	}

}
 
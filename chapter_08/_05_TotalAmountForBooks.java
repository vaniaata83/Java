package chapter_08;

public class _05_TotalAmountForBooks {
	public static void printTotalAmountForBooks(double...prices){
		double totalAmount=0;
		for(double singleBookPrice: prices){
			totalAmount+=singleBookPrice;
		}
		System.out.println("The total amount of all books is: "+totalAmount);
	
	}
	public static void main(String[] args){
		printTotalAmountForBooks(12.25, 13.50,7);
		printTotalAmountForBooks(12, 13.50,7);
		printTotalAmountForBooks(25, 13.50,7);
		printTotalAmountForBooks();
		
		System.out.println();
		
		double [] prices=new double[]{1,3,5,7};
		printTotalAmountForBooks(prices);
	
	}

}

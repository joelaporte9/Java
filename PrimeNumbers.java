import javax.swing.JOptionPane;

public class PrimeNumbers {

	public static void main(String[] args) {
		
	       //Empty String
	       String  sPrimeNumbers = "";
	       boolean bIfPrime = false;
	       int iCount = 0; 

	       for (int i = 1; i <= 100; i++)         
	       { 
	    	   bIfPrime = true;
	    	   
	    	   for (int j = 2; j < i; j++) 
	    	   {
	    		   if(i % j == 0) 
	    		   {
	    			   bIfPrime = false;
	    			   break;
	    		   }
	    	   }
	    	   if(bIfPrime)
	    	   {
	    		   sPrimeNumbers += i + " ";
	    		   iCount ++;
	    		   if(iCount % 1 == 0)
	    		   {
	    			   sPrimeNumbers += "\n";
	    		   }
	    	   }
	    	
	       }
	    	  JOptionPane.showMessageDialog(null, sPrimeNumbers);
	        
	}

}

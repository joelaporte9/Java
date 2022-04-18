import javax.swing.JOptionPane;

public class Pi {

	public static void main(String[] args) {
		
		// variable deceleration
		
		String sInput;
		int iInputNumber;
		double dSum = 0;
		double dPi;
		
		// Prompt user for input
		
		 sInput = JOptionPane.showInputDialog("Enter number to approximate");
		 iInputNumber = Integer.parseInt(sInput); 
		 
		// Validation
		for(double i = 0; i <= iInputNumber; i++)
		{
		    if(i % 2 != 0) 
		        dSum += -1 / ( 2 * i + 1);
		    else 
		        dSum -= -1 / (2  * i + 1);
		}
		// pi calculation
		
		dPi = 4 * dSum;
		
		// output
		
		   JOptionPane.showMessageDialog(null,"Approximate the value of pi calculates" + iInputNumber + " is " +  dPi);

	}



}

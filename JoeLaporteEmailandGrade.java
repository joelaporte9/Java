import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Email {

	public static void main(String[] args) 
	{
		//variable deceleration
	
		String sMessage  = "",
		       sLetterGrade = "",
			   sOutputMsg,
			   sEmail,
			   sGrade;
			
		float fGrade = 0;
		
		//Prompt user for email
		
	     sEmail = JOptionPane.showInputDialog(null, "Enter your email: ");
	     
	     int atSymbol = sEmail.indexOf("@");
		 int atSymbol2 = sEmail.lastIndexOf("@");
		
	     //Validate users email
	     
		if (sEmail.length() == 0) {
			
			sMessage  += "Email can not be blank.\n";
		}
		
		if(sEmail.length() > 30) {
			
			sMessage  += "Email can not be more than 30 charecters.\n";
		}
		
		if(!sEmail.endsWith("student.stcc.edu")) {
			
			sMessage  += "Email must end with '@student.stcc.edu'.\n";
		}
		
		if(atSymbol != atSymbol2) {
			
			sMessage  += "Email can not contain more than one '@'.\n";
		}
				
		if(sEmail.contains("#") || sEmail.contains("$") || sEmail.contains("%") || sEmail.contains("&")) {
			
			sMessage  += "Email can not contain #, $, % or &.\n";
		}
		
		if(!Character.isLetter(sEmail.charAt(0))) {
			
			sMessage  += "Email must start with A through Z or a through z.\n";
		}
		if(sMessage == "") {
			sMessage = "Email is valid.";
		}
		
		//Prompt user for grade 
		
		sGrade = JOptionPane.showInputDialog(null, "Enter your grade: ");
		fGrade = Float.parseFloat(sGrade);
		
		//Validate the letter grade
		
		if (fGrade >= 97.0) 
			sLetterGrade = "A+";
		
		else if (fGrade >= 94.0)
			sLetterGrade = "A";
		
		else if (fGrade >= 90.0)
			sLetterGrade = "A-";
	
		else if (fGrade >= 87.0)	
			sLetterGrade = "B+";
		
		else if (fGrade >= 84.0)
			sLetterGrade = "B";
		
		else if (fGrade >= 80.0)	
			sLetterGrade = "B-";
		
		else if (fGrade >= 77.0)
			sLetterGrade = "C+";
		
		else if (fGrade >= 74.0)
			sLetterGrade = "C";
		
		else if (fGrade >= 70.0)	
			sLetterGrade = "C-";
		
		else if (fGrade >= 67.0)
			sLetterGrade = "D+";
		
		else if (fGrade >= 64.0)
			sLetterGrade = "D";
		
		else if (fGrade >= 60.0)	
			sLetterGrade = "D-";
		
		else 	
			sLetterGrade = "F";	
		
		//Creating a message variable for the output
		
		sOutputMsg = "For user: " + sEmail + "\n" +
		 			 sMessage + "\n" +
		 			"Test score: " + fGrade + "\n" +
		 			"Letter grade: " + sLetterGrade;
		
		//Output the email and grade
		
		JOptionPane.showMessageDialog(null, sOutputMsg, "Email and Grade", JOptionPane.INFORMATION_MESSAGE);
	    		 						           
		}
	
	}

	 	      
	        	
	        	
        
	       
	      
	       
	       
	

		
		
	
		
		 


	
	

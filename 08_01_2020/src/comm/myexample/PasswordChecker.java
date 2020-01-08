package comm.myexample;

public class PasswordChecker {
	
	    private String password;
	    
	   public void passwordCheck(String password) throws PasswordIsNotValidException
	    {
		   int flag =0;
		   char c=' ';
		   int len = password.length();
		   char[] ch = new char[len];
	    
		   for (int i = 0; i < len; i++)
		   { 
			   c = password.charAt(i); 
				  
			   if (len>=8 && len<15) 
			   {
				   if ((c >='A' && c <= 'Z')||(c>= 'a' && c <= 'z')  || (c >=0 && c <= '9')) 
				   {
					  
					 flag = 0;
				   } 
				   else
					   throw new PasswordIsNotValidException("Password is Invalid.");
			   }
			   else
			   {
				   throw new PasswordIsNotValidException("Password is Invalid.");
			   }
			   
		  
		   }
		   if(flag == 0)
		   {
			   System.out.println("Login Successful.");
		   }
	    }

}
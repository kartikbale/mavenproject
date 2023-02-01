package main.java.com.login.app;



public class login
{
    


	public static boolean validation(String p)
	{
		int uc=0,spc=0,d=0,lc=0;
		if(p.length()>7)
		{
			for (int i=0;i<p.length();i++)
			{
				char x=p.charAt(i);
				if(x>='A' && x<='Z' || x>='a' && x<='z' ) 
				{
				if(x>='A' && x<='Z') 
						uc++;
					else
						lc++;

				}
				else if(x>='0' && x<='9')
					d++;
				else 
					spc++;

			}
			if(uc>0 && spc>0 && d>0)
				return true;
			else
				return false;
		}
		return false;
	}
	public static boolean emailvalidation(String p)
	{
		int uc=0,spc=0,d=0,atRate=0,dot=0,lc=0;
		
		
			for (int i=0;i<p.length();i++)
			{
				char x=p.charAt(i);
				if(x>='A' && x<='Z' || x>='a' && x<='z' ) 
				{
					if(x>='A' && x<='Z') 
						uc++;
					else
						lc++;

				}
				else if(x>='0' && x<='9')
					d++;
				else if(x=='@') {
					atRate++;
				}
				else if(x=='.') {
					dot++;
				}
				else {
					spc++;
				}

			}
			if(uc>0 && spc==0 && d>=0 && atRate==1 && dot==1)
				return true;
			else
				return false;
		
	
	}
	
	
	
}

              
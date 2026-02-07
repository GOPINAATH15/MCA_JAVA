package string;

public class Search_String1
{
	public static void main(String[] args) {
	     String   str1  = "avecnakept";
	     String str2  = "vecna";
	     char ch = str2.charAt(0);//v
	     
	     for(int i=0;i<str1.length();i++)
	     {
	         String temp="";
	         if(str1.charAt(i)==ch)
	         {
	             
	             temp+=str1.charAt(i);//v
	             int k=1;
	             for(int j=i+1;j<str2.length()+1;j++)
	             {
	                    System.out.println(str2.charAt(k)+" "+str1.charAt(j));
	                 if(str2.charAt(k)!=str1.charAt(j))
	                 
	                 {
	                     break;
	                 }
	                 temp+=str1.charAt(j);
	                 k++;
	                 
	             }
	             System.out.println(temp);
	             
	             
	         }
	     }
	     
	}
}

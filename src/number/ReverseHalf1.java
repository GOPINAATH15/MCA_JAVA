package number;
public class ReverseHalf1
{
	public static void main(String[] args) {
	    int n = 24568;
	    int num1 = n;
	    int num2=0;
	    int count=0;
	    while(n>0)
	    {
	        n/=10;
	        count++;
	    }
	    
	    if(count%2==0)
	    {
	        
    	    int i=0;
    	    while(i<(count/2))
    	    {
    	        num2=(num2*10)+(num1%10);
    	        num1/=10;
    	        i++;
    	    }
    	    for(int j=0;j<count/2;j++)
    	    {
    	        num1*=10;
    	    }
    	    System.out.println(num1+num2);
	    }
	    else{
	        int i=0;
    	    while(i<((count/2)+1))
    	    {
    	        num2=(num2*10)+(num1%10);
    	        num1/=10;
    	        i++;
    	    }
    	    for(int j=0;j<(count/2)+1;j++)
    	    {
    	        num1*=10;
    	    }
    	    System.out.println(num1+num2);
	    }
	    //System.out.println();
	    
	}
}

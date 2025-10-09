package number;
public class Main
{
	public static void main(String[] args) {
		int n = 123456;
		int m = n, r=1;
		int l =0,l1 =0, count =0;
		
		while(n>0){
		    int s = n%10;
		    l = l*10 +s;
		    n = n/10;
		    count++;
		}
		for(int i = 1;i<=count/2;i++) r = r*10;
		System.out.println("r"+r);
		int op = m%r , num = m/r;
		System.out.println(op);
		System.out.println(num);
		while(op>0){
		    int so = op%10;
		    l1 = l1*10 +so;
		    op = op/10;
		}
		System.out.println((num*r)+l1);
	}
}
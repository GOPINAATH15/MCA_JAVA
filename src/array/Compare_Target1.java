package array;
public class Compare_Target1
{
	public static void main(String[] args) {
	        int arr[] ={4,6,1,8,3};
	        int target = 7;
	        for(int i=0;i<arr.length;i++){
            int val = target-arr[i];
            boolean isFound=false;
                for(int j=0;j<arr.length;j++){
                        if(arr[j]==val){
                            isFound=true;
                            System.out.println(i+","+j);
                            break;
                        }
                    }
                    if(isFound)
                    {
                        break;
                    }
            }
	}
}

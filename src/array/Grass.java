//package array;
//import java.util.*;
//
//public class Grass
//{
//	public static void main(String[] args) {
//		int size = 5;
//		char[][] arr = new char[size][size];
//		Scanner in = new Scanner(System.in);
//		
//		for(int row=0;row<size;row++)
//		{
//		    for(int col=0;col<size;col++)
//		    {
//		        arr[row][col]=in.next().charAt(0);
//		        
//		    }
//		}
//		String findtext = in.nextLine();//GRASS
//		System.out.println("Data Stored Successfully");
//
//		char startCh = str.charAt(0);
//		for(int i=0;i<size;i++)
//		{
//		    for(int j=0;j<size;j++)
//		    {
//		        boolean isFound=true;
//		        
//		        if(arr[i][j]==startCh){
//		            int strInd = 1;
//		            for(int k=j+1;k<size;k++)
//		            {
//		                if(str.chatAt(strInd)!=arr[i][k]){
//		                    isFound=false;
//		                    break;
//		                }
//		                strInd++;
//		            }
//		            for(int k=i+1;k<size;k++)
//		            {
//		                if(str.chatAt(strInd)!=arr[k][j]){
//		                    isFound=false;
//		                    break;
//		                }
//		                strInd++;
//		            }
//		        }
//		        
//		        if(isFound)
//		        {
//		            break;
//		        }
//		        
//		    }
//		        if(isFound)
//		        {
//		            break;
//		        }
//		    System.out.println();
//		}
//
//
//	}
//}

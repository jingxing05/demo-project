public class HelloWinhong{ 
    //杨辉三角 打印
    public static void main(String[] args){  
       System.out.println("Yang hui San Jiao");  
       int m = 10;
       int n=2*m-1;                                 //列元素个数
       int arr[][]=new int[m][n];  
       for(int i=0;i<m;i++){                    //外循环控制行  
           for(int j=0;j<n;j++){                 //内循环控制列  
               if(j<(m-i-1)||(j>=(m+i)))        //输出等腰三角形两边空格  
                   System.out.print("   ");  
               else if((j==(m-i-1))||(j==(m+i-1)))  
                                                //计算并输出等腰三角形两个腰  
               {  
                   arr[i][j]=1;  
                   System.out.printf("%-3d",arr[i][j]);  
               }  
               else if((i+j)%2==0&&m%2==0||(i+j)%2==1&&m%2==1)   //中间默认数字0用空格替换  
                   System.out.print("   ");  
               else                             //计算并输出中间数字  
               {  
                   arr[i][j]=arr[i-1][j-1]+arr[i-1][j+1];  
                   System.out.printf("%-3d",arr[i][j]);  
               }  
           }  
           System.out.println();                    //输出换行  
        }
        
    }  
} 
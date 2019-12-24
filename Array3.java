import java.util.*;
import java.io.*;
class Array3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int i,val;
for(i=0;i<n;i++)
{
val=sc.nextInt();
arr[i]=val;
}
int se=sc.nextInt();
for(i=0;i<n;i++)
{
if(se==arr[i])
{
System.out.println(i);
break;
}
}
if(i==n)
{
System.out.println("-1");
}

}
}

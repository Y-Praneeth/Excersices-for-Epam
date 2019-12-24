import java.util.*;
import java.io.*;
public class Array2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n;
n=sc.nextInt();
int arr[]=new int[n];
int sum=0,count=0;
float avg;
for(i=0;i<n;i++)
{
int val=sc.nextInt();
arr[i]=val;
sum=sum+arr[i];
}
count=n;
avg=sum/count;
System.out.println("Sum is "+sum);
System.out.println("Avg is "+avg);
}
}
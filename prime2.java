package prime;

import java.util.Scanner;
public class prime2
{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int N =sc.nextInt();
int count=0;
int m=2;
while(count!=N)
{
    boolean prime=true;
    for (int i=2;i<=Math.sqrt(m);i++)
    {
        if (m%i==0)
        {
            prime=false;
            break;
        }
}
    if (prime)
    {
        count++;
        System.out.println(m);
    }
    m++;
}
} 
} 
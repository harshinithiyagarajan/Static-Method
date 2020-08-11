/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise3;

import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class average {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter array sie:");
        int n=obj.nextInt();
        double a[]=new double[n];
        System.out.println("enter "+n+" array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextDouble();
        }
        mean.display(a,n);
           }    
}
class mean
{
    static void display(double a[],int n)
    {
        double avg=0,mean;
        for(int i=0;i<n;i++)
        {
            avg=avg+a[i];
        }
        mean=avg/n;
        System.out.println("average:"+mean);                
    }
    
}

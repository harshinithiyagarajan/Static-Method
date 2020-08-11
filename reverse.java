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
public class reverse {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter no of array elements:");
        int n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("enter "+n+" array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        reversea.display(a,n);
        
    }
    
}
class reversea
{
    static void display(int a[],int n)
    {
        int rev[]=new int[n];
        System.out.println("reversed array:");
        for(int i=n-1;i>=0;i--)
        {
            rev[i]=a[i];
            System.out.println(rev[i]);        }
    }
}

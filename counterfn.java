/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise3;

/**
 *
 * @author Thiagarajan
 */
public class counterfn {
    public static void main(String[] args){
        System.out.println("first increment");
        counter obj=new counter();
        obj.inc();
        System.out.println("second increment");
        counter obj1=new counter();
        obj1.inc();
        
    }
    
}
class counter
{
    static int i=0;
    int j=0;
    void inc()
    {
        i++;
        j++;
        System.out.println("static increment:"+i);
        System.out.println("non static increment:"+j);
    }
}
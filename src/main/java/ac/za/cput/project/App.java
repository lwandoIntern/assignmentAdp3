package ac.za.cput.project;

/**
 * Hello world!
 *
 */

import java.util.*;
import javax.swing.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);

        int num1,num2,total;

        System.out.print("Enter The first Number " );
        num1=input.nextInt();

        System.out.print("Enter The Second Number ");
        num2=input.nextInt();

        total =num1 + num2;




        JOptionPane.showMessageDialog(null,"Your Answer is "+total);

    }
}

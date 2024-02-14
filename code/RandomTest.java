/* 
File Name : RandomTest.jav
Author : Ameen SHW
Date : 2/13/2024
Discription : Print greetings and name. 
*/
import java.util.Scanner;
public class RandomTest {
    public static void main(String args[]) {
       Scanner scn = new Scanner(System.in);
       System.out.println("put the user name ");
       String  UserName = scn.nextLine();
       System.out.println("the user name is " + UserName);
        System.out.println("Hello" + '\n' + "Ameen");
    scn.close();
    }
    }
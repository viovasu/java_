import java.io.*;
import java.util.*;
class Positive {
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    if(a>0)
	    {
		System.out.println("Positive");
	    }
	    else if(a<0)
	    {
	        System.out.println("Negative");
	    }
	    else
	    {
	        System.out.println("Zero");
	    }
	}
}

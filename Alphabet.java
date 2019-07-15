import java.io.*;
import java.util.*;
class Alphabet 
{
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    char a=sc.next().charAt(0);
	    if((a>='a' && a<='z')||(a>='A' && a<='Z'))
	    {
		System.out.println("Alphabet");
	    }
	    else
	    {
	        System.out.println("Not a Alphabet");
	    }
	}
}

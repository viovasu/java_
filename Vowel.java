import java.io.*;
import java.util.*;
class Vowel {
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    char a=sc.next().charAt(0);
	    if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
	    {
		System.out.println("Vowel");
	    }
	    else
	    {
	        System.out.println("Consonant");
	    }
	}
}

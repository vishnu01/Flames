import java.util.Scanner;
class Flames {
StringBuffer flames (int k)
{
	char ch;
	int p=k,l=3,x;
	StringBuffer str = new StringBuffer ("flames"); 
	try
	{
		x=k;
		l=str.length();
		while(l!=2) 					// when l=2 str contains only one character
		{
			l=str.length();
			System.out.println(str);  
			if(k>l)
			{	
				x=k;
				while(x>l)
				{
					x-=l;
					p=x;
				}
			}
			else
			p=k; 
			str.deleteCharAt(Math.abs(p-1)); 
		}
		
	}
	catch(StringIndexOutOfBoundsException e)
	{
			str.deleteCharAt(Math.abs(p-1)%l); 	// exception when above p-1 is greater than l
	}
System.out.println(str);
return str;
}
public static void main (String args[])
{
	Flames f = new Flames();
	Scanner input = new Scanner (System.in);
	System.out.print("enter your name :");
	String s1 = input.next();
	System.out.print("enter your crush name :");
	String s2 = input.next();
	int l1,l2;
	l1=s1.length();
	l2=s2.length();
	int i,j,p=0;
	char ch1,ch2,c='p';
	for ( i=0;i<l1;i++)
	{
		ch1=s1.charAt(i);
		for (j=0;j<l2;j++)
		{
			if (ch1==(s2.charAt(j)))
			{
				p++;
			}
			else 
			continue;
		}
	}
System.out.print("common letters in the names are :"+p); 
System.out.println();
StringBuffer str = f.flames(p); 

switch(str.charAt(0))
{
	case 'f' : System.out.println("both are friends");
		   break;
	case 'l' : System.out.println("both are lovers");
		   break;
	case 'a' : System.out.println("both have affection");
		   break;
	case 'm' : System.out.println("both will marry");
		   break;
	case 'e' : System.out.println("both are enemies");
		   break;
	case 's' : System.out.println("both are siblings");
		   break;
	default  : System.out.println("invalid relation");

}
}
}

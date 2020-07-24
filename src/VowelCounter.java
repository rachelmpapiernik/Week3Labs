import java.util.Scanner;

public static boolean isSpace(char c); {
	
	return c==' ';
	}

public static boolean isVowel(char c)
	{
	return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'); 
}

public static boolean isConsonant(char c)
{
	if((c>='a' && c<='z') 
			|| (c<='Z' && c>='A'))
 {
		return !isVowel(c);
 }
		return false;
}

public static boolean isPunctuation(char c)
{
	return (!(c>='a' && c<='z') && !(c<='Z' && c>='A'));

	}

}

public static void main(String[] args);
	{
	int num_a=0, num_e = 0, num_i = 0, num_o = 0, num_u = 0;
	int nConsonant = 0, nSpace = 0, nPunctuation = 0;
 
	String str;
 
	Scanner scan = new Scanner(System.in);
 
	System.out.print("Enter a string: ");
	str = scan.nextLine();
 
	char c;{

	for(int i=0; i<str.length(); i++) 
 {
		if(isSpace(str.charAt(i)))
			nSpace++;
		else if(isVowel(str.charAt(i)))
 {
			c = str.charAt(i);
			if(c=='a') 
				num_a++;
			else if(c=='e')
				num_e++;
			else if(c=='i')
				num_i++;
			else if(c=='o')
				num_o++;
			else if(c=='u')
				num_u++;
  }
 
		else if(isConsonant(str.charAt(i)))
			nConsonant++;
		else if(isPunctuation(str.charAt(i)))
			nPunctuation++;
 }
	{
 		System.out.println("         Result         /n");
 		System.out.println("a: \t\t" + num_a);
 		System.out.println("e: \t\t" + num_e);
 		System.out.println("i: \t\t" + num_i);
 		System.out.println("o: \t\t" + num_o);
 		System.out.println("u: \t\t" + num_u);
 		System.out.println("Consonants: \t" + nConsonant);
 		System.out.println("Spaces: \t\t" + nSpace);
 		System.out.println("Punctuations: \t" + nPunctuation);
 	
	}
}
	
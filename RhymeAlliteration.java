import java.util.Scanner;

public class RhymeAlliteration {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Type two words: ");
		String words = console.nextLine();
		int space = words.indexOf(" ");
		int length = words.length()-1;
		
		if (words.substring(space-3, space).equals(words.substring(length-2,length+1))) {
			System.out.println("They rhyme!");
		}
		if (words.charAt(0)==(words.charAt(space+1))) {
			System.out.println("They alliterate!");
		}
		
	}
}

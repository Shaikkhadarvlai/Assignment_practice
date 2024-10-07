package Assignement_practice;

public class vowels_counting 
{
	public static void main(String[] args) {
        String name = "khadaar vali";
        String vowels = "aeiou";
           System.out.println(name.length());
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                System.out.println("Vowel found: " + ch);
            }
        }
	}
	

}

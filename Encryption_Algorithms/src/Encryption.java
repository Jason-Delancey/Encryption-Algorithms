

/**
 * 
 */

/**
 * Class used to encrypt text by replacing each character in the original string with a character 
 * in the UNICODE listing equal to 1 less than the numerical value or the original character.
 * @author CloudStrife
 *
 */
public class Encryption
{
	private char[] charList;
	
	public Encryption()
	{
		charList = new char[1];
	}
	
	public String encrypt(String aWord)
	{
		String newWord = "";
		for(int i = 0; i < aWord.length(); i++)
		{
			/*System.out.println((int) oldWord.charAt(i));*/
			
			/** Convert each letter in the word to the previous letter in the 
			 * alphabet.
			 */
			charList = Character.toChars((int) aWord.charAt(i) - 1);
			newWord = newWord + charList[0];
			
			/*System.out.println(charList[0]);*/
		}
		/*System.out.println(newWord);*/
		return newWord;
	}
	
	public String decrypt(String aWord)
	{
		String newWord = "";
		for(int i = 0; i < aWord.length(); i++)
		{
			/** Convert each letter in the word to the next letter in the 
			 * alphabet.
			 */
			charList = Character.toChars((int) aWord.charAt(i) + 1);
			newWord = newWord + charList[0];
		}
		
		return newWord;
	}
}

import Converters.*;

public class main {

	/*
	 * Testing purposes only. Example of the use to call in a console print use-case.
	 */
	
	public static void main(String[] args) {
		//Give any digit (without comma/dot)
		System.out.println(RomanConverter.INSTANCE.ToRoman(55));
		//Example of format that needs to be given
		System.out.println(EpochConverter.INSTANCE.DateToEpoch("2014/18/08 18:52:21"));
		//Example
		System.out.println(TextCapitalizationConverter.INSTANCE.TextCapitalizationChanger("random", "This is just an example!"));
		//Example normal text to Caesar
		System.out.println(CaesarCipher.INSTANCE.normalToCaesar("This is a text", 15));
		//Example Caeser text to normal
		System.out.println(CaesarCipher.INSTANCE.caesarToNormal("iwxh xh p itmi", 15));
	}
}

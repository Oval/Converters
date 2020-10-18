import Converters.*;

public class main {

	/*
	 * Testing purposes only. Example of the use to call.
	 */
	public static void main(String[] args) {
		RomanConverter.INSTANCE.ArabicToRoman(55);
		//Example of format that needs to be given
		EpochConverter.INSTANCE.DateToEpoch("2014/18/08 18:52:21");
		//Example
		TextCapitalizationConverter.INSTANCE.TextCapitalizationChanger("random", "This is just an example!");
	}
}

import Converters.EpochConverter;
import Converters.RomanConverter;

public class main {

	/*
	 * Testing purposes only. Example of the use to call.
	 */
	
	public static void main(String[] args) {
		RomanConverter.INSTANCE.ArabicToRoman(55);
		
		//Example of format that needs to be given
		EpochConverter.INSTANCE.DateToEpoch("2014/18/08 18:52:21");
	}

}

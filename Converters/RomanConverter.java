package Converters;

import java.util.Collections;

public enum RomanConverter {
	INSTANCE;

	public final String ToRoman(int number) {
		return String.join("", Collections.nCopies(number, "I")).replace("IIIII", "V").replace("IIII", "IV")
				.replace("VV", "X").replace("VIV", "IX").replace("XXXXX", "L").replace("XXXX", "XL").replace("LL", "C")
				.replace("LXL", "XC").replace("CCCCC", "D").replace("CCCC", "CD").replace("DD", "M")
				.replace("DCD", "CM");
	}
}

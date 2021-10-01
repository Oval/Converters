package Converters;

public enum RomanConverter {
	INSTANCE;

	public final String ToRoman(int number) {
		TreeMap<Integer, String> m = new TreeMap<Integer, String>();
		m.put(1000, "M");
		m.put(900, "CM");
		m.put(500, "D");
		m.put(400, "CD");
		m.put(100, "C");
		m.put(90, "XC");
		m.put(50, "L");
		m.put(40, "XL");
		m.put(10, "X");
		m.put(9, "IX");
		m.put(5, "V");
		m.put(4, "IV");
		m.put(1, "I");

		int l = m.floorKey(number);
		if (number == l) {
			return m.get(number);
		}
		return m.get(l) + ToRoman(number - l);
	}
}

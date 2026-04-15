package main;

public class Classes {
	public static void main(String[] args) {
	Cipher(2, "abc");	
	}
  static public  String Cipher(int key, String message) {
		key = (key % 26);
		if (key < 0) key += 26;
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			char[] c = message.toCharArray();
			
			if (Character.isLetter(c[i])) {
				char newChar = (char)(c[i] - key);
			}
			else {
			c[i] += 26;
			}
		}
		return builder.toString();
	}
	
	
	
}
	
	
	
	


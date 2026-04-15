package main;

public class Classes {
	public static void main(String[] args) {
	
		System.out.println(Cipher(2, "abc"));	
	}
   public static String Cipher(int key, String message) {
		key = (key % 26);
		if (key < 0) key += 26;
		
		char c;
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			c = message.charAt(i);
			
			if (Character.isLetter(c)) {
				char newChar = (char)((c + key)+ 26);
				c = newChar;
			}
			else {
			c += 26;
			}
			builder.append(c);
		}
		return builder.toString();
	}
	
	
	
}
	
	
	
	


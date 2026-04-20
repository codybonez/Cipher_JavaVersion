package main;

public class Classes {
	public static void main(String[] args) {
	
		System.out.println(Cipher(2, "abc"));	
	}
   public static String Cipher(int key, String message) {
		key = (key % 26);
		if (key < 0) key += 26;
		System.out.println(key);
		char c;
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			c = message.charAt(i);
			
			if (Character.isLetter(c)) {
				
				char newChar = Character.isUpperCase(c)? 'A' : 'a';
				System.out.println(newChar);
				char shifted =  (char)((((c - newChar) + key) % 26) + newChar);
				System.out.println(shifted);
				builder.append(shifted);
			}
			else {
				builder.append(c);
			}
		
		}
		return builder.toString();
	}
	
	
	
}
	
	
	
	


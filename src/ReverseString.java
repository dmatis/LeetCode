public static String reverse ( String s ) {
	char[] stringArray = s.toCharArray();
	for (int i = 0; i < stringArray.length()/2; i++) {	
		char c = stringArray[i];
		stringArray[i] = stringArray[stringArray.length-1-i];
		stringArray[stringArray.length-1-i] = c;
	}
	return new String(stringArray);
} 
	
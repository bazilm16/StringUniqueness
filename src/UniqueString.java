import java.util.Arrays;

public class UniqueString {

	private String string1;
	private String string2;
	
	/**
	 * converts string to an array of integers
	 * @param str, the string to be converted
	 * @return an array of ASCII integers for the converted string
	 */
	private static int[] stringToIntArr(String str){
		char[] charArray = str.toCharArray();
		int intArray[] = new int[str.length()];
		for(int i = 0; i < charArray.length; i++){
			intArray[i] = (int)charArray[i];
		}
		Arrays.sort(intArray);
		return intArray;
	}//stringToIntArr
	
	private static boolean compareStrings(String s1, String s2){
		return false;
	}//compareStrings
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Bazil";
		int intArr[] = stringToIntArr(str);
		for(int x = 0; x < str.length(); x++){
			System.out.println(intArr[x]);
		}
	}

}

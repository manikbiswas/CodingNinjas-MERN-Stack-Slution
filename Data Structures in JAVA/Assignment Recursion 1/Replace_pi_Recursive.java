public class solution {

	// Return the changed string
	public static String replace(String input){

		// Write your code here
	if (input.length() == 1 || input.length() == 0)
		return input;
	String smallans = replace(input.substring(1));
	if (smallans.charAt(0) == 'i' && input.charAt(0) == 'p')
		smallans = "3.14" + smallans.substring(1);
	else
		smallans = input.charAt(0) + smallans;
	return smallans;

	}
}

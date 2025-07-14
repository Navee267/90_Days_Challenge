package Day_1;


public class StringExamples {
	public static void main(String[] args) {
		String name = "Naveen";
		String output = "";
		int count = 0;
		for(int i=name.length()-1;i>=0;i--) {
			output += name.charAt(i);
			count = count + 1;
		}
		System.out.println("Output " + output);
		System.out.println("Count " + count);
	}
}

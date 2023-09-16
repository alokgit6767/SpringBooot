public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello, World!");

		String str = "Alok Kumar Nayak";
		String reverse = "";
		System.out.print(str.length());
		for (int j = 0; j <= 2; j++) {
			System.out.print(j);
		}
		int len = str.length();
		System.err.println(len);
		for (int k = len-1; k >= 0; k--) {
			System.out.print(k + " " + len);
			char ch = str.charAt(k);
			System.out.println("--" + ch);
			reverse = reverse + ch;
		}
		System.out.println("--" + reverse);
	}
}
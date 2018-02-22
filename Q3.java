package chapterQuestions_1;

public class Q3 {
	
	//Q3
	//Write a short Java method, isMultiple, that takes two long values, n and m, 
	//and returns true if and only if n is a multiple of m, that is, n = mi for some integer i
	public static boolean isMultiple(long n,long m ) {
		if (n % m == 0) {
			return true;
		}
		return false;
	}
	
	//Q4
	//WriteashortJavamethod,isEven,that takes an int i and returns true if and only if i is even. 
	//Your method cannot use the multiplication, modulus, or division operators, however.
	public static boolean isEven(int i) {
		String s = String.valueOf(i);
		int size = s.length();
		String evens = "02468";
		if(evens.contains(String.valueOf(s.charAt(size-1)) )) {
			return true;
		}
		return false;
	}
	
	//Q7
	//Write a short Java method that takes an integer n and returns the sum of the squares of all positive 
	//integers less than or equal to n.
	public static int squaresOfPos (int n) {
		if(n == 0) {
			return 0;
		}
		if(n < 0) {
			return 0;
		}
		int sum = 0;
		for(int i = 0; i < n + 1; i ++) {
			sum += (i * i);
		}
		return sum;
	}
	
	
	//Q8
	//Write a short Java method that counts the number of vowels in a given character string.
	public static int countVowels(String s) {
		if(s.length() == 0) {
			return 0;
		}
		String vowels = "aeiou";
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			if(vowels.contains(String.valueOf(s.charAt(i)))) {
				sum += 1;
			}
		}
		return sum;
	}

	
	//Q9
	//Write a short Java method that uses a StringBuilder instance to remove all the punctuation 
	//from a string s storing a sentence, for example, transforming the string "Let’s try, Mike!" 
	//to "Lets try Mike".
	//*LOOK INTO STRINGBUILDER
	
	
	//Q15
	//Write a pseudocode description of a method for finding the smallest and largest numbers in an array
	//of integers and compare that to a Java method that would do the same thing.
	public static int find(int[] array) {
		int small = array[0];
		int large = array[0];
		for (int i = 0; i < array.length; i ++) {
			if(array[i] < small) {
				small = array[i];
			}
			if(array[i] > large) {
				large = array[i];
			}
		}
		System.out.println(small+" " + large); 
		return 0;
	}
	
	
	//Q19
	//Write a Java program that can take a positive integer greater than 2 as input and write out
	//the number of times one must repeatedly divide this number by 2 before getting a value less than 2.
	public static int div2(int n) {
		if(n <= 2) {
			throw new IllegalArgumentException();
		}
		int sum = 0;
		while(n >= 2) {
			n = n/2;
			sum +=1;
		}
		return sum;
	}
	
	public static void main(String args[]) {
		long n = 30000000;
		long m = 5000;
		int[] array = {1,2,3,4};
		int answer = div2(4);
		System.out.println(answer);
	}
}

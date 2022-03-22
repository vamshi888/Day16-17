
public class RecursionMethod_1 {
	public static void main(String[] args) {	
		// Find Permutations of a string in Java
        String str = "ABC";
        	permutations("", str);
    	}
	// Recursive function to generate all permutations of a string
    private static void permutations(String candidate, String remaining) {		
        if (remaining == null) {
            return;
        	}
        if (remaining.length() == 0) {
            System.out.println(candidate);
        	}
        for (int i = 0; i < remaining.length(); i++) {
            String newCandidate = candidate + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) +
                remaining.substring(i + 1);
            permutations(newCandidate, newRemaining);
        	}
	}
}

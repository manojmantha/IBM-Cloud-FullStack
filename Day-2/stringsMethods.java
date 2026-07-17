public class stringMethods {
    public static void main(String[] args) {
	    String name = "Java Programming";
	    
	    System.out.println(name.length());
	    System.out.println(name.trim());
	    System.out.println(name.toUpperCase());
	    System.out.println(name.toLowerCase());
	    System.out.println(name.trim().substring(0,4));
	    System.out.println(name.contains("Java"));
	    System.out.println(name.replace("Java", "Python"));
	    System.out.println(name.trim().equals("Java Programming"));
	    
	    // output
	    // 16
        // Java Programming
        // JAVA PROGRAMMING
        // java programming
        // Java
        // true
        // Python Programming
        // true
	}
}
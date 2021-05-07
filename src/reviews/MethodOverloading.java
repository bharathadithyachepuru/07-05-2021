package reviews;

public class MethodOverloading {
	
public static void main(String[] args) {
		
		
        add(); 
        
        add(100,200);
        
        add('A','B');
        
        add(100,"java");
        
        add("SQL",200);
		
  }

public static void add() {
	
	System.out.println(10+20);
}

public static void add(int i, int j) {
	
	System.out.println(i+j);
}

public static void add (char ch1, char ch2) {
	
	System.out.println(ch1+ch2);
}

public static void add(int i, String s) {
	
	System.out.println(i+s);
}

public static void add(String s, int i) {
	
	System.out.println(s+i);
}
}

import java.io.*; 
import java.util.*;

/**
 * Palindrome Project
 * 03OCT2019
 * Author, Austin Young
 */
  
class Main { //My "Application.java"
      
	static boolean isSubSequence(String str1, String str2, int m, int n) //Creates my isSubSequence 
    { 
        int j = 0; 

        for (int i = 0; i < n && j < m; i++) 		//Compares current char with str2 with the first unmatched of str1
            if (str1.charAt(j) == str2.charAt(i)) 	
                j++; 

        return (j == m);  
    } 
     
    public static void main (String[] args)  //Driver Program to test the subsequences 
    { 
   
    	Scanner user = new Scanner(System.in); //Scanner to detect user input
    	System.out.println("Would you like enter sequences manually or from a file? (M/F):"); //Manual works well, I have the code for the file part and was																					  //down below, but I couldn't get it to work properly
    	String seq = user.nextLine();														  //able to get it to work here and there, but not consistently 
   
    	//if(seq == "M")   
    	
        	System.out.println("Enter the first sequence:"); //First sequence, i.e. abc
        	String str1 = user.nextLine();
        	System.out.println("Enter the second sequence:"); //Second sequence, i.e. axxbxxc
        	String str2 = user.nextLine();	
        	int m = str1.length(); //Turns the string into an int based on length, then compares to isSubSequence
        	int n = str2.length(); 
        	boolean res = isSubSequence(str1, str2, m, n); 
 
        	if(res) 
        		System.out.println(str1 + " IS A SUBSEQUENCE of " + str2); //Output if the Sequence is true
        	else
        		System.out.println(str1 + " IS NOT A SUBSEQUENCE of " + str2); //Output if the Sequence is false
        		
    /***    if(seq == "F")
        	
        	BufferedReader br = new BufferedReader(new FileReader("file.txt")); 
        try {																	//Whenever I would try and use Buffered Reader,
            StringBuilder sb = new StringBuilder();								//I would get an error that almost seemed related to Java.io,
            String line = br.readLine();										//even though I'm utializing it.

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
        } finally {
            br.close();
        }
        
   ***/
        		
        System.out.println("Would you like to enter more sequences? (Y/N):"); 
        String cont = user.nextLine();
        
        if(cont == "Y")
        	Main.isSubSequence(str1, str2, m, n);
        else
        	System.out.println("<END RUN>");
        	
    } 
    
} 
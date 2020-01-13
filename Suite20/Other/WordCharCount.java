public class Wordcounter{
	public static void wordcount(String filename) throws IOException {
		char c;
		int nl, nw, nc, intch;
		boolean inword;
		
		inword = false;
		nl = 1;
		nw = 0;
		nc = 0;

		FileInputStream fileStream = new FileInputStream(filename);

	    while((intch = fileStream.read()) != -1) { 
		    c = (char) intch;
	    	nc++;
	        if(c == '\n') 
	            nl++; 
	        if ( c == ' ' || c == '\n' || c == '\t')     
	            inword = false;
	        else if (inword == false) {
	        	inword = true;
	        	nw++;  
	        } 
	    } 
	    
	    System.out.println("Number of lines: "+nl);
		System.out.println("Number of words: "+nw);
		System.out.println("Number of characters: "+nc);
    } 
} 
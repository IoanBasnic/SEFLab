public class main {  
	

	 
    public static void main(String[] args) {  
       
    	
    	while(true)
    	{
    		try {
    			throw new Exception("hi");
    		}
    		catch(Exception e) {
    			System.out.println("hi2");
    		}
    	}
} 
}
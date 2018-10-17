package extra;

public class RAP {
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	  }


	public static void main(String[] args) {
		speak(+"");


		
	}
	
	
	
	
}
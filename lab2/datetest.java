import java.util.*;

public class datetest {
	public static void main(String[] args) {
		Date d= new Date();
		
		for (int i = 0; i < 100; i++) {
			try{
				Thread.sleep(1000);
				
				System.out.println (d);
			} catch(Exception e){

			}
		}
	}
}
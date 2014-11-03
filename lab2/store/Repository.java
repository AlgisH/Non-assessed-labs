package store;

import java.io.*;

public class Repository {

	public static void store(Store s) {
		try
      	{
	    // Serialize data object to a file
      		FileOutputStream fileout = new FileOutputStream("mystore.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(s);
			out.close();
	     	}catch(IOException i) {
	      		i.printStackTrace();
	    	}
	}
	public static void retrieve() {
		Store s;
		try {
		         FileInputStream fileIn = new FileInputStream("mystore.ser");
		         ObjectInputStream in = new ObjectInputStream(fileIn);
		         s = (Store) in.readObject();
		         in.close();
		         fileIn.close();
     		}catch(IOException i)
     		{
       			  i.printStackTrace();
        		 return;
     		}catch(ClassNotFoundException c)
     		{
		         System.out.println("Store class not found");
		         c.printStackTrace();
		         return;
    		}
    		s.print();
    }

}

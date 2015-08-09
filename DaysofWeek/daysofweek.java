public class daysofweek
{
  native String[] returndays(); // This is the method we will be calling 

   static
   {
	  System.loadLibrary("daysofweek"); // The library file we will be creating for jni
   }

   static public void main(String args[]) 
   {
			    
	  daysofweek obj = new daysofweek(); // create a new object
      String[] days = obj.returndays(); // call the method

	  System.out.println(" > The days of the week are :: ");
	  for(String name: days)
		System.out.println(name);
   }
}


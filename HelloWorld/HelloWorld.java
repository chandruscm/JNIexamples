//HelloWorld.java

public class HelloWorld 
{
  native void cfunction();

  static
  {
	System.loadLibrary("forhelloworld"); 
  }

  public static void main(String args[]) 
  {
	HelloWorld obj = new HelloWorld();
	obj.cfunction(); 
   }
}

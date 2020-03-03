import java.util.ArrayList; 
public class creatingExceptions
	{

		public static void main(String[] args)
			{
				
				divideByZeroException(); 
				nullPointerException(); 
				castException(); 
				

			}
		
		
		
		
		public static void divideByZeroException()
		{ 
			try
				{ 
					int zero = 0; 
					int number = 5; 
					
					System.out.println(number/zero); 
				}
				
				catch(ArithmeticException exc)
				{ 
					System.out.println("You cannot divide by zero.");
				}
				
		}
		
		public static void nullPointerException()
		{ 
			
			try
				{ 
					Integer myNum = null; 
					
					myNum ++; 
					
				}
			
			catch(NullPointerException exc)
				{ 
					System.out.println("This is a null pointer exception ");
				}
		
		}
		
		public static void castException()
		{ 
			try 
			{
				Object myObject = new Integer(5); 
				String name = ((String) myObject); 
				
			}
			
			catch(ClassCastException exc)
				{ 
					System.out.println("You can't do this, cast exception.");
				}
			
			
		}
		
		
	}

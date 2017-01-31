package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide an arbitrary amount of integers to add/subtract");
        }
	   catch (IllegalArgumentException){
		System.err.println("Please provide a set of INTEGERS to add/subtract.");
    }     catch(NullPointerException){
		 System.err.println("Please provide a SET of integers to add/subtract.");
	}

    private static int addArguments(String[] args) {
	   int sum = 0;

	   if (args.length == 0){
			return 0;
	   }
	   else if (Integer.valueOf(args[0]) >= 0){
		   for (int i = 0; i < args.length; i++)
		   {
     		  	  sum += Integer.valueOf(args[i]);
		   }
	   }
	   else{
		   for (int i = 0; i < args.length; i++)
		   {
     		  	  sum -= Integer.valueOf(args[i]);
		   }
	   }
        return sum;
    }
}

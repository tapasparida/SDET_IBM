public class Passing_Array {

    public static void main(String[] args) {
	//Declaring an Array
	String [] carMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
		
	// Calling Print_Array method and passing carMake as a parameter
	printArray(carMake);
    }

    //This method accepts Array as an argument of type String 
    public static void printArray(String [] args){
	for(int i=0; i <= args.length-1; i++){
	    System.out.println( args[i] );
        }
    }
}
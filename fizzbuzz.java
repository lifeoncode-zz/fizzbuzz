public class fizzbuzz {
    public static void main(String[] args){

        // STATEMENTS FOR A for loop SHOULD ALWAYS BE IN BRACKETS
        //i ++ ~ post-increament 
        for (int i = 1; i <= 50; i ++){
            //CHECKING FOR DIVISIBILITY BY 3 AND PRINT 'FIZZ'
            if (i % 3 == 0){
                System.out.println("FIZZ");
            }

            //CHECKING FOR DIVISIBILTY BY 5 AND PRINT 'BUZZ'
            if (i % 5 == 0){
                System.out.println("BUZZ");
            }
        }
    }
}


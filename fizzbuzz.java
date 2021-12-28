public class fizzbuzz {
    public static void main(String[] args){

        // STATEMENTS FOR A for loop SHOULD ALWAYS BE IN BRACKETS
        //i ++ ~ post-increament 
        for (int i = 1; i <= 50; i ++){

            //CHECKING FOR DIVISIBILITY BY 3 AND 5 AND PRINT 'FIZZBUZZ'
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FIZZBUZZ");
            }
            
            //CHECKING FOR DIVISIBILITY BY 3 AND PRINT 'FIZZ'
            else if (i % 3 == 0){
                System.out.println("FIZZ");
            }

            //CHECKING FOR DIVISIBILTY BY 5 AND PRINT 'BUZZ'
            else if (i % 5 == 0){
                System.out.println("BUZZ");
            }

            //ELSE IF NONE OF THE IF STATEMENTS ARE TRUE JUST PRINT THE NUMBER
            else{
                System.out.println(i);
            }
        }   
    }
}


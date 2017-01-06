class TwoRandom
{

    public static void main(String[] args)
    {
        int roll1;
        int roll2;
        String result ="A tie!";
        
        //Assigning the two random numbers and finding the difference
        roll1 = RandomUtils.randomInt(1, 7);
        roll2 = RandomUtils.randomInt(1, 7);
        int difference = Math.abs(roll1-roll2);
        
        // if/elseif to find if the plater wins or loses - if neither => it's a tie
        if (difference == 1 || difference ==3 || difference == 5){
            result = "You lose!";
        } else if (difference == 2 || difference == 4 || difference == 6){
            result = "You win!";
        }
        
        System.out.printf("Your numbers are: %d and %d \n%s\n", roll1, roll2, result);
        
    }
}
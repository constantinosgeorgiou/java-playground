class Game {
    public static void main(String[] args) {
        System.out.println("1st \"Game\"\n");
        int total = 0;
        int score = 7;
        
        if (score == 7) {
            System.out.println("You score a touchdown!");
        }
        //If statement in a single line
        if (score == 3) System.out.println("You kick a field goal!");
        
        total = total + score;
        
        System.out.println("Total score: " + total);
        System.out.println();
        //------------------------------------------
        System.out.println("2nd \"Game\"\n");
        int playerScore = 12000;
        int playerLives = 3;
        int difficultyLevel = 10;
        
        System.out.println("Lives: " + playerLives);
        System.out.println("Difficulty: " + difficultyLevel);
        
        if (playerScore > 9999) {
            playerLives++;
            System.out.println("Extra life!");
            difficultyLevel = difficultyLevel + 5;
        }
        System.out.println("Lives: " + playerLives);
        System.out.println("Difficulty: " + difficultyLevel);
    }
}
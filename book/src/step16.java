class Wheel {
    public static void main(String[] args) {
        String phrase[] = {
            "A STITCH IN TIME SAVES NINE",
            "DON'T EAT YELLOW SNOW",
            "JUST DO IT",
            "DON'T LET YOUR DREAMS BE DREAMS",
            "SO JUST... DO IT",
            "NOTHING IS IMPOSSIBLE",
            "EVERY GOOD BOY DOES FINE",
            "I WANT MY MTV",
            "PLAY IT AGAIN, SAM",
            "FROSTY THE SNOWMAN",
            "HE WAS MADE OUT OF COCCAINE",
            "ONE MORE FOR THE ROAD",
            "HOME FIELD ADVANTAGE",
            "MY MILKSHAKE BRINGS ALL THE BOYS IN THE YARD",
            "NOW PANIC AND FREAK OUT",
            "AIN'T NOBODY GOT TIME FOR THAT",
            "WAR, WAR NEVER CHANGES",
            "I'M TIRED OF TYPING",
            "I GUESS I SHOULD STOP",
            "NOT",
            "I'M NEVER GONNA GIVE YOU UP",
            "NEVER GONNA LET YOU DOWN",
            "NEVER GONNA RUN AROUND AND",
            "DESSERT YOU",
            "IT'S PEANUT BUTTER JELLY TIME",
            "ALRIGHT, I'M DONE :P",
        };
        int[] letterCount = new int[26];
        for (int count = 0; count < phrase.length; count++) {
            String current = phrase[count];
            char[] letters = current.toCharArray();
            for (int count2 = 0; count2 < letters.length; count2++) {
                char lett = letters[count2];
                if ( (lett >= 'A') & (lett <= 'Z') ) {
                    letterCount[lett - 'A']++;
                }
            }
        }
        for (char count = 'A'; count <= 'Z'; count++) {
            System.out.print(count + ": " + letterCount[count - 'A'] + " ");
        }
        System.out.println();
    }
}
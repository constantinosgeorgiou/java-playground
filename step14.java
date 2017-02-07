class Spaceremover {
    public static void main(String[] args) {
        String sentence = "Oh shit Look A.. Sentence!";
        char[] strToChar = sentence.toCharArray();
        for (int i = 0; i < strToChar.length; i++) {
            char current = strToChar[i];
            if (current != ' ') {
                System.out.print(current);
            } else {
                System.out.print('.');
            }
        }
        System.out.println();
    }
}
public class FRQSolutions {

    public FRQSolutions() {
    }

    public void printNums(int value, int numRounds) {
        for (int i = 0; i < numRounds; i++) {
            int randomNum = (int) (Math.random() * 10);
            System.out.print(randomNum);
            while (randomNum != value) {
                randomNum = (int) (Math.random() * 10);
                System.out.print(randomNum);
            }
            System.out.println();
        }
    }

    public String longestStreak(String str) {
        int counter = 1;
        int maxOccurance = 1;
        String letterOfMax = str.charAt(0) + "";
        for (int i = 0; i < str.length() - 1; i++) {
            String letter = str.charAt(i) + "";
            String letterAfter = str.charAt(i + 1) + "";
            if (letter.equals(letterAfter)) {
                counter++;
            } else {
                if (maxOccurance < counter) {
                    maxOccurance = counter;
                    letterOfMax = letter;
                }
                counter = 1;
            }
        }
        return letterOfMax + " " + maxOccurance;
    }
}

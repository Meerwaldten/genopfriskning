import java.util.*;

public class Main {
    static ArrayList<String> theList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //sortering("hej","med","dig","hvad","sker");
        //properCase("MIKKEL Er en stor babY");
        /*
        printPrettyFigures(5, "*");
        printPrettyFigures(7, "!");
         */
        /*
        System.out.println("How long do you want your grass to maxium be?");
        double maxLength = scanner.nextDouble();
        System.out.println("How long is your grass now?");
        double currentLength = scanner.nextDouble();
        System.out.println(doesGrassNeedMowing(currentLength, maxLength));
         */
        /*
        Bog bog1 = new Bog(123, "Asgercito",2022);
        Bog bog2 = new Bog(456, "Din mor",2020);
        Bog bog3 = new Bog(789, "er sød",2021);
        Bog bog4 = new Bog(420, "Johannes er god", 1997);

        Bibliotek bibliotek = new Bibliotek();

        bibliotek.addBooks(bog1);
        bibliotek.addBooks(bog2);
        bibliotek.addBooks(bog3);

        System.out.println(bibliotek.isBookThere(bog4));
        System.out.println(bibliotek.isBookThere(bog2));
         */
        /*
        String test1 = "hej";
        String test2 = "dig";
        String test3 = "asger";
        theList.add(test1);
        theList.add(test2);
        theList.add(test3);
        System.out.println(doesArraylistContainString(theList,"ups"));
        System.out.println(doesArraylistContainString(theList,"ups"));
        */
        /*
        String[] test = {"hej","med","dig","hvad","så"};
        String test2 = "dig";
        String test3 = "nej";

        System.out.println(search(test, test2));
        System.out.println(search(test, test3));
         */
    }


    static int search (String[] liste, String test){
        int returnValue = 0;

        for (int i = 0; i < liste.length; i++) {
            if (liste[i].equals(test)) {
                returnValue = i;
                break;
            } else {
                returnValue = -1;
            }
        }
        try {
            if(returnValue == -1){
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("FEJL!");

        }


        return returnValue;
    }
    static void sortering (String string1, String string2, String string3, String string4, String string5){
        ArrayList<String> words = new ArrayList<>();
        words.add(string1);
        words.add(string2);
        words.add(string3);
        words.add(string4);
        words.add(string5);
        //Collections.sort(words);
        Collections.sort(words, Collections.reverseOrder());

        System.out.println(words);

        }
    static void properCase (String sentence){
        String[] test = sentence.split(" ");

        for (int i = 0; i < test.length; i++) {
            String currentWord = test[i];
            currentWord = currentWord.toUpperCase();
            if (currentWord.equals(test[i])){
                System.out.println(currentWord);
                System.out.println("Case 1");
            }
            else if(test[i].length() > 3){
                test[i] = test[i].toLowerCase();
                String testeren = test[i];
                testeren = testeren.substring(0,1).toUpperCase()+testeren.substring(1).toLowerCase();
                test[i] = testeren;
                System.out.println(testeren);
                System.out.println("Case 2");
            } else {
                test[i] = test[i].toLowerCase();
                System.out.println(test[i]);
                System.out.println("Case 3");
            }

        }


    }
    static void printPrettyFigures (int numberOfFigures, String figure){
        for (int i = 0; i < numberOfFigures; i++) {
            for (int j = 0; j < numberOfFigures; j++) {
                System.out.print(figure);
            }
            System.out.println();
        }
    }
    static int doesGrassNeedMowing(double currentLength, double maxiumLength){
        int daysUntillMow = 0;
        double growthPrDay = 0.8;

        while (currentLength < maxiumLength){
            currentLength += growthPrDay;
            daysUntillMow = daysUntillMow+1;
        }
        return daysUntillMow;
    }
    public static boolean doesArraylistContainString (ArrayList<String> list, String test){
        boolean returnValue = false;
        for (String s : list) {
            if (s.equals(test)) {
                System.out.println("Word found");
                returnValue = true;
                break;
       }
        }
            if (!returnValue) {
                System.out.println("Word added");
                theList.add(test);
            }

        return returnValue;
    }
}

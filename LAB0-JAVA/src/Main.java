import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        // Create variable
        int age = 19;
        long salary = 150000;
        float interestRate = 0.7f;  // 32-bit precision IEEE 754 floating point
        double weight = 62.2;       // 64-bit precision IEEE 754 floating point
        Character grade = 'A';
        String name = "Micky Mouse";
        boolean isStudent = true;

        // Convert datatype
        String year = "2021";
        int iYear = Integer.parseInt(year);         // string to int
        double dYear = Double.parseDouble(year);    // string to double
        long lYear = Long.parseLong(year);          // string to long
        boolean bPaid = Boolean.parseBoolean("True");   // string to boolean
        int iWeight = (int) weight;                        // double to int
        double dAge = (double) age;                        // int to double

        // Operation --------------------------------------------------------------------------------------------------
        int birthday = 1990;
        age = iYear - birthday;
        double money = salary * interestRate;               // long operate with float convert to double
        String fullname = "Mr. " + name;
        String info = fullname + " " + birthday;            // convert int to string

        // Selection Structure ----------------------------------------------------------------------------------------
        // if else
        if(age >= 18)
            System.out.println("You can pass");
        else
            System.out.println("Sorry, you can not pass");

        // if elseif else
        int input = 79;
        if(input >= 80)
            System.out.println("Your grade is A");
        else if (input >= 75)
            System.out.println("Your grade is B+");
        else
            System.out.println("Your grade is B");

        // switch case
        String sInput = "M";
        switch(sInput) {
            case "M":
                System.out.println("Good afternoon, Sir");
                break;
            case "W":
                System.out.println("Good afternoon, Mam");
                break;
            default:
                System.out.println("That's wrong input.");
        }
        // Repetition Structure ---------------------------------------------------------------------------------------
        // for
        System.out.println("loop for");
        for(int i = 0; i <= 10; i++)
            System.out.print("*");

        // nested for
        System.out.println("\r\nNested loop for");
        for(int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\r\n");
        }

        // while
        int i = 0;
        while (i < 10){
            System.out.print("*");
            i++;
        }

        // do while
        i = 0;
        do{
            System.out.print("*");
            i++;
        }while (i < 10);

        // break and continue
        for (i = 0; i <= 10; i++){
            if(i == 6) continue;
            if(i == 8) break;
            if(i % 2 == 0)
                System.out.print(i);
        }

        // Collections ------------------------------------------------------------------------------------------------
        // array
        String[] bike;
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        System.out.println(cars[0]);
        System.out.println(cars[3]);

        // loop on index array
        for (i = 0; i < myNum.length; i++) {
            System.out.println(myNum[i]);
        }

        // Loop Through an Array with For-Each
        for (String car : cars) {
            System.out.println(car);
        }

        //Multidimensional Arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        for (i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        // ArrayList
        // import the ArrayList class by
        // import java.util.ArrayList;
        ArrayList<String> heros = new ArrayList<String>(); // Create an ArrayList object
        heros.add("Ironman");
        heros.add("Captain America");
        heros.add("Thor");

        System.out.println(heros.get(0));

        heros.set(2, "Hulk");
        System.out.println(heros.get(2));

        heros.remove(1);
        System.out.println(heros.get(1));

        // loop all list
        for (String hero : heros) {
            System.out.println(hero);
        }

        // Hashmap
        // import the HashMap class
        // import java.util.HashMap;
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        capitalCities.get("England");

        capitalCities.remove("England");

        capitalCities.clear();

        // Print keys
        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }
        // print all data
        for (String key : capitalCities.keySet()) {
            System.out.println("key: " + key + " value: " + capitalCities.get(key));
        }
    }
}

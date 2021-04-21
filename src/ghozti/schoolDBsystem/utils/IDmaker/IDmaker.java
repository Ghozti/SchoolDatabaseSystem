package ghozti.schoolDBsystem.utils.IDmaker;

import java.util.Random;

public class IDmaker {

    /**
     * This method:
     * will take in a random number 12 times using rand.nextInt()
     * then it will add that number to the array.
     * then it will combine the array elements into a string
     */

    public String idGenerator(){
        Random rand = new Random();
        StringBuilder builder = new StringBuilder();

        int[] intArr = new int[12];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(9-0) + 0;
        }

        for (int i = 0; i < intArr.length; i++) {
            builder.append(intArr[i]);
        }

        return builder.toString();
    }
}

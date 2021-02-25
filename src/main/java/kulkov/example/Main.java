package kulkov.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Main {

    static int[] resultArray;
    static int[] testArray1 = { 134,14,3,423,423,42,34,235,74,7,5,3,4,324,2342,34,234,234,34, 4 };

    public static void main(String[] args) {

        splitArray(testArray1, resultArray, checkArray(testArray1));

        check1Or4Array(new int[] {1,1,1,1,1,1,1,4});

    }

    public static boolean check1Or4Array(int[] checkArray) {

        boolean result = true;

        for (int num :
                checkArray) {

            if(!(num == 4 || num == 1)) {
                result = false;
            }
        }

        return result;
    }


    static int checkArray(int[] arrayToSplit) throws RuntimeException  {

        int result = 0;

        if(arrayToSplit[arrayToSplit.length - 1] == 4)  {
            throw new RuntimeException();
        }

        for(int i = arrayToSplit.length - 1; i >= 0; i--)   {

            if(arrayToSplit[i] == 4)    {

                return i;
            }
        }

        throw new RuntimeException();
    }

    static void splitArray(int[] arrayToSplit, int[] resultArray, int firstElementPosition)    {

        int j = 0;
        resultArray = new int[arrayToSplit.length - firstElementPosition - 1];

        for(int i = firstElementPosition + 1; i < arrayToSplit.length; i++) {

            resultArray[j] = arrayToSplit[i];
            j++;

        }
    }
}

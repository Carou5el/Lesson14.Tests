package kulkov.example;

public class Main {

    // Тестовый массив.
    static int[] testArray = { 23,234, 234,123, 4, 32, 23 };
    static int[] resultArray;
    public static void main(String[] args) {

        checkArray(testArray);
    }

    static void checkArray(int[] arrayToSplit) throws RuntimeException  {

        for(int i = arrayToSplit.length - 1; i >= 0; i--)   {

            // При обнаружении "4" создаём новый массив, необходимого размера.
            if(arrayToSplit[i] == 4)    {
                resultArray = new int[(arrayToSplit.length - 1 - i)];
                splitArray(arrayToSplit, resultArray);
                return;
            }
        }
        throw new RuntimeException();

    }

    static void splitArray(int[] arrayToSplit, int[] resultArray)    {

        int j = 0;
        int firstElemPos = arrayToSplit.length - resultArray.length;

        for(int i = firstElemPos; i < arrayToSplit.length; i++) {

            resultArray[j] = arrayToSplit[i];
            j++;

        }
    }
}

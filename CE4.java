public class CE4 {

    public static void main(String[] args) {


        int[] arr = {3, 2, 1, 6, 3, 2, 8, 9, 5, 8, 9, 7, 9, 2, 3, 4};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] > arr[i]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }
        }

        int secondHighestElement = findSecondHighest(arr);

        System.out.println("The Second Highest Element is : " + secondHighestElement);

    }

    public static int findSecondHighest(int[] sortedArray) {

        int last = sortedArray[sortedArray.length - 1];
        for (int i = sortedArray.length - 2; i > 0; i--) {

            if (last != sortedArray[i]) {
                return sortedArray[i];
            }


        }
        return 0;
    }

}





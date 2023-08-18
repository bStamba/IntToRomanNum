import java.util.HashMap;

public class Roman {

    //Takes in an integer value, and then converts it to the roman numeral and returns the string.
    public String intToRoman(int num){
        String romanNum = "";
        int tempNum = num;
        int[] arr1 = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] arr2 = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        //Compare the int to each possible value, if the value of num is greater than or equal to the value
        //in our integer array, then subtract it and add the corresponding String letter to our romanNum string.
        for(int i = 0; i < arr1.length; i++){
            while(tempNum >= arr1[i]){
                romanNum = romanNum + arr2[i];
                tempNum = tempNum - arr1[i];
            }
        }
        return romanNum;
    }
}

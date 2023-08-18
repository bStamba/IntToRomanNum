public class Roman {

    //Takes in an integer value, and then converts it to the roman numeral and returns the string.
    public String intToRoman(int num){
        String romanNum = "";
        int val = num;

        while(val > 0){

            if(val > 999){
                val = val - 1000;
                romanNum = romanNum + "M";
            }
            else if(val >= 900){
                val = val - 900;
                romanNum = romanNum + "CM";
            }
            else if(val > 499){
                val = val - 500;
                romanNum = romanNum + "D";
            }
            else if(val >= 400){
                val = val - 400;
                romanNum = romanNum + "CD";
            }
            else if(val > 99){
                val = val - 100;
                romanNum = romanNum + "C";
            }
            else if(val >= 90){
                val = val - 90;
                romanNum = romanNum + "XC";
            }
            else if(val > 49){
                val = val - 50;
                romanNum = romanNum + "L";
            }
            else if(val >= 40){
                val = val - 40;
                romanNum = romanNum + "XL";
            }
            else if(val > 9){
                val = val - 10;
                romanNum = romanNum + "X";
            }
            else if(val == 9){
                val = val - 9;
                romanNum = romanNum + "IX";
            }
            else if(val > 4){
                val = val - 5;
                romanNum = romanNum + "V";
            }
            else if(val == 4){
                val = val - 4;
                romanNum = romanNum + "IV";
            }
            else{
                val = val - 1;
                romanNum = romanNum + "I";
            }
        }
        System.out.println("Roman numeral for " + num + " is: " + romanNum);
        return romanNum;
    }
}

class Solution {
    public String intToRoman(int num) {
        String roman = "";
        int[] storeInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] storeRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < storeInt.length; i++) {
            while (num >= storeInt[i]) {
                roman += storeRoman[i];
                num -= storeInt[i];
            }
        }   
        return roman;
    }
}






class Solution {
    public String intToRoman(int num) {
         
       String result = "";
       int original = num;
       
       if (original / 1000 > 0){
        int thousands = (int)original/1000;
        for (int i = thousands; i > 0; i--){
               result += "M";
            }
        original %= 1000;
       }

       if(original / 100 > 0){
        int hundreds =  (int)original/100;
        String stringHundreds = convert(hundreds, "D", "C", "M");
        original %= 100;
        result += stringHundreds;
       }
      if (original / 10 > 0){
        int decimals = (int)original/10;
        String stringDecimals = convert(decimals, "L", "X", "C");
        original %= 10;
        result += stringDecimals;

        }
     if (original > 0){
        String str =  convert(original, "V", "I", "X");
        result += str;
     }  
     return result; 
    }
    static String convert(int number, String symbol, String additionalSymbol, String caseNine) {
        String stringResult = "";
       
        if(number == 9){
            return additionalSymbol + caseNine;    
        }
        else if (number < 4){
            for (int i = number; i > 0; i--){
                stringResult += additionalSymbol;
            }
        } 
        else if (number == 4){
            stringResult = additionalSymbol + symbol;   
        }else if (number == 5){
            stringResult = symbol;
        }else{
            stringResult += symbol;
            for (int i = number; i > 5; i--){
            stringResult += additionalSymbol;
            }
        }    
        return stringResult;
    }
}
class Solution {
    public int maximum69Number (int num) {

        String number = Integer.toString(num);
        char[] digits = number.toCharArray();

        for(int i = 0; i < digits.length; i++){
            if(digits[i] == '6'){
                digits[i] = '9';
                String result = String.valueOf(digits);
                return Integer.parseInt(result);
            }
        }
        return num;
    }
}

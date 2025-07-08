class Solution {
    public int[] plusOne(int[] digits) {
    //     if(digits.length == 0){
    //         int []new_digits = new int[1];
    //         new_digits[0]=1;
    //         return new_digits;
    //     }
        
    //     StringBuilder s = new StringBuilder();
    //     for(int i =0;i<digits.length;i++){
    //         String number=Integer.toString(digits[i]);
    //         s.append(number);
    //     }
        
    //     long num = Long.parseLong(s.toString()); 
    //     num += 1;

    //     String s2 = Long.toString(num);
        
    //     if(s2.length() == digits.length){
    //         for(int i = 0;i<digits.length;i++){
    //             digits[i]=Character.getNumericValue(s2.charAt(i));
    //         }
    //     }
    //     else{
    //         int []new_digits = new int[s2.length()];
    //         for(int i = 0;i<new_digits.length;i++){
    //             new_digits[i]=Character.getNumericValue(s2.charAt(i));
    //         }
    //         return new_digits;
    //     }
    //     return digits;
    // }
        int n = digits.length;

        // Iterate from the rightmost digit (least significant)
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, we can simply increment it
            // and we are done. No carry-over needed.
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Return the modified array
            }
            // If the current digit is 9, set it to 0 and continue the loop
            // to handle the carry-over to the next digit (to the left)
            digits[i] = 0;
        }

        // If we reach this point, it means all digits were 9 (e.g., [9, 9, 9]).
        // We need to create a new array with an additional leading '1' and
        // all subsequent digits as '0'.
        // Example: [9, 9] + 1 becomes [1, 0, 0]
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // Set the first digit to 1
        // The rest of the newDigits array elements will be 0 by default,
        // which is exactly what we need (e.g., for [9,9], newDigits will be [1,0,0])

        return newDigits;
    }
}
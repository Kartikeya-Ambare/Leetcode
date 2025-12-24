class Solution {
    public int compress(char[] chars) {
        // Map<Character, Integer> mapp = new LinkedHashMap<>(); 
        
        // for (char ch : chars) {
        //     mapp.put(ch, mapp.getOrDefault(ch, 0) + 1);
        // }

        // StringBuilder sr = new StringBuilder();
        // for (Map.Entry<Character, Integer> entry : mapp.entrySet()) {
        //     char key = entry.getKey();
        //     int value = entry.getValue();
            
        //     sr.append(key);
        //     if (value > 1) {
        //         sr.append(value);
        //     }
        // }

        // char[] compressedChars = sr.toString().toCharArray();
        // for (int i = 0; i < compressedChars.length; i++) {
        //     chars[i] = compressedChars[i];
        // }

        // return sr.length();
        int index = 0;
        int i = 0;
        
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }
            
            chars[index++] = currentChar;
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char digit : countStr.toCharArray()) {
                    chars[index++] = digit;
                }
            }
        }
        
        return index;
    }
}
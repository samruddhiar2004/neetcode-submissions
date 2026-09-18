
class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return "";
        }
        
        StringBuilder encodedString = new StringBuilder();
        for (String s : strs) {
            // Pattern: [length] + [#] + [string]
            encodedString.append(s.length()).append('#').append(s);
        }
        return encodedString.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return decoded_strs;
        }
        
        int i = 0;
        while (i < str.length()) {
            // 1. Find the delimiter '#' starting from index i
            int delimiterIdx = str.indexOf('#', i);
            
            // 2. Parse the length of the upcoming string
            int length = Integer.parseInt(str.substring(i, delimiterIdx));
            
            // 3. Move pointer right past the '#' character
            i = delimiterIdx + 1;
            
            // 4. Extract the exact string data using the parsed length
            String s = str.substring(i, i + length);
            decoded_strs.add(s);
            
            // 5. Move pointer to the start of the next length prefix
            i += length;
        }
        
        return decoded_strs;
    }
}

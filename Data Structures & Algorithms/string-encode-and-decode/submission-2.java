// Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.
// but how do we know where to cut the ties while decoding.???
// maybe add something in between so we split with that in between..
// Format: <length>#<string>


class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }
    public List<String> decode(String s) {
        List<String> decodedStrs = new ArrayList<>();
        int i = 0; 
        while (i < s.length()) {
            int delimiter = s.indexOf('#', i);
            String lenStr = s.substring(i, delimiter);
            int len = Integer.parseInt(lenStr);
            int start = delimiter + 1;
            int end = start + len; 
            String str = s.substring(start, end);
            decodedStrs.add(str);
            i = end;
        }

        return decodedStrs;
    }
}
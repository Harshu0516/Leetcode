class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for (int i = 0; i < details.length; i++) {
            char f = details[i].charAt(11);
            char s = details[i].charAt(12);
            if (f > '6' || (f == '6' && s > '0')) {
                c++;
            }
        }
        return c;
    }
}
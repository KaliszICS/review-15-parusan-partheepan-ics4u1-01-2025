public class PracticeProblem {

    public static void main(String args[]) {

    }



//Question 1
public static int goodString(String s1) {
    int len = s1.length();
    int count = Integer.MAX_VALUE; 

    char firstLetter = s1.charAt(0);
    char lastLetter = s1.charAt(len - 1);

    if (len >= 2 && firstLetter == lastLetter) {
        return 0;
    }

    for (int i = 0; i < len; i++) {
        for (int back = len - 1; back > i; back--) {
            if (s1.charAt(i) == s1.charAt(back)) {
                int operations = i + (len - 1 - back);
                if (back - i + 1 >= 2 && operations < count) {
                    count = operations;
                }
            }
        }
    }

    if (count == Integer.MAX_VALUE) {
        return -1;
    }
    return count;
}
}
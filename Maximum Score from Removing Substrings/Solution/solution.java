class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> stack = new Stack<>();
        int score = 0;

        char first1 = 'a', first2 = 'b';
        int firstPoints = x, secondPoints = y;

        if (y > x) {
            first1 = 'b';
            first2 = 'a';
            firstPoints = y;
            secondPoints = x;
        }

        StringBuilder leftover = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first1 && c == first2) {
                stack.pop();
                score += firstPoints;
            } else {
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            leftover.append(stack.pop());
        }
        leftover.reverse();

        stack.clear();

        for (char c : leftover.toString().toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first2 && c == first1) {
                stack.pop();
                score += secondPoints;
            } else {
                stack.push(c);
            }
        }

        return score;
    }
}

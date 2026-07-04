class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int el2 = stack.pop(); 
                int el1 = stack.pop(); 
                int res = 0;

                if (s.equals("+")) {
                    res = el1 + el2;
                } else if (s.equals("-")) {
                    res = el1 - el2;
                } else if (s.equals("*")) {
                    res = el1 * el2;
                } else if (s.equals("/")) {
                    res = el1 / el2; 
                }

                stack.push(res);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }
}

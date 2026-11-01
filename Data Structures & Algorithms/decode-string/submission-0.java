class Solution {
    public String decodeString(String s) {
        Deque<StringBuilder> stringStack = new ArrayDeque<StringBuilder>();
        Deque<Integer> countStack = new ArrayDeque<Integer>();
        int number = 0 ;
        StringBuilder current = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '['){
                stringStack.push(current);
                current = new StringBuilder();
                countStack.push(number);
                number = 0 ;
            }
            else if(Character.isDigit(ch)){
                number = number* 10 + (ch-'0');
            }
            else if(ch == ']'){
                StringBuilder prev = stringStack.pop();
                int repCount = countStack.pop();
                for(int i = 0 ;i<repCount;i++){
                    prev.append(current);
                }
                current =prev;
            }
            else {
                current.append(ch);
            }
        }
        return current.toString();
    }
}
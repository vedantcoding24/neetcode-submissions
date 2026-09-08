class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
           if(stack.isEmpty()){
            if(ch=='['||ch=='('||ch=='{'){
                stack.push(ch);
            }
            else{
                return false;
            }
           }else{
            char top=stack.peek();
            if((ch==']'&& top=='[')||(ch==')'&& top=='(')||(ch=='}'&& top=='{')){
                stack.pop();
            }else if((ch=='['||ch=='('||ch=='{')&&(top=='['|| top=='{'||top=='(')){
                stack.push(ch);
            }
            else{
                return false;
            }
           }
        }

        return stack.isEmpty();
    }
}



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        
        Stack <Character> s = new Stack();
        
        for(int i = 0; i < x.length(); i++){
            if (s.isEmpty()){
            s.push(x.charAt(i));
            }
            else if(x.charAt(i) == ')' && s.peek() == '(' || x.charAt(i) == '}' && s.peek() == '{' || x.charAt(i) == ']' && s.peek() == '[')
            {
                s.pop();
            }
            
            
            else{
                s.push(x.charAt(i));
            }
        }
        if(s.isEmpty()) return true;
        else return false;
    }
}

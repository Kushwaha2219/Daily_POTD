class Solution
{
    String colName (long n)
    {
        StringBuilder str=new StringBuilder();
        
        while(n-->0){
            str.append((char)('A'+n%26));
            n=n/26;
        }
         return str.reverse().toString();
    }
   
}

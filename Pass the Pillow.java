class Solution {
    public int passThePillow(int n, int time) {
        int c = 1; 
        int person = 1; 
        for (int i = 0; i < time; i++) {
            person += c; 
            if (person == 1 || person == n) c *= -1; 
        }
        return person; 
    }
}

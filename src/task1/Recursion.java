package task1;

public class Recursion {
    private int result;
    public int mult(int x, int y){
        if(y==0){
            return result;
        } else {
            x += mult(x,y-1);
        }
        return x;
    }
}

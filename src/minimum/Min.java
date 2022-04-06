package minimum;

public class Min{

    public int getMinimum(int a, int b) {
        if(a <= b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static void main(String args[]){
    Min obj = new Min();
    int min = obj.getMinimum(5,995516516);
    System.out.println("Minimum: " + min);
    }
 }

import java.util.Set;
import java.util.Vector;

public class MethodOverload {
    Vector<String> a= new Vector<>();
    public void testOverload(){
        System.out.printf("square of 7 is %d\n",square(7));
        System.out.printf("square of 7.5 is %f\n",square(7.5));
    }
        public int square(int value){
            return value * value;
        }
        public double square(double value){
            return value * value;
        }
    }


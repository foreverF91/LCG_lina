import java.util.ArrayList;

public class Verification {
    public static final double m_n = 0.01;
    public static final double n_m =100;
    public int[] Counts(ArrayList<Integer> num){
        int[] counts=new int[100];
        for(int i=0;i<100;i++){
            counts[i]=0;
        }
        for(int i=0;i<num.size();i++){
            int temp=num.get(i);
            counts[temp]=counts[temp]+1;
        }
        return counts;
    }
    public double Calculate(int[] counts){
        double sum=0;
        for(int i=0;i<100;i++){
            sum=sum+Math.pow(counts[i]-n_m,2);
        }
        return m_n*sum;
    }
    public double veri(ArrayList<Integer> num){
        int[] count=Counts(num);
        return Calculate(count);
    }
}

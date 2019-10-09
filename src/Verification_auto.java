import java.util.ArrayList;

public class Verification_auto {
    public double veri(ArrayList<Integer> num){
        int sum=0;
        for(int i=0;i<num.size();i++){
            sum=sum+num.get(i);
        }
        double avg=sum/num.size();
        double sum2=0;
        for(int i=0;i<num.size();i++){
            sum2=sum2+Math.pow(num.get(i)-avg,2);
        }
        double sum3=0;
        for(int i=0;i<num.size()-5;i++){
            sum3=sum3+((num.get(i)-avg)*(num.get(i+5)-avg));
        }
        return sum3/sum2;
    }
}

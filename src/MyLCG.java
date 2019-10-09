import java.util.ArrayList;

public class MyLCG {
    private int modulus;
    private int a;
    private int c;
    private int seed;
    public MyLCG(int modulus,int a,int c,int seed){
    this.modulus=modulus;
    this.a=a;
    this.c=c;
    this.seed=seed;
    }
    public ArrayList<Integer> generate(){
        ArrayList<Integer> random=new ArrayList<Integer>();
        for(int i=0;i<10000;i++){
            seed=(a*seed+c)%modulus;
            random.add(Math.round(seed*100/modulus));
        }
        return random;
    }
    public static void main(String[] args){
        Verification v=new Verification();
        Verification_auto v2=new Verification_auto();
        MyLCG mylcg=new MyLCG(10000,3549,5233,(int) ((System.nanoTime()/100)%100));
//        MyLCG mylcg=new MyLCG(100,41,7,6);
        ArrayList<Integer> Mynum=mylcg.generate();

        double MyresultR=v2.veri(Mynum);
        double Myresult=v.veri(Mynum);
        System.out.println(Myresult);
        System.out.println("R    :"+MyresultR);

        readRandom random=new readRandom();
        ArrayList<Integer> num=random.read();
        double result=v.veri(num);
        double resultR=v2.veri(num);
        System.out.println(result);
        System.out.println("R    :"+resultR);
    }
}

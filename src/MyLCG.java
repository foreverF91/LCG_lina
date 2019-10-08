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
    public void generate(){
        for(int i=0;i<100;i++){
            seed=(a*seed+c)%modulus;
            System.out.println(seed);
        }
    }
    public static void main(String[] args){
        MyLCG mylcg=new MyLCG(32,2,2,5);
        mylcg.generate();
    }
}

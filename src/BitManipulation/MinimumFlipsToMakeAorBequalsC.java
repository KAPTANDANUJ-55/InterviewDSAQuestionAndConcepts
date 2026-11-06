package BitManipulation;

public class MinimumFlipsToMakeAorBequalsC {

    public static int minFlips(int a, int b, int c) {

        int Nflips =0;

        while(a>0 || b>0 || c>0){
            int bitA =  a &1;
            int bitB = b &1;
            int bitC = c &1;

            if(bitC==1){
                if(bitA==0 && bitB==0){
                    Nflips++;
                }

            } else{
                if(bitA==1){
                    Nflips += bitA;
                }

                if(bitB==1){
                    Nflips += bitB;
                }
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return Nflips;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 5;

        int res = minFlips(a,b,c);

        System.out.println("Your Ops Is: "+res);
    }
}

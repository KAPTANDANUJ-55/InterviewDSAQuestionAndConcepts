package SlidingWIndow;

public class MaximumYouObtainFromCard {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int sum=0;

        for(int i=0;i<k;i++){
            sum+= cardPoints[i];
        }

        int maxPoints =sum;
        int backInd =n-1;
        for(int i=k-1;i>=0;i--){
            sum -= cardPoints[i];
            sum+= cardPoints[backInd];
            backInd--;
            maxPoints = Math.max(maxPoints, sum);
        }

        return maxPoints;
    }

    public static void main(String[] args) {
        int[] cardPoints ={1,2,3,4,5,6,1};
        int k = 3;

        System.out.println(new MaximumYouObtainFromCard().maxScore(cardPoints, k));
    }
}

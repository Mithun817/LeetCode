class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount < 5) return 100;
        else if(purchaseAmount%10==5) return 100-(purchaseAmount+5);
        else if(purchaseAmount < 10) return 90;
        else 
        {
            //int n = (String.valueOf(purchaseAmount).length());
            if(purchaseAmount % 10 > 5) return 100 - ((purchaseAmount/10)+1)*10;
            return 100 - (purchaseAmount/10)*10;
        }
    }
}
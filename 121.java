class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int max = 0;

        for(int price : prices){
            if(price < minPrice)

            minPrice = price;
        
        else if(price - minPrice > max){
            max = price - minPrice;
        }

    }
    return max;
}
}

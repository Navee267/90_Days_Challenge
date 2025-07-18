class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            int profit = price - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {1,2,3,4,5,6,7,8};
        int profit = obj.maxProfit(arr);
        System.out.println("MaxProfit is " + profit);
    }
}
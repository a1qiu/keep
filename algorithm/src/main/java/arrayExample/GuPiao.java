package arrayExample;

/**
 * @author mawei
 * @date 11/30/20
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * <p>
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * <p>
 */
public class GuPiao {
    public static void main(String[] args) {
        int[] p = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(p));
    }

    public static int maxProfit(int[] price) {
        int profit = 0;
        for (int i = 1; i < price.length; i++) {
            int temp = price[i] - price[i - 1];
            if (temp > 0)
                profit += temp;
        }
        return profit;
    }
}

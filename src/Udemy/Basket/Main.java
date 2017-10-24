package Udemy.Basket;

import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86,100);
        stockList.addStock(temp);

        temp = new StockItem("car", 102, 2);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("chair", 20, 120);
        stockList.addStock(temp);

        temp = new StockItem("door", 26.39, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 13, 60);
        stockList.addStock(temp);

        temp = new StockItem("phone", 67.46, 34);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()){
            System.out.println(s);
        }

        Basket grigoryBasket = new Basket("Grigory");
        sellItem(grigoryBasket,"car", 20);
        System.out.println(stockList);

        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + " costs" + price.getValue());
        }
    }
    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem==null){
            System.out.println("We don't sell" +item);
            return 0;
        }
        if (stockList.reserveStock(item,quantity)!=0){
            return basket.addToBasket(stockItem,quantity);
        }
        return 0;
    }
    public static int removeItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell" + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket){
        for(Map.Entry<StockItem, Integer> item : basket.Item().entrySet()){
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}

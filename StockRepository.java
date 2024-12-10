import java.util.HashMap;
import java.util.Map;

public class StockRepository {
    private Map<String, Stock> stocks = new HashMap<>();

    public StockRepository() {
        stocks.put("AMZN", new Stock("AMZN", "Amazon", 3400.00, 0));
	stocks.put("AAPL", new Stock("AAPL", "Apple", 150.00, 0));
	stocks.put("GOOGL", new Stock("GOOGL", "Google", 2800.00, 0));
	stocks.put("MSFT", new Stock("MSFT", "Microsoft", 300.00, 0));
	stocks.put("META", new Stock("META", "Meta Platforms", 380.00, 0)); 	stocks.put("TSLA", new Stock("TSLA", "Tesla", 700.00, 0));
	stocks.put("NFLX", new Stock("NFLX", "Netflix", 650.00, 0));
	stocks.put("NVDA", new Stock("NVDA", "NVIDIA", 550.00, 0)); 
	stocks.put("INTC", new Stock("INTC", "Intel", 55.00, 0));
	stocks.put("AMD", new Stock("AMD", "Advanced Micro Devices", 110.00, 0));
	stocks.put("SPOT", new Stock("SPOT", "Spotify", 200.00, 0));
	stocks.put("PYPL", new Stock("PYPL", "PayPal", 270.00, 0));
	stocks.put("BABA", new Stock("BABA", "Alibaba", 100.00, 0));
	stocks.put("SQ", new Stock("SQ", "Block", 220.00, 0)); 
	stocks.put("CRM", new Stock("CRM", "Salesforce", 220.00, 0));
	stocks.put("DIS", new Stock("DIS", "Walt Disney", 180.00, 0));
	stocks.put("ORCL", new Stock("ORCL", "Oracle", 90.00, 0));
	stocks.put("ADBE", new Stock("ADBE", "Adobe", 600.00, 0));
	stocks.put("IBM", new Stock("IBM", "IBM", 130.00, 0));
	stocks.put("TWTR", new Stock("TWTR", "Twitter", 50.00, 0));
	stocks.put("V", new Stock("V", "Visa", 240.00, 0)); 
	stocks.put("MA", new Stock("MA", "Mastercard", 370.00, 0));         
    }

    public void saveStock(Stock stock) {
        stocks.put(stock.getStockSymbol(), stock);
    }

    public Stock getStockBySymbol(String stockSymbol) {
        return stocks.get(stockSymbol);
    }

    public void updateStockPrice(String stockSymbol, double newPrice) {
        Stock stock = stocks.get(stockSymbol);
        if (stock != null) {
            stock.setCurrentPrice(newPrice);
        }
    }

    public void deleteStock(String stockSymbol) {
        stocks.remove(stockSymbol);
    }
}

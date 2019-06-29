import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String GOOGLE_SEARCH_URL = "https://www.google.com/search";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the search query: ");
        String searchQuery = scanner.nextLine();
        scanner.close();

        String searchURL = GOOGLE_SEARCH_URL + "?q=" + searchQuery;

        try {
            Document document = Jsoup.connect(searchURL)
                    .userAgent("Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML like Gecko) Chrome/44.0.2403.155 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();

            Element result = document.select("div.r > a").first();

            String URL = result.attr("href");
            String title = result.select("h3").text();

            System.out.println("Title: " + title + "\nURL: " + URL);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

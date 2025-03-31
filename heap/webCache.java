package heap;

import java.util.HashMap;

public class webCache {
    private HashMap<String, String> cache;

    public webCache(){
        this.cache = new HashMap<>();
    }

    private String fetchWebPageContent(String url){
        return "Content of " + url;
    }

    public String getWebPageContent(String url){
        if (cache.containsKey(url)) {
            System.out.println("Fetching from cache: "+ url);
            return cache.get(url);
        } else {
            System.out.println("Fetching from the web "+ url);
            String content = fetchWebPageContent(url);
            cache.put(url, content);
            return content;
        }
        
    }
    public static void main(String[] args){
        webCache webpage = new webCache();

        String url1 = "http://example.com/page1";
        String url2 = "http://example.com/page2";

        System.out.println(webpage.getWebPageContent(url1));
        System.out.println(webpage.getWebPageContent(url2));

        System.out.println(webpage.getWebPageContent(url1));
        System.out.println(webpage.getWebPageContent(url2));
    }
}

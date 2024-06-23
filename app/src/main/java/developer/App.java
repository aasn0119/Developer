
package developer;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class App {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        String url = "https://example.com/";

        Request request = new Request.Builder()
                .url(url)
                .build();

       try(Response response = client.newCall(request).execute()) {
           if (!response.isSuccessful()) {
               System.out.println("Something went wrong: ");
           }
            System.out.println(response.body().string());
       } catch (Exception e) {
              e.printStackTrace();
       }
    }
}

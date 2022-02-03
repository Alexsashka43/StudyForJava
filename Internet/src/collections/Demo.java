package collections;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/alarms/v1/5day/")//ключ Питер
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().toString());
    }
}

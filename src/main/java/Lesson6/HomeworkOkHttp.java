package Lesson6;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Scanner;

public class HomeworkOkHttp {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        System.out.println("Введите API Key: ");
        Scanner scanner = new Scanner(System.in);
        String apiKey = scanner.nextLine();

        Request request = new Request.Builder()
                .url("https://api.weather.yandex.ru/v2/forecast?lat=59.939099&lon=30.315877&lang=ru_RU&limit=5&extra=true")
                .get()
                .addHeader("X-Yandex-API-Key", apiKey)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        int responseCode = response.code();
        String responseBody = response.body().string();

        System.out.println(responseCode);
        System.out.println(responseBody);
    }
}

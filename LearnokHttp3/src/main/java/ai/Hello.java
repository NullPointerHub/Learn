package ai;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.net.InetAddress;

/**
 * @author liujd65
 * @date 2021/11/10 17:14
 **/
public class Hello {
    public static void main(String[] args) throws Exception{
        String url = "http://wwww.baidu.com";
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(url)
                .build();



        final Call call = okHttpClient.newCall(request);

        Response response = call.execute();
        System.out.println(response);

    }
}

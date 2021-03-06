package advisor.ocl.DAL.impl;

import android.app.Application;
import android.content.Context;
import android.provider.Settings;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.StringWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;

import advisor.ocl.DAL.api.AbstractAnswerFetcher;
import advisor.ocl.DAL.api.IAnswerFetcher;
import advisor.ocl.domain.User;
import advisor.ocl.main.App;
import advisor.ocl.util.ConstantLoader;
import advisor.ocl.util.FWriter;

/**
 * Created by ezarsto on 16.9.2015..
 */
public class AnswerFetcherMock extends AbstractAnswerFetcher implements IAnswerFetcher {

    User user;
    OkHttpClient client = new OkHttpClient();
    String responseStr = "";

    public AnswerFetcherMock() {}

    @Override
    public String getAnswer()
    {
        downloadFile();

        return responseStr;
    }

    @Override
    public void downloadFile() {
        try {
            String contentMock = mockSerialize();

            Boolean isPorxyEnabled = true;
            if(isPorxyEnabled) {
                Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("172.17.64.132", 8080));
                client.setProxy(proxy);
            }

            //  String url = "http://www.google.com";
            String url = "http://10.0.2.2:49873";
            Request request = new Request.Builder()
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();
            responseStr = response.body().string();
            if(response.isSuccessful() && response.code() == 200)
                deserialize();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            responseStr = "error = " + e.getMessage() + " | " + e.getStackTrace().toString();
        }
    }

    @Override
    public void deserialize() {
        try {
        Serializer serializer = new Persister();
        user = serializer.read(User.class, ConstantLoader.USER_PATH);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    private String mockSerialize() throws Exception {
        User user2 = new User();
        user2.setAndroidId(Settings.Secure.ANDROID_ID);
        user2.setUKey("65r4g6d");

        StringWriter sw = new StringWriter();

        Serializer serializer = new Persister();
        serializer.write(user2, sw);

        return sw.toString();
    }
}

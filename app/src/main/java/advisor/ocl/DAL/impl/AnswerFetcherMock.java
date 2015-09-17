package advisor.ocl.DAL.impl;

import android.provider.Settings;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.StringWriter;

import advisor.ocl.DAL.api.IAnswerFetcher;
import advisor.ocl.domain.User;
import advisor.ocl.util.ConstantLoader;

/**
 * Created by ezarsto on 16.9.2015..
 */
public class AnswerFetcherMock implements IAnswerFetcher {

    User user;
    String contentMock;

    @Override
    public String getAnswer() {
        return null;
    }

    @Override
    public void downloadFile() {

    }

    @Override
    public void deserialize() {
        try {
            mockSerialize();


        Serializer serializer = new Persister();
        user = serializer.read(User.class, ConstantLoader.USER_PATH);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void mockSerialize() throws Exception {
        User user2 = new User();
        user2.setAndroidId(Settings.Secure.ANDROID_ID);
        user2.setUKey("65r4g6d");

        StringWriter sw = new StringWriter();

        Serializer serializer = new Persister();
        serializer.write(user, sw);

        contentMock = sw.toString();
    }
}

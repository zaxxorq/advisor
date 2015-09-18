package advisor.ocl.main;

import android.app.Application;
import android.content.Context;

/**
 * Created by ezarsto on 18.9.2015..
 */
public class App extends Application {
    private static App instance;

    public static App getInstance() {
        return instance;
    }

    public static Context getContext(){
        return instance.getApplicationContext();
    }

    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
    }

}

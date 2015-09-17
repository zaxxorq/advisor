package advisor.ocl.DAL.api;

import android.content.Context;

/**
 * Created by ezarsto on 17.9.2015..
 */
public abstract class AbstractAnswerFetcher implements IAnswerFetcher {
    protected Context context;

    public AbstractAnswerFetcher(Context context){
        this.context = context;

    }

    public abstract String getAnswer();
    public abstract void downloadFile();
    public abstract void deserialize();
}

package advisor.ocl.DAL.api;

import android.content.Context;

/**
 * Created by ezarsto on 17.9.2015..
 */
public abstract class AbstractAnswerFetcher
{
    protected abstract void downloadFile();
    protected abstract void deserialize();
}

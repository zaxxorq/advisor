package advisor.ocl.DAL.impl;

import android.content.Context;

import advisor.ocl.DAL.api.IAnswerFetcher;

/**
 * Created by ezarsto on 17.9.2015..
 */
public class AnswerFactory {
    public static IAnswerFetcher getInstance(Context context)
    {
        //TODO: implement magic
        // context.getClass();
        return new AnswerFetcherMock();
    }
}

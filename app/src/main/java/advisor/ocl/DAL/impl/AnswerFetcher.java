package advisor.ocl.DAL.impl;

import android.content.Context;

import advisor.ocl.DAL.api.AbstractAnswerFetcher;
import advisor.ocl.DAL.api.IAnswerFetcher;

/**
 * Created by ezarsto on 16.9.2015..
 */
public class AnswerFetcher extends AbstractAnswerFetcher {
    public AnswerFetcher(Context context) {
        super(context);
    }

    @Override
    public String getAnswer() {
        return null;
    }

    @Override
    public void downloadFile() {

    }

    @Override
    public void deserialize() {

    }
}

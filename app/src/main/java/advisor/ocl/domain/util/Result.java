package advisor.ocl.domain.util;

/**
 * Created by ezarsto on 16.9.2015..
 */
public class Result extends  AbstractResult {
    @Override
    void init() {

    }

    public void setStatus(Status status) {
       super.setStatus(status);
    }

    public void setMessage(String message) {
        super.setMessage(message);
    }
}

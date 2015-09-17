package advisor.ocl.domain.util;

/**
 * Created by ezarsto on 16.9.2015..
 */
public class ResultError extends AbstractResult {

    public ResultError(Exception ex)
    {
        super();
        setMessage(ex.getMessage());
    }

    @Override
    void init() {
        setStatus(Status.error);
    }
}

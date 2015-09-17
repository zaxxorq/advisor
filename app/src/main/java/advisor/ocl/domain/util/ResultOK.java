package advisor.ocl.domain.util;

/**
 * Created by ezarsto on 16.9.2015..
 */
public class ResultOK extends AbstractResult {
    @Override
    void init() {
        setStatus(Status.ok);
    }
}

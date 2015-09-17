package advisor.ocl.domain.util;

/**
 * Created by ezarsto on 16.9.2015..
 */
public abstract class AbstractResult {
    private Status status;
    private String message;

    public AbstractResult(){init();}
    public AbstractResult(String message)
    {
        init();
        setMessage(message);
    }

    abstract void init();

    public Status getStatus() {
        return status;
    }

    protected void setStatus(Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    protected void setMessage(String message) {
        this.message = message;
    }
}

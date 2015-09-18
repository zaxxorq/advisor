package advisor.ocl.domain;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class User {
    @Element
    private String AndroidId;
    @Element
    private String UKey;

    public String getAndroidId() {
        return AndroidId;
    }

    public void setAndroidId(String androidId) {
        AndroidId = androidId;
    }

    public String getUKey() {
        return UKey;
    }

    public void setUKey(String UKey) {
        this.UKey = UKey;
    }
}

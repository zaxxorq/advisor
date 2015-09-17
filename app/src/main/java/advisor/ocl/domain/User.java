package advisor.ocl.domain;

import org.simpleframework.xml.Root;

@Root
public class User {
    private String AndroidId;
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

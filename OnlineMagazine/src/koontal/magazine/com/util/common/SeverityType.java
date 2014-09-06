

package koontal.magazine.com.util.common;

/**
 * This is the SeverityType enum that would define the SeverityType in 
 * 
 * 
 * @author KOONTAL
 * @version
 */
public enum SeverityType {

    HIGH("1"), MEDIUM("2"), LOW("3");

    private final String value;

    SeverityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeverityType fromValue(String v) {
        for (SeverityType c : SeverityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

/**
 * 
 */
package koontal.magazine.com.util.common;

import org.springframework.stereotype.Component;

/**
 * @author KOONTAL
 *
 */
@Component
public class MagazineFieldLevelError {
	private String field;

    private String message;

    public MagazineFieldLevelError() {
    }

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

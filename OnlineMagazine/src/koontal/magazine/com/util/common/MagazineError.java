/**
 * 
 */
package koontal.magazine.com.util.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author KOONTAL
 *
 */
@Component
public class MagazineError {

	private String                errorCode;

    private SeverityType          severity;

	private String                functionalErrMsg;

    private String                technicalErrMsg;

    private List<MagazineFieldLevelError> fieldErrors = new ArrayList<MagazineFieldLevelError>();
    
    public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public SeverityType getSeverity() {
		return severity;
	}

	public void setSeverity(SeverityType severity) {
		this.severity = severity;
	}

	public String getFunctionalErrMsg() {
		return functionalErrMsg;
	}

	public void setFunctionalErrMsg(String functionalErrMsg) {
		this.functionalErrMsg = functionalErrMsg;
	}

	public String getTechnicalErrMsg() {
		return technicalErrMsg;
	}

	public void setTechnicalErrMsg(String technicalErrMsg) {
		this.technicalErrMsg = technicalErrMsg;
	}

	public List<MagazineFieldLevelError> getFieldErrors() {
		return fieldErrors;
	}

	public void setFieldErrors(List<MagazineFieldLevelError> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}

}

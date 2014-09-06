/**
 * 
 */
package koontal.magazine.com.util.common;


/**
 * @author KOONTAL
 *
 */
public class CommonResponse {

	private StatusType status       = null;

    private String     responseCode = null;

    private String     responseMsg  = null;

    private MagazineError error        = null;

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public MagazineError getError() {
		return error;
	}

	public void setError(MagazineError error) {
		this.error = error;
	}
}

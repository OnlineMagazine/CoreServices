/**
 * 
 */
package koontal.magazine.com.util.common;

import koontal.magazine.com.constants.MagazineConstants;

/**
 * @author KOONTAL
 *
 */
public enum StatusType {

	SUCCESS(MagazineConstants.SUCCESS),
	FAILURE(MagazineConstants.FAILURE),
	FUNC_FAILURE(MagazineConstants.FUNC_FAILURE);
	
	private final String value;

	/**
	 * @param value
	 */
	private StatusType(String v) {
		this.value = v;
	}
	
	public String value(){
		return value;
	}
	
	public static StatusType fromValue(String v) {
		for(StatusType c:StatusType.values()){
			if(c.value.equals(v)){
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
	
}

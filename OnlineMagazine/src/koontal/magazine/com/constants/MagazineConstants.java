/**
 * 
 */
package koontal.magazine.com.constants;

/**
 * @author KOONTAL
 *
 */
public interface MagazineConstants {

	String SCHEMA="onlinemagazine";
	
	
	/* Service response error and success codes and messages */
    String OK                     = "200";
    String INTERNAL_ERROR_CODE    = "500";
    String UNAUTHORIZED           = "401";
    String INTERNAL_ERROR_MESSAGE = "Internal Server Error";
    String SUCCESS                = "success";
    String FAILURE                = "failure";
    String FUNC_FAILURE           = "functional error";
    String FUNC_ERROR_CODE_SUFFIX = ".code";
    String LOGIN_SUCCESS          = "Logged in Successfully";

    /* Mime types */
    String APPLICATION_JSON       = "application/json";
    String APPLICATION_XML        = "application/xml";

    /* General Constants */
    String EQUALS                 = "=";

    /* Export File constants */
    String GETFILE                = "/file";
    String IMPORTFILE             = "/uploadSurvey/{uniqueSurveyId}/{clientId}";
    String IMPORTFILELOCAL        = "/importFileLocal/{cookie}";
    String EXPORT                 = "/export";
    String IMPORT                 = "/importer";

    /* MIME Types */
    String APPLICATION_PDF        = "application/pdf";
    String APPLICATION_EXCEL      = "application/vnd.ms-excel";

    /* SESSION Related Constants */
    int    SESSION_EXPIRY_TIME    = 30;

    String UPLOAD_FAILED          = "Upload file failed";
    String UPLOADED               = "File Uploaded";

}

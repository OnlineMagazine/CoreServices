/**
 * This program is proprietary to Tata Consultancy Services LTD and is not to be
 * reproduced, used, or disclosed without permission of:
 *
 *  Tata Consultancy Services LTD
 *  Chennai
 *
 * File Name: PostgreSQLDialect.java
 * Application: ReportingFramework
 * Created on Jun 20, 2013
 */

package koontal.magazine.com.util;

import java.sql.Types;
import org.hibernate.dialect.PostgreSQL82Dialect;

/**
 * Postgres Dialect class for Array type
 * 
 * @author 661128
 * @version 1.0
 */

public class PostgreSQLDialect extends PostgreSQL82Dialect {

    public PostgreSQLDialect() {
        super();
        registerHibernateType(Types.ARRAY, "array");
        registerColumnType(Types.ARRAY, "array");
    }

}

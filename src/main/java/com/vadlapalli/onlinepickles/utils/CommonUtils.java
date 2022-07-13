package com.vadlapalli.onlinepickles.utils;

import java.util.Objects;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonUtils {
	 private static final String EMAIL_PATTERN = "^[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
	    private static final String NUMERIC_PATTERN = "^[+0-9-\\\\(\\\\)\\\\s]*{6,14}$";
	    public static final String UUID_REGEX_PATTERN = "^[{]?[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}[}]?$";
	    private static final String POSITIVE_NUMERIC_PATTERN = "^[1-9]\\d*$";
	    private static final String THREE_DIGIT_NUMERIC_PATTERN = "^[0-9][0-9][0-9]$";

	    public static final String POSITIVE_NUM_PATTERN_1 = "^[0-9]*$";
	    public static final String ALPHA_PATTERN_1 = "^[a-zA-Z\\s-]*$";
	    public static final String ALPHA_NUM_PATTERN_1 = "^[A-Za-z0-9\\s-]*$";
	    public static final String ALPHA_NUM_SPEC_PATTERN_1 = "^[A-Za-z0-9@.'-/#&+\\s]*$";

	    public static final String POSITIVE_NUM_PATTERN_2 = "^[0-9]+$";
	    public static final String ALPHA_PATTERN_2 = "^[a-zA-Z\\s-]+$";

	    public static final String ALPHA_PATTERN_3 = "^[a-zA-Z\\s-_]+$";
	    public static final String ALPHA_NUM_PATTERN_2 = "^[A-Za-z0-9\\s-]+$";
	    public static final String ALPHA_NUM_SPEC_PATTERN_2 = "^[A-Za-z0-9@.'-/#&+\\s]+$";

	    public static final String ALPHA_ONLY_PATTERN_1 = "^[a-zA-Z\\s]*$";
	    public static final String ALPHA_ONLY_PATTERN_2 = "^[a-zA-Z\\s]+$";

	    public static final String CURRENCY_CODE_PATTERN = "^[A-Z][A-Z][A-Z]$";
	    public static final String COUNTRY_CODE_PATTERN = "^[A-Z][A-Z]$";

	    public static boolean containsAlphabets(String str) {
	        str = str.trim();
	        return str.matches("[A-Za-z ]+");
	    }
	    
	    public static boolean isValidEmail(final String email) {
	        return Pattern.matches(EMAIL_PATTERN, StringUtils.stripAccents(email));
	    }
	    
	    public static String getValue(final Object value) {
	        if (Objects.isNull(value)) {
	            return null;
	        }
	        return value.toString();
	    }
	    
	    public static boolean nonNull(Object obj) {
	        return obj != null;
	    }

		public static boolean isValidPassword(String password) {
			 return Pattern.matches(ALPHA_NUM_SPEC_PATTERN_2, StringUtils.stripAccents(password));
		}
}

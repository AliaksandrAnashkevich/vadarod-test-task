package by.vadarod.nbrb.task.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StringUtil {

    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String DATE_FORMAT_PATTERN = "^\\d{4}-\\d{2}-\\d{2}$";
    public static final String STRING_EMPTY_MESSAGE_ERROR = "field cannot be empty";
    public static final String INVALID_DATE_FORMAT_MESSAGE_ERROR = "field invalid date format";
}

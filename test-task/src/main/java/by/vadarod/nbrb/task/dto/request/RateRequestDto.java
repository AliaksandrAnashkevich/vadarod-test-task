package by.vadarod.nbrb.task.dto.request;

import static by.vadarod.nbrb.task.util.StringUtil.DATE_FORMAT_PATTERN;

import by.vadarod.nbrb.task.util.StringUtil;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class RateRequestDto {

    @NotBlank(message = "date " + StringUtil.STRING_EMPTY_MESSAGE_ERROR)
    @Pattern(regexp = DATE_FORMAT_PATTERN, message = "date " + StringUtil.INVALID_DATE_FORMAT_MESSAGE_ERROR)
    String date;

    @NotBlank(message = "curId " + StringUtil.STRING_EMPTY_MESSAGE_ERROR)
    String curId;
}

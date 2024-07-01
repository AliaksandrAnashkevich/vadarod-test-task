package by.vadarod.nbrb.task.service;

import by.vadarod.nbrb.task.dto.request.RateRequestDto;
import by.vadarod.nbrb.task.dto.request.RateSearchRequestDto;

public interface RateService {

    String getAllRatesForDay(RateSearchRequestDto dto);

    String getRateForDayAndCurId(RateRequestDto dto);
}

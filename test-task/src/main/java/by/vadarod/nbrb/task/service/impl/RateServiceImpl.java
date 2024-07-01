package by.vadarod.nbrb.task.service.impl;

import by.vadarod.nbrb.task.dto.parser.JsonRateDto;
import by.vadarod.nbrb.task.dto.request.RateRequestDto;
import by.vadarod.nbrb.task.dto.request.RateSearchRequestDto;
import by.vadarod.nbrb.task.repository.RateRepository;
import by.vadarod.nbrb.task.service.RateService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URL;
import java.util.List;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class RateServiceImpl implements RateService {

    private final String NBRB_URL = "https://api.nbrb.by/exrates/rates?ondate=%s&periodicity=0";

    RateRepository rateRepository;
    RestTemplate restTemplate = new RestTemplate();


    @Override
    public String getAllRatesForDay(RateSearchRequestDto dto) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            URL json = new URL(String.format(NBRB_URL, dto.getDate()));
            List<JsonRateDto> jsonList = objectMapper
                .readValue(json, objectMapper.getTypeFactory().constructCollectionType(List.class, JsonRateDto.class));

            return "String";
        } catch (Exception e) {
            e.printStackTrace();
            return "exception";
        }
    }

    @Override
    public String getRateForDayAndCurId(RateRequestDto dto) {
        return null;
    }
}

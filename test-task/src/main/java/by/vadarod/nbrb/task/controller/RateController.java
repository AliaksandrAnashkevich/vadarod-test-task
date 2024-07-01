package by.vadarod.nbrb.task.controller;


import by.vadarod.nbrb.task.dto.request.RateSearchRequestDto;
import by.vadarod.nbrb.task.service.RateService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class RateController {

    RateService rateService;

    @PostMapping("/rate/download")
    public ResponseEntity<String> downloadRates(@RequestBody @Valid RateSearchRequestDto dto){
        return ResponseEntity.ok(rateService.getAllRatesForDay(dto));
    }
}

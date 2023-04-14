package service.co3201;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.thymeleaf.expression.Arrays;

import model.co3201.RefereeNameData;

@Service
public class ApiService {
    @Value("${api.key}")
    private String apiKey;
    
    public List<RefereeNameData> fetchData() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", apiKey);
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<RefereeNameData[]> response = restTemplate.exchange(
            "https://api.example.com/data",
            HttpMethod.GET,
            entity,
            RefereeNameData[].class
        );
        return Arrays.asList(response.getBody());
    }
}


package service.co3201;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import model.co3201.RefereeData;


@Service
public class ApiService {
    @Value("${api.key}")
    private String apiKey;
    
    public List<RefereeData> fetchData() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", apiKey);
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<RefereeData[]> response = restTemplate.exchange(
            "https://api.example.com/data",
            HttpMethod.GET,
            entity,
            RefereeData[].class
        );
        return Arrays.asList(response.getBody());
    }
    
    
    @Autowired
    private RefereeService refereeService;
    
    public void fetchDataAndStore() {
        List<RefereeData> dataList = fetchData();
        refereeService.saveData(dataList);
    }
}


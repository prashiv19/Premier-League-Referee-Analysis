package service.co3201;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.co3201.RefereeData;
import repo.co3201.RefereeDataRepository;

@Service
public class RefereeService {
	
	
    @Autowired
    private RefereeDataRepository refereedataRepository;
    
    public void saveData(List<RefereeData> dataList) {
        for (RefereeData data : dataList) {
            refereedataRepository.save(data);
        }
    }
}



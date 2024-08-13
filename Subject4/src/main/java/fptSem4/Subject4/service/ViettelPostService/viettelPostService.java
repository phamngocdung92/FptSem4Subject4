package fptSem4.Subject4.service.ViettelPostService;

import fptSem4.Subject4.dto.ResponseDto.ViettelResDto.viettelListPostOfficeResponseWrapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface viettelPostService {
    String login();
    List<viettelListPostOfficeResponseWrapper.viettelListPostOfficeResponse> getListOffice(String token);
}

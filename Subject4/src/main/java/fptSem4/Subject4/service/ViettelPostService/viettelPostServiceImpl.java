package fptSem4.Subject4.service.ViettelPostService;

import fptSem4.Subject4.config.properties.ViettelPostApiProperties;
import fptSem4.Subject4.dto.RequestDto.ViettelReqDto.viettelPostLoginRequestDto;
import fptSem4.Subject4.dto.ResponseDto.ViettelResDto.viettelListPostOfficeResponseWrapper;
import fptSem4.Subject4.dto.ResponseDto.ViettelResDto.viettelPostLoginResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
@Service

public class viettelPostServiceImpl implements viettelPostService {
    @Autowired
    private ViettelPostApiProperties viettelPostApiProperties;

    @Override
    public String login() {
        String token = null;
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = viettelPostApiProperties.getBaseUrl() + viettelPostApiProperties.getLoginPath();
            viettelPostLoginRequestDto requestDto = new viettelPostLoginRequestDto();
            requestDto.setUsername(viettelPostApiProperties.getUsername());
            requestDto.setPassword(viettelPostApiProperties.getPassword());

            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setContentType(MediaType.APPLICATION_JSON);
            httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<viettelPostLoginRequestDto>requestEntity = new HttpEntity<>(requestDto, httpHeaders);
            ResponseEntity<viettelPostLoginResponseWrapper> resEntity = restTemplate.exchange(
                    url,
                    HttpMethod.POST,
                    requestEntity,
                    viettelPostLoginResponseWrapper.class
            );
            if(resEntity.getStatusCode() == HttpStatus.OK){
                viettelPostLoginResponseWrapper res = resEntity.getBody();
                if(!res.getError() && res.getStatus().equalsIgnoreCase("200") && !StringUtils.isEmpty((res.getData().getToken()))){
                    token = res.getData().getToken();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return token;
    }

    @Override
    public List<viettelListPostOfficeResponseWrapper.viettelListPostOfficeResponse> getListOffice(String token) {
        String url = viettelPostApiProperties.getBaseUrl() + viettelPostApiProperties.getGetListOfficePath();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        httpHeaders.set("token", token);
        HttpEntity<?> requestEntity = new HttpEntity<>(httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<viettelListPostOfficeResponseWrapper> resEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                requestEntity,
                viettelListPostOfficeResponseWrapper.class
        );
        if(resEntity.getStatusCode() == HttpStatus.OK){
            viettelListPostOfficeResponseWrapper res = resEntity.getBody();
            if(!res.getError() && res.getStatus().equalsIgnoreCase("200")){
                return res.getListPostOffice();
            }
        }
        return null;
    }
}

package fptSem4.Subject4.dto.ResponseDto.ViettelResDto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class viettelListPostOfficeResponseWrapper {
    private String status;
    private Boolean error;
    private String message;
    @JsonProperty("data")
    private List<viettelListPostOfficeResponse> listPostOffice;
    public class viettelListPostOfficeResponse{
        @JsonProperty("TEN_TINH")
        private String provinceName;
        @JsonProperty("TEN_QUANHUYEN")
        private String districtName;
        @JsonProperty("TEN_PHUONGXA")
        private String wardName;
        @JsonProperty("MA_BUUCUC")
        private String officeCode;
        @JsonProperty("TEN_BUUCUC")
        private String officeName;
        @JsonProperty("DIA_CHI")
        private String address;
        @JsonProperty("LATITUDE")
        private String latitude;
        @JsonProperty("LONGITUDE")
        private String longitude;
        @JsonProperty("DIEN_THOAI")
        private String phone;
        @JsonProperty("PHUTRACH")
        private String manager;
        @JsonProperty("PHUTRACHPHONE")
        private String mangerPhone;

        public String getProvinceName() {
            return provinceName;
        }

        public void setProvinceName(String provinceName) {
            this.provinceName = provinceName;
        }

        public String getDistrictName() {
            return districtName;
        }

        public void setDistrictName(String districtName) {
            this.districtName = districtName;
        }

        public String getWardName() {
            return wardName;
        }

        public void setWardName(String wardName) {
            this.wardName = wardName;
        }

        public String getOfficeCode() {
            return officeCode;
        }

        public void setOfficeCode(String officeCode) {
            this.officeCode = officeCode;
        }

        public String getOfficeName() {
            return officeName;
        }

        public void setOfficeName(String officeName) {
            this.officeName = officeName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getManager() {
            return manager;
        }

        public void setManager(String manager) {
            this.manager = manager;
        }

        public String getMangerPhone() {
            return mangerPhone;
        }

        public void setMangerPhone(String mangerPhone) {
            this.mangerPhone = mangerPhone;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<viettelListPostOfficeResponse> getListPostOffice() {
        return listPostOffice;
    }

    public void setListPostOffice(List<viettelListPostOfficeResponse> listPostOffice) {
        this.listPostOffice = listPostOffice;
    }
}

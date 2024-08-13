package fptSem4.Subject4.dto.ResponseDto.ViettelResDto;

public class viettelPostLoginResponseWrapper {
    private String status;
    private Boolean error;
    private String message;
    private viettelPostLoginResponse data;
    public class viettelPostLoginResponse{
        private Long userId;
        private String token;
        private String partner;
        private String phone;
        private String postcode;
        private Long expired;
        private String encrypted;
        private int source;
        private Boolean infoUpdated;

        public Long getUserId() {
            return userId;
        }

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getPartner() {
            return partner;
        }

        public void setPartner(String partner) {
            this.partner = partner;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public Long getExpired() {
            return expired;
        }

        public void setExpired(Long expired) {
            this.expired = expired;
        }

        public String getEncrypted() {
            return encrypted;
        }

        public void setEncrypted(String encrypted) {
            this.encrypted = encrypted;
        }

        public int getSource() {
            return source;
        }

        public void setSource(int source) {
            this.source = source;
        }

        public Boolean getInfoUpdated() {
            return infoUpdated;
        }

        public void setInfoUpdated(Boolean infoUpdated) {
            this.infoUpdated = infoUpdated;
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

    public viettelPostLoginResponse getData() {
        return data;
    }

    public void setData(viettelPostLoginResponse data) {
        this.data = data;
    }
}

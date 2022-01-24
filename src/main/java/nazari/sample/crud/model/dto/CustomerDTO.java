package nazari.sample.crud.model.dto;

import java.util.Date;

public class CustomerDTO {

    private Long id;
    private String username;
    private Long customerBookId;
    private Date createdDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getCustomerBookId() {
        return customerBookId;
    }

    public void setCustomerBookId(Long customerBookId) {
        this.customerBookId = customerBookId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}

package nazari.sample.crud.model.dto;

import java.util.Date;
import java.util.Set;

public class CustomerDTO {

    private Long id;
    private String username;
    private Set<CustomerBookDTO> customerBookDTOS;
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

    public Set<CustomerBookDTO> getCustomerBookDTOS() {
        return customerBookDTOS;
    }

    public void setCustomerBookDTOS(Set<CustomerBookDTO> customerBookDTOS) {
        this.customerBookDTOS = customerBookDTOS;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}

package nazari.sample.crud.model.dto;

import java.util.Set;

public class BookDTO {

    private Long id;
    private String bookName;
    private String createdDate;
    private Set<CustomerBookDTO> customerBookDTOS;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Set<CustomerBookDTO> getCustomerBookDTOS() {
        return customerBookDTOS;
    }

    public void setCustomerBookDTOS(Set<CustomerBookDTO> customerBookDTOS) {
        this.customerBookDTOS = customerBookDTOS;
    }
}

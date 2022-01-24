package nazari.sample.crud.model.dto;

public class BookDTO {

    private Long id;
    private String bookName;
    private String createdDate;
    private Long customerBookId;

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

    public Long getCustomerBookId() {
        return customerBookId;
    }

    public void setCustomerBookId(Long customerBookId) {
        this.customerBookId = customerBookId;
    }
}

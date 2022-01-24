package nazari.sample.crud.model.datamodel;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String bookName;

    @CreatedDate
    private Date createdDate;

    @OneToMany(mappedBy = "book")
    private Set<CustomerBook> customerBooks;

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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Set<CustomerBook> getCustomerBooks() {
        return customerBooks;
    }

    public void setCustomerBooks(Set<CustomerBook> customerBooks) {
        this.customerBooks = customerBooks;
    }
}

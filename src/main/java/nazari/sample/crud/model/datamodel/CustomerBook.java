package nazari.sample.crud.model.datamodel;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "CUSTOMER_BOOK")
public class CustomerBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @CreatedDate
    private Date createdDate;

    @JoinColumn
    @ManyToOne
    private Customer customer;

    @JoinColumn
    @ManyToOne
    private Book book;

    @PrePersist
    private void onCreate(){
        createdDate =  new Timestamp(System.currentTimeMillis());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book books) {
        this.book = books;
    }
}

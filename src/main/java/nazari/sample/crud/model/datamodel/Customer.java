package nazari.sample.crud.model.datamodel;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String username;

    @CreatedDate
    private Date createdDate;

    @OneToMany(mappedBy = "customer")
    private Set<CustomerBook> customerBooks;


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

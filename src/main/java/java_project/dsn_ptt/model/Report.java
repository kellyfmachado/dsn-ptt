package java_project.dsn_ptt.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date startSate;
    private Date endDate;
    private Double totalIncome;
    private Double totalExpense;
    @ManyToOne
    private User user;

    public Date getStartSate() {
        return startSate;
    }

    public void setStartSate(Date startSate) {
        this.startSate = startSate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public Double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(Double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

package ua.a8m8.entities;

import java.io.Serializable;

/**
 * @author Artur Meshcheriakov
 */
public class Payment extends AbstractEntity {

    private Long idPayment;
    private Account accountFrom;
    private Account accountTo;
    private Double amount;

    public Long getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(Long idPayment) {
        this.idPayment = idPayment;
    }

    public Account getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(Account accountFrom) {
        this.accountFrom = accountFrom;
    }

    public Account getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(Account accountTo) {
        this.accountTo = accountTo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public Serializable getID() {
        return getIdPayment();
    }
}

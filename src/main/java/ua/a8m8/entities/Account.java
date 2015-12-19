package ua.a8m8.entities;

import java.io.Serializable;

/**
 * @author Artur Meshcheriakov
 */
public class Account extends AbstractEntity{

    private Integer idAccount;
    private Client client;
    private Double balance;

    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }



    @Override
    public Serializable getID() {
        return getIdAccount();
    }
}

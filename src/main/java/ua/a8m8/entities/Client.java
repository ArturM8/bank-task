package ua.a8m8.entities;

import java.io.Serializable;
import java.util.List;

/**
 * @author Artur Meshcheriakov
 */
public class Client extends AbstractEntity{

    private Integer idClient;
    private String firstName;
    private String lastName;

    private List<Account> accounts;

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public Serializable getID() {
        return getIdClient();
    }
}

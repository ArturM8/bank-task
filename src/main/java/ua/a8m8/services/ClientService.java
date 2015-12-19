package ua.a8m8.services;

import ua.a8m8.entities.Account;
import ua.a8m8.entities.Client;

import java.util.List;

/**
 * @author Artur Meshcheriakov
 */
public interface ClientService {

    double getClientBalance(Client client, List<Account> accounts);

    Client getClientWithMaxBalance(List<Account> accounts);

}

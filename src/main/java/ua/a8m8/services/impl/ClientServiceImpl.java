package ua.a8m8.services.impl;

import ua.a8m8.entities.Account;
import ua.a8m8.entities.Client;
import ua.a8m8.services.ClientService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Artur Meshcheriakov
 */
public class ClientServiceImpl implements ClientService {

    public double getClientBalance(Client client, List<Account> accounts) {

        double result = 0.0;
        for (Account account : accounts) {
            if (account.getClient().equals(client)) {
                result+=account.getBalance();
            }
        }
        return result;
    }

    public Client getClientWithMaxBalance(List<Account> accounts) {

        Map<Client, Double> clientBills = new HashMap<Client, Double>();
        for(Account account:accounts) {
            if (!clientBills.containsKey(account.getClient())) {
                clientBills.put(account.getClient(), account.getBalance());
            } else {
                double balance = clientBills.get(account.getClient()) + account.getBalance();
                clientBills.remove(account.getClient());
                clientBills.put(account.getClient(), balance);
            }
        }
        double max = 0.0;
        Client client = null;
        for (Map.Entry entry : clientBills.entrySet()) {
            if (((Double) entry.getValue()) > max) {
                client = (Client) entry.getKey();
            }
        }
        return client;

    }
}

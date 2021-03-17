package ru.job4j.tracker.ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User u = findByPassport(passport);
        if (!users.get(u).contains(account)) {
            users.get(u).add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User u : users.keySet()) {
            if (passport.equals(u.getPassport())) {
                return u;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User u = findByPassport(passport);
        for (Account a : users.get(u)) {
            if (a.getRequisite().equals(requisite)) {
                return a;
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        User usrc = findByPassport(srcPassport);
        Account asrc = findByRequisite(srcPassport, srcRequisite);
        User udest = findByPassport(destPassport);
        Account adest = findByRequisite(destPassport, destRequisite);
        if (udest.equals(null) || usrc.equals(null) || asrc.getBalance() < amount) {
            return false;
        }
        asrc.setBalance(asrc.getBalance() - amount);
        adest.setBalance(adest.getBalance() + amount);
        return true;
    }
}

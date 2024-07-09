package java_project.dsn_ptt.service;

import java_project.dsn_ptt.model.Transaction;
import java_project.dsn_ptt.model.User;

import java.util.Optional;

public interface TransactionService {
    void addTransaction(Transaction transaction);
    void updateTransaction(Long id, Transaction transaction);
    void deleteTransaction(Transaction transaction);
    Optional<Transaction>  viewTransaction(Long id);
}

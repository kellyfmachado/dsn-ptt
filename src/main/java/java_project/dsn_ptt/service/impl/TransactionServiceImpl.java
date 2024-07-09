package java_project.dsn_ptt.service.impl;

import java_project.dsn_ptt.model.Transaction;
import java_project.dsn_ptt.repository.TransactionRepository;
import java_project.dsn_ptt.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void addTransaction(Transaction transaction){
        transactionRepository.save(transaction);
    }

    @Override
    public void updateTransaction(Long id, Transaction transaction){
        Optional<Transaction> transactionBd = transactionRepository.findById(id);
        if (transactionBd.isPresent()){
            transactionRepository.save(transaction);
        }

    }

    @Override
    public void deleteTransaction(Transaction transaction){
        transactionRepository.delete(transaction);
    }

    @Override
    public Optional<Transaction> viewTransaction(Long id){
        return transactionRepository.findById(id);
    }

}

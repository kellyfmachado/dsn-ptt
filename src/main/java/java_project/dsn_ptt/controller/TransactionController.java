package java_project.dsn_ptt.controller;

import java_project.dsn_ptt.model.Transaction;
import java_project.dsn_ptt.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("transaction")
public class TransactionController {

    @Autowired
    public TransactionService transactionService;

    @PostMapping("/add/{transaction}")
    public ResponseEntity<Transaction> add(@PathVariable Transaction transaction) {
        transactionService.addTransaction(transaction);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{transaction}")
    public ResponseEntity<Transaction> update(Long id, @PathVariable Transaction transaction) {
        transactionService.updateTransaction(id, transaction);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{transaction}")
    public ResponseEntity<Transaction> delete(@PathVariable Transaction transaction){
        transactionService.deleteTransaction(transaction);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<Transaction> view(@PathVariable Long id){
        transactionService.viewTransaction(id);
        return ResponseEntity.ok().build();
    }

}


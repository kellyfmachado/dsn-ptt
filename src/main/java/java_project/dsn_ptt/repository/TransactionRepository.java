package java_project.dsn_ptt.repository;

import java_project.dsn_ptt.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long>{
}

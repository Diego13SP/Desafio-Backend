package com.picpaysimplificado.repositories;

import com.picpaysimplificado.domain.transaction.TransactionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionModel, Long> {
}

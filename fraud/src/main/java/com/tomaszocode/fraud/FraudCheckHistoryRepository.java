package com.tomaszocode.fraud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudCheckHistoryRepository
        extends JpaRepository<FraudCheckHistory, Integer>, JpaSpecificationExecutor<FraudCheckHistory> {
}

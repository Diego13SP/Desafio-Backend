package com.picpaysimplificado.domain.user.transaction;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity(name="transactions")
@Table(name="transactions")
@Getter
@Setter
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
}

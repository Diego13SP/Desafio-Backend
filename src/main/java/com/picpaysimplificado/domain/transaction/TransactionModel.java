package com.picpaysimplificado.domain.transaction;
import com.picpaysimplificado.domain.user.UserModel;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name="transactions")
@Table(name="transactions")
@Getter
@Setter
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class TransactionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    @ManyToOne
    @JoinColumn(name="sender-id")
    private UserModel sender;
    @ManyToOne
    @JoinColumn(name="receiver-id")
    private UserModel receiver;
    private LocalDateTime timestamp;
}

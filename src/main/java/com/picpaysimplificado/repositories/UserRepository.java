/**
 * Enum que representa os tipos de usuários no sistema.
 *
 * <p>Autor: Seu Nome Aqui</p>
 *
 * <p>Este enum pode ser usado para definir vários papéis de usuário dentro da aplicação.</p>
 */

package com.picpaysimplificado.repositories;
import com.picpaysimplificado.domain.user.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    Optional<UserModel> findUserByDocument(String document);
    Optional<UserModel> findUserById(Long id);
}

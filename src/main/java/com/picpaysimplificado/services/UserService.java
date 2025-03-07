package com.picpaysimplificado.services;
import com.picpaysimplificado.Enumaration.UserType;
import com.picpaysimplificado.domain.user.UserModel;
import com.picpaysimplificado.dto.UserDTO;
import com.picpaysimplificado.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public void validateTransaction(UserModel sender, BigDecimal amount) throws Exception {
        if (sender.getUserType() == UserType.MERCHANT) {
            throw new Exception("Usuario do tipo lojista não autorizado a realizar transação");
        }
        if (sender.getBalance().compareTo(amount) < 0) {
            throw new Exception("Saldo insuficiente");
        }
    }

    public UserModel findUserById(Long id) throws Exception {
        return this.repository.findUserById(id).orElseThrow(() -> new Exception("Usuario não encontrado"));
    }

    public UserModel createUser(UserDTO userDTO) {
        UserModel newUserModel = new UserModel(userDTO);
        this.saveUser(newUserModel);
        return newUserModel;
    }

    public void saveUser(UserModel userModel) {
        this.repository.save(userModel);
    }

    public List<UserModel> getAllUsers() {
        return this.repository.findAll();
    }
}

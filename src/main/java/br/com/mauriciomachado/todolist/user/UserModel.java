package br.com.mauriciomachado.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data //Coloca automaticamente os getters e setters
@Entity(name= "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    // @Column (name="usuario")
    @Column(unique = true)
    private String username; //Default public (implícito) não é necessário definir
    // ou
    // @Getter
    // @Setter
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

}

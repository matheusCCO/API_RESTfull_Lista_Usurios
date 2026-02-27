package testebacklovable.com.br.testebacklovable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import testebacklovable.com.br.testebacklovable.model.Usuarios;
import testebacklovable.com.br.testebacklovable.repository.UsuarioRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class UsuarioContorller {
    private UsuarioRepository userRepository;
    
    @Autowired
    public UsuarioContorller(UsuarioRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<Usuarios> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public Usuarios addNewUser(@RequestBody Usuarios usuario) {
        System.out.println(usuario.toString());
        return userRepository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }
}

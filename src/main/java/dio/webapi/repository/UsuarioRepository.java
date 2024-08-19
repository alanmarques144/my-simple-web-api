package dio.webapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.webapi.handler.BusinessException;
import dio.webapi.model.Usuario;

@Repository
public class UsuarioRepository {
    
    public void save(Usuario usuario){

        if (usuario.getLogin() == null) {
            throw new BusinessException("o campo login e obrigatorio!");
        }

        if (usuario.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        }else{
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        

        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("alan","password"));
        usuarios.add(new Usuario("alan02","masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("alan","password");
    }
}

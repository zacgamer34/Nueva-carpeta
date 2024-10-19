
    package com.example;

    import com.example.entity.Usuario;
    import com.example.repository.UsuarioRepository;
    import com.example.service.UsuarioService;
    import jakarta.persistence.EntityManager;
    import jakarta.persistence.EntityManagerFactory;
    import jakarta.persistence.Persistence;
    
    import java.util.List;
    
    public class Main {
        public static void main(String[] args) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");
            EntityManager em = emf.createEntityManager();
    
            UsuarioRepository repository = new UsuarioRepository(em);
            UsuarioService service = new UsuarioService(repository);
    
            // Crear usuarios
            service.crearUsuario("Juan Pérez", "juan@example.com");
            service.crearUsuario("María García", "maria@example.com");
    
            // Obtener todos los usuarios
            List<Usuario> usuarios = service.obtenerTodosLosUsuarios();
            System.out.println("Usuarios:");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
    
            // Obtener un usuario específico
            Usuario usuario = service.obtenerUsuario(1L);
            if (usuario != null) {
                System.out.println("Usuario encontrado: " + usuario);
    
                // Actualizar usuario
                usuario.setNombre("Juan Antonio Pérez");
                service.actualizarUsuario(usuario);
                System.out.println("Usuario actualizado: " + service.obtenerUsuario(1L));
    
                // Eliminar usuario
                service.eliminarUsuario(usuario);
                System.out.println("Usuario eliminado. Buscando de nuevo...");
                Usuario usuarioEliminado = service.obtenerUsuario(1L);
                System.out.println(usuarioEliminado != null ? "Usuario aún existe" : "Usuario no encontrado");
            }
    
            em.close();
            emf.close();
        }
    }
     


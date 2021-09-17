package Domain;

public class Usuarios {
    
    private int id_usuario;
    private String usuario;
    private String contrasenia;
    
    public Usuarios(){
    
    }
    
    public Usuarios(int id_usuario){
    
        this.id_usuario=id_usuario;
    
    }
    
    public Usuarios(int id_usuario, String usuario, String contrasenaia){
    
        this.id_usuario=id_usuario;
        this.usuario=usuario;
        this.contrasenia=contrasenaia;
    
    }
    
    public Usuarios(String usuario, String contrasenaia){
    
        this.usuario=usuario;
        this.contrasenia=contrasenaia;
    
    }
    
}

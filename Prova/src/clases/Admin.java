package clases;

public class Admin extends Usuari {

    public Admin(String nomusuari, String passwd) {
        super(nomusuari, passwd);
    }

    @Override
    public void MostraMenu() {
        System.out.println("1 - Crear un post");
        System.out.println("2 - Llistar tots els posts");
        System.out.println("3 - Eliminar un post");
        System.out.println("4 - Modificar un Lector a Editor");
        System.out.println("5 - Llistar Editors");
        System.out.println("6 - Llistar Lectors");
        System.out.println("7 - Log Out");
    }

    @Override
    public void CrearPost() {
        // TODO Auto-generated method stub

    }

    @Override
    public void LlistarEditors() {
        // TODO Auto-generated method stub

    }

    @Override
    public void LlistarLectors() {
        // TODO Auto-generated method stub

    }

    @Override
    public void ModificarLector() {
        // TODO Auto-generated method stub

    }

    @Override
    public void MostrarMur() {
        // TODO Auto-generated method stub

    }

    @Override
    public void SeguirEditor() {
        // TODO Auto-generated method stub

    }

    @Override
    public void VeureSegueixo() {
        // TODO Auto-generated method stub

    }

    @Override
    public void EliminarPost() {
        // TODO Auto-generated method stub

    }

    
   
    
}
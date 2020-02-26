package app.usuari;

public class Usuari {
    String usuari,contrasenya,telefon,direccio;
    

    public Usuari(String usuari) {
        this.usuari = usuari;
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public boolean comprovacontrasenya(String contrasenya) {
        if (this.contrasenya.equals(contrasenya)) {
            return true;
        } else {
            return false;
        }

    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }
    public void mostrausuari(){
        System.out.println("Usuari: "+this.usuari+" - Contrasenya: "+this.contrasenya+" - Direcció: "+this.direccio+" - Telèfon: "+this.telefon);
    }
    
}
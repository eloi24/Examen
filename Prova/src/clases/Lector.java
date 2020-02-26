package clases;
public class Lector extends Usuari{
    boolean major;

    public boolean isMajor() {
        return major;
    }

    public void setMajor(boolean major) {
        this.major = major;
    }

    public Lector(String nomusuari, String passwd) {
        super(nomusuari, passwd);
    }

    
}
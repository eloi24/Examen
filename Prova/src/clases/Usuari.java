package clases;
public  abstract class Usuari{
    protected String nomusuari,passwd;

    public Usuari(String nomusuari, String passwd) {
        this.nomusuari = nomusuari;
        this.passwd = passwd;
    }

    public String getNomusuari() {
        return nomusuari;
    }

    public void setNomusuari(String nomusuari) {
        this.nomusuari = nomusuari;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    
}

package tclab2;

import java.util.Calendar;

public class Comment {
    private int postId;
    private String guardarAutor;
    private String guardarCom;
    private Calendar guardarfecha;

    public Comment(int postid, String autor, String commentario) {
        postId = postid;
        guardarAutor = autor;
        guardarCom = commentario;
        guardarfecha = Calendar.getInstance();

    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getGuardarAutor() {
        return guardarAutor;
    }

    public void setGuardarAutor(String guardarAutor) {
        this.guardarAutor = guardarAutor;
    }

    public String getGuardarCom() {
        return guardarCom;
    }

    public void setGuardarCom(String guardarCom) {
        this.guardarCom = guardarCom;
    }

    public Calendar getGuardarfecha() {
        return guardarfecha;
    }

    public void setGuardarfecha(Calendar guardarfecha) {
        this.guardarfecha = guardarfecha;
    }

    public void print(){
        System.out.println("AUTOR: " + guardarAutor + "- FECHA: " + guardarfecha);
        System.out.println("CONTENIDO DEL COMENTARIO : " +guardarCom);
    }
    
    
}

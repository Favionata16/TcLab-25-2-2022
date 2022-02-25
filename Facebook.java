
package tclab2;

import java.util.ArrayList;


public class Facebook extends SocialClass implements Commentable{
    
    private ArrayList<Comment> comentarios;

    public Facebook(String username) {
        super(username);
        comentarios = new ArrayList();
    }

    public ArrayList<Comment> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comment> comentarios) {
        this.comentarios = comentarios;
    }

    public boolean addComment(Comment comment) {

        for (Comment comentario : comentarios) {

            for (int index = comentario.getPostId(); index < comentarios.size(); ++index) {
                if (comentarios.get(index) == null) {
                    comentarios.add(comment);
                    System.out.println("Se agrego con exito");
                    return true;
                } else {
                    System.out.println("El comentario ya existe");
                    return false;
                }
            }
        }
        return false;

    }

    public void timeline() {
        for (int i = 0; i < getPosts().size(); i++) {
            System.out.println("POST " + i);
            System.out.println(getPosts().get(i));
            for (int j = 0; j < comentarios.size(); j++) {
                System.out.println("COMENTARIO " + j);
                System.out.println(comentarios.get(j).toString());
            }
        }
    }

    
}

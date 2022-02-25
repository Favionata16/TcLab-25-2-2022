
package tclab2;

import java.util.ArrayList;

public class UberSocial {
        private ArrayList<SocialClass> redes;

    public SocialClass buscar(String username) {
        for (SocialClass rede : redes) {
            if (rede.getUsername().contains(username)) {
                return buscar(username);
            }

        }
        return null;

    }

    public void agregarCuenta(String username, String tipo) {
        if (redes.toString().contains(username)) {
            if (tipo.equalsIgnoreCase("FACEBOOK")) {
                redes.add(new Facebook(username));
            } else if (tipo.equalsIgnoreCase("TWITTER")) {
                redes.add(new Twitter(username));
            }
        }
    }

    public void agregarPost(String user, String post) {
        if (buscar(user) != null) {
            for (SocialClass rede : redes) {
                rede.addPost(post);
            }
        }
    }

    public void agregarAmigo(String user1, String user2) {

        if (buscar(user1) != null && buscar(user2) != null) {
            for (int i = 0; i < redes.size(); i++) {
                SocialClass sc = redes.get(i);
                if (redes.get(i) instanceof Facebook) {
                    redes.toString();
                } else if (redes.get(i) instanceof Twitter) {

                }
            }
        }
    }

    public void agregarComment(String user, int postId, String autor, String comment) {

    }

    public void profileFrom(String user) {

    }
}

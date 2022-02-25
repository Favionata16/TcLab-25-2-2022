
package tclab2;

public class username {
    protected String username;

    public username(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "username{" + "username=" + username + '}';
    }
    
    
}

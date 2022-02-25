package tclab2;

public class Twitter extends SocialClass{
        public Twitter(String username) {
        super(username);
    }

    public void timeline() {
        System.out.println("Posts");
        System.out.println(getPosts());
    }
}

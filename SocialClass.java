/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tclab2;

import java.util.ArrayList;
import java.util.Scanner;


public abstract class SocialClass {
    private ArrayList<String> friends;
    private ArrayList<String> posts;
    private String Username;

    public SocialClass(String username) {
        Username = username;
        friends = new ArrayList();
        posts = new ArrayList();
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<String> friends) {
        this.friends = friends;
    }

    public ArrayList<String> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<String> posts) {
        this.posts = posts;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public boolean addFriend(String user) {
        if (!friends.contains(user) && friends.toString().equals(user)) {
            friends.add(user);
            return true;
        }

        return false;
    }

    public void addPost(String msg) {
        posts.add(msg);
    }

    public abstract void timeline();

    public void myProfile() {

        System.out.println("USERNAME: " + Username);
        System.out.println("TIMELINE :");
        timeline();
        System.out.println("AMIGOS");

        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre: " + friends.get(i));
        }
    }
}
    


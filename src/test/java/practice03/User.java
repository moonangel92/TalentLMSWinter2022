package practice03;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class User {

    private  String name;
    private int age;

    public void sayHi(){
        System.out.println("Hello from" + getName());
    }

    public void login(String username, String password){
        System.out.println("Login ");

    }



}

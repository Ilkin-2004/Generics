package generics;

public class User<T>  {
 private String name;
 private String surname;

    public User() {

    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

}

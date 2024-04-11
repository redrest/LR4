package Entity;

public class User {
    private Integer idUser;

    public Integer getId() {
        return idUser;
    }
    public void setId(Integer idUser) {
        this.idUser = idUser;
    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String lastName;
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String middleName;
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    private Integer age;
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    private String language;
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public User(Integer idUser, String name, String lastName, String middleName, Integer age, String language) {
        this.idUser = idUser;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.language = language;
    }

    public User() {

    }
}

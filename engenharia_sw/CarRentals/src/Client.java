public class Client {
    private String name;
    private int birth;
    private String phoneNumber;
    private String email;

    public Client(String name, int birth, String phoneNumber, String email) {
        this.name = name;
        this.birth = birth;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getBirth() {
        return birth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}

package builder;

public class User {
    private String user;
    private String email;
    private String phone;

    private User(UserBuilder userBuilder) {
        this.user=userBuilder.user;
        this.email=userBuilder.email;
        this.phone=userBuilder.phone;
    }

    public String getUser() {
        return user;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public static class UserBuilder{
        public UserBuilder setUser(String user) {
            this.user = user;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;

        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        private String user;
        private String email;
        private String phone;

       public User build(){
           return new User(this);
       }


    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

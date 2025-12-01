interface User {
    public abstract void login();
    public abstract void logout();
}
class UserImplementation implements User{
    @Override public void login(){
        System.out.println("login successful");
    }
    @Override public void logout(){
        System.out.println("logout");
    }
    public static void main(String[] args) {
        User u1 =new UserImplementation();
        u1.login();
        u1.logout();
        // User u2 = new User();
        // u2.login();
    }
}
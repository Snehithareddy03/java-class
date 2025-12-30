interface DaoI{
    public abstract void login();
    public abstract void logout();

}

class DaoImpl implements DaoI{
    public void login(){
        System.out.println("Login success");
    }
    public void logout(){
        System.out.println("logged out successfully");
    }
}
class Test{
    public static void main(String[] args) {
        DaoI d1 = new DaoImpl();
        d1.login();
        d1.logout();
    }
}
public class AdultUser implements LibraryUser{

    private int age = 12;
    private String bookType;

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getBookType() {
        return bookType;
    }

    protected void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (getAge() > 12) {
            System.out.println("You have successfully registered under a Adult Account.");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook() {
        if (getAge() > 12 && getBookType() == bookType) {
            System.out.println("Book Issued successfully, please bring it back within 10 days");
        } else {
            System.out.println("Oops! You are only allowed to take adult books only");
        }
    }

    @Override
    public void name() {

    }
}

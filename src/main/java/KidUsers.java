public class KidUsers implements LibraryUser {

    private int age = 12;
    private String bookType = "kids";

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
        if (getAge() < 12) {
            System.out.println("You have successfully registered under a Kids Account.");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if (getAge() < 12 && getBookType() == bookType) {
            System.out.println("Book Issued successfully, please bring it back within 10 days");
        } else {
            System.out.println("Oops! You are only allowed to take kids books only");
        }
    }

    @Override
    public void name() {

    }

}

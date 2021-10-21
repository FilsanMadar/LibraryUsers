public class LibraryInterfaceDemo {

    public static KidUsers kidUsers = new KidUsers();
    public static AdultUser adultUser = new AdultUser();

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    public static void testCase1() {

        kidUsers.setAge(10);
        kidUsers.registerAccount();
        kidUsers.setAge(18);
        kidUsers.registerAccount();
        kidUsers.setBookType("kids");
        kidUsers.requestBook();
        kidUsers.setBookType("fiction");
        kidUsers.requestBook();
    }

    public static void testCase2() {

        adultUser.setAge(5);
        adultUser.registerAccount();
        adultUser.setAge(23);
        adultUser.setBookType("kids");
        adultUser.requestBook();
        kidUsers.setBookType("fiction");
        adultUser.requestBook();

    }
}

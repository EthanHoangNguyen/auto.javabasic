package phuongthuc;

public class Company {

    public static String COMPANY_NAME = "PGA";
    public static String ADDRESS = "Hà Nội";
    public static String PHONE = "123456";
    public static String EMAIL = "pga@gmail.com";

    public static void getInfoCompany(){
        System.out.println("Company Name: " + COMPANY_NAME);
        System.out.println("Address: " + ADDRESS);
        System.out.println("Phone: " + PHONE);
        System.out.println("Email: " + EMAIL);
    }

    public static String getCompanyName (){
        return COMPANY_NAME;
    }

    public static String getEmail() {
        return EMAIL;
    }



}

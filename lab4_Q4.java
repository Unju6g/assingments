public class lab4_Q4 {
    public static void main(String[] args) {
        String userData = "USERID:abhi | FULLNAME:Abhijit Mophare | ROLE:Admin";

        
        int fullNameStart = userData.indexOf("FULLNAME:") + "FULLNAME:".length();
        int fullNameEnd = userData.indexOf("|", fullNameStart);
        String fullName = userData.substring(fullNameStart, fullNameEnd).trim();

       
        int roleStart = userData.indexOf("ROLE:") + "ROLE:".length();
        String role = userData.substring(roleStart).trim();

        String roleLower = role.toLowerCase();

       
        System.out.println("Full Name: " + fullName);
        System.out.println("Role: " + role);
        System.out.println("Role (lowercase): " + roleLower);
    }
}

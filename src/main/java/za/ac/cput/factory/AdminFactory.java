package za.ac.cput.factory;


import za.ac.cput.entity.Admin;

public class AdminFactory {

    public static Admin creatAdmin( String fisrtName, String lastName, String phoneNo, String emailAddress) {

        Admin admin= new Admin.Builder()
                .setFirstName(fisrtName)
                .setLastName(lastName)
                .setPhoneNo(phoneNo)
                .setEmailAddress(emailAddress)
                .build();

        return admin;
    }


}

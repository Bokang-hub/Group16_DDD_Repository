package za.ac.cput.Factory;
/* Trainer.java
Factory for the Trainer.
Author: Bokang Molaoa (218131097).
Date: 09 June 2021
*/
import za.ac.cput.Entity.Trainer;
import za.ac.cput.Util.GenericHelper;

public class TrainerFactory {
    public static Trainer createTrainer (String firstName, String lastName, String phoneNo,
                                         String address, String emailAddress, String password) {

        int trainerID = GenericHelper.generateId();
        Trainer.Builder builder = new Trainer.Builder();
        builder.setTrainerID(trainerID);
        builder.setFirstName(firstName);
        builder.setLastName(lastName);
        builder.setAddress(address);
        builder.setPhoneNo(phoneNo);
        builder.setEmailAddress(emailAddress);
        builder.setPassword(password);
        Trainer trainer = builder
                .build();

        return trainer;
    }
}

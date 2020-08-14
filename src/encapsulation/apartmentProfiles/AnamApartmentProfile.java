package encapsulation.apartmentProfiles;

import encapsulation.designs.ApartmentProfile;

import java.util.Arrays;

public class AnamApartmentProfile {
    public static void main(String[] args) {
        ApartmentProfile anamApartmentProfile = new ApartmentProfile();
        //criteria include (# of bedrooms, # of bathrooms, utilities, parking)
        anamApartmentProfile.setState("IL");
        anamApartmentProfile.setCity("Palatine");
        anamApartmentProfile.setBuildingName("Gates of Deer Grove");
        Object[][] apartmentCriteria = new Object[2][4];
        anamApartmentProfile.setApartmentCriteria(apartmentCriteria);

        //1bedroom
        apartmentCriteria[0][0] = "Number of bedroom: "+1;
        apartmentCriteria[0][1] = "Number of bathroom: "+1;
        apartmentCriteria[0][2] = "Utilities included:Gas, Heat, Water";
        apartmentCriteria[0][3] = "Number of parking included: "+1;
        //2bedroom
        apartmentCriteria[1][0] = "Number of bedroom: "+ 2;
        apartmentCriteria[1][1] = "Number of bathroom: "+1.5;
        apartmentCriteria[1][2] = "Utilities includes: Gas, Water";
        apartmentCriteria[1][3] = "Number of parking included: "+1;

        System.out.println(anamApartmentProfile.getState());
        System.out.println(anamApartmentProfile.getCity());
        System.out.println(anamApartmentProfile.getBuildingName());

        //criteria: print ONLY 2 bedroom
        for(int row = 0; row < apartmentCriteria.length; row++){
            for(int record = 0; record < apartmentCriteria[row].length; record++){
                if(apartmentCriteria[row][record].equals("Number of bedroom: 2")){
                    System.out.println(Arrays.toString(new Object[]{anamApartmentProfile
                            .getApartmentCriteria()[row][record]}));

                }
            }
        }

        //System.out.println(Arrays.deepToString(anamApartmentProfile.getApartmentCriteria()));
    }
}

package encapsulation.familyMemberProfiles;

import encapsulation.designs.FamilyProfile;

public class AnamProfile {
    public static void main(String[] args) {
        FamilyProfile familyProfileAnam = new FamilyProfile();
        familyProfileAnam.setName("Anam");
        familyProfileAnam.setAge(32);
        familyProfileAnam.setEmail("xyz@gmail.com");
        familyProfileAnam.setAddress("789 main street");

        System.out.println(familyProfileAnam.getName());
        System.out.println(familyProfileAnam.getAge());
        System.out.println(familyProfileAnam.getEmail());
        System.out.println(familyProfileAnam.getAddress());
    }
}

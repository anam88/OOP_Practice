package encapsulation.familyMemberProfiles;

import encapsulation.designs.FamilyProfile;

public class MohammadProfile {
    public static void main(String[] args) {
        FamilyProfile familyProfileMohammad = new FamilyProfile();
        familyProfileMohammad.setName("Mohammad");
        familyProfileMohammad.setAge(32);
        familyProfileMohammad.setEmail("abc@gmail.com");
        familyProfileMohammad.setAddress("123 Main street");

        System.out.println(familyProfileMohammad.getName());
        System.out.println(familyProfileMohammad.getAge());
        System.out.println(familyProfileMohammad.getEmail());
        System.out.println(familyProfileMohammad.getAddress());
    }
}

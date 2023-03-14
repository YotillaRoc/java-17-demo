package com.yotilla.bilbao.demos.npe;

public class HiringProcess {
    public static void main(String[] args) {
        printDev(HiringAgency.findApplicant());
        printDev(HiringAgency.findApplicant());
        printDev(HiringAgency.findApplicant());
        printDev(HiringAgency.findApplicant());
    }

    private static void printDev(final Developer nextHire) {
        System.out.printf("The applicant's favorite language was released in %s%n",
                nextHire.getFavoriteLanguage().getFirstRelease());
    }
}
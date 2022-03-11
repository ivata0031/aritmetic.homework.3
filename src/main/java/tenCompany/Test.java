package tenCompany;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

         companyFl FL1 = new companyFl();
         FL1.setInitialCapital(100);
         FL1.setActualCapital(150000);
         FL1.setFounderOfTheCompany("FO");
         FL1.setCompanyName("Moiski");
         FL1.setDateOfEstablishmentOfTheCompany("01.12.2020");
         FL1.setBulstat("BG20384503");

         FL1.printsCompanyData();
         FL1.calculateProfit();
         FL1.issueInvoice();


        //Profit with parameter!

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the current result: ");
        double cp=s.nextDouble();
        System.out.println("Enter initial capital: ");
        double sp=s.nextDouble();

        if(cp-sp>0){
            System.out.println("Profit:" +(cp-sp));
        }else if (cp-sp<0){
            System.out.println("profit:" +(sp-cp));
        }else {
            System.out.println("NEUTRAL");
        }


    }
}

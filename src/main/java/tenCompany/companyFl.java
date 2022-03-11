package tenCompany;

public class companyFl extends company implements Invoice {

    private String FounderOfTheCompany;
    private double initialCapital;
    private double actualCapital;


    public String getFounderOfTheCompany() {
        return FounderOfTheCompany;
    }

    public void setFounderOfTheCompany(String founderOfTheCompany) {
        if (founderOfTheCompany.trim().isEmpty()) {
            this.FounderOfTheCompany = founderOfTheCompany;
        } else {
            System.out.println("The name of owner is FO!");
        }
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        if (initialCapital <= 2) {
            System.out.println("Invalid initial capital!");
        } else {
            this.initialCapital = initialCapital;
        }
    }

    public double getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(double actualCapital) {
        this.actualCapital = actualCapital;
    }

    public void companyFL() {


    }

        public double calculateProfit(){
            double profit;
            profit = initialCapital - actualCapital;
            System.out.println("The profit of the company is: " + profit + "BGN");
            return profit;
        }

        public void printsCompanyData() {
            System.out.printf("The company %s is created on %s.%nIts Bulstat is: %s.%n The owner of the company is: %s%n" +
                            "Financial stat of the company is as follows:%nInitial capital is: %.2f BGN.%nActual capital is: %.2f BGN.%n",
                    getCompanyName(), getDateOfEstablishmentOfTheCompany(),getBulstat(),
                    getFounderOfTheCompany(),getActualCapital(),getInitialCapital());
        }


    @Override
    public void issueInvoice() {
        if (calculateProfit() > 50000){
            System.out.println("This company can issue invoice by VAT!");
        }else {
            System.out.println("This company can not issue invoice by VAT!");
        }
    }


}


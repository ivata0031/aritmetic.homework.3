package tenCompany;

public class company {
    private String companyName;
    private String dateOfEstablishmentOfTheCompany;
    private String bulstat;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName.trim().isEmpty()) {
            System.out.println("Invalid company name!");
        } else {
            this.companyName = companyName;
        }
    }

    public String getDateOfEstablishmentOfTheCompany() {
        return dateOfEstablishmentOfTheCompany;
    }

    public void setDateOfEstablishmentOfTheCompany(String dateOfEstablishmentOfTheCompany) {
        if(!dateOfEstablishmentOfTheCompany.trim().isEmpty()){
            this.dateOfEstablishmentOfTheCompany = dateOfEstablishmentOfTheCompany;
        }else {
            System.out.println("Invalid date og creation!");
        }
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if (bulstat.length() == 10){
            this.bulstat = bulstat;
        } else {
            System.out.println("Invalid Bulstat number!");
        }

    }

    public company(){
    }
}

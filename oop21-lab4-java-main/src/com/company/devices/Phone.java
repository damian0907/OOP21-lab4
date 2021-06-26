package com.company.devices;


import java.util.ArrayList;
import java.util.List;

public class Phone implements Device {

    private BrandApplication.Brands brand;
    private String model;
    private OS operatingSystem;
    private final List<Application> installedApplications;



    public BrandApplication.Brands getBrand() {

        return brand;
    }

    public void setBrand(BrandApplication.Brands brand)  {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public OS getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OS operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Phone() {
        installedApplications = new ArrayList<>();
    }


    public boolean installApplication(Application application) {


               for (Application application1: installedApplications ){
                   if (application1.Name.equals(application.Name)){
                       if (application1.Version >= application.Version){
                           return false;
                       }
                       installedApplications.remove(application1);
                       break;
                   }

               }
        if (operatingSystem.equals(application.SupportedOS)){
            installedApplications.add(application);
            System.out.println("Installing app");
            return true;
        }
        return false;
    }
    public boolean installBrandApplication(BrandApplication application) {
        if (brand != application.SupportedBrand){
            return false;
        }

        return installApplication(application);
    }


}

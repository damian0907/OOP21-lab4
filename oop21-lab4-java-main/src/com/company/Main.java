package com.company;

import com.company.devices.*;


public class Main {

    public static void main(String[] args) {
        var phone = new Phone();
        phone.setOperatingSystem(OS.Android);
        var human = new Human();
        human.setDevice(phone);
        var application = new Application();
        human.installApplication(application);




                Application[] applications = new Application[10];
           for (int i = 0; i < applications.length; i++ ){
               applications[i] = new Application();
               if(Math.random() > 0.5) {
                   applications[i].Paid = true;
                   applications[i].SupportedOS = OS.iOS;
               }
               else{
                   applications[i].Paid = false;
                   applications[i].SupportedOS = OS.Android;
               }
           }

        Application androidApp = new Application();
        androidApp.SupportedOS = OS.Android;
        androidApp.Name = "ABC1";
        androidApp.Version = 1.1;
        androidApp.Paid = true;
        System.out.println("Install android application on android: "
                + phone.installApplication(androidApp));

        Application iosApp = new Application();
        iosApp.SupportedOS = OS.iOS;
        iosApp.Name = "ABC2";
        iosApp.Version = 1.6;
        iosApp.Paid = true;
        System.out.println("Install IOS application on android: "
                + phone.installApplication(iosApp));


        Application androidApp2 = new Application();
        androidApp2.SupportedOS = OS.Android;
        androidApp2.Name = "ABC3";
        androidApp2.Version = 3.2;
        androidApp2.Paid = true;
        System.out.println("Install android application  on android: "
                + phone.installApplication(androidApp2));

        human.setCash(100.0);
        androidApp.Price = 200.0;
        androidApp2.Price = 50.0;


        System.out.println("Can afford to buy app which one cost 200 if have 100 "
                + human.installApplication(androidApp));

        System.out.println("Can afford to buy app which one cost 50 if have 100 "
                + human.installApplication(androidApp2));

        BrandApplication OP = new BrandApplication();
        OP.SupportedBrand = BrandApplication.Brands.OnePlus;
        OP.SupportedOS = OS.Android;

        phone.setBrand(BrandApplication.Brands.Xiaomi);

        System.out.println("Install Apple application on Xiaomi supported phone: "
        + phone.installBrandApplication(OP));

        phone.setBrand(BrandApplication.Brands.OnePlus);
        System.out.println("install OnePlus app on OnePlus supported phone: "
                + phone.installBrandApplication(OP));


    }
}

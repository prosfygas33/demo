package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner //to run code in application start up
{

    @Autowired //dependency injection
	TourPackageRepository tourPackageRepository;

    @Autowired
    TourRepository tourRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        TourPackage aegean = new TourPackage("Best tour package", 10000, "Aegean");
        TourPackage tourPackage2 = new TourPackage("Mapa tour package", 500, "SalaMykonos");
        TourPackage tourPackage3 = new TourPackage("Relax in Ionio", 3000, "Ionio");
        TourPackage peloponnese = new TourPackage("Peloponese mountains", 2000, "Peloponese");
        TourPackage marakes=new TourPackage("Ekswtika",3000,"Maroko");

        tourPackageRepository.save(aegean);
        tourPackageRepository.save(tourPackage2);
        tourPackageRepository.save(tourPackage3);
        tourPackageRepository.save(peloponnese);
        tourPackageRepository.save(marakes);

        Tour tour1 = new Tour(1000, "katamaran in Mykonos", "Enjoy hal day in a Katamaran","Eat and drink without limit while enjoyinh the local beaches");
        Tour tour2 = new Tour(600 , "Ouzaki tasting", "Drink ouzo", "Enjoy half day drinking the best ouzo in Greece");

        Tour karitena = new Tour(400, "Full day in Karitena", "East and drink on mountain village", "East and drink on mountain village");
        Tour dimitsana = new Tour(400, "Full day in Dimitsana", "East and drink on mountain village", "East and drink on mountain village");
        Tour rafting = new Tour(400, "Rafting in Lousios", "Rafting in Lousios very good", "Rafting in Lousios very good");

        tour1.setTourPackage(aegean);
        tour2.setTourPackage(aegean);

        karitena.setTourPackage(peloponnese);
        dimitsana.setTourPackage(peloponnese);
        rafting.setTourPackage(peloponnese);


        //This crashes the app, because we have not saved fake tourPackage in the database
/*      TourPackage fakeTourPackage = new TourPackage("this si fake", 0, "does not exist");
        tour2.setTourPackage(fakeTourPackage);*/

        tourRepository.save(tour1);
        tourRepository.save(tour2);
        tourRepository.save(karitena);
        tourRepository.save(dimitsana);
        tourRepository.save(rafting);
    }
}

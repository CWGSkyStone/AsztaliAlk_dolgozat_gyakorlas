package dev.skystone;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandler {
    public static List<Car> readFile(){
        try {
            return tryReadFile();  
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }      
    }
    private static List<Car> tryReadFile() throws FileNotFoundException{
        List<Car> carlist = new ArrayList<>();
        File file = new File("jaribt.txt");
        try(Scanner sc = new Scanner(file, "UTF-8")){
            while(sc.hasNext()){
                String line = sc.nextLine();
                String data[] = line.split(":");
                Car car = new Car();
                car.setLicensePlate(data[0]);
                car.setBrand(data[1]);
                car.setYear(Integer.parseInt(data[2]));
                car.setFuelType(data[3]);                
                car.setPrice(Integer.parseInt(data[4]));
                car.setAirConditioning(Integer.parseInt(data[5]) == 1);
                car.setPermitDate(LocalDate.parse(data[6]));
                carlist.add(car);    
            }
        }
        return carlist;
    }
}

package test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.Car;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //Ejemplo para serializar un Objeto de Java en un JSON
        Car renault = new Car("JIA764","Renault 4",(short)1977,"Verde",2_300_000,false, LocalDate.of(1996, Month.NOVEMBER,17));

        String json = new Gson().toJson( renault );

        //System.out.println( json );

        //uso de GsonBuilder para formatear la salida
        Gson jsonPretty = new GsonBuilder().setPrettyPrinting().create();

        //System.out.println( jsonPretty.toJson( renault ) );


        //Ejemplo que serializa una colección de objetos
        List<Car> cars = Arrays.asList(new Car("JIA764","Renault 4",(short)1977,"Verde",2_300_000,false, LocalDate.of(1996, Month.NOVEMBER,17)),
                new Car("JJJ708","Renault 9",(short)1989,"Azul",10_400_000,true, LocalDate.of(1988, Month.JUNE,25)),
                new Car("NOT560","Chevrolet Aveo",(short)2007,"Rojo",27_000_000,true, LocalDate.of(2007, Month.FEBRUARY,05)),
                new Car("DZW615","Kia Picanto",(short)2018,"Gris",28_000_000,true, LocalDate.of(2017, Month.AUGUST,25)));

        String jsonCars = jsonPretty.toJson( cars );
        //System.out.println( jsonCars );

        //Deserializando un JSON a un objeto JAVA

        String strCar = "{\"plate\":\"DZW737\"," +
                "\"brand\":\"Chevrolet Corsa Evolution\"," +
                "\"model\":2004," +
                "\"color\":\"Verde\"," +
                "\"value\":12500000," +
                "\"dateEnrollment\":{\"year\":2005,\"month\":04,\"day\":28}," +
                "\"state\":true}";

        //System.out.println( strCar);

        Car corsa = new Gson().fromJson( strCar, Car.class );

        //System.out.println( corsa );

        //Deserializando una colleción de objetos de vehículos en formato JSON a una colección de Java

        String strCars = "[{\"plate\":\"DZW737\"," +
                "\"brand\":\"Chevrolet Corsa Evolution\"," +
                "\"model\":2004," +
                "\"color\":\"Verde\"," +
                "\"value\":12500000," +
                "\"dateEnrollment\":{\"year\":2005,\"month\":04,\"day\":28}," +
                "\"state\":true}," +
                "{\"plate\":\"WLZ398\"," +
                "\"brand\":\"Mazda CX5\"," +
                "\"model\":2016," +
                "\"color\":\"Rojo\"," +
                "\"value\":78000000," +
                "\"dateEnrollment\":{\"year\":2017,\"month\":01,\"day\":10}," +
                "\"state\":true}]";

        Type typeList = new TypeToken<List<Car>>(){}.getType();
        List<Car> newCars = new Gson().fromJson(strCars, typeList );
        System.out.printf("Se han deserializado %d Objetos%n",newCars.size());
        newCars.forEach( car -> System.out.println( car ) );

    }
}

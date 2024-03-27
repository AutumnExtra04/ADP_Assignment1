package za.ac.cput;

import za.ac.cput.domain.Hotel;
import za.ac.cput.factory.HotelFactory;

public class Main {
        public static void main(String args[]){
            Hotel h = new Hotel.Builder().setHotelID("1841281").setHotelName("Ulterior Motive Hotels").setHotelAddress("13 Stormside Hills, Century City").
                    setHotelNum("0813456723").setHotelEmail("Ulteriormotivehotels@gmail.com").setHotelRating("7").build();
            Hotel h2= HotelFactory.buildHotel("Irenic Hotels","Valorant Hills","01548543621","Irenichotels15@gmail.com","1.4");

            System.out.println(h.toString());
        }
}

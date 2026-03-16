/* ReservationFactory.java
   Reservation factory class
   Author: Tiyani Ngwana (231266731)
   Date: 13 March 2026
*/
package factory;

import domain.Reservation;
import java.time.LocalDate;

public class ReservationFactory
{
    public static Reservation createReservation(String reservationID, LocalDate date, String status) {

        if (reservationID == null || date == null || status == null) {
            return null;
        }
        return new Reservation.Builder()
                .setReservationID(reservationID)
                .setDate(date)
                .setStatus(status)
                .build();

    }
}



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.*;

public class ReservationDAOTest {

    private ReservationDAO reservationDAO;

    @BeforeEach
    public void setup() {
        reservationDAO = new ReservationDAO();
    }

    @Test
    public void testSaveReservation() {
        Reservation reservation = new Reservation(0, "Jane Doe", "Flight456", 1);
        Reservation savedReservation = reservationDAO.saveReservation(reservation);

        assertNotNull(savedReservation);
        assertEquals("Jane Doe", savedReservation.getPassengerName());
        assertTrue(savedReservation.getReservationId() > 0);
    }

    @Test
    public void testGetReservationById() {
        Reservation reservation = new Reservation(0, "Jane Doe", "Flight456", 1);
        Reservation savedReservation = reservationDAO.saveReservation(reservation);

        Reservation foundReservation = reservationDAO.getReservationById(savedReservation.getReservationId());
        assertNotNull(foundReservation);
        assertEquals(savedReservation.getReservationId(), foundReservation.getReservationId());
    }
}

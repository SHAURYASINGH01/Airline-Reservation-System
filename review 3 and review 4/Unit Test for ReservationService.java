import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.*;

public class ReservationServiceTest {

    private ReservationService reservationService;

    @Mock
    private ReservationDAO reservationDAO;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        reservationService = new ReservationService(reservationDAO);
    }

    @Test
    public void testCreateReservation() {
        // Mocking the DAO's behavior
        Reservation mockReservation = new Reservation(1, "John Doe", "Flight123", 2);
        Mockito.when(reservationDAO.saveReservation(Mockito.any(Reservation.class))).thenReturn(mockReservation);

        Reservation result = reservationService.createReservation("John Doe", "Flight123", 2);
        assertNotNull(result);
        assertEquals("John Doe", result.getPassengerName());
        assertEquals("Flight123", result.getFlightCode());
        assertEquals(2, result.getSeatsBooked());
    }

    @Test
    public void testGetReservation() {
        // Mocking the DAO's behavior
        Reservation mockReservation = new Reservation(1, "John Doe", "Flight123", 2);
        Mockito.when(reservationDAO.getReservationById(1)).thenReturn(mockReservation);

        Reservation result = reservationService.getReservation(1);
        assertNotNull(result);
        assertEquals(1, result.getReservationId());
        assertEquals("John Doe", result.getPassengerName());
    }
}

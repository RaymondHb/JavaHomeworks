import homework.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBulkTicketDiscount {
    @Test
    void testBulkTicketDiscount_15 () {
        assertEquals(85, P10_BulkTicketDiscount.bulkTicketDiscounts(1, 100));
    }
    @Test
    void testBulkTicketDiscount_5 () {
        assertEquals(38, P10_BulkTicketDiscount.bulkTicketDiscounts(1, 40));
    }
    @Test
    void testBulkTicketDiscount_10 () {
        assertEquals(81, P10_BulkTicketDiscount.bulkTicketDiscounts(1, 90));
    }
    @Test
    void testBulkTicketDiscount_25 () {
        assertEquals(165, P10_BulkTicketDiscount.bulkTicketDiscounts(1, 220));
    }
}

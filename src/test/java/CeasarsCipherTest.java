import org.junit.Test;

import static org.junit.Assert.*;

public class CeasarsCipherTest {

    @Test
    public void offset12CipherSuccess() {
        CeasarsCipher Ceasars = new CeasarsCipher();
        assertEquals("tai mdq kag pauzs fapmk", Ceasars.cipher("how are you doing today", 12));
    }

    @Test
    public void offset12CipherFailure() {
        CeasarsCipher Ceasars = new CeasarsCipher();
        assertEquals("tai mdq kag pauzs fapmk", Ceasars.cipher("how are you doing today", 13));
    }

    @Test
    public void testEmptyString() {
        CeasarsCipher Ceasars = new CeasarsCipher();
        assertEquals("", Ceasars.cipher("", 12));
    }


}
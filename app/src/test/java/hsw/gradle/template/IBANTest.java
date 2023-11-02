package hsw.gradle.template;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IBANTest {
    @Test void IBANDE() {
        String myIBAN = "DE68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.check(myIBAN), true);
    }

    @Test void IBANWrong() {
        String myIBAN = "ZZ68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.check(myIBAN), false);
    }
    @Test void TestistIbannichtDE() {
        String myIBAN = "ZZ68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.check(myIBAN), false);
    }
    @Test void TestistIbanDE() {
        String myIBAN = "DE68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.check(myIBAN), true);
    }
    @Test void TestgetKontonummer() {
        String myIBAN = "DE68210501700012345678";
        String kontonummer = "0012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.getKontonummer(myIBAN), kontonummer);
    }
    @Test void TestfalsegetKontonummer() {
        String myIBAN = "DE68210501700012345678";
        String kontonummer = "1012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertNotEquals(classUnderTest.getKontonummer(myIBAN), kontonummer);
    }
    @Test void TestgetBLZ() {
        String myIBAN = "DE68210501700012345678";
        String BLZ = "21050170";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.getBLZ(myIBAN), BLZ);
    }
    @Test void TestFalsegetBLZ() {
        String myIBAN = "DE68210501700012345678";
        String BLZ = "22050170";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertNotEquals(classUnderTest.getBLZ(myIBAN), BLZ);
    }

}
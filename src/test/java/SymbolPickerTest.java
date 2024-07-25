import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymbolPickerTest {
    private  final SymbolPicker symbolPicker = new SymbolPicker();
    @Test
    public void pick_okData_success (){
        char symbol = symbolPicker.pick("Kira",0);

        assertEquals('K', symbol);
    }

    @Test
    public void pick_indexMoreThanStringSize_success () {
        char symbol = symbolPicker.pick("Kira",15);

        assertEquals(' ', symbol);
    }

    @Test
    public void pick_indexBelowZero_success() {
        char symbol = symbolPicker.pick("Даниил", -1);

        assertEquals(' ', symbol);
    }

    @Test
    public void pick_stringIsNull_success () {
        char symbol = symbolPicker.pick(null, -1);
        assertEquals(' ', symbol);
    }
}



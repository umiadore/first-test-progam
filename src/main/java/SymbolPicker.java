public class SymbolPicker {
    public  char pick (String string, int index) {
       if (string == null)  {
           return ' ';
       }

        if (index >= string.length() || index <0) {
           return ' ';
       }

        return string.charAt(index); // Метод принимает строчку и индекс, и по этому индексу выбирает один элемент
    }
}

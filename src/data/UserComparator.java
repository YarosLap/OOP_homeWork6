package data;

public class UserComparator<T extends User> implements Comparator<T> {

    // SRP (single responsibility principle) ПРИНЦИП ЕДИНСТВЕННОЙ ОТВЕТСТВЕННОСТИ -> класс UserComparator выполняет только
    // одну функцию - возвращает resultOfComparing
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
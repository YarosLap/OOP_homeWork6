

// ISP (interface segregation principle) ПРИНЦИП РАЗДЕЛЕНИЯ ИНТЕРФЕЙСОВ -> интерфейс UserController выполняет только
// метод create
public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
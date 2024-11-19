public final class Name {  // сущ-ть Имя
    private final String firstName;
    private final String lastName;
    private final String patronymic;

    public Name(String firstName, String lastName, String patronymic) { // проверка на пустоту
        if ((firstName == null || firstName.isEmpty()) && (lastName == null || lastName.isEmpty()) && (patronymic == null || patronymic.isEmpty())) {
            throw new IllegalArgumentException("Как минимум одно поле должно быть непустым!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getFullName() {
        return firstName + " " + lastName + " " + patronymic;
    }

    @Override
    public String toString() {
        return "Имя: " + firstName + ", Фамилия: " + lastName + ", Отчество: " + patronymic;
    }
}

package entities;

public class Player {

    private int id;
    private String name;
    private String lastName;
    private String nationalityId;
    private int yearofbirth;

    public Player() {
    }

    public Player(int id, String name, String lastNama, String nationalityId, int yearofbirth) {
        this.id = id;
        this.name = name;
        this.lastName = lastNama;
        this.nationalityId = nationalityId;
        this.yearofbirth = yearofbirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public int getYearofbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(int yearofbirth) {
        this.yearofbirth = yearofbirth;
    }
}

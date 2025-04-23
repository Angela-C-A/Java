import java.time.LocalDate;

public class Wedding {

    private Couple1 couple;
    private LocalDate weddingDate;
    private String location;

    public Wedding(Couple1 couple, LocalDate weddingDate, String location) {
        this.couple = couple;
        this.weddingDate = weddingDate;
        this.location = location;
    }

    public Couple1 getCouple() {
        return couple;
    }

    public LocalDate getWeddingDate() {
        return weddingDate;
    }

    public String getLocation() {
        return location;
    }
}

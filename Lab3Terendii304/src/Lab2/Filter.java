package Lab2;

public class Filter {
    private String status;

    public Filter(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void clean() {
        status = "Чистий";
    }
}

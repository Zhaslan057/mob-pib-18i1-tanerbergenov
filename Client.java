public class Client {
    private final int num;
    private final String title;
    private final ClientStatus status;


    public Client(int num, String title, ClientStatus status) {
        this.num = num;
        this.title = title;
        this.status = status;
    }

    public ClientStatus getStatus() {
        return status;
    }


    @Override
    public String toString() {
        return "id=" + num +
                ", title='" + title + '\'' +
                ", status=" + status;
    }
}

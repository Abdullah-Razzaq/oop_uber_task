package uber;

public class Taxi {
        int id;
        double x;
        double y;
        String available;
        public Taxi (){

        }

        public Taxi(int id, double x, double y, String available) {
            this.id = id;
            this.x = x;
            this.y = y;
            this.available = available;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public String isAvailable() {
            return available;
        }

        public void setAvailable(String available) {
            this.available = available;
        }

    @Override
    public String toString() {
        return "Taxi{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", available=" + available +
                '}';
    }
}



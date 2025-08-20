package Unit5.CodeIt.FiveEight;

public class Automobile {
    private int id;
    private String make;
    private String model;
    private String color;
    private int year;
    private int mpg;

    public Automobile() {
        this.id = 0;
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mpg = 0;
    }

    public Automobile(int id, String make, String model, String color, int year, int mpg) {
        setId(id);
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setMpg(mpg);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0 && id <= 9999) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 2005 && year <= 2024) {
            this.year = year;
        } else {
            this.year = 0;
        }
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        if (mpg >= 10 && mpg <= 60) {
            this.mpg = mpg;
        } else {
            this.mpg = 0;
        }
    }
}


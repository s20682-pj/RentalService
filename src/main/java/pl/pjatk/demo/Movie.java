package pl.pjatk.demo;

public class Movie {
    private Long id;
    private String name;
    private Category category;
    private String year;
    private boolean isAvailable;

    public Movie() {
    }

    public Movie(Long id, String name, Category category, String year, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

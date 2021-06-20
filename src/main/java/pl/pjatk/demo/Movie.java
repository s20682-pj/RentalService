package pl.pjatk.demo;

import io.swagger.annotations.ApiModelProperty;

public class Movie {
    @ApiModelProperty(notes = "This is an id of the movie", required = true, value = "id", example = "1")
    private Long id;
    @ApiModelProperty(notes = "This is a name of the movie", required = true, value = "name", example = "xd")
    private String name;
    @ApiModelProperty(notes = "This is a category id of the movie", required = true, value = "category", example = "Horror")
    private Category category;
    @ApiModelProperty(notes = "This is a year id of the movie", required = true, value = "year", example = "2020")
    private String year;
    @ApiModelProperty(notes = "This is an availability of the movie", required = true, value = "available", example = "1")
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

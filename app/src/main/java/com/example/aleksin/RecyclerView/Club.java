package com.example.aleksin.RecyclerView;

public class Club {


    String name, description;
    int logo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public Club(String name, String description, int logo) {
        this.name = name;
        this.logo = logo;
        this.description = description;
    }
}

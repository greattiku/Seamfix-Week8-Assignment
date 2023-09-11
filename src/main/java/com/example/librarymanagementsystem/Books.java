package com.example.librarymanagementsystem;

public class Books {
    String authorName;
    String title;
    int price;
    int stock;
    double softwareVersion;
    String softwareName;
    int pageNumber;
    String hardwareCategory;
    String publisher;



    public String getAuthorName(){
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(double softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getHardwareCategory() {
        return hardwareCategory;
    }

    public void setHardwareCategory(String hardwareCategory) {
        this.hardwareCategory = hardwareCategory;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

package io.dreamcode.pojo;

public class SiteInfo {
    private Integer id;
    private String siteName;
    private String power;
    private String copyright;
    private String brand;
    private String favicon;
    private String header;

    public SiteInfo() {
    }

    public SiteInfo(Integer id, String siteName, String power, String copyright, String brand, String favicon, String header) {
        this.id = id;
        this.siteName = siteName;
        this.power = power;
        this.copyright = copyright;
        this.brand = brand;
        this.favicon = favicon;
        this.header = header;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFavicon() {
        return favicon;
    }

    public void setFavicon(String favicon) {
        this.favicon = favicon;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return "SiteInfo{" +
                "id=" + id +
                ", siteName='" + siteName + '\'' +
                ", power='" + power + '\'' +
                ", copyright='" + copyright + '\'' +
                ", brand='" + brand + '\'' +
                ", favicon='" + favicon + '\'' +
                ", header='" + header + '\'' +
                '}';
    }
}

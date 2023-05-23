package com.example.cours3;

public class Pays {
    private String codeValue;
    private String alternateName;
    private String countryGroup;
    private String nameEn;
    private String nameFr;
    private String nameDe;
    private String lattitude;
    private String longittude;

    public Pays(String codeValue, String alternateName, String countryGroup, String nameEn, String nameFr, String nameDe, String lattitude, String longittude) {
        this.codeValue = codeValue;
        this.alternateName = alternateName;
        this.countryGroup = countryGroup;
        this.nameEn = nameEn;
        this.nameFr = nameFr;
        this.nameDe = nameDe;
        this.lattitude = lattitude;
        this.longittude = longittude;
    }

    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    public String getAlternateName() {
        return alternateName;
    }

    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getCountryGroup() {
        return countryGroup;
    }

    public void setCountryGroup(String countryGroup) {
        this.countryGroup = countryGroup;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    public String getNameDe() {
        return nameDe;
    }

    public void setNameDe(String nameDe) {
        this.nameDe = nameDe;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getLongittude() {
        return longittude;
    }

    public void setLongittude(String longittude) {
        this.longittude = longittude;
    }
}

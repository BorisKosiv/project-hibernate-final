package com.javarush.redis;
import com.javarush.domain.Continent;

import java.math.BigDecimal;
import java.util.Set;
public class CityCountry {
    private Integer id;

    private String name;

    private String district;

    private Integer population;

    private String countryCode;

    private String alternativeCountryCode;

    private String countryName;

    private Continent continent;

    private String countryRegion;

    private BigDecimal countrySurfaceArea;

    private Integer countryPopulation;

    private Set<Language> languages;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setAlternativeCountryCode(Object alternativeCode) {
        this.alternativeCountryCode = (String) alternativeCode;
    }

    public void setContinent(Object continent) {
        this.continent = (Continent) continent;
    }

    public void setCountryCode(Object code) {
        this.countryCode = (String) code;
    }

    public void setCountryName(Object name) {
        this.countryName = (String) name;
    }

    public void setCountryPopulation(Object population) {
        this.countryPopulation = (Integer) population;
    }

    public void setCountryRegion(Object region) {
        this.countryRegion = (String) region;
    }

    public void setCountrySurfaceArea(Object surfaceArea) {
        this.countrySurfaceArea = (BigDecimal) surfaceArea;
    }

    public void setLanguages(Set<Language> languages) {
        this.languages = languages;
    }

    public void setLanguages(Object languages) {
        this.languages = (Set<Language>) languages;

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public Integer getPopulation() {
        return population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getAlternativeCountryCode() {
        return alternativeCountryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public Continent getContinent() {
        return continent;
    }

    public String getCountryRegion() {
        return countryRegion;
    }

    public BigDecimal getCountrySurfaceArea() {
        return countrySurfaceArea;
    }

    public Integer getCountryPopulation() {
        return countryPopulation;
    }

    public Set<Language> getLanguages() {
        return languages;
    }
}

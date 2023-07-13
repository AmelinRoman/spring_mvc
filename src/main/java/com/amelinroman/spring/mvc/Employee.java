package com.amelinroman.spring.mvc;

import com.amelinroman.spring.mvc.validation.CheckEmail;
import jakarta.validation.constraints.*;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    @NotBlank(message = "name is required field")
    @Size(min = 2, max = 25, message = "name must be min 2  and max 25 symbols")
    private String name;
    @NotBlank(message = "surname is required field")
    @Size(min = 2, max = 25, message = "name must be min 2  and max 25 symbols")
    private String surname;
    @Min(value = 100, message = "must be greater than 99")
    @Max(value = 2500, message = "must be less than 2501")
    private int salary;
    private String department;
    private String carBrand;
    private String[] languages;
    private Map<String, String> langs;
    private Map<String, String> departments;
    private Map<String, String> carBrands;
    @CheckEmail(value = "emp.com", message = "mail must ends with emp.com")
    private String email;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use this patter: XXX-XX-XX")
    private String phoneNumber;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("AUDI", "AUDI");
        carBrands.put("Mercedes-Benz", "MB");

        langs = new HashMap<>();
        langs.put("English", "EN");
        langs.put("Franch", "FR");
        langs.put("Russian", "RU");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getLangs() {
        return langs;
    }

    public void setLangs(Map<String, String> langs) {
        this.langs = langs;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

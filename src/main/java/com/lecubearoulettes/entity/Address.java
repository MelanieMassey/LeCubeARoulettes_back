package com.lecubearoulettes.entity;

import com.lecubearoulettes.entity.Customer;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "addresses")
@Embeddable
@AttributeOverrides({
        @AttributeOverride(
                name = "streetNumber",
                column = @Column(name = "address_streetNumber")
        ),
        @AttributeOverride(
                name = "streetType",
                column = @Column(name = "address_streetType")
        ),
        @AttributeOverride(
                name = "streetName",
                column = @Column(name = "address_streetName")
        ),
        @AttributeOverride(
                name = "addressMoreInfo",
                column = @Column(name = "address_moreInfo")
        ),
        @AttributeOverride(
                name = "zipCode",
                column = @Column(name = "address_zipCode")
        ),
        @AttributeOverride(
                name = "city",
                column = @Column(name = "address_city")
        )
})
public class Address {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer addressId;
    private Integer streetNumber;
    private String streetType;
    private String streetName;
    private String addressMoreInfo;
    private String zipCode;
    private String city;
//    @OneToMany(mappedBy = "address", cascade = CascadeType.PERSIST)
//    private List<Customer> customersLeavingThere = new ArrayList<>();

    public Address() {
    }

    public Address(Integer streetNumber, String streetType, String streetName, String addressMoreInfo, String zipCode, String city) {
        this.streetNumber = streetNumber;
        this.streetType = streetType;
        this.streetName = streetName;
        this.addressMoreInfo = addressMoreInfo;
        this.zipCode = zipCode;
        this.city = city;
    }

//    public void addCustomer(Customer customer){
//        customersLeavingThere.add(customer);
//    }

    // GETTERS & SETTERS
    public Integer getStreetNumber() {
        return streetNumber;
    }

    public String getStreetType() {
        return streetType;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getAddressMoreInfo() {
        return addressMoreInfo;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

//    public List<Customer> getCustomersLeavingThere() {
//        return customersLeavingThere;
//    }
//
//    public void setCustomersLeavingThere(List<Customer> customersLeavingThere) {
//        this.customersLeavingThere = customersLeavingThere;
//    }
}

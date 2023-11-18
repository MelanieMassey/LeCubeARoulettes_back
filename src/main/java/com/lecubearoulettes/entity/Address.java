//package com.lecubearoulettes.entity;
//
////import com.lecubearoulettes.entity.Customer;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "addresses")
////@Embeddable
////@AttributeOverrides({
////        @AttributeOverride(
////                name = "streetNumber",
////                column = @Column(name = "address_streetNumber")
////        ),
////        @AttributeOverride(
////                name = "streetType",
////                column = @Column(name = "address_streetType")
////        ),
////        @AttributeOverride(
////                name = "streetName",
////                column = @Column(name = "address_streetName")
////        ),
////        @AttributeOverride(
////                name = "addressMoreInfo",
////                column = @Column(name = "address_moreInfo")
////        ),
////        @AttributeOverride(
////                name = "zipCode",
////                column = @Column(name = "address_zipCode")
////        ),
////        @AttributeOverride(
////                name = "city",
////                column = @Column(name = "address_city")
////        )
////})
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//public class Address {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private Integer streetNumber;
//    private String streetType;
//    private String streetName;
//    private String addressMoreInfo;
//    private String zipCode;
//    private String city;
//    @JsonIgnore
//    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<UserEntity> usersLeavingThere = new ArrayList<>();
//
//
//
//
//}

package com.example;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {

    private String name;
    private Integer size;
    private Integer price;


    public UserDto() {

    }
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(final Integer size) {
        this.size = size;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(final Integer price) {
        this.price = price;
    }

    public String toString() {
        String var10000 = this.getName();
        return "UserDto(name=" + var10000 + ", size=" + this.getSize() + ", price=" + this.getPrice() + ")";
    }
}

package com.iqcollections;

// this class stores all the constructors as well as the get and set methods for the wishlist function
public class wishClass {
    private String wishName;
    private String wishDesc;
    private String wishPrice;


    public wishClass() {

    }

    public wishClass(String wishName, String wishDesc, String wishPrice) {
        this.wishName = wishName;
        this.wishDesc = wishDesc;
        this.wishPrice = wishPrice;
    }

    public String getWishName() {
        return wishName;
    }

    public void setWishName(String wishName) {
        this.wishName = wishName;
    }

    public String getWishDesc() {
        return wishDesc;
    }

    public void setWishDesc(String wishDesc) {
        this.wishDesc = wishDesc;
    }

    public String getWishPrice() {
        return wishPrice;
    }

    public void setWishPrice(String wishPrice) {
        this.wishPrice = wishPrice;
    }


}

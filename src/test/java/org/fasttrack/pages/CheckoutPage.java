package org.fasttrack.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(css = ".top .button")
    private WebElementFacade proceedToCheckoutButton;
    @FindBy(id = "billing-address-select")
    private WebElementFacade newaddress;

    @FindBy(css = "#billing-address-select > option:nth-child(2)")
    private WebElementFacade chooseNewAddress;


    @FindBy(id="billing:street1")
    private WebElementFacade addressField;

    @FindBy(id = "billing:city")
    private WebElementFacade cityField;

    @FindBy(id = "billing:region_id")
    private WebElementFacade regionDropdownList;

    @FindBy(css = "#billing\\:region_id > option:nth-child(14)")
    private WebElementFacade regionselect;

    @FindBy(id = "billing:postcode")
    private WebElementFacade postcodeField;
    @FindBy(id = "billing:country_id")
    private WebElementFacade countryDropdownList;

    @FindBy(css = "#billing\\:country_id > option:nth-child(186)")
    private WebElementFacade countryselect;
    @FindBy(id = "billing:telephone")
    private WebElementFacade telephoneField;

    @FindBy(css = "#billing-buttons-container [title='Continue'] ")
    private WebElementFacade continuefrombillinginfo;
    @FindBy(css = "#shipping-buttons-container span")
    private WebElementFacade continueFromShippingInfo;
    @FindBy(css = "[for='s_method_freeshipping_freeshipping']")
    private WebElementFacade freeShippingButton;
    @FindBy(css = "#shipping-method-buttons-container span")
    private WebElementFacade continuefromShipping;
    @FindBy(css = "#payment-buttons-container span")
    private WebElementFacade continueFromPayment;
    @FindBy(css = ".btn-checkout span")
    private WebElementFacade placeOrder;
    @FindBy(css = ".sub-title")
    private WebElementFacade welcomeText2;


    public void clickCheckoutButton(){
        clickOn(proceedToCheckoutButton);
    }
    public void clickNewAddress(){
        clickOn(newaddress);
    }
    public void clickChooseNewAddress(){
        clickOn(chooseNewAddress);
    }

    public void setAddressField(String address){
        typeInto(addressField, address);
    }

    public void setCityField(String city){
        typeInto(cityField, city);
    }

    public void clickRegionDropDownList(){
        clickOn(regionDropdownList);
    }

    public void clickRegion(){
        clickOn(regionselect);
    }
    public void setPostcode(String postcode){
        typeInto(postcodeField, postcode);
    }
    public void clickCountryDropdownList(){
        clickOn(countryDropdownList);

    }
    public void clickCountrySelect(){
        clickOn(countryselect);
    }
    public void setTelephoneField(String phoneNumber){
        typeInto(telephoneField, phoneNumber);
    }
    public void clickContinueFromBillingInfo(){
        clickOn(continuefrombillinginfo);
    }
    public void clickContinueFromShippingInfo(){
        clickOn(continueFromShippingInfo);
    }

    public void clickFreeShippingButton(){
        clickOn(freeShippingButton);

    }
    public void clickContinueFromShipping(){
        clickOn(continuefromShipping);
    }
    public void clickContinueFromPayment(){
        clickOn(continueFromPayment);
    }
    public void clickPlaceOrder(){
        clickOn(placeOrder);
    }
    public String getWelcomeText2(){
        return welcomeText2.getText();
    }

}
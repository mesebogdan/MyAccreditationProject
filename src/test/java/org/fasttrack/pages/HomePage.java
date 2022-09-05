package org.fasttrack.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008/")
public class HomePage extends BasePage {

    @FindBy(id = "menu-item-122")
    private WebElementFacade myAccountLink;

    @FindBy(css = ".header-search")
    private WebElementFacade searchIcon;
    @FindBy(css = ".header-search-open .search-field")
    private WebElementFacade searchField;

    @FindBy(css = ".header-search [type='submit']")
    private WebElementFacade searchButton;

    public void clickAccountLink() {
        clickOn(myAccountLink);
    }
    public void clickSearchIcon(){
        clickOn(searchIcon);
    }

    public void setSearchField(String value){
        typeInto(searchField,value);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }
}

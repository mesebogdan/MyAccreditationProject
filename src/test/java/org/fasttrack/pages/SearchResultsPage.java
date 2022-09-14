package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".woocommerce-LoopProduct-link h2")
    private List<WebElementFacade> listOfProductNames;

    public boolean findProductInGridAndOpen(String productName){
        for (WebElementFacade element : listOfProductNames){
            if (element.getText().equalsIgnoreCase(productName)){
                element.click();
                return true;
            }
        }
        return false;
    }
}

package uistore;

import org.openqa.selenium.By;

public class SwarovskiGiftPageLocator {
    //Kartik Bameta
    public static By hoverOnGifts = By.xpath("(//span[text()='Gifts'])[1]");
    public static By clickOnWeddingGifts = By.xpath("(//span[text()='Wedding gifts'])[1]");
    public static By clickOnCategories = By.xpath("//span[@class='swa-filter-category-desktop__filter-name swa-label-sans--small' and contains(text(),'Categories')]");
    public static By clickOnWatches = By.xpath("(//li[@class='swa-filter-list-item']/child::label[contains(text(),'Watches')])[2]");
    public static By clickOnAllWatches = By.cssSelector("label[for='filter-category-0202']");
    public static By clickOnShowAll = By.cssSelector("button[class='swa-button swa-button--large swa-button--no-margin swa-button-primary-black swa-filter-button swa-filter-button--show swa-button--apply-all']>span[class='swa-button__content']>span[class='swa-button__text swa-label-sans--medium-strong']");
    // public static By clickOnFilter = By.id("filter-dropdown-count-product_material");
    public static By clickOnMaterialDropDown = By.id("filter-dropdown-count-product_material");
    public static By clickOnStainlessSteel = By.xpath("(//span[@class='swa-size-caption' and text()='Stainless steel'])[2]");
    public static By clickOnShowAllButton = By.cssSelector("button[class='swa-button swa-button--large swa-button--no-margin swa-button-primary-black swa-filter-button swa-filter-button--show swa-button--apply-all']>span[class='swa-button__content']>span[class='swa-button__text swa-label-sans--medium-strong']");
    public static By clickOnFirstProductWatch = By.xpath("(//p/span[@class='swa-product-tile-plp__information__title swa-product-sans--name'])[1]");
    public static By addToCartText = By.xpath("//span[text()='Add to bag']");
}

package Amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AmazonTest extends HomePage {

    HomePage home;

    @Test(priority = 1)
    public void testCheckSearchBox() {
        checkSearchBox();
        String expectedText = "\"Gloves\"";
        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test(priority = 2)
    public void testPageTitle() {
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");
    }

    @Test(priority = 3)
    public void testBooks() {
        String expectedText = "Amazon.com: Books";
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 4)
    public void testTodaysDeals() {
        String expectedText = "Gold Box Deals | Today's Deals - Amazon.com";
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 5)
    public void testCart() {
        String expectedText = "Amazon.com Shopping Cart";
        driver.findElement(By.cssSelector("#nav-cart")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 6)
    public void testKindleBooks() {
        String expectedText = "Amazon Sign-In";
        driver.findElement(By.cssSelector("#nav-link-prime")).click();
        driver.findElement(By.cssSelector("#prime-header-CTA > span > input")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 7)
    public void testPrimeVideo() throws InterruptedException {
        String expectedText = "Amazon.com: Prime Video: Prime Video";
        driver.findElement(By.cssSelector("#nav-hamburger-menu > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(7) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(6) > a")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 8)
    public void testMensFashion() throws InterruptedException {
        String expectedText = "Men's Clothing, Shoes, Jewelry, Watches & Accessories | Amazon.com";
        driver.findElement(By.cssSelector("#nav-hamburger-menu > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(17) > a > div")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(5) > a")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 9)
    public void testChangeLanguage() throws InterruptedException {
        String expectedText = "Amazon.com: Compras en Línea de Electrónicos, Ropa, Computadoras, Libros, DVDs y más";
        driver.findElement(By.cssSelector("#icp-nav-flyout-link-2 > span.icp-nav-flag.icp-nav-flag-us")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#customer-preferences > div > div > form > div.a-row > div.a-column.a-span7 > div:nth-child(8) > div > label > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#icp-btn-save > span > input")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");
    }

    @Test(priority = 10)
    public void testSubscribeToProtectPlans() throws InterruptedException {
        String expectedText = "Subscribe to Protect Plans to Save Your Videos | Ring";
        driver.findElement(By.cssSelector("#navFooter > div.navFooterLine.navFooterLinkLine.navFooterDescLine > table > tbody > tr:nth-child(9) > td:nth-child(13) > a > span")).click();
        driver.findElement(By.cssSelector("#header > div > div.nav-product-desktop > ul > li.nav-link-flex.nav-link--plans.nav-dropdown--container > a")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 11)
    public void testAmazonButtonReturnsToHomePage() throws InterruptedException {
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        driver.findElement(By.cssSelector("#nav-logo-sprites")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 12)
    public void testSignIn() {
        String expectedText = "Amazon Sign-In";
        driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 12)
    public void testShoppingCart() {
        String expectedText = "Amazon.com Shopping Cart";
        driver.findElement(By.cssSelector("a.nav-a:nth-child(5)")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }
    @Test(priority = 13)
    public void testFashionTab() throws InterruptedException {
        String expectedText = "Amazon Fashion | Clothing, Shoes & Jewelry | Amazon.com";
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");


    }

    @Test(priority = 14)
    public void testAnniversaryGiftCard() {
        String expectedText = "Amazon.com";
        driver.findElement(By.cssSelector("a.nav-a:nth-child(9)")).click();
        driver.findElement(By.cssSelector("div.a-section:nth-child(15) > ul:nth-child(2) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > span:nth-child(1)")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 15)
    public void testSignUp() throws InterruptedException {
        driver.findElement(By.cssSelector(".nav-long-width")).click();
        driver.findElement(By.cssSelector("#createAccountSubmit")).click();
        String expectedText = "";
        String actualText = driver.findElement(By.id("ap_customer_name")).getText();
        Assert.assertEquals(actualText, expectedText, "Product does not match");

    }

    @Test(priority = 16)
    public void testFireStickTv() throws InterruptedException {
        String expectedText = "Amazon.com: Fire TV Stick with Alexa Voice Remote (includes TV controls) | HD streaming device | 2020 release: Amazon Devices";
        driver.findElement(By.cssSelector(".hm-icon-label")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("ul.hmenu:nth-child(1) > li:nth-child(11) > a:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("ul.hmenu:nth-child(6) > li:nth-child(4) > a:nth-child(1)")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");
    }

    @Test(priority = 17)
    public void testAddFireStickTvToCart() throws InterruptedException {
        String expectedText = "Amazon.com Shopping Cart";
        driver.findElement(By.cssSelector(".hm-icon-label")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("ul.hmenu:nth-child(1) > li:nth-child(11) > a:nth-child(1) > div:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("ul.hmenu:nth-child(6) > li:nth-child(4) > a:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#preOwnedCrossSellCertRefurb-addToCart > span:nth-child(1) > input:nth-child(1)")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");
    }

    @Test(priority = 18)
    public void testGiftsForWomen() {
        String expectedText = "Gifts for Women | Amazon.com Gift Finder";
        driver.findElement(By.cssSelector("a.nav-a:nth-child(11)")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[1]/div/a[1]/div/div[1]/div/img")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");
    }

    @Test(priority = 19)
    public void testCustomerService() {
        String expectedText = "Amazon.com Help: Help & Customer Service";
        driver.findElement(By.className("hm-icon-label")).click();
        driver.findElement(By.cssSelector("ul.hmenu:nth-child(1) > li:nth-child(37) > a:nth-child(1)")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 20)
    public void testSearchAndSelectStarbucksCoffee() {
        checkSearch();
        String expectedText = "Amazon.com : Starbucks Medium Roast Ground Coffee — Breakfast Blend — 100% Arabica — 1 bag (20 oz.) Great Holiday Gift : Grocery & Gourmet Food";
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        driver.findElement(By.cssSelector("#p_89\\/Starbucks > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)")).click();
        driver.findElement(By.cssSelector("div.s-result-item:nth-child(2) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > h2:nth-child(1) > a:nth-child(1) > span:nth-child(1)")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");
    }

    @Test(priority = 21)
    public void testCareer() {
        String expectedText = "Amazon.jobs: Help us build Earth’s most customer-centric company.";
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div[1]/ul/li[1]/a")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 22)
    public void verifyAmazonLogo() {
        boolean logo = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
        Assert.assertTrue(logo);
    }

    @Test(priority = 23)
    public void testBlog() throws InterruptedException {
        String expectedText = "About Amazon";
        driver.findElement(By.cssSelector("div.navFooterLinkCol:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#trending-now > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(13) > div:nth-child(1) > bsp-newsletter-module:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > label:nth-child(1) > input:nth-child(1)")).getText();
        driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/bsp-tabs/div/div[2]/div[1]/div/div/div/ul/li[13]/div/bsp-newsletter-module/div/form/div[2]/div[1]/button[1]")).click();
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");


    }

    @Test(priority = 24)
    public void testSpringIntoSummerDeals() {
        String expectedResult = "Amazon.com: Spring into Summer Deals";
        driver.findElement(By.xpath("//*[@id=\"swm-link\"]")).click();
        driver.findElement(By.cssSelector("div.bxc-grid__column:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > a:nth-child(1)")).click();
        String actualTest = driver.getTitle();
        Assert.assertEquals(actualTest, expectedResult, "Page Title Not Match");

    }
    @Test(priority = 25)
    public void testFindTheFourWindsNovelThanAddToCart() throws InterruptedException {
        String expectedResult = "Amazon.com Shopping Cart";
        driver.findElement(By.cssSelector(".hm-icon-label")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("ul.hmenu:nth-child(1) > li:nth-child(18) > a:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("ul.hmenu:nth-child(11) > li:nth-child(3) > a:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/div/div/div/div/div/div[2]/div/ol/li[1]/div/a/span/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
        //Thread.sleep(2000);
        String actualTest = driver.getTitle();
        Assert.assertEquals(actualTest, expectedResult, "Page Title Not Match");

    }

    @Test(priority = 26)
    public void testWatchComing2AmericaTrailer() throws InterruptedException {
        checkTrailer();
        String expectedText = "Watch Coming to America | Prime Video";
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.s-result-item:nth-child(4) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h2:nth-child(1) > a:nth-child(1) > span:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a.hym-nE > span:nth-child(2) > span:nth-child(1)")).click();
        Thread.sleep(26000);
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 27)
    public void testWatchHomeAloneTrailer() throws InterruptedException {
        checkHomeAloneTrailer();
        String expectedText = "Watch Home Alone | Prime Video";
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div/div[4]/div/div/div/div/div[2]/div/div/span/span/a/span[2]/span")).click();
        Thread.sleep(26000);
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 28)
    public void testSearchAndSelectHarryPotterSorcerersStoneBookThanAddToCart() throws InterruptedException {
        String expectedText = "Amazon.com Shopping Cart";
        driver.findElement(By.cssSelector("a.nav-a:nth-child(7)")).click();
        Thread.sleep(2000);
        checkBook();
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[4]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
        Thread.sleep(2000);
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");

    }

    @Test(priority = 29)
    public void testSearchChessAndSelectMagneticChessThanAddToCart() throws InterruptedException {
        checkChess();
        String expectedText = "Amazon.com Shopping Cart";
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.sg-col-4-of-12:nth-child(3) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > h2:nth-child(2) > a:nth-child(1) > span:nth-child(1)")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
        Thread.sleep(2000);
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }
    @Test(priority = 30)
    public void testSearchSelectAndAddToCartNightLamp() throws InterruptedException {
        checkNightLamp();
        String expectedText = "Amazon.com Shopping Cart";
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/h2/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
        Thread.sleep(2000);
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }

    @Test
    public void testEx(){
        home.checkBook();

    }


}
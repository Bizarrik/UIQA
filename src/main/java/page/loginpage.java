package page;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class LoginPage {

    By login = By.xpath("//*[@id=\"mobileOrEmail\"]");
    By password = By.xpath("//*[@id=\"password\"]");
    By buttonOk = By.xpath("//*[@id=\"loginByPwdButton\"]/span");

public void sendLogin () {
    Selenide.$(login).setValue("111");
}
public void sendPassword () {
    Selenide.$(password).setValue("111");
}
public void clickButton () {
    Selenide.$(buttonOk).click();
}
}

package framework.webPages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("pass");
	private By loginButton = By.id("loginbutton");
	private By firstNameTextField = By.id("u_0_e");
	private By lastNameTextField = By.id("u_0_g");
	private By mobileNumberTextField = By.id("u_0_j");
	private By newPasswordTextField = By.id("u_0_q");
	private By errorMessage = By.xpath("//div[text()='Please enter a valid mobile number or email address.']");
	private By femaleGender = By.id("u_0_9");
	private By maleGender = By.id("u_0_a");
	private By messengerLink = By.linkText("Messenger");
	private By signupButton = By.id("u_0_y");
	
	public void clickOnLoginButton() {
		clickOn(loginButton);
	}

	public void enterEmail(String enterEmail) {
		setValue(emailTextField, enterEmail);
	}
	
	public void enterPassword(String enterPassword) {
		setValue(passwordTextField, enterPassword);
	}

	public void enterFirstName(String firstName) {
		setValue(firstNameTextField, firstName);
	}

	public void enterLastName(String lastName) {
		setValue(lastNameTextField, lastName);
	}

	public void enterMobileNumber(String mobileNum) {
		setValue(mobileNumberTextField, mobileNum);
	}

	public void enterNewPassword(String password) {
		setValue(newPasswordTextField, password);
	}

	public String getErrorMessage() {
		return getTextFromElement(errorMessage);
	}

	public boolean isGenderFemaleSelected() {
		return isElementSelected(femaleGender);
	}

	public void clickOnFemaleGender() {
		clickOn(femaleGender);
	}

	public boolean isGenderMaleSelected() {
		return isElementSelected(maleGender);
	}

	public void clickOnMaleGender() {
		clickOn(maleGender);
	}

	public void clickOnMessengerLink() {
		clickOn(messengerLink);
	}

	public boolean isSignupButtonEnable() {
		return isElementEnabled(signupButton);
	}

	public void clickOnPasswordTextField(){
		clickOn(newPasswordTextField);
	}

	public void clickOnEmailTextField(){
		clickOn(mobileNumberTextField);
	}







}

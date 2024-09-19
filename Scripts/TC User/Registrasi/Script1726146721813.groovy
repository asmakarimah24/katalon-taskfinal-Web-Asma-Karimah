import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.siteURL)

WebUI.click(findTestObject('Language/button_Dismiss'))

WebUI.click(findTestObject('Language/a_cookies btn'))

WebUI.click(findTestObject('Object Repository/Register/span_Account'))

WebUI.click(findTestObject('Object Repository/Register/span_Login'))

WebUI.click(findTestObject('Object Repository/Register/a_Registrasi Btn'))

WebUI.click(findTestObject('Object Repository/Register/div_Email'))

WebUI.setText(findTestObject('Object Repository/Register/input_User Registration_emailControl'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/Register/input_Email_passwordControl'), password)

WebUI.setEncryptedText(findTestObject('Object Repository/Register/input_Password must be 5-40 characters long_eeca64'), 
    repassword)

WebUI.verifyElementVisible(findTestObject('Object Repository/Register/span_Repeat Password_mat-slide-toggle-bar'))

//WebUI.click(findTestObject('Register/span_Repeat Password_mat-slide-toggle-bar'))
if (passworddetail == true) {
    WebUI.click(findTestObject('Register/span_Repeat Password_mat-slide-toggle-bar'))
}

//WebUI.verifyElementPresent(findTestObject('Register/span_contains at least one lower character'), 0)
if (passworddetail == true) {
    WebUI.verifyElementVisible(findTestObject('Register/span_contains at least one lower character'), FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.verifyElementNotPresent(findTestObject('Register/span_contains at least one lower character'), 0)
}

WebUI.click(findTestObject('Register/div_Security Question'))

WebUI.click(findTestObject('Register/span_Your eldest siblings middle name'))

WebUI.setText(findTestObject('Object Repository/Register/input_This cannot be changed later_security_f37fc9'), answer)

WebUI.click(findTestObject('Object Repository/Register/button_Register'))

WebUI.verifyElementPresent(findTestObject('Login/h1_Login'), 0)

WebUI.closeBrowser()


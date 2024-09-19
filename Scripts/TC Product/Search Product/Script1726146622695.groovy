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

WebUI.click(findTestObject('Object Repository/Search/mat-icon_search'))

WebUI.setText(findTestObject('Object Repository/Search/input_OWASP Juice Shop_mat-input-0'), buah)

WebUI.sendKeys(findTestObject('Object Repository/Search/input_OWASP Juice Shop_mat-input-0'), Keys.chord(Keys.ENTER))

///WebUI.verifyElementText(findTestObject('product/div_label Juice item'), 'Apple Juice (1000ml)')
switch (facility) {
	case facility = 'Tokyo CURA Healthcare Center':
		WebUI.verifyElementText(findTestObject('Confirmation Page/p_Label Health Center'), 'Tokyo CURA Healthcare Center')

		break
	case facility = 'Hongkong CURA Healthcare Center':
		WebUI.verifyElementText(findTestObject('Confirmation Page/p_Label Health Center'), 'Hongkong CURA Healthcare Center')

		break
	case facility = 'Seoul CURA Healthcare Center':
		WebUI.verifyElementText(findTestObject('Confirmation Page/p_Label Health Center'), 'Seoul CURA Healthcare Center')

		break
	default:
		WebUI.verifyElementText(findTestObject('Confirmation Page/p_Label Health Center'), 'Tokyo CURA Healthcare Center')

		break
}
WebUI.doubleClick(findTestObject('Object Repository/Search/mat-icon_search'))


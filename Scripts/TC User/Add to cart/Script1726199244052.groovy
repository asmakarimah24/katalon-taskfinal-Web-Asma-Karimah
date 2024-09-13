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

WebUI.navigateToUrl('https://juice-shop.herokuapp.com/#/')

WebUI.click(findTestObject('Object Repository/Cart/span_Dismiss'))

WebUI.click(findTestObject('Object Repository/Cart/a_Me want it'))

WebUI.click(findTestObject('Object Repository/Cart/button_account_circle  Account'))

WebUI.click(findTestObject('Object Repository/Cart/button_exit_to_app  Login'))

WebUI.click(findTestObject('Object Repository/Cart/div_Email'))

WebUI.setText(findTestObject('Object Repository/Cart/input_Login_email'), 'lala@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart/input_Email_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/Cart/mat-icon_exit_to_app'))

WebUI.click(findTestObject('Object Repository/Cart/button_Add to Basket'))

WebUI.click(findTestObject('Object Repository/Cart/span_1'))

WebUI.closeBrowser()


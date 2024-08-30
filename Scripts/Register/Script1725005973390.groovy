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

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('http://localhost:4200/register')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Register/input_name'), 'Jane Smith')
WebUI.setText(findTestObject('Page_Register/input_telephone'), '1234567890')
WebUI.setText(findTestObject('Page_Register/input_email'), 'jane@example.com')
WebUI.setText(findTestObject('Page_Register/input_password'), 'password123')

WebUI.click(findTestObject('Page_Register/button_sign_in'))

WebUI.waitForPageLoad(10)

boolean isRedirected = WebUI.verifyMatch(WebUI.getUrl(), 'http://localhost:4200/overview', false)

if (isRedirected) {
	WebUI.comment('Registration process is successful and user is redirected to the home page.')
} else {
	WebUI.comment('Registration process failed or user was not redirected to the home page.')
}

WebUI.closeBrowser()

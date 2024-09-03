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

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser('')
WebUI.navigateToUrl('http://localhost:4200/users')


WebUI.click(findTestObject('Object Repository/Page_Users/button_Create'))


WebUI.setText(findTestObject('Object Repository/Page_CreateUser/input_Name_name'), 'John Doe')
WebUI.setText(findTestObject('Object Repository/Page_CreateUser/input_Email_email'), 'johndoe@example.com')
WebUI.setText(findTestObject('Object Repository/Page_CreateUser/input_Password_password'), 'SecurePassword123')
WebUI.setText(findTestObject('Object Repository/Page_CreateUser/input_Telephone_telephone'), '1234567890')


WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CreateUser/select_Role'), 'Admin', true)


WebUI.click(findTestObject('Object Repository/Page_CreateUser/button_Create'))


boolean isUserCreated = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Users/label_Success'), 10)

if (isUserCreated) {
	println('User was successfully created.')
} else {
	println('User creation failed.')
}

WebUI.closeBrowser()

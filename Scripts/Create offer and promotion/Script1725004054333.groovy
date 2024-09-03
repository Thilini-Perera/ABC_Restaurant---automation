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
WebUI.navigateToUrl('http://localhost:4200/offernpromotions')

WebUI.click(findTestObject('Object Repository/Page_OfferNPromotions/button_Create'))

WebUI.setText(findTestObject('Object Repository/Page_CreateOffer/input_Message_message'), 'Get 20% off on all items!')
WebUI.setText(findTestObject('Object Repository/Page_CreateOffer/input_Code_code'), 'SUMMER20')
WebUI.setText(findTestObject('Object Repository/Page_CreateOffer/input_Discount_discount'), '20%')

WebUI.click(findTestObject('Object Repository/Page_CreateOffer/input_DatePicker_offerUntil'))  
WebUI.click(findTestObject('Object Repository/Page_CreateOffer/select_Date')) 

WebUI.click(findTestObject('Object Repository/Page_CreateOffer/button_Create'))

boolean isOfferCreated = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OfferNPromotions/label_Success'), 10)

if (isOfferCreated) {
	println('Offer or Promotion was successfully created.')
} else {
	println('Offer or Promotion creation failed.')
}

WebUI.closeBrowser()

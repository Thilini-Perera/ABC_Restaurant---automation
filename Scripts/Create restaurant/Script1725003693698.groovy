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
WebUI.navigateToUrl('http://localhost:4200/restaurants')


WebUI.click(findTestObject('Object Repository/Page_Restaurants/button_Create'))


WebUI.setText(findTestObject('Object Repository/Page_CreateRestaurant/input_Name_name'), 'ABC Restaurant - Ganemulla')
WebUI.setText(findTestObject('Object Repository/Page_CreateRestaurant/input_Location_location'), 'Ganemulla')
WebUI.setText(findTestObject('Object Repository/Page_CreateRestaurant/input_MaximumReservations_maximum_reservations'), '50')
WebUI.setText(findTestObject('Object Repository/Page_CreateRestaurant/input_RateForReservations_rate_for_reservations'), '2500')
WebUI.setText(findTestObject('Object Repository/Page_CreateRestaurant/input_Telephone_telephone'), '1234567890')


WebUI.click(findTestObject('Object Repository/Page_CreateRestaurant/button_Create'))


boolean isRestaurantCreated = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Restaurants/label_Success'), 10)

if (isRestaurantCreated) {
	println('Restaurant was successfully created.')
} else {
	println('Restaurant creation failed.')
}


WebUI.closeBrowser()

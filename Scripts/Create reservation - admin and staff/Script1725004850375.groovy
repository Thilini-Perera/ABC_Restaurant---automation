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
WebUI.navigateToUrl('http://localhost:4200/reservations')

WebUI.click(findTestObject('Object Repository/Page_Reservations/button_Create'))

WebUI.setText(findTestObject('Object Repository/Page_CreateReservation/input_Name_name'), 'Birthday party')

WebUI.setText(findTestObject('Object Repository/Page_CreateReservation/input_ReservationDate_reservationDate'), '2024-09-01')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CreateReservation/select_Customer'), 'Customer1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CreateReservation/select_ReservationType'), 'Dine-in', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CreateReservation/select_Restaurant'), 'ABC Restaurant - Ganemulla', true)

WebUI.setText(findTestObject('Object Repository/Page_CreateReservation/input_NumberOfPeople_numberOfPeople'), '4')

WebUI.click(findTestObject('Object Repository/Page_CreateReservation/button_Create'))

boolean isReservationCreated = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Reservations/label_Success'), 10)

if (isReservationCreated) {
	println('Reservation was successfully created.')
} else {
	println('Reservation creation failed.')
}

WebUI.closeBrowser()

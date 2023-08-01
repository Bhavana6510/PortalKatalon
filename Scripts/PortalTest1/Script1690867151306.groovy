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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://kdx03:Servehugematch93!@clientsupport.sit.charles-stanley.co.uk/app/')

WebUI.click(findTestObject('Object Repository/PortalRepo/Page_Dashboard/button_Create new'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PortalRepo/Page_Dashboard/select_Select Service IMS OneStep - Five-po_f58547'),
	'2', true)

WebUI.click(findTestObject('Object Repository/PortalRepo/Page_Dashboard/button_Create new'))

WebUI.click(findTestObject('Object Repository/PortalRepo/Page_Dashboard/input_Business getter code_form-select ng-u_14f3bc'))

WebUI.click(findTestObject('Object Repository/PortalRepo/Page_Dashboard/li_DOX - Aidan Fuller'))

WebUI.click(findTestObject('Object Repository/PortalRepo/Page_Dashboard/span_Client Details'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PortalRepo/Page_Dashboard/select_Select titleMrMsMrsMissDrOther'),
	'1: Mr', true)

WebUI.setText(findTestObject('Object Repository/PortalRepo/Page_Dashboard/input_First names_client1firstnames'), 'Test')

WebUI.setText(findTestObject('Object Repository/PortalRepo/Page_Dashboard/input_Last name_client1lastname'), 'Last')

WebUI.setText(findTestObject('Object Repository/PortalRepo/Page_Dashboard/input_Date of birth_client1dob'), '12/11/1976')

WebUI.click(findTestObject('Object Repository/PortalRepo/Page_Dashboard/label_Male'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PortalRepo/Page_Dashboard/select_Please selectSingleMarriedSeparatedD_f061ed'),
	'Married', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PortalRepo/Page_Dashboard/select_Please selectSingleMarriedSeparatedD_f061ed'),
	'Single', true)

WebUI.setText(findTestObject('Object Repository/PortalRepo/Page_Dashboard/input_Email address_client1email'), 'Test@gmqil.com')

WebUI.setText(findTestObject('Object Repository/PortalRepo/Page_Dashboard/input_Mobile telephone_client1mobiletelephone'),
	'894452778')

WebUI.click(findTestObject('Object Repository/PortalRepo/Page_Dashboard/li_5 Five Point Health Check'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PortalRepo/Page_Dashboard/h2_Five Point Health Check'), 0)

WebUI.takeFullPageScreenshotAsCheckpoint("FivePointTab")

WebUI.closeBrowser()


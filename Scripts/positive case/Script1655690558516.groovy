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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('Object Repository/Page_Marvin/input_Email Address_LSQEmail'), GlobalVariable.user)

WebUI.click(findTestObject('Object Repository/Page_Marvin/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Marvin/input_Password_password'), GlobalVariable.pass)

WebUI.click(findTestObject('Object Repository/Page_Marvin/button_Continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Marvin/button_Check-In'), 0)

WebUI.click(findTestObject('Object Repository/Page_Marvin/svg_of 10070 pages_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Page_Marvin/div_S'))

WebUI.click(findTestObject('Object Repository/Page_Marvin/span_Sign Out'))

WebUI.closeBrowser()


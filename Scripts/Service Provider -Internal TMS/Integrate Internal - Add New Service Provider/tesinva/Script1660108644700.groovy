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

WebUI.navigateToUrl('https://console-dev.hzn.one/tms/dashboard')

WebUI.setText(findTestObject('Object Repository/cobainvalid/Page_/input_Company Email_email'), 'admin@hzn.one')

WebUI.setEncryptedText(findTestObject('Object Repository/cobainvalid/Page_/input_Password_password'), 'MnsJkEeAVpEG2LE9uYr7zQ==')

WebUI.click(findTestObject('Object Repository/cobainvalid/Page_/button_visibility_off'))

WebUI.click(findTestObject('Object Repository/cobainvalid/Page_/form_Company EmailPasswordvisibilityForgot _f23241'))

WebUI.click(findTestObject('Object Repository/cobainvalid/Page_/button_Login'))

WebUI.click(findTestObject('Object Repository/cobainvalid/Page_/span_User Management'))

WebUI.click(findTestObject('Object Repository/cobainvalid/Page_/span_Service Provider'))

WebUI.click(findTestObject('Object Repository/cobainvalid/Page_/span_add'))

WebUI.click(findTestObject('Object Repository/cobainvalid/Page_/body_Service ProviderNew Admin 1logo-hznass_8380c2'))

WebUI.click(findTestObject('Object Repository/cobainvalid/Page_/clickbody'))

WebUI.click(findTestObject('Object Repository/cobainvalid/Page_/body_Service ProviderNew Admin 1logo-hznass_8380c2_1'))

WebUI.click(findTestObject('Object Repository/cobainvalid/Page_/clickbody'))

WebUI.click(findTestObject('Object Repository/cobainvalid/Page_/body_Service ProviderNew Admin 1logo-hznass_8380c2_1_2'))

WebUI.click(findTestObject('Object Repository/cobainvalid/Page_/div_Add Service Provider_MuiBackdrop-root M_4d634a_1'))

WebUI.click(findTestObject('Object Repository/cobainvalid/Page_/button_Add Service Provider'))

WebUI.verifyElementText(findTestObject('Object Repository/cobainvalid/Page_/p_Company name must be filled'), 'Company name must be filled')

WebUI.verifyElementText(findTestObject('Object Repository/cobainvalid/Page_/p_Company email must be filled'), 'Company email must be filled')

WebUI.verifyElementText(findTestObject('Object Repository/cobainvalid/Page_/p_Phone number must be filled'), 'Phone number must be filled')

WebUI.verifyElementText(findTestObject('Object Repository/cobainvalid/Page_/p_Company country must be filled'), 'Company country must be filled.')

WebUI.verifyElementText(findTestObject('Object Repository/cobainvalid/Page_/p_Company city must be filled'), 'Company city must be filled.')

WebUI.verifyElementText(findTestObject('Object Repository/cobainvalid/Page_/p_Company province must be filled'), 'Company province must be filled.')

WebUI.closeBrowser()


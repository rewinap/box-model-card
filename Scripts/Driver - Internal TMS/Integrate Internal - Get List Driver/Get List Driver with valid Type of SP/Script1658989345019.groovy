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

WebUI.callTestCase(findTestCase('PreCondition/Driver'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Get List Driver/Page_/Dropdown_SPType'))

WebUI.click(findTestObject('Get List Driver/Page_/li_PT ABCDEF'))

WebUI.verifyElementPresent(findTestObject('Get List Driver/Page_/span_arrow_forward'), 0)

WebUI.click(findTestObject('Get List Driver/Page_/Dropdown_SPType'))

WebUI.click(findTestObject('Get List Driver/Page_/li_Service Four'))

WebUI.verifyElementPresent(findTestObject('Get List Driver/Page_/span_arrow_forward'), 0)

WebUI.click(findTestObject('Get List Driver/Page_/Dropdown_SPType'))

WebUI.click(findTestObject('Get List Driver/Page_/li_Service Six Inc'))

WebUI.verifyElementPresent(findTestObject('Get List Driver/Page_/span_arrow_forward'), 0)

WebUI.click(findTestObject('Get List Driver/Page_/Dropdown_SPType'))

WebUI.click(findTestObject('Get List Driver/Page_/li_All Service Provider'))

WebUI.verifyElementPresent(findTestObject('Get List Driver/Page_/span_arrow_forward'), 0)

WebUI.closeBrowser()


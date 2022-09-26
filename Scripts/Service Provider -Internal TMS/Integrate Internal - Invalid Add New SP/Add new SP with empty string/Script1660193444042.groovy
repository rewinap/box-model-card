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

WebUI.callTestCase(findTestCase('PreCondition/SP'), [('validData') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Add SP with valid data/Page_/FirstButton_addSP'))

WebUI.click(findTestObject('Add SP with valid data/Page_/choose country'))

WebUI.click(findTestObject('Add SP with valid data/Page_/li_Indonesia'))

WebUI.click(findTestObject('Add SP with valid data/Page_/last button_add SP'))

WebUI.click(findTestObject('Add SP with valid data/Page_/div_Contact Personarrow_drop_down'))

WebUI.click(findTestObject('Add SP with valid data/Page_/div_Company dropdown password'))

WebUI.click(findTestObject('Add SP with valid data/Page_/last button_add SP'))

WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/EmptyString_C_Name'), 'Company name must be filled')

WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/EmptyString_C_Email'), 'Company email must be filled')

WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/EmptyString_C_PhoneNum'), 'Phone number must be filled')

//WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/EmptyString_C_country'), 'Company country must be filled.')
//WebUI.click(findTestObject('Add SP with valid data/Page_/choose country'))
//
//WebUI.click(findTestObject('Add SP with valid data/Page_/li_Indonesia'))
//
//WebUI.click(findTestObject('Add SP with valid data/Page_/last button_add SP'))
WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/EmptyString_C_province'), 'Company province must be filled.')

WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/EmptyString_C_city'), 'Company city must be filled.')

//WebUI.click(findTestObject('Add SP with valid data/Page_/choose country'))
//
//WebUI.click(findTestObject('Add SP with valid data/Page_/li_Indonesia'))
//
//WebUI.click(findTestObject('Add SP with valid data/Page_/last button_add SP'))
WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/EmptyString_C_NPWP'), 'Company NPWP must be filled.')

WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/EmptyString_C_tax'), 'Company tax must be choosen.')

WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/EmptyString_C_ type of ser'), 'Company type of service must be filled.')

WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/EmptyString_C_Logo'), 'Company Logo of service must be uploaded.')

WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/EmptyString_CP_Name'), 'Name must be filled')

WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/EmptySting_CP_Email'), 'Email must be filled')

WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/Page_/EmptySting_CP_Phone number'), 'Phone number must be filled')

WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/mptyString_C_Password'), 'Password must contain minimal 8 characters, maximal 50 characters, one uppercase, one lowercase, one number, one special case character (!@#$%^&*.), and no spaces.')

WebUI.closeBrowser()


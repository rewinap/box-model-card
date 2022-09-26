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

WebUI.setText(findTestObject('Add SP with valid data/Page_/AddSP_Input company name'), companyNameSP)

WebUI.setText(findTestObject('Object Repository/Add SP with valid data/Page_/addSP_input Email'), companyEmailSP)

WebUI.setText(findTestObject('Object Repository/Add SP with valid data/Page_/AddSP_companyPhone'), companyPhoneSP)

WebUI.click(findTestObject('Object Repository/Add SP with valid data/Page_/choose country'))

WebUI.click(findTestObject('Add SP with valid data/Page_/li_Indonesia'))

WebUI.click(findTestObject('Object Repository/Add SP with valid data/Page_/choose province'))

WebUI.click(findTestObject('Object Repository/Add SP with valid data/Page_/li_SUMATERA UTARA'))

WebUI.click(findTestObject('Object Repository/Add SP with valid data/Page_/choose city'))

WebUI.click(findTestObject('Object Repository/Add SP with valid data/Page_/li_MEDAN'))

WebUI.setText(findTestObject('Object Repository/Add SP with valid data/Page_/Add SP_input_SIUP_businessLicense'), siupBusinessLicenseSP)

WebUI.setText(findTestObject('Object Repository/Add SP with valid data/Page_/AddSP_input_NPWP_taxId'), NPWP_SP)

WebUI.click(findTestObject('Object Repository/Add SP with valid data/Page_/span_PKP'))

WebUI.click(findTestObject('Object Repository/Add SP with valid data/Page_/input_Type Of Service_PrivateSwitchBase-inp_a246e6'))

WebUI.uploadFile(findTestObject('Add SP with valid data/Page_/inputPhoto'), lokasiFIle)

WebUI.click(findTestObject('Add SP with valid data/Page_/div_Contact Personarrow_drop_down'))

WebUI.setText(findTestObject('Object Repository/Add SP with valid data/Page_/AddSP_CP_input name'), NamaCP)

WebUI.setText(findTestObject('Object Repository/Add SP with valid data/Page_/AddSp_CP_input Email'), EmailCP)

WebUI.setText(findTestObject('Object Repository/Add SP with valid data/Page_/AddSP_CP_input_Phone Number'), PhoneNumberCP)

WebUI.click(findTestObject('Add SP with valid data/Page_/div_Company dropdown password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Add SP with valid data/Page_/AddSP_input_Password'), passwordSP)

WebUI.setEncryptedText(findTestObject('Object Repository/Add SP with valid data/Page_/AddSP_input_Confirmation Password'), 
    confirmationPasswordSP)

WebUI.click(findTestObject('Object Repository/Add SP with valid data/Page_/last button_add SP'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Add SP with valid data/Page_/main_addAdd Service ProvidersearchCityCityS_3f5b59'), 
    0)

WebUI.closeBrowser()


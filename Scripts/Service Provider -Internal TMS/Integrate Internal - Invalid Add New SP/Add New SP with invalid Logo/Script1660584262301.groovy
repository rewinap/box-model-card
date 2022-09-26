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

WebUI.callTestCase(findTestCase('PreCondition/Add New SP with invalid Parameter'), [('Inv_companyNameSP') : 'SP Testing'
        , ('Inv_companyEmailSP') : 'SPTesting@gmail.com', ('Inv_companyPhoneSP') : '092049238493248', ('Inv_PostCode') : 'apaja'
        , ('Inv_siupBusinessLicenseSP') : '43224244233', ('Inv_NPWP_SP') : '43224244233', ('Inv_lokasiFIle') : 'C:\\Users\\User\\Downloads\\InvalidLogin.xlsx'
        , ('Inv_NamaCP') : 'Stella', ('Inv_EmailCP') : 'gunado@gmail.com', ('Inv_PhoneNumberCP') : '082276536253', ('Inv_passwordSP') : 'IwS7qD7jR1P43VTFCrEeRg=='
        , ('Inv_confirmationPasswordSP') : 'IwS7qD7jR1P43VTFCrEeRg=='], FailureHandling.CONTINUE_ON_FAILURE)


//jika menggunakan !('Inv_lokasiFIle'.contains('.png')) diautomasi tidak bisa mengupload yang bukan png jadinya empty string
if (('Inv_lokasiFIle'.contains('.pdf')) || ('Inv_lokasiFIle'.contains('.doc')) || ('Inv_lokasiFIle'.contains('.jpg')) || ('Inv_lokasiFIle'.contains('.xlsx'))) {
    //    WebUI.verifyElementPresent(findTestObject('Invalid_Parameter_PopUP/Page_/Body_ALert'), 0)
    WebUI.verifyElementText(findTestObject('Validation_With Empty String/Page_/EmptyString_C_Logo'), 'File must be PNG format')

    WebUI.closeBrowser()
}


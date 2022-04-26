package steps;

import hooks.Startup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.util.Asserts;
import pages.*;

import java.util.List;


public class CheckerToolSteps {

    @Given("I am accessing the CheckerTool from <Browser Type>")
    public void iAmAccessingTheCheckerToolFromBrowserType(DataTable dataTable) {
        Startup start = new Startup();
        List<List<String>> collection = dataTable.asLists(String.class);

        collection.forEach(data -> {
            String browserType = data.get(0);
            start.InitialiseTest(browserType);
        });
    }

    @Given("I click next to start")
    public void i_click_next_to_start() {
        HomePage homePage = new HomePage();
        homePage.ClickNext();
    }
    @Given("I select my country of <Residence> and click next")
    public void i_select_my_country_of_residence_and_click_next(DataTable dataTable) {

        ResidencePage residencePage = new ResidencePage();
        List<List<String>> collection = dataTable.asLists(String.class);

        collection.forEach(data -> {
            String country = data.get(0);
            residencePage.ClickOptionRegion(country);
        });
        residencePage.ClickNext();
    }

    @When("I select the location of my <GP Practice> and click next")
    public void i_select_the_location_of_my_gp_practice_and_click_next(io.cucumber.datatable.DataTable dataTable) {
        GpPage gpPage = new GpPage();

        List<List<String>> collection = dataTable.asLists(String.class);

        collection.forEach(data -> {
            //Is your GP practice in Scotland or Wales?
            String isYourGpPracticeInScotlandOrWales = data.get(0);
            gpPage.ClickOptionYesOrNo(isYourGpPracticeInScotlandOrWales);
        });
        gpPage.ClickNext();
    }
    @When("I select the Country of <Dental Practice> and click next")
    public void i_select_the_country_of_dental_practice_and_click_next(io.cucumber.datatable.DataTable dataTable) {
        CountryOfDentalPracticePage dentalPracticePage = new CountryOfDentalPracticePage();

        List<List<String>> collection = dataTable.asLists(String.class);

        collection.forEach(data -> {
            // Which country is your dental practice in?
            String whichCountryIsYourDentalPracticeIn = data.get(0);
            dentalPracticePage.ClickOptionRegion(whichCountryIsYourDentalPracticeIn);
        });
        dentalPracticePage.ClickNext();
    }
    @When("I enter my <Day><Month><Year> of birth and click next")
    public void i_enter_my_day_month_year_of_birth_and_click_next(io.cucumber.datatable.DataTable dataTable) {
        DOBPage dobPage = new DOBPage();

        List<List<String>> collection = dataTable.asLists(String.class);

        collection.forEach(data -> {
            //What is your date of birth?
            String day = data.get(0);
            String month = data.get(1);
            String year = data.get(2);
            dobPage.EnterDOB(day, month, year);
        });
        dobPage.ClickNext();
    }
    @When("I select my <Relationship Status> and click next")
    public void i_select_my_relationship_status_and_click_next(io.cucumber.datatable.DataTable dataTable) {
        RelationshipStatusPage relationshipStatusPage = new RelationshipStatusPage();
        List<List<String>> collection = dataTable.asLists(String.class);

        collection.forEach(data -> {
            //Do you live with a partner?
            String doYouLiveWithAPartner = data.get(0);
            relationshipStatusPage.ClickOptionYesOrNo(doYouLiveWithAPartner);
        });
        relationshipStatusPage.ClickNext();
    }
    @When("I select <Tax Credit> option and click next")
    public void i_select_tax_credit_option_and_click_next(io.cucumber.datatable.DataTable dataTable) {
        TaxPage taxPage = new TaxPage();
        List<List<String>> collection = dataTable.asLists(String.class);

        collection.forEach(data -> {
            //Do you claim any benefits or tax credits?
            String doYouClaimTaxBenefit = data.get(0);
            taxPage.ClickOptionYesOrNo(doYouClaimTaxBenefit);
        });
        taxPage.ClickNext();
    }
    @When("I select if I get paid <Universal Credit> and click next")
    public void i_select_if_i_get_paid_universal_credit_and_click_next(io.cucumber.datatable.DataTable dataTable) {
        UniversalCreditPage universalCreditPage = new UniversalCreditPage();
        List<List<String>> collection = dataTable.asLists(String.class);

        collection.forEach(data -> {
            //Do you get paid Universal Credit?
            String doYoGetPaidUniversalCredit = data.get(0);
            universalCreditPage.ClickOptionYesOrNoUniversalCredit(doYoGetPaidUniversalCredit);
        });
        universalCreditPage.ClickNext();
    }
    @When("I select <Liability> option for my universal credit and click next")
    public void i_select_liability_option_for_my_universal_credit_and_click_next(io.cucumber.datatable.DataTable dataTable) {
        LiabilitiesPage liabilitiesPage = new LiabilitiesPage();
        List<List<String>> collection = dataTable.asLists(String.class);

        collection.forEach(data -> {
            //As part of your Universal Credit, do you have any of these?
            String asPartOfYourUniversalCreditDoYouHaveAnyOfThese = data.get(0);
            liabilitiesPage.ClickOptionYesOrNo(asPartOfYourUniversalCreditDoYouHaveAnyOfThese);
        });
        liabilitiesPage.ClickNext();
    }
    @When("I select if my <Take-Home> pay for my last universal credit period is {int} or less")
    public void i_select_if_my_take_home_pay_for_my_last_universal_credit_period_is_or_less(Integer int1, io.cucumber.datatable.DataTable dataTable) {
        TakeHomePayPage takeHomePayPage = new TakeHomePayPage();
        List<List<String>> collection = dataTable.asLists(String.class);

        collection.forEach(data -> {
            //Was your take-home pay for your last Universal Credit period £935 or less?
            String wasYourTakeHomePayForYourLastUniversalCreditPeriod935OrLess = data.get(0);
            takeHomePayPage.ClickOptionYesOrNo(wasYourTakeHomePayForYourLastUniversalCreditPeriod935OrLess);
        });
        takeHomePayPage.ClickNext();
    }
    @Then("I should be able to see if I can get the <Treatment> I need")
    public void i_should_be_able_to_see_if_i_can_get_the_treatment_i_need(io.cucumber.datatable.DataTable dataTable) {
        OutcomePage outcomePage = new OutcomePage();

        List<List<String>> collection = dataTable.asLists(String.class);

        collection.forEach(data -> {

            String getHelp = data.get(0);
            outcomePage.ResultContent(getHelp);
        });
    }




}

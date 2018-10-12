package ScreenPlay.Reto4.RunnerTags;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/MaxTime.feature",
		tags= "@tag1",
		glue="ScreenPlay.Reto4.StepDefinitions",
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {
}


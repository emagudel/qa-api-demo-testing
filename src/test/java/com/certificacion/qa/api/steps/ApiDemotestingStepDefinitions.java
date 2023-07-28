package com.certificacion.qa.api.steps;

import com.certificacion.qa.api.data.DataApiDemoTesting;
import com.certificacion.qa.api.tasks.Members;
import com.certificacion.qa.api.tasks.ValidateMembers;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static com.certificacion.qa.api.data.DataApiDemoTesting.*;
import static com.certificacion.qa.api.helpers.ConstantApiDemo.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ApiDemotestingStepDefinitions {

    @Dado("que {} cuenta con las credenciales para obtener los miembros")
    public void queQACuentaConLasCredencialesParaObtenerLosMiembros(String actor) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(actor)
                .whoCan(CallAnApi.at(BASE_URL_API_DEMO)
                );
    }

    @Cuando("se ejecuta el servicio que obtiene listado de miembros")
    public void seEjecutaElServicioQueObtieneListadoDeMiembros() {
        theActorInTheSpotlight().attemptsTo(
                Members.withId()
        );
    }

    @Entonces("se puede ver listado de miembros del api")
    public void sePuedeVerListadoDeMiembrosDelApi() {
        theActorInTheSpotlight().attemptsTo(
                ValidateMembers.without()
        );
    }
}

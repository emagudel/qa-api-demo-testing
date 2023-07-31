package com.certificacion.qa.api.steps;

import com.certificacion.qa.api.tasks.MembersGet;
import com.certificacion.qa.api.tasks.MembersPost;
import com.certificacion.qa.api.tasks.ValidateMembers;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static com.certificacion.qa.api.helpers.ConstantApiDemo.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ApiDemotestingStepDefinitions {

    @Dado("que {} cuenta con las credenciales del servicio")
    public void queQACuentaConLasCredencialesDelServicio(String actor) {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(actor)
                .whoCan(CallAnApi.at(BASE_URL_API_DEMO)
                );
    }

    @Cuando("se ejecuta el servicio que obtiene listado de miembros")
    public void seEjecutaElServicioQueObtieneListadoDeMiembros() {
        theActorInTheSpotlight().attemptsTo(
                MembersGet.withId()
        );
    }

    @Entonces("se puede ver listado de miembros del api")
    public void sePuedeVerListadoDeMiembrosDelApi() {
        theActorInTheSpotlight().attemptsTo(
                ValidateMembers.without()
        );
    }

    @Cuando("se ejecuta el servicio para crear un nuevo miembro")
    public void seEjecutaElServicioParaCrearUnNuevoMiembro() {
        theActorInTheSpotlight().attemptsTo(
                MembersPost.withId()
        );
    }

    @Entonces("se puede ver el miembro nuevo en la respuesta")
    public void sePuedeVerElMiembroNuevoEnLaRespuesta() {
    }

    @Cuando("se ejecuta el servicio para actualizar un nuevo miembro")
    public void seEjecutaElServicioParaActualizarUnNuevoMiembro() {
        
    }

    @Entonces("se puede ver el miembro con datos actualizados")
    public void sePuedeVerElMiembroConDatosActualizados() {
    }

    @Cuando("se ejecuta el servicio para borrar un nuevo miembro")
    public void seEjecutaElServicioParaBorrarUnNuevoMiembro() {
        
    }

    @Entonces("se puede ver fue borrado de manera exitosa")
    public void sePuedeVerFueBorradoDeManeraExitosa() {
    }
}

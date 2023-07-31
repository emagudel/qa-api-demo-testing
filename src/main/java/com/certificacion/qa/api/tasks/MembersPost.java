/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.certificacion.qa.api.tasks;

import com.certificacion.qa.api.helpers.EnvironmentProperties;
import com.certificacion.qa.api.request.Template;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.annotations.Step;
import org.apache.http.HttpHeaders;

import static com.certificacion.qa.api.helpers.ConstantApiDemo.*;

public class MembersPost implements Task {

    public MembersPost() {
    }

    public static Performable withId() {
        return Instrumented.instanceOf(MembersPost.class).withProperties();
    }

    @Override
    @Step("{0} Ejecutar servicio")
    public <T extends Actor> void performAs(T actor) {
        Object object = Template.getRequestMemberPost();
        actor.attemptsTo(
                Post.to(EnvironmentProperties.getProperty(URL_MEMBERS))
                        .with(request -> request
                                .header(HttpHeaders.AUTHORIZATION,  BASIC_AUTH)
                                .header(HttpHeaders.CONTENT_TYPE, HEADER_VALUE_CONTEN_TYPE)
                                .body(object))
        );
    }
}
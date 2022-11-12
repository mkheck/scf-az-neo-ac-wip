package com.thehecklers.aircraftfn;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

import java.util.Optional;

//public class AircraftHandler extends FunctionInvoker<Aircraft, String> {
//    @FunctionName("ac")
//    public HttpResponseMessage execute(
//            @HttpTrigger(name = "request",
//                    methods = {HttpMethod.GET, HttpMethod.POST},
//                    authLevel = AuthorizationLevel.ANONYMOUS)
//                    HttpRequestMessage<Optional<Aircraft>> request,
//            ExecutionContext context) {
//        Aircraft ac = request.getBody()
//                .filter(a -> a.adshex() != null)
//                .orElseGet(() -> new Aircraft("000000", "123456", "UNK"));
//        context.getLogger().info("Aircraft ID: " + ac.adshex());
//        System.out.println("<> Aircraft ID: " + ac.adshex());
//        return request
//                .createResponseBuilder(HttpStatus.OK)
//                .body(handleRequest(ac, context))
//                .header("Content-Type", "application/json")
//                .build();
//    }
//}
public class AircraftHandler extends FunctionInvoker<Aircraft, Aircraft> {
    @FunctionName("ac")
    public HttpResponseMessage execute(
            @HttpTrigger(name = "request",
                    methods = {HttpMethod.GET, HttpMethod.POST},
                    authLevel = AuthorizationLevel.ANONYMOUS)
                    HttpRequestMessage<Optional<Aircraft>> request,
            ExecutionContext context) {
        Aircraft aircraft = request.getBody()
                        .orElseGet(() -> new Aircraft("010101", "987654", "PA28"));
        context.getLogger().info("Aircraft ID is " + aircraft.getAdshex());
        return request
                .createResponseBuilder(HttpStatus.OK)
                .body(handleRequest(aircraft, context))
                .header("Content-Type", "application/json")
                .build();
    }
}

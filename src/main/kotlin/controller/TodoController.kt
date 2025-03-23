package org.project.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController {

    @GetMapping("/hello")
    @Operation(
        summary = "Retorna uma saudação",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "Saudação retornada com sucesso"
            )
        ]
    )
    fun hello(): String {
        return "Hello World!"
    }
}
package com.redstevo.code.Controllers;


import com.redstevo.code.Services.LearningService;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/learn")
@CrossOrigin(value = {"http://localhost:51743", "http://192.168.0.124:5173"},
        allowCredentials = "true")
public class LearningController {

    private final LearningService learningService;

    /*
    * This end point will :-
    *   1. Create a new Collection.
    *   2. If User allows a new Description file will be created to describe the course.
    *   3. Relate the Collection to a user and the Description file to the collection.
    */

    @PostMapping("/new/collection/{userId}")
    public ResponseEntity<HttpStatusCode> createCollection(
            @Validated @NotNull
            @PathVariable Long userId,

            @Validated @NotBlank
            @RequestParam("collectionName") String collectionName,

            @RequestParam("createDescriptionFile") Boolean createDescriptionFile){

        log.info("Request to create a new collection.");

        return learningService.createCollection(userId, collectionName, createDescriptionFile);
    }
    /*This End point allows use to fetch created collection from the database and their
    * related topics if any.*/

}

package com.johnlewis.collectionPoint.v1

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CollectionPointController {

        val name: String = "Abhi"


        @GetMapping("/collectionPoint/v1/getCollectionPointById/{id}")
        fun getCollectionPointById(@RequestParam(value= "id", defaultValue = "1") id: String)
                : CollectionPointModel.CollectionPoint {

               return  CollectionPointDTO.CollectionPointInfo.getCollectionPointById(1)
        }




}
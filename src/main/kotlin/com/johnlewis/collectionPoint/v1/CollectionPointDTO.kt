package com.johnlewis.collectionPoint.v1

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class CollectionPointDTO {

    object CollectionPointInfo {
        fun getCollectionPointById(id: Int): CollectionPointModel.CollectionPoint {
            return CollectionPointModel.CollectionPoint(id, "first",
                    "56 Viola Avenue", " Staines", "TW197SB")

        }
    }
}
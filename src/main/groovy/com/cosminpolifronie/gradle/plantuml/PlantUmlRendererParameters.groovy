package com.cosminpolifronie.gradle.plantuml

import org.gradle.workers.WorkParameters

class PlantUmlRendererParameters implements WorkParameters, Serializable {
    PlantUmlPreparedRender plantUmlPreparedRender
}
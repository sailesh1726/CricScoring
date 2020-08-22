package com.cricket.sparks.cricscoring.datamodel

import androidx.annotation.Keep
import androidx.room.Entity

@Keep
@Entity(tableName = "score_sheet_table", primaryKeys = ["teamId"])
class ScoreSheet(val teamId: String,
                 val team: String) {

}

package cn.ppps.forwarder.entity

import com.google.gson.annotations.SerializedName
import cn.ppps.forwarder.database.entity.Rule
import cn.ppps.forwarder.database.entity.Sender
import cn.ppps.forwarder.database.entity.Task
import java.io.Serializable

data class CloneInfo(
    @SerializedName("version_code")
    var versionCode: Int = 0,

    @SerializedName("version_name")
    var versionName: String? = null,

    @SerializedName("settings")
    var settings: String = "",

    @SerializedName("sender_list")
    var senderList: List<Sender>? = null,

    @SerializedName("rule_list")
    var ruleList: List<Rule>? = null,

    @SerializedName("task_list")
    var taskList: List<Task>? = null,
) : Serializable

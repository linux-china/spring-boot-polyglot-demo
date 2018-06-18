package org.mvnsearch

import kotlinx.serialization.Optional
import kotlinx.serialization.SerialId
import kotlinx.serialization.Serializable

/**
 * user data class for serialization
 *
 * @author linux_china
 */

@Serializable
data class User(@SerialId(id = 1) val id: Int, @SerialId(id = 2) @Optional val nick: String = "")

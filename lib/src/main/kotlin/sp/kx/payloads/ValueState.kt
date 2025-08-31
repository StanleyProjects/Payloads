package sp.kx.payloads

import kotlin.time.Duration

class ValueState(
    val updated: Duration,
    val hash: ByteArray,
)

package sp.kx.payloads

class Payload<T : Any>(
    val value: T,
    val valueInfo: ValueInfo,
    val valueState: ValueState,
)

package sp.kx.payloads

import java.util.UUID

class CommitState(
    val hash: ByteArray,
    val payloads: List<Payload<ByteArray>>,
    val deleted: Set<UUID>,
)

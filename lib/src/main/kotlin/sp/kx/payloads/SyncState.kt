package sp.kx.payloads

import java.util.UUID

class SyncState(
    val valueStates: Map<UUID, ValueState>,
    val deleted: Set<UUID>,
)

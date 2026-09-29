package com.lingq.core.network.api.result;

import kotlinx.serialization.KSerializer;

/* JADX INFO: renamed from: com.lingq.core.network.api.result.b5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1627b5 {
    public final <ResultType> KSerializer serializer(KSerializer kSerializer) {
        kSerializer.getClass();
        return new Results$$serializer(kSerializer);
    }
}

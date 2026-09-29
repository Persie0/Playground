package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.hn1;
import p000.n3c;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestChatUpdateMessage {
    public static final C1584l Companion = new C1584l();

    /* JADX INFO: renamed from: a */
    public final boolean f20336a;

    public /* synthetic */ RequestChatUpdateMessage(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f20336a = z;
        } else {
            n3c.m17204b(i, 1, RequestChatUpdateMessage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestChatUpdateMessage) && this.f20336a == ((RequestChatUpdateMessage) obj).f20336a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20336a);
    }

    public final String toString() {
        return hn1.m13355e("RequestChatUpdateMessage(includedInImport=", ")", this.f20336a);
    }
}

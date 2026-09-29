package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.hn1;
import p000.n3c;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestChatMemory {
    public static final C1576h Companion = new C1576h();

    /* JADX INFO: renamed from: a */
    public final boolean f20326a;

    public /* synthetic */ RequestChatMemory(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f20326a = z;
        } else {
            n3c.m17204b(i, 1, RequestChatMemory$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestChatMemory) && this.f20326a == ((RequestChatMemory) obj).f20326a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20326a);
    }

    public final String toString() {
        return hn1.m13355e("RequestChatMemory(enabled=", ")", this.f20326a);
    }

    public RequestChatMemory(boolean z) {
        this.f20326a = z;
    }
}

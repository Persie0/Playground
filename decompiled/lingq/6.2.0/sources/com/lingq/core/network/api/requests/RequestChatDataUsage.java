package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.hn1;
import p000.n3c;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestChatDataUsage {
    public static final C1573g Companion = new C1573g();

    /* JADX INFO: renamed from: a */
    public final boolean f20325a;

    public /* synthetic */ RequestChatDataUsage(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f20325a = z;
        } else {
            n3c.m17204b(i, 1, RequestChatDataUsage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestChatDataUsage) && this.f20325a == ((RequestChatDataUsage) obj).f20325a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20325a);
    }

    public final String toString() {
        return hn1.m13355e("RequestChatDataUsage(improvementOptIn=", ")", this.f20325a);
    }

    public RequestChatDataUsage(boolean z) {
        this.f20325a = z;
    }
}

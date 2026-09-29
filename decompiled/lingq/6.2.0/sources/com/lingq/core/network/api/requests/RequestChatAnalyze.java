package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestChatAnalyze {
    public static final C1567e Companion = new C1567e();

    /* JADX INFO: renamed from: a */
    public final int f20323a;

    public /* synthetic */ RequestChatAnalyze(int i, int i2) {
        if (1 == (i & 1)) {
            this.f20323a = i2;
        } else {
            n3c.m17204b(i, 1, RequestChatAnalyze$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestChatAnalyze) && this.f20323a == ((RequestChatAnalyze) obj).f20323a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20323a);
    }

    public final String toString() {
        return ux5.m22989l("RequestChatAnalyze(index=", this.f20323a, ")");
    }
}

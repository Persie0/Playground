package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestLipp {
    public static final C1577h0 Companion = new C1577h0();

    /* JADX INFO: renamed from: a */
    public final int f20402a;

    /* JADX INFO: renamed from: b */
    public final int f20403b;

    public /* synthetic */ RequestLipp(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, RequestLipp$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20402a = i2;
        this.f20403b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestLipp)) {
            return false;
        }
        RequestLipp requestLipp = (RequestLipp) obj;
        return this.f20402a == requestLipp.f20402a && this.f20403b == requestLipp.f20403b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20403b) + (Integer.hashCode(this.f20402a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f20402a, this.f20403b, "RequestLipp(sentenceStart=", ", sentenceCount=", ")");
    }

    public RequestLipp(int i, int i2) {
        this.f20402a = i;
        this.f20403b = i2;
    }
}

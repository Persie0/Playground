package com.lingq.core.network.api.requests;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestMoreLingQs {
    public static final C1579i0 Companion = new C1579i0();

    /* JADX INFO: renamed from: a */
    public final int f20404a;

    /* JADX INFO: renamed from: b */
    public final long f20405b;

    /* JADX INFO: renamed from: c */
    public final String f20406c;

    public /* synthetic */ RequestMoreLingQs(int i, long j, String str, int i2) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, RequestMoreLingQs$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20404a = i2;
        this.f20405b = j;
        this.f20406c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestMoreLingQs)) {
            return false;
        }
        RequestMoreLingQs requestMoreLingQs = (RequestMoreLingQs) obj;
        return this.f20404a == requestMoreLingQs.f20404a && this.f20405b == requestMoreLingQs.f20405b && fa4.m11650l(this.f20406c, requestMoreLingQs.f20406c);
    }

    public final int hashCode() {
        return this.f20406c.hashCode() + ux5.m22981d(this.f20405b, Integer.hashCode(this.f20404a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestMoreLingQs(amount=");
        sb.append(this.f20404a);
        sb.append(", timestamp=");
        sb.append(this.f20405b);
        return AbstractC3393o1.m17739n(sb, ", signature=", this.f20406c, ")");
    }

    public RequestMoreLingQs(String str, int i, long j) {
        this.f20404a = i;
        this.f20405b = j;
        this.f20406c = str;
    }
}

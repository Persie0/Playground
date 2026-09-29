package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestGentts {
    public static final C1602u Companion = new C1602u();

    /* JADX INFO: renamed from: a */
    public final String f20364a;

    /* JADX INFO: renamed from: b */
    public final String f20365b;

    public /* synthetic */ RequestGentts(String str, int i, String str2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, RequestGentts$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20364a = str;
        this.f20365b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestGentts)) {
            return false;
        }
        RequestGentts requestGentts = (RequestGentts) obj;
        return fa4.m11650l(this.f20364a, requestGentts.f20364a) && fa4.m11650l(this.f20365b, requestGentts.f20365b);
    }

    public final int hashCode() {
        return this.f20365b.hashCode() + (this.f20364a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("RequestGentts(appName=", this.f20364a, ", voice=", this.f20365b, ")");
    }

    public RequestGentts(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f20364a = str;
        this.f20365b = str2;
    }
}

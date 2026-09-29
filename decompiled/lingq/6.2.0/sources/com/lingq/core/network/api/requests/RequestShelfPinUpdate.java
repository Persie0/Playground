package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestShelfPinUpdate {
    public static final C1609x0 Companion = new C1609x0();

    /* JADX INFO: renamed from: a */
    public final String f20455a;

    public /* synthetic */ RequestShelfPinUpdate(int i, String str) {
        if (1 == (i & 1)) {
            this.f20455a = str;
        } else {
            n3c.m17204b(i, 1, RequestShelfPinUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestShelfPinUpdate) && fa4.m11650l(this.f20455a, ((RequestShelfPinUpdate) obj).f20455a);
    }

    public final int hashCode() {
        return this.f20455a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("RequestShelfPinUpdate(shelf=", this.f20455a, ")");
    }

    public RequestShelfPinUpdate(String str) {
        this.f20455a = str;
    }
}

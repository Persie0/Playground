package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.n3c;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestPurchase {
    public static final C1595q0 Companion = new C1595q0();

    /* JADX INFO: renamed from: a */
    public final RequestReceipt f20422a;

    public /* synthetic */ RequestPurchase(int i, RequestReceipt requestReceipt) {
        if (1 == (i & 1)) {
            this.f20422a = requestReceipt;
        } else {
            n3c.m17204b(i, 1, RequestPurchase$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RequestPurchase) && fa4.m11650l(this.f20422a, ((RequestPurchase) obj).f20422a);
    }

    public final int hashCode() {
        return this.f20422a.hashCode();
    }

    public final String toString() {
        return "RequestPurchase(receipt=" + this.f20422a + ")";
    }

    public RequestPurchase(RequestReceipt requestReceipt) {
        this.f20422a = requestReceipt;
    }
}

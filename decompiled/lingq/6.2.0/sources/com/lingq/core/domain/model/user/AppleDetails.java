package com.lingq.core.domain.model.user;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class AppleDetails {
    public static final C1501c Companion = new C1501c();

    /* JADX INFO: renamed from: a */
    public final String f19632a;

    /* JADX INFO: renamed from: b */
    public final String f19633b;

    /* JADX INFO: renamed from: c */
    public final String f19634c;

    public /* synthetic */ AppleDetails(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, AppleDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19632a = str;
        this.f19633b = str2;
        this.f19634c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppleDetails)) {
            return false;
        }
        AppleDetails appleDetails = (AppleDetails) obj;
        return fa4.m11650l(this.f19632a, appleDetails.f19632a) && fa4.m11650l(this.f19633b, appleDetails.f19633b) && fa4.m11650l(this.f19634c, appleDetails.f19634c);
    }

    public final int hashCode() {
        return this.f19634c.hashCode() + ux5.m22980c(this.f19632a.hashCode() * 31, this.f19633b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("AppleDetails(transactionId=", this.f19632a, ", originalTransactionId=", this.f19633b, ", productId="), this.f19634c, ")");
    }
}

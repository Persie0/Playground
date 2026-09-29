package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultOfferBanner {
    public static final C1625b3 Companion = new C1625b3();

    /* JADX INFO: renamed from: a */
    public final String f21378a;

    /* JADX INFO: renamed from: b */
    public final String f21379b;

    /* JADX INFO: renamed from: c */
    public final String f21380c;

    public /* synthetic */ ResultOfferBanner(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, ResultOfferBanner$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f21378a = str;
        this.f21379b = str2;
        this.f21380c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultOfferBanner)) {
            return false;
        }
        ResultOfferBanner resultOfferBanner = (ResultOfferBanner) obj;
        return fa4.m11650l(this.f21378a, resultOfferBanner.f21378a) && fa4.m11650l(this.f21379b, resultOfferBanner.f21379b) && fa4.m11650l(this.f21380c, resultOfferBanner.f21380c);
    }

    public final int hashCode() {
        return this.f21380c.hashCode() + ux5.m22980c(this.f21378a.hashCode() * 31, this.f21379b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ResultOfferBanner(type=", this.f21378a, ", image=", this.f21379b, ", locale="), this.f21380c, ")");
    }
}

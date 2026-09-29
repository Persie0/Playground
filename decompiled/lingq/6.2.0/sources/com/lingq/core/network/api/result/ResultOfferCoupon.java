package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultOfferCoupon {
    public static final C1632c3 Companion = new C1632c3();

    /* JADX INFO: renamed from: a */
    public final String f21381a;

    /* JADX INFO: renamed from: b */
    public final String f21382b;

    /* JADX INFO: renamed from: c */
    public final String f21383c;

    public /* synthetic */ ResultOfferCoupon(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, ResultOfferCoupon$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f21381a = str;
        this.f21382b = str2;
        this.f21383c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultOfferCoupon)) {
            return false;
        }
        ResultOfferCoupon resultOfferCoupon = (ResultOfferCoupon) obj;
        return fa4.m11650l(this.f21381a, resultOfferCoupon.f21381a) && fa4.m11650l(this.f21382b, resultOfferCoupon.f21382b) && fa4.m11650l(this.f21383c, resultOfferCoupon.f21383c);
    }

    public final int hashCode() {
        String str = this.f21381a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21382b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21383c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ResultOfferCoupon(web=", this.f21381a, ", ios=", this.f21382b, ", android="), this.f21383c, ")");
    }
}

package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultOfferDate {
    public static final C1639d3 Companion = new C1639d3();

    /* JADX INFO: renamed from: a */
    public final String f21384a;

    /* JADX INFO: renamed from: b */
    public final String f21385b;

    /* JADX INFO: renamed from: c */
    public final String f21386c;

    /* JADX INFO: renamed from: d */
    public final boolean f21387d;

    public /* synthetic */ ResultOfferDate(int i, String str, String str2, String str3, boolean z) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, ResultOfferDate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f21384a = str;
        this.f21385b = str2;
        if ((i & 4) == 0) {
            this.f21386c = null;
        } else {
            this.f21386c = str3;
        }
        if ((i & 8) == 0) {
            this.f21387d = false;
        } else {
            this.f21387d = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultOfferDate)) {
            return false;
        }
        ResultOfferDate resultOfferDate = (ResultOfferDate) obj;
        return fa4.m11650l(this.f21384a, resultOfferDate.f21384a) && fa4.m11650l(this.f21385b, resultOfferDate.f21385b) && fa4.m11650l(this.f21386c, resultOfferDate.f21386c) && this.f21387d == resultOfferDate.f21387d;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(this.f21384a.hashCode() * 31, this.f21385b, 31);
        String str = this.f21386c;
        return Boolean.hashCode(this.f21387d) + ((iM22980c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultOfferDate(start=", this.f21384a, ", end=", this.f21385b, ", countdown=");
        sbM23000w.append(this.f21386c);
        sbM23000w.append(", countdownEnded=");
        sbM23000w.append(this.f21387d);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}

package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultProvider {
    public static final C1688l3 Companion = new C1688l3();

    /* JADX INFO: renamed from: a */
    public final int f21471a;

    /* JADX INFO: renamed from: b */
    public final String f21472b;

    /* JADX INFO: renamed from: c */
    public final String f21473c;

    /* JADX INFO: renamed from: d */
    public final String f21474d;

    /* JADX INFO: renamed from: e */
    public final String f21475e;

    public /* synthetic */ ResultProvider(int i, int i2, String str, String str2, String str3, String str4) {
        this.f21471a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f21472b = null;
        } else {
            this.f21472b = str;
        }
        if ((i & 4) == 0) {
            this.f21473c = null;
        } else {
            this.f21473c = str2;
        }
        if ((i & 8) == 0) {
            this.f21474d = null;
        } else {
            this.f21474d = str3;
        }
        if ((i & 16) == 0) {
            this.f21475e = null;
        } else {
            this.f21475e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultProvider)) {
            return false;
        }
        ResultProvider resultProvider = (ResultProvider) obj;
        return this.f21471a == resultProvider.f21471a && fa4.m11650l(this.f21472b, resultProvider.f21472b) && fa4.m11650l(this.f21473c, resultProvider.f21473c) && fa4.m11650l(this.f21474d, resultProvider.f21474d) && fa4.m11650l(this.f21475e, resultProvider.f21475e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f21471a) * 31;
        String str = this.f21472b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21473c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21474d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21475e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f21471a, "ResultProvider(id=", ", description=", this.f21472b, ", image=");
        AbstractC3393o1.m17725C(sbM22995r, this.f21473c, ", title=", this.f21474d, ", url=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f21475e, ")");
    }
}

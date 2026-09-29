package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultNotice {
    public static final C1753w2 Companion = new C1753w2();

    /* JADX INFO: renamed from: a */
    public final int f21338a;

    /* JADX INFO: renamed from: b */
    public final String f21339b;

    /* JADX INFO: renamed from: c */
    public final String f21340c;

    /* JADX INFO: renamed from: d */
    public final String f21341d;

    /* JADX INFO: renamed from: e */
    public final String f21342e;

    public /* synthetic */ ResultNotice(int i, int i2, String str, String str2, String str3, String str4) {
        this.f21338a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f21339b = "";
        } else {
            this.f21339b = str;
        }
        if ((i & 4) == 0) {
            this.f21340c = "";
        } else {
            this.f21340c = str2;
        }
        if ((i & 8) == 0) {
            this.f21341d = "";
        } else {
            this.f21341d = str3;
        }
        if ((i & 16) == 0) {
            this.f21342e = "";
        } else {
            this.f21342e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultNotice)) {
            return false;
        }
        ResultNotice resultNotice = (ResultNotice) obj;
        return this.f21338a == resultNotice.f21338a && fa4.m11650l(this.f21339b, resultNotice.f21339b) && fa4.m11650l(this.f21340c, resultNotice.f21340c) && fa4.m11650l(this.f21341d, resultNotice.f21341d) && fa4.m11650l(this.f21342e, resultNotice.f21342e);
    }

    public final int hashCode() {
        return this.f21342e.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f21338a) * 31, this.f21339b, 31), this.f21340c, 31), this.f21341d, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f21338a, "ResultNotice(id=", ", title=", this.f21339b, ", startDate=");
        AbstractC3393o1.m17725C(sbM22995r, this.f21340c, ", endDate=", this.f21341d, ", noticeType=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f21342e, ")");
    }
}

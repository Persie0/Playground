package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultMeaning {
    public static final C1723r2 Companion = new C1723r2();

    /* JADX INFO: renamed from: a */
    public final int f21316a;

    /* JADX INFO: renamed from: b */
    public final String f21317b;

    /* JADX INFO: renamed from: c */
    public final String f21318c;

    /* JADX INFO: renamed from: d */
    public final int f21319d;

    /* JADX INFO: renamed from: e */
    public final int f21320e;

    /* JADX INFO: renamed from: f */
    public final boolean f21321f;

    /* JADX INFO: renamed from: g */
    public final String f21322g;

    /* JADX INFO: renamed from: h */
    public final Integer f21323h;

    /* JADX INFO: renamed from: i */
    public final boolean f21324i;

    /* JADX INFO: renamed from: j */
    public final int f21325j;

    public /* synthetic */ ResultMeaning(int i, int i2, String str, String str2, int i3, int i4, boolean z, String str3, Integer num, boolean z2, int i5) {
        if ((i & 1) == 0) {
            this.f21316a = 0;
        } else {
            this.f21316a = i2;
        }
        if ((i & 2) == 0) {
            this.f21317b = null;
        } else {
            this.f21317b = str;
        }
        if ((i & 4) == 0) {
            this.f21318c = null;
        } else {
            this.f21318c = str2;
        }
        if ((i & 8) == 0) {
            this.f21319d = 0;
        } else {
            this.f21319d = i3;
        }
        if ((i & 16) == 0) {
            this.f21320e = 0;
        } else {
            this.f21320e = i4;
        }
        if ((i & 32) == 0) {
            this.f21321f = false;
        } else {
            this.f21321f = z;
        }
        if ((i & 64) == 0) {
            this.f21322g = null;
        } else {
            this.f21322g = str3;
        }
        if ((i & 128) == 0) {
            this.f21323h = null;
        } else {
            this.f21323h = num;
        }
        if ((i & 256) == 0) {
            this.f21324i = false;
        } else {
            this.f21324i = z2;
        }
        if ((i & 512) == 0) {
            this.f21325j = 0;
        } else {
            this.f21325j = i5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultMeaning)) {
            return false;
        }
        ResultMeaning resultMeaning = (ResultMeaning) obj;
        return this.f21316a == resultMeaning.f21316a && fa4.m11650l(this.f21317b, resultMeaning.f21317b) && fa4.m11650l(this.f21318c, resultMeaning.f21318c) && this.f21319d == resultMeaning.f21319d && this.f21320e == resultMeaning.f21320e && this.f21321f == resultMeaning.f21321f && fa4.m11650l(this.f21322g, resultMeaning.f21322g) && fa4.m11650l(this.f21323h, resultMeaning.f21323h) && this.f21324i == resultMeaning.f21324i && this.f21325j == resultMeaning.f21325j;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f21316a) * 31;
        String str = this.f21317b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21318c;
        int iM12428e = g9a.m12428e(wq1.m24106b(this.f21320e, wq1.m24106b(this.f21319d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.f21321f);
        String str3 = this.f21322g;
        int iHashCode3 = (iM12428e + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f21323h;
        return Integer.hashCode(this.f21325j) + g9a.m12428e((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f21324i);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f21316a, "ResultMeaning(id=", ", locale=", this.f21317b, ", text=");
        AbstractC3393o1.m17748w(this.f21319d, this.f21318c, ", termId=", ", popularity=", sbM22995r);
        hn1.m13368r(sbM22995r, this.f21320e, ", flagged=", this.f21321f, ", detectedLocale=");
        hn1.m13371u(sbM22995r, this.f21322g, ", creatorId=", this.f21323h, ", isGoogleTranslate=");
        sbM22995r.append(this.f21324i);
        sbM22995r.append(", wordId=");
        sbM22995r.append(this.f21325j);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}

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
public final class ResultTokenMeaning {
    public static final C1659g4 Companion = new C1659g4();

    /* JADX INFO: renamed from: a */
    public final int f21587a;

    /* JADX INFO: renamed from: b */
    public final String f21588b;

    /* JADX INFO: renamed from: c */
    public final String f21589c;

    /* JADX INFO: renamed from: d */
    public final int f21590d;

    /* JADX INFO: renamed from: e */
    public final int f21591e;

    /* JADX INFO: renamed from: f */
    public final boolean f21592f;

    /* JADX INFO: renamed from: g */
    public final String f21593g;

    /* JADX INFO: renamed from: h */
    public final Integer f21594h;

    /* JADX INFO: renamed from: i */
    public final boolean f21595i;

    /* JADX INFO: renamed from: j */
    public final int f21596j;

    public /* synthetic */ ResultTokenMeaning(int i, int i2, String str, String str2, int i3, int i4, boolean z, String str3, Integer num, boolean z2, int i5) {
        if ((i & 1) == 0) {
            this.f21587a = 0;
        } else {
            this.f21587a = i2;
        }
        if ((i & 2) == 0) {
            this.f21588b = null;
        } else {
            this.f21588b = str;
        }
        if ((i & 4) == 0) {
            this.f21589c = null;
        } else {
            this.f21589c = str2;
        }
        if ((i & 8) == 0) {
            this.f21590d = 0;
        } else {
            this.f21590d = i3;
        }
        if ((i & 16) == 0) {
            this.f21591e = 0;
        } else {
            this.f21591e = i4;
        }
        if ((i & 32) == 0) {
            this.f21592f = false;
        } else {
            this.f21592f = z;
        }
        if ((i & 64) == 0) {
            this.f21593g = null;
        } else {
            this.f21593g = str3;
        }
        if ((i & 128) == 0) {
            this.f21594h = null;
        } else {
            this.f21594h = num;
        }
        if ((i & 256) == 0) {
            this.f21595i = false;
        } else {
            this.f21595i = z2;
        }
        if ((i & 512) == 0) {
            this.f21596j = 0;
        } else {
            this.f21596j = i5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTokenMeaning)) {
            return false;
        }
        ResultTokenMeaning resultTokenMeaning = (ResultTokenMeaning) obj;
        return this.f21587a == resultTokenMeaning.f21587a && fa4.m11650l(this.f21588b, resultTokenMeaning.f21588b) && fa4.m11650l(this.f21589c, resultTokenMeaning.f21589c) && this.f21590d == resultTokenMeaning.f21590d && this.f21591e == resultTokenMeaning.f21591e && this.f21592f == resultTokenMeaning.f21592f && fa4.m11650l(this.f21593g, resultTokenMeaning.f21593g) && fa4.m11650l(this.f21594h, resultTokenMeaning.f21594h) && this.f21595i == resultTokenMeaning.f21595i && this.f21596j == resultTokenMeaning.f21596j;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f21587a) * 31;
        String str = this.f21588b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21589c;
        int iM12428e = g9a.m12428e(wq1.m24106b(this.f21591e, wq1.m24106b(this.f21590d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.f21592f);
        String str3 = this.f21593g;
        int iHashCode3 = (iM12428e + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f21594h;
        return Integer.hashCode(this.f21596j) + g9a.m12428e((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f21595i);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f21587a, "ResultTokenMeaning(id=", ", locale=", this.f21588b, ", text=");
        AbstractC3393o1.m17748w(this.f21590d, this.f21589c, ", termId=", ", popularity=", sbM22995r);
        hn1.m13368r(sbM22995r, this.f21591e, ", flagged=", this.f21592f, ", detectedLocale=");
        hn1.m13371u(sbM22995r, this.f21593g, ", creatorId=", this.f21594h, ", isGoogleTranslate=");
        sbM22995r.append(this.f21595i);
        sbM22995r.append(", wordId=");
        sbM22995r.append(this.f21596j);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}

package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultLibraryCounter {
    public static final C1693m2 Companion = new C1693m2();

    /* JADX INFO: renamed from: a */
    public final boolean f21213a;

    /* JADX INFO: renamed from: b */
    public final Float f21214b;

    /* JADX INFO: renamed from: c */
    public final Double f21215c;

    /* JADX INFO: renamed from: d */
    public final Double f21216d;

    /* JADX INFO: renamed from: e */
    public final boolean f21217e;

    /* JADX INFO: renamed from: f */
    public final float f21218f;

    /* JADX INFO: renamed from: g */
    public final int f21219g;

    /* JADX INFO: renamed from: h */
    public final int f21220h;

    /* JADX INFO: renamed from: i */
    public final int f21221i;

    /* JADX INFO: renamed from: j */
    public final int f21222j;

    /* JADX INFO: renamed from: k */
    public final int f21223k;

    /* JADX INFO: renamed from: l */
    public final boolean f21224l;

    /* JADX INFO: renamed from: m */
    public final int f21225m;

    /* JADX INFO: renamed from: n */
    public final int f21226n;

    /* JADX INFO: renamed from: o */
    public final Double f21227o;

    /* JADX INFO: renamed from: p */
    public final Double f21228p;

    public /* synthetic */ ResultLibraryCounter(int i, boolean z, Float f, Double d, Double d2, boolean z2, float f2, int i2, int i3, int i4, int i5, int i6, boolean z3, int i7, int i8, Double d3, Double d4) {
        Double dValueOf = Double.valueOf(0.0d);
        if ((i & 1) == 0) {
            this.f21213a = false;
        } else {
            this.f21213a = z;
        }
        if ((i & 2) == 0) {
            this.f21214b = Float.valueOf(0.0f);
        } else {
            this.f21214b = f;
        }
        if ((i & 4) == 0) {
            this.f21215c = dValueOf;
        } else {
            this.f21215c = d;
        }
        if ((i & 8) == 0) {
            this.f21216d = dValueOf;
        } else {
            this.f21216d = d2;
        }
        if ((i & 16) == 0) {
            this.f21217e = false;
        } else {
            this.f21217e = z2;
        }
        if ((i & 32) == 0) {
            this.f21218f = 0.0f;
        } else {
            this.f21218f = f2;
        }
        if ((i & 64) == 0) {
            this.f21219g = 0;
        } else {
            this.f21219g = i2;
        }
        if ((i & 128) == 0) {
            this.f21220h = 0;
        } else {
            this.f21220h = i3;
        }
        if ((i & 256) == 0) {
            this.f21221i = 0;
        } else {
            this.f21221i = i4;
        }
        if ((i & 512) == 0) {
            this.f21222j = 0;
        } else {
            this.f21222j = i5;
        }
        if ((i & 1024) == 0) {
            this.f21223k = 0;
        } else {
            this.f21223k = i6;
        }
        if ((i & 2048) == 0) {
            this.f21224l = false;
        } else {
            this.f21224l = z3;
        }
        if ((i & 4096) == 0) {
            this.f21225m = 0;
        } else {
            this.f21225m = i7;
        }
        if ((i & 8192) == 0) {
            this.f21226n = 0;
        } else {
            this.f21226n = i8;
        }
        if ((i & 16384) == 0) {
            this.f21227o = null;
        } else {
            this.f21227o = d3;
        }
        if ((i & 32768) == 0) {
            this.f21228p = null;
        } else {
            this.f21228p = d4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLibraryCounter)) {
            return false;
        }
        ResultLibraryCounter resultLibraryCounter = (ResultLibraryCounter) obj;
        return this.f21213a == resultLibraryCounter.f21213a && fa4.m11650l(this.f21214b, resultLibraryCounter.f21214b) && fa4.m11650l(this.f21215c, resultLibraryCounter.f21215c) && fa4.m11650l(this.f21216d, resultLibraryCounter.f21216d) && this.f21217e == resultLibraryCounter.f21217e && Float.compare(this.f21218f, resultLibraryCounter.f21218f) == 0 && this.f21219g == resultLibraryCounter.f21219g && this.f21220h == resultLibraryCounter.f21220h && this.f21221i == resultLibraryCounter.f21221i && this.f21222j == resultLibraryCounter.f21222j && this.f21223k == resultLibraryCounter.f21223k && this.f21224l == resultLibraryCounter.f21224l && this.f21225m == resultLibraryCounter.f21225m && this.f21226n == resultLibraryCounter.f21226n && fa4.m11650l(this.f21227o, resultLibraryCounter.f21227o) && fa4.m11650l(this.f21228p, resultLibraryCounter.f21228p);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f21213a) * 31;
        Float f = this.f21214b;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Double d = this.f21215c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f21216d;
        int iM24106b = wq1.m24106b(this.f21226n, wq1.m24106b(this.f21225m, g9a.m12428e(wq1.m24106b(this.f21223k, wq1.m24106b(this.f21222j, wq1.m24106b(this.f21221i, wq1.m24106b(this.f21220h, wq1.m24106b(this.f21219g, wq1.m24105a(g9a.m12428e((iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.f21217e), this.f21218f, 31), 31), 31), 31), 31), 31), 31, this.f21224l), 31), 31);
        Double d3 = this.f21227o;
        int iHashCode4 = (iM24106b + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f21228p;
        return iHashCode4 + (d4 != null ? d4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultLibraryCounter(roseGiven=");
        sb.append(this.f21213a);
        sb.append(", progress=");
        sb.append(this.f21214b);
        sb.append(", listenTimes=");
        sb.append(this.f21215c);
        sb.append(", readTimes=");
        sb.append(this.f21216d);
        sb.append(", isTaken=");
        sb.append(this.f21217e);
        sb.append(", difficulty=");
        sb.append(this.f21218f);
        sb.append(", rosesCount=");
        hn1.m13360j(this.f21219g, this.f21220h, ", newWordsCount=", ", knownWordsCount=", sb);
        hn1.m13360j(this.f21221i, this.f21222j, ", cardsCount=", ", lessonsCount=", sb);
        hn1.m13368r(sb, this.f21223k, ", isCompletelyTaken=", this.f21224l, ", totalWordsCount=");
        hn1.m13360j(this.f21225m, this.f21226n, ", uniqueWordsCount=", ", audioStart=", sb);
        sb.append(this.f21227o);
        sb.append(", audioEnd=");
        sb.append(this.f21228p);
        sb.append(")");
        return sb.toString();
    }
}

package com.lingq.core.domain.model.library;

import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class LibraryItemCounter {
    public static final C1466h Companion = new C1466h();

    /* JADX INFO: renamed from: a */
    public final int f19455a;

    /* JADX INFO: renamed from: b */
    public final boolean f19456b;

    /* JADX INFO: renamed from: c */
    public final Float f19457c;

    /* JADX INFO: renamed from: d */
    public final Double f19458d;

    /* JADX INFO: renamed from: e */
    public final Double f19459e;

    /* JADX INFO: renamed from: f */
    public final boolean f19460f;

    /* JADX INFO: renamed from: g */
    public final float f19461g;

    /* JADX INFO: renamed from: h */
    public final int f19462h;

    /* JADX INFO: renamed from: i */
    public final int f19463i;

    /* JADX INFO: renamed from: j */
    public final int f19464j;

    /* JADX INFO: renamed from: k */
    public final int f19465k;

    /* JADX INFO: renamed from: l */
    public final int f19466l;

    /* JADX INFO: renamed from: m */
    public final boolean f19467m;

    /* JADX INFO: renamed from: n */
    public final int f19468n;

    /* JADX INFO: renamed from: o */
    public final int f19469o;

    /* JADX INFO: renamed from: p */
    public final Double f19470p;

    /* JADX INFO: renamed from: q */
    public final Double f19471q;

    public /* synthetic */ LibraryItemCounter(int i, int i2, boolean z, Float f, Double d, Double d2, boolean z2, float f2, int i3, int i4, int i5, int i6, int i7, boolean z3, int i8, int i9, Double d3, Double d4) {
        Double dValueOf = Double.valueOf(0.0d);
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, LibraryItemCounter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19455a = i2;
        if ((i & 2) == 0) {
            this.f19456b = false;
        } else {
            this.f19456b = z;
        }
        if ((i & 4) == 0) {
            this.f19457c = null;
        } else {
            this.f19457c = f;
        }
        if ((i & 8) == 0) {
            this.f19458d = dValueOf;
        } else {
            this.f19458d = d;
        }
        if ((i & 16) == 0) {
            this.f19459e = dValueOf;
        } else {
            this.f19459e = d2;
        }
        if ((i & 32) == 0) {
            this.f19460f = false;
        } else {
            this.f19460f = z2;
        }
        if ((i & 64) == 0) {
            this.f19461g = 0.0f;
        } else {
            this.f19461g = f2;
        }
        if ((i & 128) == 0) {
            this.f19462h = 0;
        } else {
            this.f19462h = i3;
        }
        if ((i & 256) == 0) {
            this.f19463i = 0;
        } else {
            this.f19463i = i4;
        }
        if ((i & 512) == 0) {
            this.f19464j = 0;
        } else {
            this.f19464j = i5;
        }
        if ((i & 1024) == 0) {
            this.f19465k = 0;
        } else {
            this.f19465k = i6;
        }
        if ((i & 2048) == 0) {
            this.f19466l = 0;
        } else {
            this.f19466l = i7;
        }
        if ((i & 4096) == 0) {
            this.f19467m = false;
        } else {
            this.f19467m = z3;
        }
        if ((i & 8192) == 0) {
            this.f19468n = 0;
        } else {
            this.f19468n = i8;
        }
        if ((i & 16384) == 0) {
            this.f19469o = 0;
        } else {
            this.f19469o = i9;
        }
        if ((32768 & i) == 0) {
            this.f19470p = null;
        } else {
            this.f19470p = d3;
        }
        if ((i & 65536) == 0) {
            this.f19471q = null;
        } else {
            this.f19471q = d4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryItemCounter)) {
            return false;
        }
        LibraryItemCounter libraryItemCounter = (LibraryItemCounter) obj;
        return this.f19455a == libraryItemCounter.f19455a && this.f19456b == libraryItemCounter.f19456b && fa4.m11650l(this.f19457c, libraryItemCounter.f19457c) && fa4.m11650l(this.f19458d, libraryItemCounter.f19458d) && fa4.m11650l(this.f19459e, libraryItemCounter.f19459e) && this.f19460f == libraryItemCounter.f19460f && Float.compare(this.f19461g, libraryItemCounter.f19461g) == 0 && this.f19462h == libraryItemCounter.f19462h && this.f19463i == libraryItemCounter.f19463i && this.f19464j == libraryItemCounter.f19464j && this.f19465k == libraryItemCounter.f19465k && this.f19466l == libraryItemCounter.f19466l && this.f19467m == libraryItemCounter.f19467m && this.f19468n == libraryItemCounter.f19468n && this.f19469o == libraryItemCounter.f19469o && fa4.m11650l(this.f19470p, libraryItemCounter.f19470p) && fa4.m11650l(this.f19471q, libraryItemCounter.f19471q);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(Integer.hashCode(this.f19455a) * 31, 31, this.f19456b);
        Float f = this.f19457c;
        int iHashCode = (iM12428e + (f == null ? 0 : f.hashCode())) * 31;
        Double d = this.f19458d;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f19459e;
        int iM24106b = wq1.m24106b(this.f19469o, wq1.m24106b(this.f19468n, g9a.m12428e(wq1.m24106b(this.f19466l, wq1.m24106b(this.f19465k, wq1.m24106b(this.f19464j, wq1.m24106b(this.f19463i, wq1.m24106b(this.f19462h, wq1.m24105a(g9a.m12428e((iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.f19460f), this.f19461g, 31), 31), 31), 31), 31), 31), 31, this.f19467m), 31), 31);
        Double d3 = this.f19470p;
        int iHashCode3 = (iM24106b + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f19471q;
        return iHashCode3 + (d4 != null ? d4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryItemCounter(id=");
        sb.append(this.f19455a);
        sb.append(", roseGiven=");
        sb.append(this.f19456b);
        sb.append(", progress=");
        sb.append(this.f19457c);
        sb.append(", listenTimes=");
        sb.append(this.f19458d);
        sb.append(", readTimes=");
        sb.append(this.f19459e);
        sb.append(", isTaken=");
        sb.append(this.f19460f);
        sb.append(", difficulty=");
        sb.append(this.f19461g);
        sb.append(", rosesCount=");
        sb.append(this.f19462h);
        sb.append(", lessonsCount=");
        hn1.m13360j(this.f19463i, this.f19464j, ", newWordsCount=", ", knownWordsCount=", sb);
        hn1.m13360j(this.f19465k, this.f19466l, ", cardsCount=", ", isCompletelyTaken=", sb);
        hn1.m13373w(sb, this.f19467m, ", totalWordsCount=", this.f19468n, ", uniqueWordsCount=");
        sb.append(this.f19469o);
        sb.append(", audioStart=");
        sb.append(this.f19470p);
        sb.append(", audioEnd=");
        sb.append(this.f19471q);
        sb.append(")");
        return sb.toString();
    }

    public LibraryItemCounter(int i, boolean z, Float f, Double d, Double d2, boolean z2, float f2, int i2, int i3, int i4, int i5, int i6, boolean z3, int i7, int i8, Double d3, Double d4) {
        this.f19455a = i;
        this.f19456b = z;
        this.f19457c = f;
        this.f19458d = d;
        this.f19459e = d2;
        this.f19460f = z2;
        this.f19461g = f2;
        this.f19462h = i2;
        this.f19463i = i3;
        this.f19464j = i4;
        this.f19465k = i5;
        this.f19466l = i6;
        this.f19467m = z3;
        this.f19468n = i7;
        this.f19469o = i8;
        this.f19470p = d3;
        this.f19471q = d4;
    }
}

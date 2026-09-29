package com.lingq.core.database.entity;

import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class LibraryCounterEntity {
    public static final C1366y Companion = new C1366y();

    /* JADX INFO: renamed from: a */
    public final int f17357a;

    /* JADX INFO: renamed from: b */
    public final String f17358b;

    /* JADX INFO: renamed from: c */
    public final boolean f17359c;

    /* JADX INFO: renamed from: d */
    public final Float f17360d;

    /* JADX INFO: renamed from: e */
    public final Double f17361e;

    /* JADX INFO: renamed from: f */
    public final Double f17362f;

    /* JADX INFO: renamed from: g */
    public final boolean f17363g;

    /* JADX INFO: renamed from: h */
    public final float f17364h;

    /* JADX INFO: renamed from: i */
    public final int f17365i;

    /* JADX INFO: renamed from: j */
    public final int f17366j;

    /* JADX INFO: renamed from: k */
    public final int f17367k;

    /* JADX INFO: renamed from: l */
    public final int f17368l;

    /* JADX INFO: renamed from: m */
    public final int f17369m;

    /* JADX INFO: renamed from: n */
    public final boolean f17370n;

    /* JADX INFO: renamed from: o */
    public final int f17371o;

    /* JADX INFO: renamed from: p */
    public final int f17372p;

    /* JADX INFO: renamed from: q */
    public final Double f17373q;

    /* JADX INFO: renamed from: r */
    public final Double f17374r;

    public /* synthetic */ LibraryCounterEntity(int i, int i2, String str, boolean z, Float f, Double d, Double d2, boolean z2, float f2, int i3, int i4, int i5, int i6, int i7, boolean z3, int i8, int i9, Double d3, Double d4) {
        Double dValueOf = Double.valueOf(0.0d);
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, LibraryCounterEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17357a = i2;
        this.f17358b = str;
        if ((i & 4) == 0) {
            this.f17359c = false;
        } else {
            this.f17359c = z;
        }
        if ((i & 8) == 0) {
            this.f17360d = Float.valueOf(0.0f);
        } else {
            this.f17360d = f;
        }
        if ((i & 16) == 0) {
            this.f17361e = dValueOf;
        } else {
            this.f17361e = d;
        }
        if ((i & 32) == 0) {
            this.f17362f = dValueOf;
        } else {
            this.f17362f = d2;
        }
        if ((i & 64) == 0) {
            this.f17363g = false;
        } else {
            this.f17363g = z2;
        }
        if ((i & 128) == 0) {
            this.f17364h = 0.0f;
        } else {
            this.f17364h = f2;
        }
        if ((i & 256) == 0) {
            this.f17365i = 0;
        } else {
            this.f17365i = i3;
        }
        if ((i & 512) == 0) {
            this.f17366j = 0;
        } else {
            this.f17366j = i4;
        }
        if ((i & 1024) == 0) {
            this.f17367k = 0;
        } else {
            this.f17367k = i5;
        }
        if ((i & 2048) == 0) {
            this.f17368l = 0;
        } else {
            this.f17368l = i6;
        }
        if ((i & 4096) == 0) {
            this.f17369m = 0;
        } else {
            this.f17369m = i7;
        }
        if ((i & 8192) == 0) {
            this.f17370n = false;
        } else {
            this.f17370n = z3;
        }
        if ((i & 16384) == 0) {
            this.f17371o = 0;
        } else {
            this.f17371o = i8;
        }
        if ((32768 & i) == 0) {
            this.f17372p = 0;
        } else {
            this.f17372p = i9;
        }
        if ((65536 & i) == 0) {
            this.f17373q = null;
        } else {
            this.f17373q = d3;
        }
        if ((i & 131072) == 0) {
            this.f17374r = null;
        } else {
            this.f17374r = d4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static LibraryCounterEntity m7760a(LibraryCounterEntity libraryCounterEntity, boolean z, Double d, Double d2, boolean z2, int i, int i2) {
        int i3 = libraryCounterEntity.f17357a;
        String str = libraryCounterEntity.f17358b;
        boolean z3 = (i2 & 4) != 0 ? libraryCounterEntity.f17359c : z;
        Float f = libraryCounterEntity.f17360d;
        Double d3 = (i2 & 16) != 0 ? libraryCounterEntity.f17361e : d;
        Double d4 = (i2 & 32) != 0 ? libraryCounterEntity.f17362f : d2;
        boolean z4 = (i2 & 64) != 0 ? libraryCounterEntity.f17363g : z2;
        float f2 = libraryCounterEntity.f17364h;
        int i4 = (i2 & 256) != 0 ? libraryCounterEntity.f17365i : i;
        int i5 = libraryCounterEntity.f17366j;
        boolean z5 = z3;
        Double d5 = d3;
        Double d6 = d4;
        boolean z6 = z4;
        int i6 = i4;
        int i7 = libraryCounterEntity.f17367k;
        int i8 = libraryCounterEntity.f17368l;
        int i9 = libraryCounterEntity.f17369m;
        boolean z7 = (i2 & 8192) != 0 ? libraryCounterEntity.f17370n : true;
        int i10 = libraryCounterEntity.f17371o;
        boolean z8 = z7;
        int i11 = libraryCounterEntity.f17372p;
        Double d7 = libraryCounterEntity.f17373q;
        Double d8 = libraryCounterEntity.f17374r;
        str.getClass();
        return new LibraryCounterEntity(i3, str, z5, f, d5, d6, z6, f2, i6, i5, i7, i8, i9, z8, i10, i11, d7, d8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryCounterEntity)) {
            return false;
        }
        LibraryCounterEntity libraryCounterEntity = (LibraryCounterEntity) obj;
        return this.f17357a == libraryCounterEntity.f17357a && fa4.m11650l(this.f17358b, libraryCounterEntity.f17358b) && this.f17359c == libraryCounterEntity.f17359c && fa4.m11650l(this.f17360d, libraryCounterEntity.f17360d) && fa4.m11650l(this.f17361e, libraryCounterEntity.f17361e) && fa4.m11650l(this.f17362f, libraryCounterEntity.f17362f) && this.f17363g == libraryCounterEntity.f17363g && Float.compare(this.f17364h, libraryCounterEntity.f17364h) == 0 && this.f17365i == libraryCounterEntity.f17365i && this.f17366j == libraryCounterEntity.f17366j && this.f17367k == libraryCounterEntity.f17367k && this.f17368l == libraryCounterEntity.f17368l && this.f17369m == libraryCounterEntity.f17369m && this.f17370n == libraryCounterEntity.f17370n && this.f17371o == libraryCounterEntity.f17371o && this.f17372p == libraryCounterEntity.f17372p && fa4.m11650l(this.f17373q, libraryCounterEntity.f17373q) && fa4.m11650l(this.f17374r, libraryCounterEntity.f17374r);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(ux5.m22980c(Integer.hashCode(this.f17357a) * 31, this.f17358b, 31), 31, this.f17359c);
        Float f = this.f17360d;
        int iHashCode = (iM12428e + (f == null ? 0 : f.hashCode())) * 31;
        Double d = this.f17361e;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f17362f;
        int iM24106b = wq1.m24106b(this.f17372p, wq1.m24106b(this.f17371o, g9a.m12428e(wq1.m24106b(this.f17369m, wq1.m24106b(this.f17368l, wq1.m24106b(this.f17367k, wq1.m24106b(this.f17366j, wq1.m24106b(this.f17365i, wq1.m24105a(g9a.m12428e((iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.f17363g), this.f17364h, 31), 31), 31), 31), 31), 31), 31, this.f17370n), 31), 31);
        Double d3 = this.f17373q;
        int iHashCode3 = (iM24106b + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f17374r;
        return iHashCode3 + (d4 != null ? d4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f17357a, "LibraryCounterEntity(id=", ", type=", this.f17358b, ", roseGiven=");
        sbM22995r.append(this.f17359c);
        sbM22995r.append(", progress=");
        sbM22995r.append(this.f17360d);
        sbM22995r.append(", listenTimes=");
        sbM22995r.append(this.f17361e);
        sbM22995r.append(", readTimes=");
        sbM22995r.append(this.f17362f);
        sbM22995r.append(", isTaken=");
        sbM22995r.append(this.f17363g);
        sbM22995r.append(", difficulty=");
        sbM22995r.append(this.f17364h);
        sbM22995r.append(", rosesCount=");
        hn1.m13360j(this.f17365i, this.f17366j, ", newWordsCount=", ", knownWordsCount=", sbM22995r);
        hn1.m13360j(this.f17367k, this.f17368l, ", cardsCount=", ", lessonsCount=", sbM22995r);
        hn1.m13368r(sbM22995r, this.f17369m, ", isCompletelyTaken=", this.f17370n, ", totalWordsCount=");
        hn1.m13360j(this.f17371o, this.f17372p, ", uniqueWordsCount=", ", audioStart=", sbM22995r);
        sbM22995r.append(this.f17373q);
        sbM22995r.append(", audioEnd=");
        sbM22995r.append(this.f17374r);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }

    public LibraryCounterEntity(int i, String str, boolean z, Float f, Double d, Double d2, boolean z2, float f2, int i2, int i3, int i4, int i5, int i6, boolean z3, int i7, int i8, Double d3, Double d4) {
        str.getClass();
        this.f17357a = i;
        this.f17358b = str;
        this.f17359c = z;
        this.f17360d = f;
        this.f17361e = d;
        this.f17362f = d2;
        this.f17363g = z2;
        this.f17364h = f2;
        this.f17365i = i2;
        this.f17366j = i3;
        this.f17367k = i4;
        this.f17368l = i5;
        this.f17369m = i6;
        this.f17370n = z3;
        this.f17371o = i7;
        this.f17372p = i8;
        this.f17373q = d3;
        this.f17374r = d4;
    }
}

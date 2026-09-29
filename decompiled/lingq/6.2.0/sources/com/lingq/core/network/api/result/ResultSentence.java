package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g98;
import p000.hn1;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultSentence {
    public static final C1718q3 Companion = new C1718q3();

    /* JADX INFO: renamed from: h */
    public static final cs4[] f21488h;

    /* JADX INFO: renamed from: a */
    public final List f21489a;

    /* JADX INFO: renamed from: b */
    public final String f21490b;

    /* JADX INFO: renamed from: c */
    public final String f21491c;

    /* JADX INFO: renamed from: d */
    public final Integer f21492d;

    /* JADX INFO: renamed from: e */
    public final List f21493e;

    /* JADX INFO: renamed from: f */
    public final String f21494f;

    /* JADX INFO: renamed from: g */
    public final String f21495g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f21488h = new cs4[]{AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(2)), null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(3)), null, null};
    }

    public /* synthetic */ ResultSentence(int i, List list, String str, String str2, Integer num, List list2, String str3, String str4) {
        this.f21489a = (i & 1) == 0 ? EmptyList.f47638a : list;
        if ((i & 2) == 0) {
            this.f21490b = null;
        } else {
            this.f21490b = str;
        }
        if ((i & 4) == 0) {
            this.f21491c = null;
        } else {
            this.f21491c = str2;
        }
        if ((i & 8) == 0) {
            this.f21492d = null;
        } else {
            this.f21492d = num;
        }
        if ((i & 16) == 0) {
            this.f21493e = null;
        } else {
            this.f21493e = list2;
        }
        if ((i & 32) == 0) {
            this.f21494f = null;
        } else {
            this.f21494f = str3;
        }
        if ((i & 64) == 0) {
            this.f21495g = null;
        } else {
            this.f21495g = str4;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Integer m8389a() {
        return this.f21492d;
    }

    /* JADX INFO: renamed from: b */
    public final List m8390b() {
        return this.f21489a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultSentence)) {
            return false;
        }
        ResultSentence resultSentence = (ResultSentence) obj;
        return fa4.m11650l(this.f21489a, resultSentence.f21489a) && fa4.m11650l(this.f21490b, resultSentence.f21490b) && fa4.m11650l(this.f21491c, resultSentence.f21491c) && fa4.m11650l(this.f21492d, resultSentence.f21492d) && fa4.m11650l(this.f21493e, resultSentence.f21493e) && fa4.m11650l(this.f21494f, resultSentence.f21494f) && fa4.m11650l(this.f21495g, resultSentence.f21495g);
    }

    public final int hashCode() {
        int iHashCode = this.f21489a.hashCode() * 31;
        String str = this.f21490b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21491c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f21492d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f21493e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f21494f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21495g;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultSentence(tokens=");
        sb.append(this.f21489a);
        sb.append(", text=");
        sb.append(this.f21490b);
        sb.append(", normalizedText=");
        hn1.m13371u(sb, this.f21491c, ", index=", this.f21492d, ", timestamp=");
        wq1.m24130z(", url=", this.f21494f, ", opentag=", sb, this.f21493e);
        return AbstractC3393o1.m17738m(sb, this.f21495g, ")");
    }
}

package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g98;
import p000.hn1;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultTranslationSentenceV3 {
    public static final C1695m4 Companion = new C1695m4();

    /* JADX INFO: renamed from: f */
    public static final cs4[] f21616f;

    /* JADX INFO: renamed from: a */
    public final int f21617a;

    /* JADX INFO: renamed from: b */
    public final String f21618b;

    /* JADX INFO: renamed from: c */
    public final String f21619c;

    /* JADX INFO: renamed from: d */
    public final List f21620d;

    /* JADX INFO: renamed from: e */
    public final List f21621e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f21616f = new cs4[]{null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(17)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(18))};
    }

    public /* synthetic */ ResultTranslationSentenceV3(int i, int i2, String str, String str2, List list, List list2) {
        this.f21617a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f21618b = null;
        } else {
            this.f21618b = str;
        }
        if ((i & 4) == 0) {
            this.f21619c = null;
        } else {
            this.f21619c = str2;
        }
        if ((i & 8) == 0) {
            this.f21620d = null;
        } else {
            this.f21620d = list;
        }
        if ((i & 16) == 0) {
            this.f21621e = null;
        } else {
            this.f21621e = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTranslationSentenceV3)) {
            return false;
        }
        ResultTranslationSentenceV3 resultTranslationSentenceV3 = (ResultTranslationSentenceV3) obj;
        return this.f21617a == resultTranslationSentenceV3.f21617a && fa4.m11650l(this.f21618b, resultTranslationSentenceV3.f21618b) && fa4.m11650l(this.f21619c, resultTranslationSentenceV3.f21619c) && fa4.m11650l(this.f21620d, resultTranslationSentenceV3.f21620d) && fa4.m11650l(this.f21621e, resultTranslationSentenceV3.f21621e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f21617a) * 31;
        String str = this.f21618b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21619c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f21620d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f21621e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f21617a, "ResultTranslationSentenceV3(index=", ", cleanText=", this.f21618b, ", text=");
        hn1.m13366p(this.f21619c, ", timestamp=", ", translations=", sbM22995r, this.f21620d);
        return hn1.m13356f(sbM22995r, this.f21621e, ")");
    }
}

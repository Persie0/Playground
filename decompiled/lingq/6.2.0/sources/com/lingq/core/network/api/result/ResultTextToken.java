package com.lingq.core.network.api.result;

import java.util.Map;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC3194a;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g98;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultTextToken {
    public static final C1647e4 Companion = new C1647e4();

    /* JADX INFO: renamed from: o */
    public static final cs4[] f21567o = {null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new g98(6))};

    /* JADX INFO: renamed from: a */
    public final String f21568a;

    /* JADX INFO: renamed from: b */
    public final String f21569b;

    /* JADX INFO: renamed from: c */
    public final boolean f21570c;

    /* JADX INFO: renamed from: d */
    public final String f21571d;

    /* JADX INFO: renamed from: e */
    public final String f21572e;

    /* JADX INFO: renamed from: f */
    public final ResultLessonTransliteration f21573f;

    /* JADX INFO: renamed from: g */
    public final int f21574g;

    /* JADX INFO: renamed from: h */
    public final int f21575h;

    /* JADX INFO: renamed from: i */
    public final boolean f21576i;

    /* JADX INFO: renamed from: j */
    public final String f21577j;

    /* JADX INFO: renamed from: k */
    public final boolean f21578k;

    /* JADX INFO: renamed from: l */
    public final boolean f21579l;

    /* JADX INFO: renamed from: m */
    public final int f21580m;

    /* JADX INFO: renamed from: n */
    public final Map f21581n;

    public /* synthetic */ ResultTextToken(int i, String str, String str2, boolean z, String str3, String str4, ResultLessonTransliteration resultLessonTransliteration, int i2, int i3, boolean z2, String str5, boolean z3, boolean z4, int i4, Map map) {
        if ((i & 1) == 0) {
            this.f21568a = null;
        } else {
            this.f21568a = str;
        }
        if ((i & 2) == 0) {
            this.f21569b = null;
        } else {
            this.f21569b = str2;
        }
        if ((i & 4) == 0) {
            this.f21570c = false;
        } else {
            this.f21570c = z;
        }
        if ((i & 8) == 0) {
            this.f21571d = null;
        } else {
            this.f21571d = str3;
        }
        if ((i & 16) == 0) {
            this.f21572e = null;
        } else {
            this.f21572e = str4;
        }
        if ((i & 32) == 0) {
            this.f21573f = null;
        } else {
            this.f21573f = resultLessonTransliteration;
        }
        if ((i & 64) == 0) {
            this.f21574g = 0;
        } else {
            this.f21574g = i2;
        }
        if ((i & 128) == 0) {
            this.f21575h = 0;
        } else {
            this.f21575h = i3;
        }
        if ((i & 256) == 0) {
            this.f21576i = false;
        } else {
            this.f21576i = z2;
        }
        if ((i & 512) == 0) {
            this.f21577j = null;
        } else {
            this.f21577j = str5;
        }
        if ((i & 1024) == 0) {
            this.f21578k = false;
        } else {
            this.f21578k = z3;
        }
        if ((i & 2048) == 0) {
            this.f21579l = false;
        } else {
            this.f21579l = z4;
        }
        if ((i & 4096) == 0) {
            this.f21580m = 0;
        } else {
            this.f21580m = i4;
        }
        this.f21581n = (i & 8192) == 0 ? AbstractC3194a.m15360M() : map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTextToken)) {
            return false;
        }
        ResultTextToken resultTextToken = (ResultTextToken) obj;
        return fa4.m11650l(this.f21568a, resultTextToken.f21568a) && fa4.m11650l(this.f21569b, resultTextToken.f21569b) && this.f21570c == resultTextToken.f21570c && fa4.m11650l(this.f21571d, resultTextToken.f21571d) && fa4.m11650l(this.f21572e, resultTextToken.f21572e) && fa4.m11650l(this.f21573f, resultTextToken.f21573f) && this.f21574g == resultTextToken.f21574g && this.f21575h == resultTextToken.f21575h && this.f21576i == resultTextToken.f21576i && fa4.m11650l(this.f21577j, resultTextToken.f21577j) && this.f21578k == resultTextToken.f21578k && this.f21579l == resultTextToken.f21579l && this.f21580m == resultTextToken.f21580m && fa4.m11650l(this.f21581n, resultTextToken.f21581n);
    }

    public final int hashCode() {
        String str = this.f21568a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21569b;
        int iM12428e = g9a.m12428e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f21570c);
        String str3 = this.f21571d;
        int iHashCode2 = (iM12428e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21572e;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ResultLessonTransliteration resultLessonTransliteration = this.f21573f;
        int iM12428e2 = g9a.m12428e(wq1.m24106b(this.f21575h, wq1.m24106b(this.f21574g, (iHashCode3 + (resultLessonTransliteration == null ? 0 : resultLessonTransliteration.hashCode())) * 31, 31), 31), 31, this.f21576i);
        String str5 = this.f21577j;
        return this.f21581n.hashCode() + wq1.m24106b(this.f21580m, g9a.m12428e(g9a.m12428e((iM12428e2 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.f21578k), 31, this.f21579l), 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultTextToken(punct=", this.f21568a, ", whitespace=", this.f21569b, ", isNumber=");
        hn1.m13367q(", opentag=", this.f21571d, ", closetag=", sbM23000w, this.f21570c);
        sbM23000w.append(this.f21572e);
        sbM23000w.append(", transliteration=");
        sbM23000w.append(this.f21573f);
        sbM23000w.append(", index=");
        hn1.m13360j(this.f21574g, this.f21575h, ", indexInSentence=", ", isIgnored=", sbM23000w);
        hn1.m13367q(", text=", this.f21577j, ", isUnknown=", sbM23000w, this.f21576i);
        wq1.m24101A(sbM23000w, this.f21578k, ", isKnown=", this.f21579l, ", wordId=");
        sbM23000w.append(this.f21580m);
        sbM23000w.append(", translation=");
        sbM23000w.append(this.f21581n);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}

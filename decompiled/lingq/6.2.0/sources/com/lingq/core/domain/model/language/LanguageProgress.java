package com.lingq.core.domain.model.language;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.uf4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class LanguageProgress {
    public static final C1427g Companion = new C1427g();

    /* JADX INFO: renamed from: y */
    public static final cs4[] f19046y = {null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new uf4(10)), null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final String f19047a;

    /* JADX INFO: renamed from: b */
    public final String f19048b;

    /* JADX INFO: renamed from: c */
    public final int f19049c;

    /* JADX INFO: renamed from: d */
    public final double f19050d;

    /* JADX INFO: renamed from: e */
    public final int f19051e;

    /* JADX INFO: renamed from: f */
    public final double f19052f;

    /* JADX INFO: renamed from: g */
    public final int f19053g;

    /* JADX INFO: renamed from: h */
    public final int f19054h;

    /* JADX INFO: renamed from: i */
    public final int f19055i;

    /* JADX INFO: renamed from: j */
    public final double f19056j;

    /* JADX INFO: renamed from: k */
    public final double f19057k;

    /* JADX INFO: renamed from: l */
    public final int f19058l;

    /* JADX INFO: renamed from: m */
    public final int f19059m;

    /* JADX INFO: renamed from: n */
    public final List f19060n;

    /* JADX INFO: renamed from: o */
    public final int f19061o;

    /* JADX INFO: renamed from: p */
    public final int f19062p;

    /* JADX INFO: renamed from: q */
    public final double f19063q;

    /* JADX INFO: renamed from: r */
    public final int f19064r;

    /* JADX INFO: renamed from: s */
    public final int f19065s;

    /* JADX INFO: renamed from: t */
    public final int f19066t;

    /* JADX INFO: renamed from: u */
    public final int f19067u;

    /* JADX INFO: renamed from: v */
    public final int f19068v;

    /* JADX INFO: renamed from: w */
    public final int f19069w;

    /* JADX INFO: renamed from: x */
    public final int f19070x;

    public /* synthetic */ LanguageProgress(int i, String str, String str2, int i2, double d, int i3, double d2, int i4, int i5, int i6, double d3, double d4, int i7, int i8, List list, int i9, int i10, double d5, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, LanguageProgress$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19047a = str;
        this.f19048b = str2;
        if ((i & 4) == 0) {
            this.f19049c = 0;
        } else {
            this.f19049c = i2;
        }
        if ((i & 8) == 0) {
            this.f19050d = 0.0d;
        } else {
            this.f19050d = d;
        }
        if ((i & 16) == 0) {
            this.f19051e = 0;
        } else {
            this.f19051e = i3;
        }
        if ((i & 32) == 0) {
            this.f19052f = 0.0d;
        } else {
            this.f19052f = d2;
        }
        if ((i & 64) == 0) {
            this.f19053g = 0;
        } else {
            this.f19053g = i4;
        }
        if ((i & 128) == 0) {
            this.f19054h = 0;
        } else {
            this.f19054h = i5;
        }
        if ((i & 256) == 0) {
            this.f19055i = 0;
        } else {
            this.f19055i = i6;
        }
        if ((i & 512) == 0) {
            this.f19056j = 0.0d;
        } else {
            this.f19056j = d3;
        }
        if ((i & 1024) == 0) {
            this.f19057k = 0.0d;
        } else {
            this.f19057k = d4;
        }
        if ((i & 2048) == 0) {
            this.f19058l = 0;
        } else {
            this.f19058l = i7;
        }
        if ((i & 4096) == 0) {
            this.f19059m = 0;
        } else {
            this.f19059m = i8;
        }
        this.f19060n = (i & 8192) == 0 ? EmptyList.f47638a : list;
        if ((i & 16384) == 0) {
            this.f19061o = 0;
        } else {
            this.f19061o = i9;
        }
        if ((32768 & i) == 0) {
            this.f19062p = 0;
        } else {
            this.f19062p = i10;
        }
        if ((65536 & i) == 0) {
            this.f19063q = 0.0d;
        } else {
            this.f19063q = d5;
        }
        if ((131072 & i) == 0) {
            this.f19064r = 0;
        } else {
            this.f19064r = i11;
        }
        if ((262144 & i) == 0) {
            this.f19065s = 0;
        } else {
            this.f19065s = i12;
        }
        if ((524288 & i) == 0) {
            this.f19066t = 0;
        } else {
            this.f19066t = i13;
        }
        if ((1048576 & i) == 0) {
            this.f19067u = 0;
        } else {
            this.f19067u = i14;
        }
        if ((2097152 & i) == 0) {
            this.f19068v = 0;
        } else {
            this.f19068v = i15;
        }
        if ((4194304 & i) == 0) {
            this.f19069w = 0;
        } else {
            this.f19069w = i16;
        }
        if ((i & 8388608) == 0) {
            this.f19070x = 0;
        } else {
            this.f19070x = i17;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageProgress)) {
            return false;
        }
        LanguageProgress languageProgress = (LanguageProgress) obj;
        return fa4.m11650l(this.f19047a, languageProgress.f19047a) && fa4.m11650l(this.f19048b, languageProgress.f19048b) && this.f19049c == languageProgress.f19049c && Double.compare(this.f19050d, languageProgress.f19050d) == 0 && this.f19051e == languageProgress.f19051e && Double.compare(this.f19052f, languageProgress.f19052f) == 0 && this.f19053g == languageProgress.f19053g && this.f19054h == languageProgress.f19054h && this.f19055i == languageProgress.f19055i && Double.compare(this.f19056j, languageProgress.f19056j) == 0 && Double.compare(this.f19057k, languageProgress.f19057k) == 0 && this.f19058l == languageProgress.f19058l && this.f19059m == languageProgress.f19059m && fa4.m11650l(this.f19060n, languageProgress.f19060n) && this.f19061o == languageProgress.f19061o && this.f19062p == languageProgress.f19062p && Double.compare(this.f19063q, languageProgress.f19063q) == 0 && this.f19064r == languageProgress.f19064r && this.f19065s == languageProgress.f19065s && this.f19066t == languageProgress.f19066t && this.f19067u == languageProgress.f19067u && this.f19068v == languageProgress.f19068v && this.f19069w == languageProgress.f19069w && this.f19070x == languageProgress.f19070x;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19070x) + wq1.m24106b(this.f19069w, wq1.m24106b(this.f19068v, wq1.m24106b(this.f19067u, wq1.m24106b(this.f19066t, wq1.m24106b(this.f19065s, wq1.m24106b(this.f19064r, g9a.m12424a(this.f19063q, wq1.m24106b(this.f19062p, wq1.m24106b(this.f19061o, ux5.m22979b(wq1.m24106b(this.f19059m, wq1.m24106b(this.f19058l, g9a.m12424a(this.f19057k, g9a.m12424a(this.f19056j, wq1.m24106b(this.f19055i, wq1.m24106b(this.f19054h, wq1.m24106b(this.f19053g, g9a.m12424a(this.f19052f, wq1.m24106b(this.f19051e, g9a.m12424a(this.f19050d, wq1.m24106b(this.f19049c, ux5.m22980c(this.f19047a.hashCode() * 31, this.f19048b, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f19060n), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("LanguageProgress(interval=", this.f19047a, ", languageCode=", this.f19048b, ", writtenWordsGoal=");
        sbM23000w.append(this.f19049c);
        sbM23000w.append(", speakingTimeGoal=");
        sbM23000w.append(this.f19050d);
        sbM23000w.append(", totalWordsKnown=");
        sbM23000w.append(this.f19051e);
        sbM23000w.append(", readWords=");
        sbM23000w.append(this.f19052f);
        sbM23000w.append(", totalCards=");
        sbM23000w.append(this.f19053g);
        wq1.m24127w(this.f19054h, this.f19055i, ", activityIndex=", ", knownWordsGoal=", sbM23000w);
        hn1.m13370t(sbM23000w, ", listeningTimeGoal=", this.f19056j, ", speakingTime=");
        sbM23000w.append(this.f19057k);
        sbM23000w.append(", cardsCreatedGoal=");
        sbM23000w.append(this.f19058l);
        sbM23000w.append(", knownWords=");
        sbM23000w.append(this.f19059m);
        sbM23000w.append(", intervals=");
        sbM23000w.append(this.f19060n);
        wq1.m24127w(this.f19061o, this.f19062p, ", cardsCreated=", ", readWordsGoal=", sbM23000w);
        hn1.m13370t(sbM23000w, ", listeningTime=", this.f19063q, ", cardsLearned=");
        hn1.m13360j(this.f19064r, this.f19065s, ", writtenWords=", ", cardsLearnedGoal=", sbM23000w);
        hn1.m13360j(this.f19066t, this.f19067u, ", earnedCoins=", ", earnedCoinsGoal=", sbM23000w);
        hn1.m13360j(this.f19068v, this.f19069w, ", wpm=", ", studyTime=", sbM23000w);
        return wq1.m24123s(sbM23000w, this.f19070x, ")");
    }

    public LanguageProgress(String str, String str2, int i, double d, int i2, double d2, int i3, int i4, int i5, double d3, double d4, int i6, int i7, List list, int i8, int i9, double d5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        str.getClass();
        str2.getClass();
        this.f19047a = str;
        this.f19048b = str2;
        this.f19049c = i;
        this.f19050d = d;
        this.f19051e = i2;
        this.f19052f = d2;
        this.f19053g = i3;
        this.f19054h = i4;
        this.f19055i = i5;
        this.f19056j = d3;
        this.f19057k = d4;
        this.f19058l = i6;
        this.f19059m = i7;
        this.f19060n = list;
        this.f19061o = i8;
        this.f19062p = i9;
        this.f19063q = d5;
        this.f19064r = i10;
        this.f19065s = i11;
        this.f19066t = i12;
        this.f19067u = i13;
        this.f19068v = i14;
        this.f19069w = i15;
        this.f19070x = i16;
    }
}

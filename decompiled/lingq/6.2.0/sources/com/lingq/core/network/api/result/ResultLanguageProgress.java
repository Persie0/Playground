package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ri5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultLanguageProgress {
    public static final C1722r1 Companion = new C1722r1();

    /* JADX INFO: renamed from: w */
    public static final cs4[] f20888w = {null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new ri5(26)), null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final int f20889a;

    /* JADX INFO: renamed from: b */
    public final double f20890b;

    /* JADX INFO: renamed from: c */
    public final int f20891c;

    /* JADX INFO: renamed from: d */
    public final double f20892d;

    /* JADX INFO: renamed from: e */
    public final int f20893e;

    /* JADX INFO: renamed from: f */
    public final int f20894f;

    /* JADX INFO: renamed from: g */
    public final int f20895g;

    /* JADX INFO: renamed from: h */
    public final double f20896h;

    /* JADX INFO: renamed from: i */
    public final double f20897i;

    /* JADX INFO: renamed from: j */
    public final int f20898j;

    /* JADX INFO: renamed from: k */
    public final int f20899k;

    /* JADX INFO: renamed from: l */
    public final List f20900l;

    /* JADX INFO: renamed from: m */
    public final int f20901m;

    /* JADX INFO: renamed from: n */
    public final int f20902n;

    /* JADX INFO: renamed from: o */
    public final double f20903o;

    /* JADX INFO: renamed from: p */
    public final int f20904p;

    /* JADX INFO: renamed from: q */
    public final int f20905q;

    /* JADX INFO: renamed from: r */
    public final int f20906r;

    /* JADX INFO: renamed from: s */
    public final int f20907s;

    /* JADX INFO: renamed from: t */
    public final int f20908t;

    /* JADX INFO: renamed from: u */
    public final int f20909u;

    /* JADX INFO: renamed from: v */
    public final double f20910v;

    public /* synthetic */ ResultLanguageProgress(int i, int i2, double d, int i3, double d2, int i4, int i5, int i6, double d3, double d4, int i7, int i8, List list, int i9, int i10, double d5, int i11, int i12, int i13, int i14, int i15, int i16, double d6) {
        if ((i & 1) == 0) {
            this.f20889a = 0;
        } else {
            this.f20889a = i2;
        }
        if ((i & 2) == 0) {
            this.f20890b = 0.0d;
        } else {
            this.f20890b = d;
        }
        if ((i & 4) == 0) {
            this.f20891c = 0;
        } else {
            this.f20891c = i3;
        }
        if ((i & 8) == 0) {
            this.f20892d = 0.0d;
        } else {
            this.f20892d = d2;
        }
        if ((i & 16) == 0) {
            this.f20893e = 0;
        } else {
            this.f20893e = i4;
        }
        if ((i & 32) == 0) {
            this.f20894f = 0;
        } else {
            this.f20894f = i5;
        }
        if ((i & 64) == 0) {
            this.f20895g = 0;
        } else {
            this.f20895g = i6;
        }
        if ((i & 128) == 0) {
            this.f20896h = 0.0d;
        } else {
            this.f20896h = d3;
        }
        if ((i & 256) == 0) {
            this.f20897i = 0.0d;
        } else {
            this.f20897i = d4;
        }
        if ((i & 512) == 0) {
            this.f20898j = 0;
        } else {
            this.f20898j = i7;
        }
        if ((i & 1024) == 0) {
            this.f20899k = 0;
        } else {
            this.f20899k = i8;
        }
        this.f20900l = (i & 2048) == 0 ? null : list;
        if ((i & 4096) == 0) {
            this.f20901m = 0;
        } else {
            this.f20901m = i9;
        }
        if ((i & 8192) == 0) {
            this.f20902n = 0;
        } else {
            this.f20902n = i10;
        }
        if ((i & 16384) == 0) {
            this.f20903o = 0.0d;
        } else {
            this.f20903o = d5;
        }
        if ((32768 & i) == 0) {
            this.f20904p = 0;
        } else {
            this.f20904p = i11;
        }
        if ((65536 & i) == 0) {
            this.f20905q = 0;
        } else {
            this.f20905q = i12;
        }
        if ((131072 & i) == 0) {
            this.f20906r = 0;
        } else {
            this.f20906r = i13;
        }
        if ((262144 & i) == 0) {
            this.f20907s = 0;
        } else {
            this.f20907s = i14;
        }
        if ((524288 & i) == 0) {
            this.f20908t = 0;
        } else {
            this.f20908t = i15;
        }
        if ((1048576 & i) == 0) {
            this.f20909u = 0;
        } else {
            this.f20909u = i16;
        }
        if ((i & 2097152) == 0) {
            this.f20910v = 0.0d;
        } else {
            this.f20910v = d6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLanguageProgress)) {
            return false;
        }
        ResultLanguageProgress resultLanguageProgress = (ResultLanguageProgress) obj;
        return this.f20889a == resultLanguageProgress.f20889a && Double.compare(this.f20890b, resultLanguageProgress.f20890b) == 0 && this.f20891c == resultLanguageProgress.f20891c && Double.compare(this.f20892d, resultLanguageProgress.f20892d) == 0 && this.f20893e == resultLanguageProgress.f20893e && this.f20894f == resultLanguageProgress.f20894f && this.f20895g == resultLanguageProgress.f20895g && Double.compare(this.f20896h, resultLanguageProgress.f20896h) == 0 && Double.compare(this.f20897i, resultLanguageProgress.f20897i) == 0 && this.f20898j == resultLanguageProgress.f20898j && this.f20899k == resultLanguageProgress.f20899k && fa4.m11650l(this.f20900l, resultLanguageProgress.f20900l) && this.f20901m == resultLanguageProgress.f20901m && this.f20902n == resultLanguageProgress.f20902n && Double.compare(this.f20903o, resultLanguageProgress.f20903o) == 0 && this.f20904p == resultLanguageProgress.f20904p && this.f20905q == resultLanguageProgress.f20905q && this.f20906r == resultLanguageProgress.f20906r && this.f20907s == resultLanguageProgress.f20907s && this.f20908t == resultLanguageProgress.f20908t && this.f20909u == resultLanguageProgress.f20909u && Double.compare(this.f20910v, resultLanguageProgress.f20910v) == 0;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f20899k, wq1.m24106b(this.f20898j, g9a.m12424a(this.f20897i, g9a.m12424a(this.f20896h, wq1.m24106b(this.f20895g, wq1.m24106b(this.f20894f, wq1.m24106b(this.f20893e, g9a.m12424a(this.f20892d, wq1.m24106b(this.f20891c, g9a.m12424a(this.f20890b, Integer.hashCode(this.f20889a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        List list = this.f20900l;
        return Double.hashCode(this.f20910v) + wq1.m24106b(this.f20909u, wq1.m24106b(this.f20908t, wq1.m24106b(this.f20907s, wq1.m24106b(this.f20906r, wq1.m24106b(this.f20905q, wq1.m24106b(this.f20904p, g9a.m12424a(this.f20903o, wq1.m24106b(this.f20902n, wq1.m24106b(this.f20901m, (iM24106b + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultLanguageProgress(writtenWordsGoal=");
        sb.append(this.f20889a);
        sb.append(", speakingTimeGoal=");
        sb.append(this.f20890b);
        sb.append(", totalWordsKnown=");
        sb.append(this.f20891c);
        sb.append(", readWords=");
        sb.append(this.f20892d);
        sb.append(", totalCards=");
        sb.append(this.f20893e);
        wq1.m24127w(this.f20894f, this.f20895g, ", activityIndex=", ", knownWordsGoal=", sb);
        hn1.m13370t(sb, ", listeningTimeGoal=", this.f20896h, ", speakingTime=");
        sb.append(this.f20897i);
        sb.append(", cardsCreatedGoal=");
        sb.append(this.f20898j);
        sb.append(", knownWords=");
        sb.append(this.f20899k);
        sb.append(", intervals=");
        sb.append(this.f20900l);
        wq1.m24127w(this.f20901m, this.f20902n, ", cardsCreated=", ", readWordsGoal=", sb);
        hn1.m13370t(sb, ", listeningTime=", this.f20903o, ", cardsLearned=");
        hn1.m13360j(this.f20904p, this.f20905q, ", writtenWords=", ", cardsLearnedGoal=", sb);
        hn1.m13360j(this.f20906r, this.f20907s, ", earnedCoins=", ", earnedCoinsGoal=", sb);
        hn1.m13360j(this.f20908t, this.f20909u, ", wpm=", ", studyTime=", sb);
        sb.append(this.f20910v);
        sb.append(")");
        return sb.toString();
    }
}

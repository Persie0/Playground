package com.lingq.core.network.api.result;

import p000.e65;
import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLanguageStats {
    public static final C1740u1 Companion = new C1740u1();

    /* JADX INFO: renamed from: a */
    public final ResultLanguageStatValue f20916a;

    /* JADX INFO: renamed from: b */
    public final ResultLanguageStatValue f20917b;

    /* JADX INFO: renamed from: c */
    public final ResultLanguageStatValue f20918c;

    /* JADX INFO: renamed from: d */
    public final ResultLanguageStatValue f20919d;

    /* JADX INFO: renamed from: e */
    public final ResultLanguageStatValue f20920e;

    /* JADX INFO: renamed from: f */
    public final ResultLanguageStatValue f20921f;

    /* JADX INFO: renamed from: g */
    public final ResultLanguageStatValue f20922g;

    /* JADX INFO: renamed from: h */
    public final ResultLanguageStatValue f20923h;

    /* JADX INFO: renamed from: i */
    public final ResultLanguageStatValue f20924i;

    /* JADX INFO: renamed from: j */
    public final ResultLanguageStatValue f20925j;

    /* JADX INFO: renamed from: k */
    public final ResultLanguageStatValue f20926k;

    /* JADX INFO: renamed from: l */
    public final ResultLanguageStatValue f20927l;

    /* JADX INFO: renamed from: m */
    public final ResultLanguageStatValue f20928m;

    /* JADX INFO: renamed from: n */
    public final ResultLanguageStatValue f20929n;

    /* JADX INFO: renamed from: o */
    public final ResultLanguageStatValue f20930o;

    /* JADX INFO: renamed from: p */
    public final ResultLanguageStatValue f20931p;

    /* JADX INFO: renamed from: q */
    public final ResultLanguageStatValue f20932q;

    /* JADX INFO: renamed from: r */
    public final ResultLanguageStatValue f20933r;

    /* JADX INFO: renamed from: s */
    public final ResultLanguageStatValue f20934s;

    /* JADX INFO: renamed from: t */
    public final ResultLanguageStatValue f20935t;

    /* JADX INFO: renamed from: u */
    public final ResultLanguageStatValue f20936u;

    /* JADX INFO: renamed from: v */
    public final ResultLanguageStatValue f20937v;

    /* JADX INFO: renamed from: w */
    public final ResultLanguageStatValue f20938w;

    /* JADX INFO: renamed from: x */
    public final ResultLanguageStatValue f20939x;

    /* JADX INFO: renamed from: y */
    public final ResultLanguageStatValue f20940y;

    public /* synthetic */ ResultLanguageStats(int i, ResultLanguageStatValue resultLanguageStatValue, ResultLanguageStatValue resultLanguageStatValue2, ResultLanguageStatValue resultLanguageStatValue3, ResultLanguageStatValue resultLanguageStatValue4, ResultLanguageStatValue resultLanguageStatValue5, ResultLanguageStatValue resultLanguageStatValue6, ResultLanguageStatValue resultLanguageStatValue7, ResultLanguageStatValue resultLanguageStatValue8, ResultLanguageStatValue resultLanguageStatValue9, ResultLanguageStatValue resultLanguageStatValue10, ResultLanguageStatValue resultLanguageStatValue11, ResultLanguageStatValue resultLanguageStatValue12, ResultLanguageStatValue resultLanguageStatValue13, ResultLanguageStatValue resultLanguageStatValue14, ResultLanguageStatValue resultLanguageStatValue15, ResultLanguageStatValue resultLanguageStatValue16, ResultLanguageStatValue resultLanguageStatValue17, ResultLanguageStatValue resultLanguageStatValue18, ResultLanguageStatValue resultLanguageStatValue19, ResultLanguageStatValue resultLanguageStatValue20, ResultLanguageStatValue resultLanguageStatValue21, ResultLanguageStatValue resultLanguageStatValue22, ResultLanguageStatValue resultLanguageStatValue23, ResultLanguageStatValue resultLanguageStatValue24, ResultLanguageStatValue resultLanguageStatValue25) {
        this.f20916a = (i & 1) == 0 ? new ResultLanguageStatValue() : resultLanguageStatValue;
        if ((i & 2) == 0) {
            this.f20917b = new ResultLanguageStatValue();
        } else {
            this.f20917b = resultLanguageStatValue2;
        }
        if ((i & 4) == 0) {
            this.f20918c = new ResultLanguageStatValue();
        } else {
            this.f20918c = resultLanguageStatValue3;
        }
        if ((i & 8) == 0) {
            this.f20919d = new ResultLanguageStatValue();
        } else {
            this.f20919d = resultLanguageStatValue4;
        }
        if ((i & 16) == 0) {
            this.f20920e = new ResultLanguageStatValue();
        } else {
            this.f20920e = resultLanguageStatValue5;
        }
        if ((i & 32) == 0) {
            this.f20921f = new ResultLanguageStatValue();
        } else {
            this.f20921f = resultLanguageStatValue6;
        }
        if ((i & 64) == 0) {
            this.f20922g = new ResultLanguageStatValue();
        } else {
            this.f20922g = resultLanguageStatValue7;
        }
        if ((i & 128) == 0) {
            this.f20923h = new ResultLanguageStatValue();
        } else {
            this.f20923h = resultLanguageStatValue8;
        }
        if ((i & 256) == 0) {
            this.f20924i = new ResultLanguageStatValue();
        } else {
            this.f20924i = resultLanguageStatValue9;
        }
        if ((i & 512) == 0) {
            this.f20925j = new ResultLanguageStatValue();
        } else {
            this.f20925j = resultLanguageStatValue10;
        }
        if ((i & 1024) == 0) {
            this.f20926k = new ResultLanguageStatValue();
        } else {
            this.f20926k = resultLanguageStatValue11;
        }
        if ((i & 2048) == 0) {
            this.f20927l = new ResultLanguageStatValue();
        } else {
            this.f20927l = resultLanguageStatValue12;
        }
        if ((i & 4096) == 0) {
            this.f20928m = new ResultLanguageStatValue();
        } else {
            this.f20928m = resultLanguageStatValue13;
        }
        this.f20929n = (i & 8192) == 0 ? new ResultLanguageStatValue() : resultLanguageStatValue14;
        this.f20930o = (i & 16384) == 0 ? new ResultLanguageStatValue() : resultLanguageStatValue15;
        this.f20931p = (32768 & i) == 0 ? new ResultLanguageStatValue() : resultLanguageStatValue16;
        this.f20932q = (65536 & i) == 0 ? new ResultLanguageStatValue() : resultLanguageStatValue17;
        this.f20933r = (131072 & i) == 0 ? new ResultLanguageStatValue() : resultLanguageStatValue18;
        this.f20934s = (262144 & i) == 0 ? new ResultLanguageStatValue() : resultLanguageStatValue19;
        this.f20935t = (524288 & i) == 0 ? new ResultLanguageStatValue() : resultLanguageStatValue20;
        this.f20936u = (1048576 & i) == 0 ? new ResultLanguageStatValue() : resultLanguageStatValue21;
        this.f20937v = (2097152 & i) == 0 ? new ResultLanguageStatValue() : resultLanguageStatValue22;
        this.f20938w = (4194304 & i) == 0 ? new ResultLanguageStatValue() : resultLanguageStatValue23;
        this.f20939x = (8388608 & i) == 0 ? new ResultLanguageStatValue() : resultLanguageStatValue24;
        this.f20940y = (i & 16777216) == 0 ? new ResultLanguageStatValue() : resultLanguageStatValue25;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLanguageStats)) {
            return false;
        }
        ResultLanguageStats resultLanguageStats = (ResultLanguageStats) obj;
        return fa4.m11650l(this.f20916a, resultLanguageStats.f20916a) && fa4.m11650l(this.f20917b, resultLanguageStats.f20917b) && fa4.m11650l(this.f20918c, resultLanguageStats.f20918c) && fa4.m11650l(this.f20919d, resultLanguageStats.f20919d) && fa4.m11650l(this.f20920e, resultLanguageStats.f20920e) && fa4.m11650l(this.f20921f, resultLanguageStats.f20921f) && fa4.m11650l(this.f20922g, resultLanguageStats.f20922g) && fa4.m11650l(this.f20923h, resultLanguageStats.f20923h) && fa4.m11650l(this.f20924i, resultLanguageStats.f20924i) && fa4.m11650l(this.f20925j, resultLanguageStats.f20925j) && fa4.m11650l(this.f20926k, resultLanguageStats.f20926k) && fa4.m11650l(this.f20927l, resultLanguageStats.f20927l) && fa4.m11650l(this.f20928m, resultLanguageStats.f20928m) && fa4.m11650l(this.f20929n, resultLanguageStats.f20929n) && fa4.m11650l(this.f20930o, resultLanguageStats.f20930o) && fa4.m11650l(this.f20931p, resultLanguageStats.f20931p) && fa4.m11650l(this.f20932q, resultLanguageStats.f20932q) && fa4.m11650l(this.f20933r, resultLanguageStats.f20933r) && fa4.m11650l(this.f20934s, resultLanguageStats.f20934s) && fa4.m11650l(this.f20935t, resultLanguageStats.f20935t) && fa4.m11650l(this.f20936u, resultLanguageStats.f20936u) && fa4.m11650l(this.f20937v, resultLanguageStats.f20937v) && fa4.m11650l(this.f20938w, resultLanguageStats.f20938w) && fa4.m11650l(this.f20939x, resultLanguageStats.f20939x) && fa4.m11650l(this.f20940y, resultLanguageStats.f20940y);
    }

    public final int hashCode() {
        return this.f20940y.hashCode() + e65.m10870b(this.f20939x, e65.m10870b(this.f20938w, e65.m10870b(this.f20937v, e65.m10870b(this.f20936u, e65.m10870b(this.f20935t, e65.m10870b(this.f20934s, e65.m10870b(this.f20933r, e65.m10870b(this.f20932q, e65.m10870b(this.f20931p, e65.m10870b(this.f20930o, e65.m10870b(this.f20929n, e65.m10870b(this.f20928m, e65.m10870b(this.f20927l, e65.m10870b(this.f20926k, e65.m10870b(this.f20925j, e65.m10870b(this.f20924i, e65.m10870b(this.f20923h, e65.m10870b(this.f20922g, e65.m10870b(this.f20921f, e65.m10870b(this.f20920e, e65.m10870b(this.f20919d, e65.m10870b(this.f20918c, e65.m10870b(this.f20917b, this.f20916a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ResultLanguageStats(lessonCompleted=" + this.f20916a + ", speakingUsage=" + this.f20917b + ", coinsWords=" + this.f20918c + ", lessonShared=" + this.f20919d + ", translationsShared=" + this.f20920e + ", lessonPublished=" + this.f20921f + ", studyTime=" + this.f20922g + ", wpm=" + this.f20923h + ", lessonTaken=" + this.f20924i + ", translationsCreated=" + this.f20925j + ", learnedWords=" + this.f20926k + ", readingUsage=" + this.f20927l + ", listening=" + this.f20928m + ", earnedCoins=" + this.f20929n + ", coinsRead=" + this.f20930o + ", reviewUsage=" + this.f20931p + ", listeningUsage=" + this.f20932q + ", writing=" + this.f20933r + ", createdLingQs=" + this.f20934s + ", knownWords=" + this.f20935t + ", lessonImported=" + this.f20936u + ", translationsUsed=" + this.f20937v + ", reading=" + this.f20938w + ", coinsListen=" + this.f20939x + ", speaking=" + this.f20940y + ")";
    }
}

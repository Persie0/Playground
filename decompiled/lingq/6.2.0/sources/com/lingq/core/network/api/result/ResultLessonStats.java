package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLessonStats {
    public static final C1645e2 Companion = new C1645e2();

    /* JADX INFO: renamed from: a */
    public final Double f21111a;

    /* JADX INFO: renamed from: b */
    public final Double f21112b;

    /* JADX INFO: renamed from: c */
    public final Double f21113c;

    /* JADX INFO: renamed from: d */
    public final Double f21114d;

    /* JADX INFO: renamed from: e */
    public final Double f21115e;

    /* JADX INFO: renamed from: f */
    public final Double f21116f;

    /* JADX INFO: renamed from: g */
    public final Double f21117g;

    /* JADX INFO: renamed from: h */
    public final Double f21118h;

    public /* synthetic */ ResultLessonStats(int i, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8) {
        if ((i & 1) == 0) {
            this.f21111a = null;
        } else {
            this.f21111a = d;
        }
        if ((i & 2) == 0) {
            this.f21112b = null;
        } else {
            this.f21112b = d2;
        }
        if ((i & 4) == 0) {
            this.f21113c = null;
        } else {
            this.f21113c = d3;
        }
        if ((i & 8) == 0) {
            this.f21114d = null;
        } else {
            this.f21114d = d4;
        }
        if ((i & 16) == 0) {
            this.f21115e = null;
        } else {
            this.f21115e = d5;
        }
        if ((i & 32) == 0) {
            this.f21116f = null;
        } else {
            this.f21116f = d6;
        }
        if ((i & 64) == 0) {
            this.f21117g = null;
        } else {
            this.f21117g = d7;
        }
        if ((i & 128) == 0) {
            this.f21118h = null;
        } else {
            this.f21118h = d8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLessonStats)) {
            return false;
        }
        ResultLessonStats resultLessonStats = (ResultLessonStats) obj;
        return fa4.m11650l(this.f21111a, resultLessonStats.f21111a) && fa4.m11650l(this.f21112b, resultLessonStats.f21112b) && fa4.m11650l(this.f21113c, resultLessonStats.f21113c) && fa4.m11650l(this.f21114d, resultLessonStats.f21114d) && fa4.m11650l(this.f21115e, resultLessonStats.f21115e) && fa4.m11650l(this.f21116f, resultLessonStats.f21116f) && fa4.m11650l(this.f21117g, resultLessonStats.f21117g) && fa4.m11650l(this.f21118h, resultLessonStats.f21118h);
    }

    public final int hashCode() {
        Double d = this.f21111a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.f21112b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f21113c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f21114d;
        int iHashCode4 = (iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f21115e;
        int iHashCode5 = (iHashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f21116f;
        int iHashCode6 = (iHashCode5 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.f21117g;
        int iHashCode7 = (iHashCode6 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.f21118h;
        return iHashCode7 + (d8 != null ? d8.hashCode() : 0);
    }

    public final String toString() {
        return "ResultLessonStats(readWords=" + this.f21111a + ", lingqsCreated=" + this.f21112b + ", knownWords=" + this.f21113c + ", listeningTime=" + this.f21114d + ", coinsNew=" + this.f21115e + ", earnedCoins=" + this.f21116f + ", studyTime=" + this.f21117g + ", wpm=" + this.f21118h + ")";
    }
}

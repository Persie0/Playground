package com.lingq.core.network.api.result;

import p000.e65;
import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class JoinedChallengeStats {
    public static final C1666i Companion = new C1666i();

    /* JADX INFO: renamed from: a */
    public final Double f20533a;

    /* JADX INFO: renamed from: b */
    public final Double f20534b;

    /* JADX INFO: renamed from: c */
    public final Integer f20535c;

    /* JADX INFO: renamed from: d */
    public final Integer f20536d;

    /* JADX INFO: renamed from: e */
    public final Integer f20537e;

    /* JADX INFO: renamed from: f */
    public final Integer f20538f;

    /* JADX INFO: renamed from: g */
    public final Integer f20539g;

    /* JADX INFO: renamed from: h */
    public final Integer f20540h;

    /* JADX INFO: renamed from: i */
    public final Integer f20541i;

    /* JADX INFO: renamed from: j */
    public final Integer f20542j;

    /* JADX INFO: renamed from: k */
    public final Integer f20543k;

    /* JADX INFO: renamed from: l */
    public final Integer f20544l;

    /* JADX INFO: renamed from: m */
    public final Integer f20545m;

    /* JADX INFO: renamed from: n */
    public final Integer f20546n;

    /* JADX INFO: renamed from: o */
    public final Integer f20547o;

    /* JADX INFO: renamed from: p */
    public final Integer f20548p;

    /* JADX INFO: renamed from: q */
    public final Double f20549q;

    /* JADX INFO: renamed from: r */
    public final Double f20550r;

    /* JADX INFO: renamed from: s */
    public final Integer f20551s;

    /* JADX INFO: renamed from: t */
    public final Integer f20552t;

    public /* synthetic */ JoinedChallengeStats(int i, Double d, Double d2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Double d3, Double d4, Integer num15, Integer num16) {
        if ((i & 1) == 0) {
            this.f20533a = null;
        } else {
            this.f20533a = d;
        }
        if ((i & 2) == 0) {
            this.f20534b = null;
        } else {
            this.f20534b = d2;
        }
        if ((i & 4) == 0) {
            this.f20535c = null;
        } else {
            this.f20535c = num;
        }
        if ((i & 8) == 0) {
            this.f20536d = null;
        } else {
            this.f20536d = num2;
        }
        if ((i & 16) == 0) {
            this.f20537e = null;
        } else {
            this.f20537e = num3;
        }
        if ((i & 32) == 0) {
            this.f20538f = null;
        } else {
            this.f20538f = num4;
        }
        if ((i & 64) == 0) {
            this.f20539g = null;
        } else {
            this.f20539g = num5;
        }
        if ((i & 128) == 0) {
            this.f20540h = null;
        } else {
            this.f20540h = num6;
        }
        if ((i & 256) == 0) {
            this.f20541i = null;
        } else {
            this.f20541i = num7;
        }
        if ((i & 512) == 0) {
            this.f20542j = null;
        } else {
            this.f20542j = num8;
        }
        if ((i & 1024) == 0) {
            this.f20543k = null;
        } else {
            this.f20543k = num9;
        }
        if ((i & 2048) == 0) {
            this.f20544l = null;
        } else {
            this.f20544l = num10;
        }
        if ((i & 4096) == 0) {
            this.f20545m = null;
        } else {
            this.f20545m = num11;
        }
        if ((i & 8192) == 0) {
            this.f20546n = null;
        } else {
            this.f20546n = num12;
        }
        if ((i & 16384) == 0) {
            this.f20547o = null;
        } else {
            this.f20547o = num13;
        }
        if ((32768 & i) == 0) {
            this.f20548p = null;
        } else {
            this.f20548p = num14;
        }
        if ((65536 & i) == 0) {
            this.f20549q = null;
        } else {
            this.f20549q = d3;
        }
        if ((131072 & i) == 0) {
            this.f20550r = null;
        } else {
            this.f20550r = d4;
        }
        if ((262144 & i) == 0) {
            this.f20551s = null;
        } else {
            this.f20551s = num15;
        }
        if ((i & 524288) == 0) {
            this.f20552t = null;
        } else {
            this.f20552t = num16;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Integer m8284a() {
        return this.f20547o;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m8285b() {
        return this.f20548p;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m8286c() {
        return this.f20551s;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m8287d() {
        return this.f20552t;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m8288e() {
        return this.f20543k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinedChallengeStats)) {
            return false;
        }
        JoinedChallengeStats joinedChallengeStats = (JoinedChallengeStats) obj;
        return fa4.m11650l(this.f20533a, joinedChallengeStats.f20533a) && fa4.m11650l(this.f20534b, joinedChallengeStats.f20534b) && fa4.m11650l(this.f20535c, joinedChallengeStats.f20535c) && fa4.m11650l(this.f20536d, joinedChallengeStats.f20536d) && fa4.m11650l(this.f20537e, joinedChallengeStats.f20537e) && fa4.m11650l(this.f20538f, joinedChallengeStats.f20538f) && fa4.m11650l(this.f20539g, joinedChallengeStats.f20539g) && fa4.m11650l(this.f20540h, joinedChallengeStats.f20540h) && fa4.m11650l(this.f20541i, joinedChallengeStats.f20541i) && fa4.m11650l(this.f20542j, joinedChallengeStats.f20542j) && fa4.m11650l(this.f20543k, joinedChallengeStats.f20543k) && fa4.m11650l(this.f20544l, joinedChallengeStats.f20544l) && fa4.m11650l(this.f20545m, joinedChallengeStats.f20545m) && fa4.m11650l(this.f20546n, joinedChallengeStats.f20546n) && fa4.m11650l(this.f20547o, joinedChallengeStats.f20547o) && fa4.m11650l(this.f20548p, joinedChallengeStats.f20548p) && fa4.m11650l(this.f20549q, joinedChallengeStats.f20549q) && fa4.m11650l(this.f20550r, joinedChallengeStats.f20550r) && fa4.m11650l(this.f20551s, joinedChallengeStats.f20551s) && fa4.m11650l(this.f20552t, joinedChallengeStats.f20552t);
    }

    /* JADX INFO: renamed from: f */
    public final Integer m8289f() {
        return this.f20544l;
    }

    /* JADX INFO: renamed from: g */
    public final Integer m8290g() {
        return this.f20535c;
    }

    /* JADX INFO: renamed from: h */
    public final Integer m8291h() {
        return this.f20536d;
    }

    public final int hashCode() {
        Double d = this.f20533a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.f20534b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.f20535c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f20536d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f20537e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f20538f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f20539g;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f20540h;
        int iHashCode8 = (iHashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f20541i;
        int iHashCode9 = (iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f20542j;
        int iHashCode10 = (iHashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f20543k;
        int iHashCode11 = (iHashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.f20544l;
        int iHashCode12 = (iHashCode11 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.f20545m;
        int iHashCode13 = (iHashCode12 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.f20546n;
        int iHashCode14 = (iHashCode13 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.f20547o;
        int iHashCode15 = (iHashCode14 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.f20548p;
        int iHashCode16 = (iHashCode15 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Double d3 = this.f20549q;
        int iHashCode17 = (iHashCode16 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f20550r;
        int iHashCode18 = (iHashCode17 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num15 = this.f20551s;
        int iHashCode19 = (iHashCode18 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.f20552t;
        return iHashCode19 + (num16 != null ? num16.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final Integer m8292i() {
        return this.f20541i;
    }

    /* JADX INFO: renamed from: j */
    public final Integer m8293j() {
        return this.f20542j;
    }

    /* JADX INFO: renamed from: k */
    public final Double m8294k() {
        return this.f20549q;
    }

    /* JADX INFO: renamed from: l */
    public final Double m8295l() {
        return this.f20550r;
    }

    /* JADX INFO: renamed from: m */
    public final Integer m8296m() {
        return this.f20539g;
    }

    /* JADX INFO: renamed from: n */
    public final Integer m8297n() {
        return this.f20540h;
    }

    /* JADX INFO: renamed from: o */
    public final Double m8298o() {
        return this.f20534b;
    }

    /* JADX INFO: renamed from: p */
    public final Double m8299p() {
        return this.f20533a;
    }

    /* JADX INFO: renamed from: q */
    public final Integer m8300q() {
        return this.f20545m;
    }

    /* JADX INFO: renamed from: r */
    public final Integer m8301r() {
        return this.f20546n;
    }

    /* JADX INFO: renamed from: s */
    public final Integer m8302s() {
        return this.f20537e;
    }

    /* JADX INFO: renamed from: t */
    public final Integer m8303t() {
        return this.f20538f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinedChallengeStats(readProgressGoal=");
        sb.append(this.f20533a);
        sb.append(", readProgress=");
        sb.append(this.f20534b);
        sb.append(", knownWords=");
        e65.m10883o(sb, this.f20535c, ", knownWordsGoal=", this.f20536d, ", wordsEarnedCoins=");
        e65.m10883o(sb, this.f20537e, ", wordsEarnedCoinsGoal=", this.f20538f, ", readEarnedCoins=");
        e65.m10883o(sb, this.f20539g, ", readEarnedCoinsGoal=", this.f20540h, ", listenEarnedCoins=");
        e65.m10883o(sb, this.f20541i, ", listenEarnedCoinsGoal=", this.f20542j, ", earnedCoins=");
        e65.m10883o(sb, this.f20543k, ", earnedCoinsGoal=", this.f20544l, ", readWords=");
        e65.m10883o(sb, this.f20545m, ", readWordsGoal=", this.f20546n, ", cardsCreated=");
        e65.m10883o(sb, this.f20547o, ", cardsCreatedGoal=", this.f20548p, ", listeningTime=");
        sb.append(this.f20549q);
        sb.append(", listeningTimeGoal=");
        sb.append(this.f20550r);
        sb.append(", cardsLearned=");
        sb.append(this.f20551s);
        sb.append(", cardsLearnedGoal=");
        sb.append(this.f20552t);
        sb.append(")");
        return sb.toString();
    }
}

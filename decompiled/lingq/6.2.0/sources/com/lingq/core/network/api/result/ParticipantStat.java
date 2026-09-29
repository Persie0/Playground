package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.tx5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ParticipantStat {
    public static final C1702o Companion = new C1702o();

    /* JADX INFO: renamed from: w */
    public static final cs4[] f20573w = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new tx5(16)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final Target f20574a;

    /* JADX INFO: renamed from: b */
    public final List f20575b;

    /* JADX INFO: renamed from: c */
    public final Double f20576c;

    /* JADX INFO: renamed from: d */
    public final Double f20577d;

    /* JADX INFO: renamed from: e */
    public final Integer f20578e;

    /* JADX INFO: renamed from: f */
    public final Integer f20579f;

    /* JADX INFO: renamed from: g */
    public final Integer f20580g;

    /* JADX INFO: renamed from: h */
    public final Integer f20581h;

    /* JADX INFO: renamed from: i */
    public final Integer f20582i;

    /* JADX INFO: renamed from: j */
    public final Integer f20583j;

    /* JADX INFO: renamed from: k */
    public final Integer f20584k;

    /* JADX INFO: renamed from: l */
    public final Integer f20585l;

    /* JADX INFO: renamed from: m */
    public final Integer f20586m;

    /* JADX INFO: renamed from: n */
    public final Integer f20587n;

    /* JADX INFO: renamed from: o */
    public final Integer f20588o;

    /* JADX INFO: renamed from: p */
    public final Integer f20589p;

    /* JADX INFO: renamed from: q */
    public final Integer f20590q;

    /* JADX INFO: renamed from: r */
    public final Integer f20591r;

    /* JADX INFO: renamed from: s */
    public final Double f20592s;

    /* JADX INFO: renamed from: t */
    public final Double f20593t;

    /* JADX INFO: renamed from: u */
    public final Integer f20594u;

    /* JADX INFO: renamed from: v */
    public final Integer f20595v;

    public /* synthetic */ ParticipantStat(int i, Target target, List list, Double d, Double d2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Double d3, Double d4, Integer num15, Integer num16) {
        this.f20574a = (i & 1) == 0 ? new Target() : target;
        if ((i & 2) == 0) {
            this.f20575b = EmptyList.f47638a;
        } else {
            this.f20575b = list;
        }
        if ((i & 4) == 0) {
            this.f20576c = null;
        } else {
            this.f20576c = d;
        }
        if ((i & 8) == 0) {
            this.f20577d = null;
        } else {
            this.f20577d = d2;
        }
        if ((i & 16) == 0) {
            this.f20578e = null;
        } else {
            this.f20578e = num;
        }
        if ((i & 32) == 0) {
            this.f20579f = null;
        } else {
            this.f20579f = num2;
        }
        if ((i & 64) == 0) {
            this.f20580g = null;
        } else {
            this.f20580g = num3;
        }
        if ((i & 128) == 0) {
            this.f20581h = null;
        } else {
            this.f20581h = num4;
        }
        if ((i & 256) == 0) {
            this.f20582i = null;
        } else {
            this.f20582i = num5;
        }
        if ((i & 512) == 0) {
            this.f20583j = null;
        } else {
            this.f20583j = num6;
        }
        if ((i & 1024) == 0) {
            this.f20584k = null;
        } else {
            this.f20584k = num7;
        }
        if ((i & 2048) == 0) {
            this.f20585l = null;
        } else {
            this.f20585l = num8;
        }
        if ((i & 4096) == 0) {
            this.f20586m = null;
        } else {
            this.f20586m = num9;
        }
        if ((i & 8192) == 0) {
            this.f20587n = null;
        } else {
            this.f20587n = num10;
        }
        if ((i & 16384) == 0) {
            this.f20588o = null;
        } else {
            this.f20588o = num11;
        }
        if ((32768 & i) == 0) {
            this.f20589p = null;
        } else {
            this.f20589p = num12;
        }
        if ((65536 & i) == 0) {
            this.f20590q = null;
        } else {
            this.f20590q = num13;
        }
        if ((131072 & i) == 0) {
            this.f20591r = null;
        } else {
            this.f20591r = num14;
        }
        if ((262144 & i) == 0) {
            this.f20592s = null;
        } else {
            this.f20592s = d3;
        }
        if ((524288 & i) == 0) {
            this.f20593t = null;
        } else {
            this.f20593t = d4;
        }
        if ((1048576 & i) == 0) {
            this.f20594u = null;
        } else {
            this.f20594u = num15;
        }
        if ((i & 2097152) == 0) {
            this.f20595v = null;
        } else {
            this.f20595v = num16;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Integer m8308a() {
        return this.f20590q;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m8309b() {
        return this.f20591r;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m8310c() {
        return this.f20594u;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m8311d() {
        return this.f20595v;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m8312e() {
        return this.f20586m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParticipantStat)) {
            return false;
        }
        ParticipantStat participantStat = (ParticipantStat) obj;
        return fa4.m11650l(this.f20574a, participantStat.f20574a) && fa4.m11650l(this.f20575b, participantStat.f20575b) && fa4.m11650l(this.f20576c, participantStat.f20576c) && fa4.m11650l(this.f20577d, participantStat.f20577d) && fa4.m11650l(this.f20578e, participantStat.f20578e) && fa4.m11650l(this.f20579f, participantStat.f20579f) && fa4.m11650l(this.f20580g, participantStat.f20580g) && fa4.m11650l(this.f20581h, participantStat.f20581h) && fa4.m11650l(this.f20582i, participantStat.f20582i) && fa4.m11650l(this.f20583j, participantStat.f20583j) && fa4.m11650l(this.f20584k, participantStat.f20584k) && fa4.m11650l(this.f20585l, participantStat.f20585l) && fa4.m11650l(this.f20586m, participantStat.f20586m) && fa4.m11650l(this.f20587n, participantStat.f20587n) && fa4.m11650l(this.f20588o, participantStat.f20588o) && fa4.m11650l(this.f20589p, participantStat.f20589p) && fa4.m11650l(this.f20590q, participantStat.f20590q) && fa4.m11650l(this.f20591r, participantStat.f20591r) && fa4.m11650l(this.f20592s, participantStat.f20592s) && fa4.m11650l(this.f20593t, participantStat.f20593t) && fa4.m11650l(this.f20594u, participantStat.f20594u) && fa4.m11650l(this.f20595v, participantStat.f20595v);
    }

    /* JADX INFO: renamed from: f */
    public final Integer m8313f() {
        return this.f20587n;
    }

    /* JADX INFO: renamed from: g */
    public final Integer m8314g() {
        return this.f20578e;
    }

    /* JADX INFO: renamed from: h */
    public final Integer m8315h() {
        return this.f20579f;
    }

    public final int hashCode() {
        Target target = this.f20574a;
        int iHashCode = (target == null ? 0 : target.hashCode()) * 31;
        List list = this.f20575b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Double d = this.f20576c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f20577d;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.f20578e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f20579f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f20580g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f20581h;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f20582i;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f20583j;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f20584k;
        int iHashCode11 = (iHashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f20585l;
        int iHashCode12 = (iHashCode11 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f20586m;
        int iHashCode13 = (iHashCode12 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.f20587n;
        int iHashCode14 = (iHashCode13 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.f20588o;
        int iHashCode15 = (iHashCode14 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.f20589p;
        int iHashCode16 = (iHashCode15 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.f20590q;
        int iHashCode17 = (iHashCode16 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.f20591r;
        int iHashCode18 = (iHashCode17 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Double d3 = this.f20592s;
        int iHashCode19 = (iHashCode18 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f20593t;
        int iHashCode20 = (iHashCode19 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num15 = this.f20594u;
        int iHashCode21 = (iHashCode20 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.f20595v;
        return iHashCode21 + (num16 != null ? num16.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final Integer m8316i() {
        return this.f20584k;
    }

    /* JADX INFO: renamed from: j */
    public final Integer m8317j() {
        return this.f20585l;
    }

    /* JADX INFO: renamed from: k */
    public final Double m8318k() {
        return this.f20592s;
    }

    /* JADX INFO: renamed from: l */
    public final Double m8319l() {
        return this.f20593t;
    }

    /* JADX INFO: renamed from: m */
    public final Integer m8320m() {
        return this.f20582i;
    }

    /* JADX INFO: renamed from: n */
    public final Integer m8321n() {
        return this.f20583j;
    }

    /* JADX INFO: renamed from: o */
    public final Double m8322o() {
        return this.f20577d;
    }

    /* JADX INFO: renamed from: p */
    public final Double m8323p() {
        return this.f20576c;
    }

    /* JADX INFO: renamed from: q */
    public final Integer m8324q() {
        return this.f20588o;
    }

    /* JADX INFO: renamed from: r */
    public final Integer m8325r() {
        return this.f20589p;
    }

    /* JADX INFO: renamed from: s */
    public final List m8326s() {
        return this.f20575b;
    }

    /* JADX INFO: renamed from: t */
    public final Integer m8327t() {
        return this.f20580g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParticipantStat(hitTarget=");
        sb.append(this.f20574a);
        sb.append(", targets=");
        sb.append(this.f20575b);
        sb.append(", readProgressGoal=");
        sb.append(this.f20576c);
        sb.append(", readProgress=");
        sb.append(this.f20577d);
        sb.append(", knownWords=");
        e65.m10883o(sb, this.f20578e, ", knownWordsGoal=", this.f20579f, ", wordsEarnedCoins=");
        e65.m10883o(sb, this.f20580g, ", wordsEarnedCoinsGoal=", this.f20581h, ", readEarnedCoins=");
        e65.m10883o(sb, this.f20582i, ", readEarnedCoinsGoal=", this.f20583j, ", listenEarnedCoins=");
        e65.m10883o(sb, this.f20584k, ", listenEarnedCoinsGoal=", this.f20585l, ", earnedCoins=");
        e65.m10883o(sb, this.f20586m, ", earnedCoinsGoal=", this.f20587n, ", readWords=");
        e65.m10883o(sb, this.f20588o, ", readWordsGoal=", this.f20589p, ", cardsCreated=");
        e65.m10883o(sb, this.f20590q, ", cardsCreatedGoal=", this.f20591r, ", listeningTime=");
        sb.append(this.f20592s);
        sb.append(", listeningTimeGoal=");
        sb.append(this.f20593t);
        sb.append(", cardsLearned=");
        sb.append(this.f20594u);
        sb.append(", cardsLearnedGoal=");
        sb.append(this.f20595v);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final Integer m8328u() {
        return this.f20581h;
    }

    public ParticipantStat() {
        this.f20574a = new Target();
        this.f20575b = EmptyList.f47638a;
        this.f20576c = null;
        this.f20577d = null;
        this.f20578e = null;
        this.f20579f = null;
        this.f20580g = null;
        this.f20581h = null;
        this.f20582i = null;
        this.f20583j = null;
        this.f20584k = null;
        this.f20585l = null;
        this.f20586m = null;
        this.f20587n = null;
        this.f20588o = null;
        this.f20589p = null;
        this.f20590q = null;
        this.f20591r = null;
        this.f20592s = null;
        this.f20593t = null;
        this.f20594u = null;
        this.f20595v = null;
    }
}

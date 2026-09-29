package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultReferralStats {
    public static final C1694m3 Companion = new C1694m3();

    /* JADX INFO: renamed from: a */
    public final Integer f21476a;

    /* JADX INFO: renamed from: b */
    public final Integer f21477b;

    /* JADX INFO: renamed from: c */
    public final Integer f21478c;

    public /* synthetic */ ResultReferralStats(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f21476a = null;
        } else {
            this.f21476a = num;
        }
        if ((i & 2) == 0) {
            this.f21477b = null;
        } else {
            this.f21477b = num2;
        }
        if ((i & 4) == 0) {
            this.f21478c = null;
        } else {
            this.f21478c = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultReferralStats)) {
            return false;
        }
        ResultReferralStats resultReferralStats = (ResultReferralStats) obj;
        return fa4.m11650l(this.f21476a, resultReferralStats.f21476a) && fa4.m11650l(this.f21477b, resultReferralStats.f21477b) && fa4.m11650l(this.f21478c, resultReferralStats.f21478c);
    }

    public final int hashCode() {
        Integer num = this.f21476a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f21477b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f21478c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "ResultReferralStats(earnedPoints=" + this.f21476a + ", lastMonthPoints=" + this.f21477b + ", referralsCount=" + this.f21478c + ")";
    }
}

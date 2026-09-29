package com.lingq.core.network.api.result.worldcup;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupContributor {
    public static final C1761f Companion = new C1761f();

    /* JADX INFO: renamed from: a */
    public final int f21760a;

    /* JADX INFO: renamed from: b */
    public final Integer f21761b;

    /* JADX INFO: renamed from: c */
    public final Integer f21762c;

    /* JADX INFO: renamed from: d */
    public final ResultCupContributorProfile f21763d;

    /* JADX INFO: renamed from: e */
    public final String f21764e;

    /* JADX INFO: renamed from: f */
    public final int f21765f;

    public /* synthetic */ ResultCupContributor(int i, int i2, Integer num, Integer num2, ResultCupContributorProfile resultCupContributorProfile, String str, int i3) {
        if ((i & 1) == 0) {
            this.f21760a = 0;
        } else {
            this.f21760a = i2;
        }
        if ((i & 2) == 0) {
            this.f21761b = null;
        } else {
            this.f21761b = num;
        }
        if ((i & 4) == 0) {
            this.f21762c = null;
        } else {
            this.f21762c = num2;
        }
        if ((i & 8) == 0) {
            this.f21763d = new ResultCupContributorProfile();
        } else {
            this.f21763d = resultCupContributorProfile;
        }
        if ((i & 16) == 0) {
            this.f21764e = "";
        } else {
            this.f21764e = str;
        }
        if ((i & 32) == 0) {
            this.f21765f = 0;
        } else {
            this.f21765f = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupContributor)) {
            return false;
        }
        ResultCupContributor resultCupContributor = (ResultCupContributor) obj;
        return this.f21760a == resultCupContributor.f21760a && fa4.m11650l(this.f21761b, resultCupContributor.f21761b) && fa4.m11650l(this.f21762c, resultCupContributor.f21762c) && fa4.m11650l(this.f21763d, resultCupContributor.f21763d) && fa4.m11650l(this.f21764e, resultCupContributor.f21764e) && this.f21765f == resultCupContributor.f21765f;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f21760a) * 31;
        Integer num = this.f21761b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f21762c;
        return Integer.hashCode(this.f21765f) + ux5.m22980c((this.f21763d.hashCode() + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31, this.f21764e, 31);
    }

    public final String toString() {
        return "ResultCupContributor(rank=" + this.f21760a + ", prevRank=" + this.f21761b + ", delta=" + this.f21762c + ", profile=" + this.f21763d + ", team=" + this.f21764e + ", score=" + this.f21765f + ")";
    }
}

package com.lingq.core.network.api.result.worldcup;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultCupToday {
    public static final C1774s Companion = new C1774s();

    /* JADX INFO: renamed from: a */
    public final String f21826a;

    /* JADX INFO: renamed from: b */
    public final ResultCupPrize f21827b;

    /* JADX INFO: renamed from: c */
    public final ResultCupClaimState f21828c;

    public /* synthetic */ ResultCupToday(int i, String str, ResultCupPrize resultCupPrize, ResultCupClaimState resultCupClaimState) {
        this.f21826a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f21827b = null;
        } else {
            this.f21827b = resultCupPrize;
        }
        if ((i & 4) == 0) {
            this.f21828c = null;
        } else {
            this.f21828c = resultCupClaimState;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupToday)) {
            return false;
        }
        ResultCupToday resultCupToday = (ResultCupToday) obj;
        return fa4.m11650l(this.f21826a, resultCupToday.f21826a) && fa4.m11650l(this.f21827b, resultCupToday.f21827b) && fa4.m11650l(this.f21828c, resultCupToday.f21828c);
    }

    public final int hashCode() {
        int iHashCode = this.f21826a.hashCode() * 31;
        ResultCupPrize resultCupPrize = this.f21827b;
        int iHashCode2 = (iHashCode + (resultCupPrize == null ? 0 : resultCupPrize.hashCode())) * 31;
        ResultCupClaimState resultCupClaimState = this.f21828c;
        return iHashCode2 + (resultCupClaimState != null ? resultCupClaimState.hashCode() : 0);
    }

    public final String toString() {
        return "ResultCupToday(date=" + this.f21826a + ", prize=" + this.f21827b + ", claim=" + this.f21828c + ")";
    }
}

package com.lingq.core.network.api.result.worldcup;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupMeSummary {
    public static final C1766k Companion = new C1766k();

    /* JADX INFO: renamed from: a */
    public final Integer f21778a;

    /* JADX INFO: renamed from: b */
    public final int f21779b;

    public /* synthetic */ ResultCupMeSummary(int i, int i2, Integer num) {
        this.f21778a = (i & 1) == 0 ? null : num;
        if ((i & 2) == 0) {
            this.f21779b = 0;
        } else {
            this.f21779b = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupMeSummary)) {
            return false;
        }
        ResultCupMeSummary resultCupMeSummary = (ResultCupMeSummary) obj;
        return fa4.m11650l(this.f21778a, resultCupMeSummary.f21778a) && this.f21779b == resultCupMeSummary.f21779b;
    }

    public final int hashCode() {
        Integer num = this.f21778a;
        return Integer.hashCode(this.f21779b) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "ResultCupMeSummary(rank=" + this.f21778a + ", score=" + this.f21779b + ")";
    }
}

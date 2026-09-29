package com.lingq.core.network.api.result;

import p000.ey8;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultMilestoneStats {
    public static final C1735t2 Companion = new C1735t2();

    /* JADX INFO: renamed from: a */
    public int f21330a;

    /* JADX INFO: renamed from: b */
    public int f21331b;

    /* JADX INFO: renamed from: c */
    public int f21332c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultMilestoneStats)) {
            return false;
        }
        ResultMilestoneStats resultMilestoneStats = (ResultMilestoneStats) obj;
        return this.f21330a == resultMilestoneStats.f21330a && this.f21331b == resultMilestoneStats.f21331b && this.f21332c == resultMilestoneStats.f21332c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21332c) + wq1.m24106b(this.f21331b, Integer.hashCode(this.f21330a) * 31, 31);
    }

    public final String toString() {
        int i = this.f21330a;
        int i2 = this.f21331b;
        return wq1.m24123s(ux5.m22994q(i, i2, "ResultMilestoneStats(knownWords=", ", lingqs=", ", dailyScore="), this.f21332c, ")");
    }
}

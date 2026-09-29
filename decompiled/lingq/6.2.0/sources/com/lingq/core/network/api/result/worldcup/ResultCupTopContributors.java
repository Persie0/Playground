package com.lingq.core.network.api.result.worldcup;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupTopContributors {
    public static final C1775t Companion = new C1775t();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f21829c = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(3)), null};

    /* JADX INFO: renamed from: a */
    public final List f21830a;

    /* JADX INFO: renamed from: b */
    public final ResultCupMeSummary f21831b;

    public /* synthetic */ ResultCupTopContributors(int i, List list, ResultCupMeSummary resultCupMeSummary) {
        this.f21830a = (i & 1) == 0 ? EmptyList.f47638a : list;
        if ((i & 2) == 0) {
            this.f21831b = null;
        } else {
            this.f21831b = resultCupMeSummary;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupTopContributors)) {
            return false;
        }
        ResultCupTopContributors resultCupTopContributors = (ResultCupTopContributors) obj;
        return fa4.m11650l(this.f21830a, resultCupTopContributors.f21830a) && fa4.m11650l(this.f21831b, resultCupTopContributors.f21831b);
    }

    public final int hashCode() {
        int iHashCode = this.f21830a.hashCode() * 31;
        ResultCupMeSummary resultCupMeSummary = this.f21831b;
        return iHashCode + (resultCupMeSummary == null ? 0 : resultCupMeSummary.hashCode());
    }

    public final String toString() {
        return "ResultCupTopContributors(results=" + this.f21830a + ", me=" + this.f21831b + ")";
    }
}

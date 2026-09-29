package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultMilestones {
    public static final C1741u2 Companion = new C1741u2();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f21333c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(23))};

    /* JADX INFO: renamed from: a */
    public ResultMilestoneStats f21334a;

    /* JADX INFO: renamed from: b */
    public List f21335b;

    /* JADX INFO: renamed from: a */
    public final List m8375a() {
        return this.f21335b;
    }

    /* JADX INFO: renamed from: b */
    public final ResultMilestoneStats m8376b() {
        return this.f21334a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultMilestones)) {
            return false;
        }
        ResultMilestones resultMilestones = (ResultMilestones) obj;
        return fa4.m11650l(this.f21334a, resultMilestones.f21334a) && fa4.m11650l(this.f21335b, resultMilestones.f21335b);
    }

    public final int hashCode() {
        ResultMilestoneStats resultMilestoneStats = this.f21334a;
        int iHashCode = (resultMilestoneStats == null ? 0 : resultMilestoneStats.hashCode()) * 31;
        List list = this.f21335b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ResultMilestones(stats=" + this.f21334a + ", milestones=" + this.f21335b + ")";
    }
}

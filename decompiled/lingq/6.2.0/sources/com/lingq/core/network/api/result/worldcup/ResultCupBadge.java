package com.lingq.core.network.api.result.worldcup;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupBadge {
    public static final C1756a Companion = new C1756a();

    /* JADX INFO: renamed from: a */
    public final ResultCupBadgeProperties f21747a;

    /* JADX INFO: renamed from: b */
    public final String f21748b;

    public /* synthetic */ ResultCupBadge(int i, ResultCupBadgeProperties resultCupBadgeProperties, String str) {
        this.f21747a = (i & 1) == 0 ? new ResultCupBadgeProperties() : resultCupBadgeProperties;
        if ((i & 2) == 0) {
            this.f21748b = null;
        } else {
            this.f21748b = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8408a() {
        return this.f21748b;
    }

    /* JADX INFO: renamed from: b */
    public final ResultCupBadgeProperties m8409b() {
        return this.f21747a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupBadge)) {
            return false;
        }
        ResultCupBadge resultCupBadge = (ResultCupBadge) obj;
        return fa4.m11650l(this.f21747a, resultCupBadge.f21747a) && fa4.m11650l(this.f21748b, resultCupBadge.f21748b);
    }

    public final int hashCode() {
        int iHashCode = this.f21747a.hashCode() * 31;
        String str = this.f21748b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ResultCupBadge(properties=" + this.f21747a + ", ctime=" + this.f21748b + ")";
    }
}

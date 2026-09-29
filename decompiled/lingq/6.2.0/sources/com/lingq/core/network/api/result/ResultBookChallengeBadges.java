package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultBookChallengeBadges {
    public static final C1738u Companion = new C1738u();

    /* JADX INFO: renamed from: a */
    public final String f20618a;

    public /* synthetic */ ResultBookChallengeBadges(int i, String str) {
        if ((i & 1) == 0) {
            this.f20618a = "";
        } else {
            this.f20618a = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8329a() {
        return this.f20618a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultBookChallengeBadges) && fa4.m11650l(this.f20618a, ((ResultBookChallengeBadges) obj).f20618a);
    }

    public final int hashCode() {
        String str = this.f20618a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ResultBookChallengeBadges(imageUrl=", this.f20618a, ")");
    }
}

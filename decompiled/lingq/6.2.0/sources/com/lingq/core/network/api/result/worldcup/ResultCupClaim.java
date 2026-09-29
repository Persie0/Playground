package com.lingq.core.network.api.result.worldcup;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupClaim {
    public static final C1759d Companion = new C1759d();

    /* JADX INFO: renamed from: a */
    public final ResultCupPrize f21755a;

    /* JADX INFO: renamed from: b */
    public final boolean f21756b;

    /* JADX INFO: renamed from: c */
    public final String f21757c;

    public /* synthetic */ ResultCupClaim(int i, ResultCupPrize resultCupPrize, boolean z, String str) {
        if ((i & 1) == 0) {
            this.f21755a = null;
        } else {
            this.f21755a = resultCupPrize;
        }
        if ((i & 2) == 0) {
            this.f21756b = true;
        } else {
            this.f21756b = z;
        }
        if ((i & 4) == 0) {
            this.f21757c = null;
        } else {
            this.f21757c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupClaim)) {
            return false;
        }
        ResultCupClaim resultCupClaim = (ResultCupClaim) obj;
        return fa4.m11650l(this.f21755a, resultCupClaim.f21755a) && this.f21756b == resultCupClaim.f21756b && fa4.m11650l(this.f21757c, resultCupClaim.f21757c);
    }

    public final int hashCode() {
        ResultCupPrize resultCupPrize = this.f21755a;
        int iM12428e = g9a.m12428e((resultCupPrize == null ? 0 : resultCupPrize.hashCode()) * 31, 31, this.f21756b);
        String str = this.f21757c;
        return iM12428e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultCupClaim(prize=");
        sb.append(this.f21755a);
        sb.append(", claimed=");
        sb.append(this.f21756b);
        sb.append(", claimedAt=");
        return AbstractC3393o1.m17738m(sb, this.f21757c, ")");
    }
}

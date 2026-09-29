package com.lingq.core.domain.model.user;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class FreeTrialDetails {
    public static final C1502d Companion = new C1502d();

    /* JADX INFO: renamed from: a */
    public final String f19635a;

    /* JADX INFO: renamed from: b */
    public final Boolean f19636b;

    public /* synthetic */ FreeTrialDetails(int i, String str, Boolean bool) {
        if ((i & 1) == 0) {
            this.f19635a = null;
        } else {
            this.f19635a = str;
        }
        if ((i & 2) == 0) {
            this.f19636b = null;
        } else {
            this.f19636b = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeTrialDetails)) {
            return false;
        }
        FreeTrialDetails freeTrialDetails = (FreeTrialDetails) obj;
        return fa4.m11650l(this.f19635a, freeTrialDetails.f19635a) && fa4.m11650l(this.f19636b, freeTrialDetails.f19636b);
    }

    public final int hashCode() {
        String str = this.f19635a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f19636b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "FreeTrialDetails(endDate=" + this.f19635a + ", isActive=" + this.f19636b + ")";
    }
}

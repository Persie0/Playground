package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultSubscriptionDetails {
    public static final C1640d4 Companion = new C1640d4();

    /* JADX INFO: renamed from: a */
    public final ResultSubscriptionDetail f21566a;

    public /* synthetic */ ResultSubscriptionDetails(int i, ResultSubscriptionDetail resultSubscriptionDetail) {
        if ((i & 1) == 0) {
            this.f21566a = null;
        } else {
            this.f21566a = resultSubscriptionDetail;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultSubscriptionDetails) && fa4.m11650l(this.f21566a, ((ResultSubscriptionDetails) obj).f21566a);
    }

    public final int hashCode() {
        ResultSubscriptionDetail resultSubscriptionDetail = this.f21566a;
        if (resultSubscriptionDetail == null) {
            return 0;
        }
        return resultSubscriptionDetail.hashCode();
    }

    public final String toString() {
        return "ResultSubscriptionDetails(detail=" + this.f21566a + ")";
    }
}

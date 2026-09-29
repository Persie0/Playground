package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCardReview {
    public static final C1777x Companion = new C1777x();

    /* JADX INFO: renamed from: a */
    public final String f20652a;

    /* JADX INFO: renamed from: b */
    public final String f20653b;

    public /* synthetic */ ResultCardReview(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f20652a = null;
        } else {
            this.f20652a = str;
        }
        if ((i & 2) == 0) {
            this.f20653b = null;
        } else {
            this.f20653b = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8331a() {
        return this.f20652a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCardReview)) {
            return false;
        }
        ResultCardReview resultCardReview = (ResultCardReview) obj;
        return fa4.m11650l(this.f20652a, resultCardReview.f20652a) && fa4.m11650l(this.f20653b, resultCardReview.f20653b);
    }

    public final int hashCode() {
        String str = this.f20652a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20653b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22991n("ResultCardReview(srsDueDate=", this.f20652a, ", statusChangedDate=", this.f20653b, ")");
    }
}

package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultOfferUrl {
    public static final C1646e3 Companion = new C1646e3();

    /* JADX INFO: renamed from: a */
    public final String f21388a;

    /* JADX INFO: renamed from: b */
    public final String f21389b;

    public /* synthetic */ ResultOfferUrl(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f21388a = null;
        } else {
            this.f21388a = str;
        }
        if ((i & 2) == 0) {
            this.f21389b = null;
        } else {
            this.f21389b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultOfferUrl)) {
            return false;
        }
        ResultOfferUrl resultOfferUrl = (ResultOfferUrl) obj;
        return fa4.m11650l(this.f21388a, resultOfferUrl.f21388a) && fa4.m11650l(this.f21389b, resultOfferUrl.f21389b);
    }

    public final int hashCode() {
        String str = this.f21388a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21389b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22991n("ResultOfferUrl(paid=", this.f21388a, ", plus=", this.f21389b, ")");
    }
}

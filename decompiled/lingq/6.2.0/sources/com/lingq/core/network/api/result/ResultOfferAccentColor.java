package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultOfferAccentColor {
    public static final C1618a3 Companion = new C1618a3();

    /* JADX INFO: renamed from: a */
    public final String f21376a;

    /* JADX INFO: renamed from: b */
    public final String f21377b;

    public /* synthetic */ ResultOfferAccentColor(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f21376a = null;
        } else {
            this.f21376a = str;
        }
        if ((i & 2) == 0) {
            this.f21377b = null;
        } else {
            this.f21377b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultOfferAccentColor)) {
            return false;
        }
        ResultOfferAccentColor resultOfferAccentColor = (ResultOfferAccentColor) obj;
        return fa4.m11650l(this.f21376a, resultOfferAccentColor.f21376a) && fa4.m11650l(this.f21377b, resultOfferAccentColor.f21377b);
    }

    public final int hashCode() {
        String str = this.f21376a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21377b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22991n("ResultOfferAccentColor(light=", this.f21376a, ", dark=", this.f21377b, ")");
    }
}

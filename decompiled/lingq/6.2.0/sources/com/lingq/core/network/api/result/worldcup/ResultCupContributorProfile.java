package com.lingq.core.network.api.result.worldcup;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupContributorProfile {
    public static final C1762g Companion = new C1762g();

    /* JADX INFO: renamed from: a */
    public final int f21766a;

    /* JADX INFO: renamed from: b */
    public final String f21767b;

    /* JADX INFO: renamed from: c */
    public final String f21768c;

    public /* synthetic */ ResultCupContributorProfile(String str, int i, int i2, String str2) {
        this.f21766a = (i & 1) == 0 ? 0 : i2;
        this.f21767b = (i & 2) == 0 ? "" : str;
        if ((i & 4) == 0) {
            this.f21768c = null;
        } else {
            this.f21768c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupContributorProfile)) {
            return false;
        }
        ResultCupContributorProfile resultCupContributorProfile = (ResultCupContributorProfile) obj;
        return this.f21766a == resultCupContributorProfile.f21766a && fa4.m11650l(this.f21767b, resultCupContributorProfile.f21767b) && fa4.m11650l(this.f21768c, resultCupContributorProfile.f21768c);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Integer.hashCode(this.f21766a) * 31, this.f21767b, 31);
        String str = this.f21768c;
        return iM22980c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22995r(this.f21766a, "ResultCupContributorProfile(id=", ", username=", this.f21767b, ", photo="), this.f21768c, ")");
    }

    public ResultCupContributorProfile() {
        this.f21766a = 0;
        this.f21767b = "";
        this.f21768c = null;
    }
}

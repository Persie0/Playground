package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChallengeProfile {
    public static final C1622b0 Companion = new C1622b0();

    /* JADX INFO: renamed from: a */
    public final int f20676a;

    /* JADX INFO: renamed from: b */
    public final String f20677b;

    /* JADX INFO: renamed from: c */
    public final String f20678c;

    /* JADX INFO: renamed from: d */
    public final String f20679d;

    /* JADX INFO: renamed from: e */
    public final int f20680e;

    /* JADX INFO: renamed from: f */
    public final boolean f20681f;

    /* JADX INFO: renamed from: g */
    public final String f20682g;

    /* JADX INFO: renamed from: h */
    public final String f20683h;

    public /* synthetic */ ResultChallengeProfile(int i, int i2, String str, String str2, String str3, int i3, boolean z, String str4, String str5) {
        if ((i & 1) == 0) {
            this.f20676a = 0;
        } else {
            this.f20676a = i2;
        }
        if ((i & 2) == 0) {
            this.f20677b = null;
        } else {
            this.f20677b = str;
        }
        if ((i & 4) == 0) {
            this.f20678c = null;
        } else {
            this.f20678c = str2;
        }
        if ((i & 8) == 0) {
            this.f20679d = null;
        } else {
            this.f20679d = str3;
        }
        if ((i & 16) == 0) {
            this.f20680e = 0;
        } else {
            this.f20680e = i3;
        }
        if ((i & 32) == 0) {
            this.f20681f = false;
        } else {
            this.f20681f = z;
        }
        if ((i & 64) == 0) {
            this.f20682g = null;
        } else {
            this.f20682g = str4;
        }
        if ((i & 128) == 0) {
            this.f20683h = null;
        } else {
            this.f20683h = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChallengeProfile)) {
            return false;
        }
        ResultChallengeProfile resultChallengeProfile = (ResultChallengeProfile) obj;
        return this.f20676a == resultChallengeProfile.f20676a && fa4.m11650l(this.f20677b, resultChallengeProfile.f20677b) && fa4.m11650l(this.f20678c, resultChallengeProfile.f20678c) && fa4.m11650l(this.f20679d, resultChallengeProfile.f20679d) && this.f20680e == resultChallengeProfile.f20680e && this.f20681f == resultChallengeProfile.f20681f && fa4.m11650l(this.f20682g, resultChallengeProfile.f20682g) && fa4.m11650l(this.f20683h, resultChallengeProfile.f20683h);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20676a) * 31;
        String str = this.f20677b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20678c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20679d;
        int iM12428e = g9a.m12428e(wq1.m24106b(this.f20680e, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.f20681f);
        String str4 = this.f20682g;
        int iHashCode4 = (iM12428e + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20683h;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f20676a, "ResultChallengeProfile(id=", ", username=", this.f20677b, ", description=");
        AbstractC3393o1.m17725C(sbM22995r, this.f20678c, ", blogUrl=", this.f20679d, ", activityIndex=");
        hn1.m13368r(sbM22995r, this.f20680e, ", deleted=", this.f20681f, ", photo=");
        return wq1.m24125u(sbM22995r, this.f20682g, ", role=", this.f20683h, ")");
    }
}

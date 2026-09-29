package com.lingq.core.domain.model.challenge;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChallengeProfile {
    public static final C1397c Companion = new C1397c();

    /* JADX INFO: renamed from: a */
    public final int f18883a;

    /* JADX INFO: renamed from: b */
    public final String f18884b;

    /* JADX INFO: renamed from: c */
    public final String f18885c;

    /* JADX INFO: renamed from: d */
    public final String f18886d;

    /* JADX INFO: renamed from: e */
    public final int f18887e;

    /* JADX INFO: renamed from: f */
    public final boolean f18888f;

    /* JADX INFO: renamed from: g */
    public final String f18889g;

    /* JADX INFO: renamed from: h */
    public final String f18890h;

    public /* synthetic */ ChallengeProfile(int i, int i2, String str, String str2, String str3, int i3, boolean z, String str4, String str5) {
        if (70 != (i & 70)) {
            n3c.m17204b(i, 70, ChallengeProfile$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f18883a = 0;
        } else {
            this.f18883a = i2;
        }
        this.f18884b = str;
        this.f18885c = str2;
        if ((i & 8) == 0) {
            this.f18886d = null;
        } else {
            this.f18886d = str3;
        }
        if ((i & 16) == 0) {
            this.f18887e = 0;
        } else {
            this.f18887e = i3;
        }
        if ((i & 32) == 0) {
            this.f18888f = false;
        } else {
            this.f18888f = z;
        }
        this.f18889g = str4;
        if ((i & 128) == 0) {
            this.f18890h = null;
        } else {
            this.f18890h = str5;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8012a() {
        return this.f18883a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeProfile)) {
            return false;
        }
        ChallengeProfile challengeProfile = (ChallengeProfile) obj;
        return this.f18883a == challengeProfile.f18883a && fa4.m11650l(this.f18884b, challengeProfile.f18884b) && fa4.m11650l(this.f18885c, challengeProfile.f18885c) && fa4.m11650l(this.f18886d, challengeProfile.f18886d) && this.f18887e == challengeProfile.f18887e && this.f18888f == challengeProfile.f18888f && fa4.m11650l(this.f18889g, challengeProfile.f18889g) && fa4.m11650l(this.f18890h, challengeProfile.f18890h);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18883a) * 31;
        String str = this.f18884b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18885c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18886d;
        int iM12428e = g9a.m12428e(wq1.m24106b(this.f18887e, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31, this.f18888f);
        String str4 = this.f18889g;
        int iHashCode4 = (iM12428e + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18890h;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f18883a, "ChallengeProfile(id=", ", username=", this.f18884b, ", description=");
        AbstractC3393o1.m17725C(sbM22995r, this.f18885c, ", blogUrl=", this.f18886d, ", activityIndex=");
        hn1.m13368r(sbM22995r, this.f18887e, ", deleted=", this.f18888f, ", photo=");
        return wq1.m24125u(sbM22995r, this.f18889g, ", role=", this.f18890h, ")");
    }

    public ChallengeProfile(int i, int i2, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.f18883a = i;
        this.f18884b = str;
        this.f18885c = str2;
        this.f18886d = str3;
        this.f18887e = i2;
        this.f18888f = z;
        this.f18889g = str4;
        this.f18890h = str5;
    }
}

package com.lingq.core.domain.model.challenge;

import p000.AbstractC3393o1;
import p000.e65;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChallengeStats {
    public static final C1399e Companion = new C1399e();

    /* JADX INFO: renamed from: a */
    public final String f18897a;

    /* JADX INFO: renamed from: b */
    public final String f18898b;

    /* JADX INFO: renamed from: c */
    public final String f18899c;

    /* JADX INFO: renamed from: d */
    public final String f18900d;

    /* JADX INFO: renamed from: e */
    public final String f18901e;

    /* JADX INFO: renamed from: f */
    public final boolean f18902f;

    /* JADX INFO: renamed from: g */
    public final boolean f18903g;

    /* JADX INFO: renamed from: h */
    public final boolean f18904h;

    public /* synthetic */ ChallengeStats(int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        if (31 != (i & 31)) {
            n3c.m17204b(i, 31, ChallengeStats$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18897a = str;
        this.f18898b = str2;
        this.f18899c = str3;
        this.f18900d = str4;
        this.f18901e = str5;
        if ((i & 32) == 0) {
            this.f18902f = false;
        } else {
            this.f18902f = z;
        }
        if ((i & 64) == 0) {
            this.f18903g = false;
        } else {
            this.f18903g = z2;
        }
        if ((i & 128) == 0) {
            this.f18904h = false;
        } else {
            this.f18904h = z3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeStats)) {
            return false;
        }
        ChallengeStats challengeStats = (ChallengeStats) obj;
        return fa4.m11650l(this.f18897a, challengeStats.f18897a) && fa4.m11650l(this.f18898b, challengeStats.f18898b) && fa4.m11650l(this.f18899c, challengeStats.f18899c) && fa4.m11650l(this.f18900d, challengeStats.f18900d) && fa4.m11650l(this.f18901e, challengeStats.f18901e) && this.f18902f == challengeStats.f18902f && this.f18903g == challengeStats.f18903g && this.f18904h == challengeStats.f18904h;
    }

    public final int hashCode() {
        String str = this.f18897a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18898b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18899c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18900d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18901e;
        return Boolean.hashCode(this.f18904h) + g9a.m12428e(g9a.m12428e((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.f18902f), 31, this.f18903g);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ChallengeStats(code=", this.f18897a, ", title=", this.f18898b, ", progress=");
        AbstractC3393o1.m17725C(sbM23000w, this.f18899c, ", actual=", this.f18900d, ", target=");
        ux5.m22976C(this.f18901e, ", isManaged=", ", isTimed=", sbM23000w, this.f18902f);
        return e65.m10875g(sbM23000w, this.f18903g, ", isDisplayed=", this.f18904h, ")");
    }
}

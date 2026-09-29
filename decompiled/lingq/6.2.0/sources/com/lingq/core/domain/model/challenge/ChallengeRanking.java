package com.lingq.core.domain.model.challenge;

import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChallengeRanking {
    public static final C1398d Companion = new C1398d();

    /* JADX INFO: renamed from: a */
    public int f18891a;

    /* JADX INFO: renamed from: b */
    public int f18892b;

    /* JADX INFO: renamed from: c */
    public int f18893c;

    /* JADX INFO: renamed from: d */
    public ChallengeProfile f18894d;

    /* JADX INFO: renamed from: e */
    public String f18895e;

    /* JADX INFO: renamed from: f */
    public String f18896f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeRanking)) {
            return false;
        }
        ChallengeRanking challengeRanking = (ChallengeRanking) obj;
        return this.f18891a == challengeRanking.f18891a && this.f18892b == challengeRanking.f18892b && this.f18893c == challengeRanking.f18893c && fa4.m11650l(this.f18894d, challengeRanking.f18894d) && fa4.m11650l(this.f18895e, challengeRanking.f18895e) && fa4.m11650l(this.f18896f, challengeRanking.f18896f);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f18893c, wq1.m24106b(this.f18892b, Integer.hashCode(this.f18891a) * 31, 31), 31);
        ChallengeProfile challengeProfile = this.f18894d;
        return this.f18896f.hashCode() + ux5.m22980c((iM24106b + (challengeProfile == null ? 0 : challengeProfile.hashCode())) * 31, this.f18895e, 31);
    }

    public final String toString() {
        int i = this.f18891a;
        int i2 = this.f18892b;
        int i3 = this.f18893c;
        ChallengeProfile challengeProfile = this.f18894d;
        String str = this.f18895e;
        String str2 = this.f18896f;
        StringBuilder sbM22994q = ux5.m22994q(i, i2, "ChallengeRanking(rank=", ", score=", ", scoreBehindLeader=");
        sbM22994q.append(i3);
        sbM22994q.append(", profile=");
        sbM22994q.append(challengeProfile);
        sbM22994q.append(", bookTitle=");
        return wq1.m24125u(sbM22994q, str, ", bookLanguage=", str2, ")");
    }
}

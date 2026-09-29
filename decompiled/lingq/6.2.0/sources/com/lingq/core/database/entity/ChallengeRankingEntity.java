package com.lingq.core.database.entity;

import com.lingq.core.domain.model.challenge.ChallengeProfile;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChallengeRankingEntity {
    public static final C1328c Companion = new C1328c();

    /* JADX INFO: renamed from: a */
    public final String f17082a;

    /* JADX INFO: renamed from: b */
    public final String f17083b;

    /* JADX INFO: renamed from: c */
    public final int f17084c;

    /* JADX INFO: renamed from: d */
    public final String f17085d;

    /* JADX INFO: renamed from: e */
    public final ChallengeProfile f17086e;

    /* JADX INFO: renamed from: f */
    public final int f17087f;

    /* JADX INFO: renamed from: g */
    public final int f17088g;

    /* JADX INFO: renamed from: h */
    public final boolean f17089h;

    /* JADX INFO: renamed from: i */
    public final String f17090i;

    /* JADX INFO: renamed from: j */
    public final String f17091j;

    public /* synthetic */ ChallengeRankingEntity(int i, String str, String str2, int i2, String str3, ChallengeProfile challengeProfile, int i3, int i4, boolean z, String str4, String str5) {
        if (31 != (i & 31)) {
            n3c.m17204b(i, 31, ChallengeRankingEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17082a = str;
        this.f17083b = str2;
        this.f17084c = i2;
        this.f17085d = str3;
        this.f17086e = challengeProfile;
        if ((i & 32) == 0) {
            this.f17087f = 0;
        } else {
            this.f17087f = i3;
        }
        if ((i & 64) == 0) {
            this.f17088g = 0;
        } else {
            this.f17088g = i4;
        }
        if ((i & 128) == 0) {
            this.f17089h = false;
        } else {
            this.f17089h = z;
        }
        if ((i & 256) == 0) {
            this.f17090i = "";
        } else {
            this.f17090i = str4;
        }
        if ((i & 512) == 0) {
            this.f17091j = "";
        } else {
            this.f17091j = str5;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m7548a() {
        return this.f17091j;
    }

    /* JADX INFO: renamed from: b */
    public final String m7549b() {
        return this.f17090i;
    }

    /* JADX INFO: renamed from: c */
    public final String m7550c() {
        return this.f17082a;
    }

    /* JADX INFO: renamed from: d */
    public final String m7551d() {
        return this.f17085d;
    }

    /* JADX INFO: renamed from: e */
    public final String m7552e() {
        return this.f17083b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeRankingEntity)) {
            return false;
        }
        ChallengeRankingEntity challengeRankingEntity = (ChallengeRankingEntity) obj;
        return fa4.m11650l(this.f17082a, challengeRankingEntity.f17082a) && fa4.m11650l(this.f17083b, challengeRankingEntity.f17083b) && this.f17084c == challengeRankingEntity.f17084c && fa4.m11650l(this.f17085d, challengeRankingEntity.f17085d) && fa4.m11650l(this.f17086e, challengeRankingEntity.f17086e) && this.f17087f == challengeRankingEntity.f17087f && this.f17088g == challengeRankingEntity.f17088g && this.f17089h == challengeRankingEntity.f17089h && fa4.m11650l(this.f17090i, challengeRankingEntity.f17090i) && fa4.m11650l(this.f17091j, challengeRankingEntity.f17091j);
    }

    /* JADX INFO: renamed from: f */
    public final ChallengeProfile m7553f() {
        return this.f17086e;
    }

    /* JADX INFO: renamed from: g */
    public final int m7554g() {
        return this.f17084c;
    }

    /* JADX INFO: renamed from: h */
    public final int m7555h() {
        return this.f17087f;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f17084c, ux5.m22980c(this.f17082a.hashCode() * 31, this.f17083b, 31), 31), this.f17085d, 31);
        ChallengeProfile challengeProfile = this.f17086e;
        return this.f17091j.hashCode() + ux5.m22980c(g9a.m12428e(wq1.m24106b(this.f17088g, wq1.m24106b(this.f17087f, (iM22980c + (challengeProfile == null ? 0 : challengeProfile.hashCode())) * 31, 31), 31), 31, this.f17089h), this.f17090i, 31);
    }

    /* JADX INFO: renamed from: i */
    public final int m7556i() {
        return this.f17088g;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7557j() {
        return this.f17089h;
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ChallengeRankingEntity(challengeCode=", this.f17082a, ", metric=", this.f17083b, ", rank=");
        hn1.m13361k(this.f17084c, ", language=", this.f17085d, ", profile=", sbM23000w);
        sbM23000w.append(this.f17086e);
        sbM23000w.append(", score=");
        sbM23000w.append(this.f17087f);
        sbM23000w.append(", scoreBehindLeader=");
        hn1.m13368r(sbM23000w, this.f17088g, ", isCompleted=", this.f17089h, ", bookTitle=");
        return wq1.m24125u(sbM23000w, this.f17090i, ", bookLanguage=", this.f17091j, ")");
    }

    public ChallengeRankingEntity(String str, String str2, int i, String str3, ChallengeProfile challengeProfile, int i2, int i3, boolean z, String str4, String str5) {
        ux5.m22975B(str, str2, str3, str4, str5);
        this.f17082a = str;
        this.f17083b = str2;
        this.f17084c = i;
        this.f17085d = str3;
        this.f17086e = challengeProfile;
        this.f17087f = i2;
        this.f17088g = i3;
        this.f17089h = z;
        this.f17090i = str4;
        this.f17091j = str5;
    }
}

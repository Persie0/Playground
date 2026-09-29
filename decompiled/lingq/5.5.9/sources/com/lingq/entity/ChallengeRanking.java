package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/ChallengeRanking;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ChallengeRanking {

    /* JADX INFO: renamed from: a */
    public final String f16918a;

    /* JADX INFO: renamed from: b */
    public final String f16919b;

    /* JADX INFO: renamed from: c */
    public final int f16920c;

    /* JADX INFO: renamed from: d */
    public final String f16921d;

    /* JADX INFO: renamed from: e */
    public final ChallengeProfile f16922e;

    /* JADX INFO: renamed from: f */
    public final int f16923f;

    /* JADX INFO: renamed from: g */
    public final int f16924g;

    /* JADX INFO: renamed from: h */
    public final boolean f16925h;

    public ChallengeRanking(String str, String str2, int i10, String str3, ChallengeProfile challengeProfile, int i11, int i12, boolean z10) {
        C5207g.m11111f(str, "challengeCode");
        C5207g.m11111f(str2, "metric");
        C5207g.m11111f(str3, "language");
        this.f16918a = str;
        this.f16919b = str2;
        this.f16920c = i10;
        this.f16921d = str3;
        this.f16922e = challengeProfile;
        this.f16923f = i11;
        this.f16924g = i12;
        this.f16925h = z10;
    }

    public /* synthetic */ ChallengeRanking(String str, String str2, int i10, String str3, ChallengeProfile challengeProfile, int i11, int i12, boolean z10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, str3, challengeProfile, (i13 & 32) != 0 ? 0 : i11, (i13 & 64) != 0 ? 0 : i12, (i13 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? false : z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeRanking)) {
            return false;
        }
        ChallengeRanking challengeRanking = (ChallengeRanking) obj;
        if (C5207g.m11106a(this.f16918a, challengeRanking.f16918a) && C5207g.m11106a(this.f16919b, challengeRanking.f16919b) && this.f16920c == challengeRanking.f16920c && C5207g.m11106a(this.f16921d, challengeRanking.f16921d) && C5207g.m11106a(this.f16922e, challengeRanking.f16922e) && this.f16923f == challengeRanking.f16923f && this.f16924g == challengeRanking.f16924g && this.f16925h == challengeRanking.f16925h) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f16921d, C0009a.m16d(this.f16920c, C0166e.m758d(this.f16919b, this.f16918a.hashCode() * 31, 31), 31), 31);
        ChallengeProfile challengeProfile = this.f16922e;
        int iM16d = C0009a.m16d(this.f16924g, C0009a.m16d(this.f16923f, (iM758d + (challengeProfile == null ? 0 : challengeProfile.hashCode())) * 31, 31), 31);
        boolean z10 = this.f16925h;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iM16d + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChallengeRanking(challengeCode=");
        sb2.append(this.f16918a);
        sb2.append(", metric=");
        sb2.append(this.f16919b);
        sb2.append(", rank=");
        sb2.append(this.f16920c);
        sb2.append(", language=");
        sb2.append(this.f16921d);
        sb2.append(", profile=");
        sb2.append(this.f16922e);
        sb2.append(", score=");
        sb2.append(this.f16923f);
        sb2.append(", scoreBehindLeader=");
        sb2.append(this.f16924g);
        sb2.append(", isCompleted=");
        return C0166e.m769p(sb2, this.f16925h, ")");
    }
}

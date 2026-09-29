package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.ChallengeProfile;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultChallengeRanking;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultChallengeRanking {

    /* JADX INFO: renamed from: a */
    public final ChallengeProfile f18371a;

    /* JADX INFO: renamed from: b */
    public final int f18372b;

    /* JADX INFO: renamed from: c */
    public final int f18373c;

    /* JADX INFO: renamed from: d */
    public final int f18374d;

    /* JADX INFO: renamed from: e */
    @InterfaceC9303g(name = "is_completed")
    public final boolean f18375e;

    public ResultChallengeRanking(ChallengeProfile challengeProfile, int i10, int i11, int i12, boolean z10) {
        this.f18371a = challengeProfile;
        this.f18372b = i10;
        this.f18373c = i11;
        this.f18374d = i12;
        this.f18375e = z10;
    }

    public /* synthetic */ ResultChallengeRanking(ChallengeProfile challengeProfile, int i10, int i11, int i12, boolean z10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(challengeProfile, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? false : z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChallengeRanking)) {
            return false;
        }
        ResultChallengeRanking resultChallengeRanking = (ResultChallengeRanking) obj;
        return C5207g.m11106a(this.f18371a, resultChallengeRanking.f18371a) && this.f18372b == resultChallengeRanking.f18372b && this.f18373c == resultChallengeRanking.f18373c && this.f18374d == resultChallengeRanking.f18374d && this.f18375e == resultChallengeRanking.f18375e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        ChallengeProfile challengeProfile = this.f18371a;
        int iM16d = C0009a.m16d(this.f18374d, C0009a.m16d(this.f18373c, C0009a.m16d(this.f18372b, (challengeProfile == null ? 0 : challengeProfile.hashCode()) * 31, 31), 31), 31);
        boolean z10 = this.f18375e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iM16d + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultChallengeRanking(profile=");
        sb2.append(this.f18371a);
        sb2.append(", rank=");
        sb2.append(this.f18372b);
        sb2.append(", score=");
        sb2.append(this.f18373c);
        sb2.append(", scoreBehindLeader=");
        sb2.append(this.f18374d);
        sb2.append(", isCompleted=");
        return C0166e.m769p(sb2, this.f18375e, ")");
    }
}

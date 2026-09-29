package com.lingq.shared.uimodel.challenge;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/challenge/ChallengeUserRanking;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ChallengeUserRanking {

    /* JADX INFO: renamed from: a */
    public final int f21673a;

    /* JADX INFO: renamed from: b */
    public final int f21674b;

    /* JADX INFO: renamed from: c */
    public final int f21675c;

    /* JADX INFO: renamed from: d */
    public final ChallengeUserProfile f21676d;

    public ChallengeUserRanking(int i10, int i11, int i12, ChallengeUserProfile challengeUserProfile) {
        this.f21673a = i10;
        this.f21674b = i11;
        this.f21675c = i12;
        this.f21676d = challengeUserProfile;
    }

    public /* synthetic */ ChallengeUserRanking(int i10, int i11, int i12, ChallengeUserProfile challengeUserProfile, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, challengeUserProfile);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeUserRanking)) {
            return false;
        }
        ChallengeUserRanking challengeUserRanking = (ChallengeUserRanking) obj;
        return this.f21673a == challengeUserRanking.f21673a && this.f21674b == challengeUserRanking.f21674b && this.f21675c == challengeUserRanking.f21675c && C5207g.m11106a(this.f21676d, challengeUserRanking.f21676d);
    }

    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f21675c, C0009a.m16d(this.f21674b, Integer.hashCode(this.f21673a) * 31, 31), 31);
        ChallengeUserProfile challengeUserProfile = this.f21676d;
        return iM16d + (challengeUserProfile == null ? 0 : challengeUserProfile.hashCode());
    }

    public final String toString() {
        return "ChallengeUserRanking(rank=" + this.f21673a + ", score=" + this.f21674b + ", scoreBehindLeader=" + this.f21675c + ", profile=" + this.f21676d + ")";
    }
}

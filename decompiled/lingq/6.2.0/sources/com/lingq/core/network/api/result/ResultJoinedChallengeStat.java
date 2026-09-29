package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultJoinedChallengeStat {
    public static final C1698n1 Companion = new C1698n1();

    /* JADX INFO: renamed from: a */
    public final JoinedChallengeStats f20862a;

    public /* synthetic */ ResultJoinedChallengeStat(int i, JoinedChallengeStats joinedChallengeStats) {
        if ((i & 1) == 0) {
            this.f20862a = null;
        } else {
            this.f20862a = joinedChallengeStats;
        }
    }

    /* JADX INFO: renamed from: a */
    public final JoinedChallengeStats m8362a() {
        return this.f20862a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultJoinedChallengeStat) && fa4.m11650l(this.f20862a, ((ResultJoinedChallengeStat) obj).f20862a);
    }

    public final int hashCode() {
        JoinedChallengeStats joinedChallengeStats = this.f20862a;
        if (joinedChallengeStats == null) {
            return 0;
        }
        return joinedChallengeStats.hashCode();
    }

    public final String toString() {
        return "ResultJoinedChallengeStat(stats=" + this.f20862a + ")";
    }
}

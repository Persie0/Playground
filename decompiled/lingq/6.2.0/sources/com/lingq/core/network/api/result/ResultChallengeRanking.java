package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChallengeRanking {
    public static final C1629c0 Companion = new C1629c0();

    /* JADX INFO: renamed from: a */
    public final Extra f20684a;

    /* JADX INFO: renamed from: b */
    public final boolean f20685b;

    /* JADX INFO: renamed from: c */
    public final Boolean f20686c;

    /* JADX INFO: renamed from: d */
    public final ResultChallengeProfile f20687d;

    /* JADX INFO: renamed from: e */
    public final int f20688e;

    /* JADX INFO: renamed from: f */
    public final double f20689f;

    /* JADX INFO: renamed from: g */
    public final String f20690g;

    public /* synthetic */ ResultChallengeRanking(int i, Extra extra, boolean z, Boolean bool, ResultChallengeProfile resultChallengeProfile, int i2, double d, String str) {
        this.f20684a = (i & 1) == 0 ? new Extra() : extra;
        if ((i & 2) == 0) {
            this.f20685b = false;
        } else {
            this.f20685b = z;
        }
        if ((i & 4) == 0) {
            this.f20686c = Boolean.FALSE;
        } else {
            this.f20686c = bool;
        }
        if ((i & 8) == 0) {
            this.f20687d = null;
        } else {
            this.f20687d = resultChallengeProfile;
        }
        if ((i & 16) == 0) {
            this.f20688e = 0;
        } else {
            this.f20688e = i2;
        }
        if ((i & 32) == 0) {
            this.f20689f = 0.0d;
        } else {
            this.f20689f = d;
        }
        if ((i & 64) == 0) {
            this.f20690g = "";
        } else {
            this.f20690g = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChallengeRanking)) {
            return false;
        }
        ResultChallengeRanking resultChallengeRanking = (ResultChallengeRanking) obj;
        return fa4.m11650l(this.f20684a, resultChallengeRanking.f20684a) && this.f20685b == resultChallengeRanking.f20685b && fa4.m11650l(this.f20686c, resultChallengeRanking.f20686c) && fa4.m11650l(this.f20687d, resultChallengeRanking.f20687d) && this.f20688e == resultChallengeRanking.f20688e && Double.compare(this.f20689f, resultChallengeRanking.f20689f) == 0 && fa4.m11650l(this.f20690g, resultChallengeRanking.f20690g);
    }

    public final int hashCode() {
        Extra extra = this.f20684a;
        int iM12428e = g9a.m12428e((extra == null ? 0 : extra.hashCode()) * 31, 31, this.f20685b);
        Boolean bool = this.f20686c;
        int iHashCode = (iM12428e + (bool == null ? 0 : bool.hashCode())) * 31;
        ResultChallengeProfile resultChallengeProfile = this.f20687d;
        int iM12424a = g9a.m12424a(this.f20689f, wq1.m24106b(this.f20688e, (iHashCode + (resultChallengeProfile == null ? 0 : resultChallengeProfile.hashCode())) * 31, 31), 31);
        String str = this.f20690g;
        return iM12424a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultChallengeRanking(extra=");
        sb.append(this.f20684a);
        sb.append(", isCompleted=");
        sb.append(this.f20685b);
        sb.append(", isFinished=");
        sb.append(this.f20686c);
        sb.append(", profile=");
        sb.append(this.f20687d);
        sb.append(", rank=");
        sb.append(this.f20688e);
        sb.append(", score=");
        sb.append(this.f20689f);
        return AbstractC3393o1.m17739n(sb, ", scoreBehindLeader=", this.f20690g, ")");
    }
}

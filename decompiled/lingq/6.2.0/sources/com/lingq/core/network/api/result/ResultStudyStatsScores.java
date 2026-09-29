package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultStudyStatsScores {
    public static final C1626b4 Companion = new C1626b4();

    /* JADX INFO: renamed from: a */
    public final String f21539a;

    /* JADX INFO: renamed from: b */
    public final String f21540b;

    /* JADX INFO: renamed from: c */
    public final int f21541c;

    /* JADX INFO: renamed from: d */
    public final ResultActivityLevel f21542d;

    public /* synthetic */ ResultStudyStatsScores(int i, String str, String str2, int i2, ResultActivityLevel resultActivityLevel) {
        if ((i & 1) == 0) {
            this.f21539a = null;
        } else {
            this.f21539a = str;
        }
        if ((i & 2) == 0) {
            this.f21540b = null;
        } else {
            this.f21540b = str2;
        }
        if ((i & 4) == 0) {
            this.f21541c = 0;
        } else {
            this.f21541c = i2;
        }
        if ((i & 8) == 0) {
            this.f21542d = null;
        } else {
            this.f21542d = resultActivityLevel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultStudyStatsScores)) {
            return false;
        }
        ResultStudyStatsScores resultStudyStatsScores = (ResultStudyStatsScores) obj;
        return fa4.m11650l(this.f21539a, resultStudyStatsScores.f21539a) && fa4.m11650l(this.f21540b, resultStudyStatsScores.f21540b) && this.f21541c == resultStudyStatsScores.f21541c && fa4.m11650l(this.f21542d, resultStudyStatsScores.f21542d);
    }

    public final int hashCode() {
        String str = this.f21539a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21540b;
        int iM24106b = wq1.m24106b(this.f21541c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        ResultActivityLevel resultActivityLevel = this.f21542d;
        return iM24106b + (resultActivityLevel != null ? resultActivityLevel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultStudyStatsScores(date=", this.f21539a, ", dayOfWeek=", this.f21540b, ", score=");
        sbM23000w.append(this.f21541c);
        sbM23000w.append(", activityLevel=");
        sbM23000w.append(this.f21542d);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}

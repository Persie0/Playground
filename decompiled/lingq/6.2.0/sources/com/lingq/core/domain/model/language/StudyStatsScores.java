package com.lingq.core.domain.model.language;

import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class StudyStatsScores {
    public static final C1435o Companion = new C1435o();

    /* JADX INFO: renamed from: a */
    public final String f19126a;

    /* JADX INFO: renamed from: b */
    public final String f19127b;

    /* JADX INFO: renamed from: c */
    public final int f19128c;

    /* JADX INFO: renamed from: d */
    public final ActivityLevel f19129d;

    public /* synthetic */ StudyStatsScores(int i, String str, String str2, int i2, ActivityLevel activityLevel) {
        if ((i & 1) == 0) {
            this.f19126a = null;
        } else {
            this.f19126a = str;
        }
        if ((i & 2) == 0) {
            this.f19127b = null;
        } else {
            this.f19127b = str2;
        }
        if ((i & 4) == 0) {
            this.f19128c = 0;
        } else {
            this.f19128c = i2;
        }
        if ((i & 8) == 0) {
            this.f19129d = null;
        } else {
            this.f19129d = activityLevel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StudyStatsScores)) {
            return false;
        }
        StudyStatsScores studyStatsScores = (StudyStatsScores) obj;
        return fa4.m11650l(this.f19126a, studyStatsScores.f19126a) && fa4.m11650l(this.f19127b, studyStatsScores.f19127b) && this.f19128c == studyStatsScores.f19128c && fa4.m11650l(this.f19129d, studyStatsScores.f19129d);
    }

    public final int hashCode() {
        String str = this.f19126a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19127b;
        int iM24106b = wq1.m24106b(this.f19128c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        ActivityLevel activityLevel = this.f19129d;
        return iM24106b + (activityLevel != null ? activityLevel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("StudyStatsScores(date=", this.f19126a, ", dayOfWeek=", this.f19127b, ", score=");
        sbM23000w.append(this.f19128c);
        sbM23000w.append(", activityLevel=");
        sbM23000w.append(this.f19129d);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public StudyStatsScores(String str, String str2, int i, ActivityLevel activityLevel) {
        this.f19126a = str;
        this.f19127b = str2;
        this.f19128c = i;
        this.f19129d = activityLevel;
    }
}

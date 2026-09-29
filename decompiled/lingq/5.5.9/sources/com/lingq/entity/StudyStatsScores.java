package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/StudyStatsScores;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class StudyStatsScores {

    /* JADX INFO: renamed from: a */
    public final String f17484a;

    /* JADX INFO: renamed from: b */
    public final String f17485b;

    /* JADX INFO: renamed from: c */
    public final int f17486c;

    /* JADX INFO: renamed from: d */
    public final ActivityLevel f17487d;

    public StudyStatsScores() {
        this(null, null, 0, null, 15, null);
    }

    public StudyStatsScores(String str, String str2, int i10, ActivityLevel activityLevel) {
        this.f17484a = str;
        this.f17485b = str2;
        this.f17486c = i10;
        this.f17487d = activityLevel;
    }

    public /* synthetic */ StudyStatsScores(String str, String str2, int i10, ActivityLevel activityLevel, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : activityLevel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StudyStatsScores)) {
            return false;
        }
        StudyStatsScores studyStatsScores = (StudyStatsScores) obj;
        return C5207g.m11106a(this.f17484a, studyStatsScores.f17484a) && C5207g.m11106a(this.f17485b, studyStatsScores.f17485b) && this.f17486c == studyStatsScores.f17486c && C5207g.m11106a(this.f17487d, studyStatsScores.f17487d);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f17484a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17485b;
        int iM16d = C0009a.m16d(this.f17486c, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        ActivityLevel activityLevel = this.f17487d;
        if (activityLevel != null) {
            iHashCode = activityLevel.hashCode();
        }
        return iM16d + iHashCode;
    }

    public final String toString() {
        return "StudyStatsScores(date=" + this.f17484a + ", dayOfWeek=" + this.f17485b + ", score=" + this.f17486c + ", activityLevel=" + this.f17487d + ")";
    }
}

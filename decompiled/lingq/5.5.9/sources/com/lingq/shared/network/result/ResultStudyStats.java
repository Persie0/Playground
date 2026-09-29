package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.lingq.entity.ActivityLevel;
import com.lingq.entity.StudyStatsScores;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultStudyStats;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultStudyStats {

    /* JADX INFO: renamed from: a */
    public final String f18972a;

    /* JADX INFO: renamed from: b */
    public final int f18973b;

    /* JADX INFO: renamed from: c */
    public final int f18974c;

    /* JADX INFO: renamed from: d */
    public final int f18975d;

    /* JADX INFO: renamed from: e */
    public final int f18976e;

    /* JADX INFO: renamed from: f */
    public final int f18977f;

    /* JADX INFO: renamed from: g */
    public final boolean f18978g;

    /* JADX INFO: renamed from: h */
    public final List<StudyStatsScores> f18979h;

    /* JADX INFO: renamed from: i */
    public final ActivityLevel f18980i;

    public ResultStudyStats() {
        this(null, 0, 0, 0, 0, 0, false, null, null, 511, null);
    }

    public ResultStudyStats(String str, int i10, int i11, int i12, int i13, int i14, boolean z10, List<StudyStatsScores> list, ActivityLevel activityLevel) {
        this.f18972a = str;
        this.f18973b = i10;
        this.f18974c = i11;
        this.f18975d = i12;
        this.f18976e = i13;
        this.f18977f = i14;
        this.f18978g = z10;
        this.f18979h = list;
        this.f18980i = activityLevel;
    }

    public /* synthetic */ ResultStudyStats(String str, int i10, int i11, int i12, int i13, int i14, boolean z10, List list, ActivityLevel activityLevel, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? 0 : i10, (i15 & 4) != 0 ? 0 : i11, (i15 & 8) != 0 ? 0 : i12, (i15 & 16) != 0 ? 0 : i13, (i15 & 32) != 0 ? 0 : i14, (i15 & 64) == 0 ? z10 : false, (i15 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? null : list, (i15 & 256) == 0 ? activityLevel : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultStudyStats)) {
            return false;
        }
        ResultStudyStats resultStudyStats = (ResultStudyStats) obj;
        return C5207g.m11106a(this.f18972a, resultStudyStats.f18972a) && this.f18973b == resultStudyStats.f18973b && this.f18974c == resultStudyStats.f18974c && this.f18975d == resultStudyStats.f18975d && this.f18976e == resultStudyStats.f18976e && this.f18977f == resultStudyStats.f18977f && this.f18978g == resultStudyStats.f18978g && C5207g.m11106a(this.f18979h, resultStudyStats.f18979h) && C5207g.m11106a(this.f18980i, resultStudyStats.f18980i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    public final int hashCode() {
        String str = this.f18972a;
        int iM16d = C0009a.m16d(this.f18977f, C0009a.m16d(this.f18976e, C0009a.m16d(this.f18975d, C0009a.m16d(this.f18974c, C0009a.m16d(this.f18973b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31), 31), 31);
        boolean z10 = this.f18978g;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iM16d + r10) * 31;
        List<StudyStatsScores> list = this.f18979h;
        int iHashCode = (i10 + (list == null ? 0 : list.hashCode())) * 31;
        ActivityLevel activityLevel = this.f18980i;
        return iHashCode + (activityLevel != null ? activityLevel.hashCode() : 0);
    }

    public final String toString() {
        return "ResultStudyStats(activityApple=" + this.f18972a + ", notificationsCount=" + this.f18973b + ", dailyGoal=" + this.f18974c + ", streakDays=" + this.f18975d + ", coins=" + this.f18976e + ", knownWords=" + this.f18977f + ", isAvatarUpgraded=" + this.f18978g + ", dailyScores=" + this.f18979h + ", activityLevel=" + this.f18980i + ")";
    }
}

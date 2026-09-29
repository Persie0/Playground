package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/StudyStats;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class StudyStats {

    /* JADX INFO: renamed from: a */
    public final String f17466a;

    /* JADX INFO: renamed from: b */
    public final String f17467b;

    /* JADX INFO: renamed from: c */
    public final String f17468c;

    /* JADX INFO: renamed from: d */
    public final int f17469d;

    /* JADX INFO: renamed from: e */
    public final int f17470e;

    /* JADX INFO: renamed from: f */
    public final int f17471f;

    /* JADX INFO: renamed from: g */
    public final int f17472g;

    /* JADX INFO: renamed from: h */
    public final int f17473h;

    /* JADX INFO: renamed from: i */
    public final boolean f17474i;

    /* JADX INFO: renamed from: j */
    public final List<StudyStatsScores> f17475j;

    /* JADX INFO: renamed from: k */
    public final int f17476k;

    public StudyStats(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, boolean z10, List<StudyStatsScores> list, int i15) {
        C5207g.m11111f(str, "code");
        this.f17466a = str;
        this.f17467b = str2;
        this.f17468c = str3;
        this.f17469d = i10;
        this.f17470e = i11;
        this.f17471f = i12;
        this.f17472g = i13;
        this.f17473h = i14;
        this.f17474i = z10;
        this.f17475j = list;
        this.f17476k = i15;
    }

    public /* synthetic */ StudyStats(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, boolean z10, List list, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i16 & 2) != 0 ? null : str2, (i16 & 4) != 0 ? null : str3, (i16 & 8) != 0 ? 0 : i10, (i16 & 16) != 0 ? 0 : i11, (i16 & 32) != 0 ? 0 : i12, (i16 & 64) != 0 ? 0 : i13, (i16 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : i14, (i16 & 256) != 0 ? false : z10, (i16 & 512) == 0 ? list : null, (i16 & 1024) == 0 ? i15 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StudyStats)) {
            return false;
        }
        StudyStats studyStats = (StudyStats) obj;
        return C5207g.m11106a(this.f17466a, studyStats.f17466a) && C5207g.m11106a(this.f17467b, studyStats.f17467b) && C5207g.m11106a(this.f17468c, studyStats.f17468c) && this.f17469d == studyStats.f17469d && this.f17470e == studyStats.f17470e && this.f17471f == studyStats.f17471f && this.f17472g == studyStats.f17472g && this.f17473h == studyStats.f17473h && this.f17474i == studyStats.f17474i && C5207g.m11106a(this.f17475j, studyStats.f17475j) && this.f17476k == studyStats.f17476k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    public final int hashCode() {
        int iHashCode = this.f17466a.hashCode() * 31;
        String str = this.f17467b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17468c;
        int iM16d = C0009a.m16d(this.f17473h, C0009a.m16d(this.f17472g, C0009a.m16d(this.f17471f, C0009a.m16d(this.f17470e, C0009a.m16d(this.f17469d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31), 31);
        boolean z10 = this.f17474i;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iM16d + r10) * 31;
        List<StudyStatsScores> list = this.f17475j;
        return Integer.hashCode(this.f17476k) + ((i10 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StudyStats(code=");
        sb2.append(this.f17466a);
        sb2.append(", language=");
        sb2.append(this.f17467b);
        sb2.append(", activityApple=");
        sb2.append(this.f17468c);
        sb2.append(", notificationsCount=");
        sb2.append(this.f17469d);
        sb2.append(", dailyGoal=");
        sb2.append(this.f17470e);
        sb2.append(", streakDays=");
        sb2.append(this.f17471f);
        sb2.append(", coins=");
        sb2.append(this.f17472g);
        sb2.append(", knownWords=");
        sb2.append(this.f17473h);
        sb2.append(", isAvatarUpgraded=");
        sb2.append(this.f17474i);
        sb2.append(", dailyScores=");
        sb2.append(this.f17475j);
        sb2.append(", activityLevel=");
        return C0166e.m768o(sb2, this.f17476k, ")");
    }
}

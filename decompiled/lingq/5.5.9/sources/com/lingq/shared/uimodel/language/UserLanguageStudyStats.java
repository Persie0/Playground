package com.lingq.shared.uimodel.language;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class UserLanguageStudyStats {

    /* JADX INFO: renamed from: a */
    public final String f21786a;

    /* JADX INFO: renamed from: b */
    public final int f21787b;

    /* JADX INFO: renamed from: c */
    public final int f21788c;

    /* JADX INFO: renamed from: d */
    public final int f21789d;

    /* JADX INFO: renamed from: e */
    public final int f21790e;

    /* JADX INFO: renamed from: f */
    public final List<UserStudyStatsScore> f21791f;

    /* JADX INFO: renamed from: g */
    public final int f21792g;

    public UserLanguageStudyStats() {
        this(null, 0, 0, 0, 0, null, 0, 127, null);
    }

    public UserLanguageStudyStats(String str, int i10, int i11, int i12, int i13, List<UserStudyStatsScore> list, int i14) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(list, "dailyScores");
        this.f21786a = str;
        this.f21787b = i10;
        this.f21788c = i11;
        this.f21789d = i12;
        this.f21790e = i13;
        this.f21791f = list;
        this.f21792g = i14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UserLanguageStudyStats(String str, int i10, int i11, int i12, int i13, List list, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i15 & 1) != 0 ? "" : str;
        int i16 = 0;
        int i17 = (i15 & 2) != 0 ? 0 : i10;
        int i18 = (i15 & 4) != 0 ? 0 : i11;
        int i19 = (i15 & 8) != 0 ? 0 : i12;
        int i20 = (i15 & 16) != 0 ? 0 : i13;
        List list2 = (i15 & 32) != 0 ? EmptyList.f38032a : list;
        if ((i15 & 64) == 0) {
            i16 = i14;
        }
        this(str, i17, i18, i19, i20, list2, i16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserLanguageStudyStats)) {
            return false;
        }
        UserLanguageStudyStats userLanguageStudyStats = (UserLanguageStudyStats) obj;
        return C5207g.m11106a(this.f21786a, userLanguageStudyStats.f21786a) && this.f21787b == userLanguageStudyStats.f21787b && this.f21788c == userLanguageStudyStats.f21788c && this.f21789d == userLanguageStudyStats.f21789d && this.f21790e == userLanguageStudyStats.f21790e && C5207g.m11106a(this.f21791f, userLanguageStudyStats.f21791f) && this.f21792g == userLanguageStudyStats.f21792g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21792g) + C0204c.m848g(this.f21791f, C0009a.m16d(this.f21790e, C0009a.m16d(this.f21789d, C0009a.m16d(this.f21788c, C0009a.m16d(this.f21787b, this.f21786a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserLanguageStudyStats(language=");
        sb2.append(this.f21786a);
        sb2.append(", dailyGoal=");
        sb2.append(this.f21787b);
        sb2.append(", streakDays=");
        sb2.append(this.f21788c);
        sb2.append(", coins=");
        sb2.append(this.f21789d);
        sb2.append(", knownWords=");
        sb2.append(this.f21790e);
        sb2.append(", dailyScores=");
        sb2.append(this.f21791f);
        sb2.append(", activityLevel=");
        return C0166e.m768o(sb2, this.f21792g, ")");
    }
}

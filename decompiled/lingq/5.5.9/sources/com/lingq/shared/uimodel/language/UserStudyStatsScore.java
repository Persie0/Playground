package com.lingq.shared.uimodel.language;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserStudyStatsScore;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class UserStudyStatsScore {

    /* JADX INFO: renamed from: a */
    public final String f21798a;

    /* JADX INFO: renamed from: b */
    public final String f21799b;

    /* JADX INFO: renamed from: c */
    public final int f21800c;

    /* JADX INFO: renamed from: d */
    public final UserActivityLevel f21801d;

    public UserStudyStatsScore() {
        this(null, null, 0, null, 15, null);
    }

    public UserStudyStatsScore(String str, String str2, int i10, UserActivityLevel userActivityLevel) {
        C5207g.m11111f(str, "date");
        C5207g.m11111f(str2, "dayOfWeek");
        this.f21798a = str;
        this.f21799b = str2;
        this.f21800c = i10;
        this.f21801d = userActivityLevel;
    }

    public /* synthetic */ UserStudyStatsScore(String str, String str2, int i10, UserActivityLevel userActivityLevel, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : userActivityLevel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStudyStatsScore)) {
            return false;
        }
        UserStudyStatsScore userStudyStatsScore = (UserStudyStatsScore) obj;
        return C5207g.m11106a(this.f21798a, userStudyStatsScore.f21798a) && C5207g.m11106a(this.f21799b, userStudyStatsScore.f21799b) && this.f21800c == userStudyStatsScore.f21800c && C5207g.m11106a(this.f21801d, userStudyStatsScore.f21801d);
    }

    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f21800c, C0166e.m758d(this.f21799b, this.f21798a.hashCode() * 31, 31), 31);
        UserActivityLevel userActivityLevel = this.f21801d;
        return iM16d + (userActivityLevel == null ? 0 : userActivityLevel.hashCode());
    }

    public final String toString() {
        return "UserStudyStatsScore(date=" + this.f21798a + ", dayOfWeek=" + this.f21799b + ", score=" + this.f21800c + ", activityLevel=" + this.f21801d + ")";
    }
}

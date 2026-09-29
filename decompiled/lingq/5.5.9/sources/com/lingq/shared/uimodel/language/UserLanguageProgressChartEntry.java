package com.lingq.shared.uimodel.language;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguageProgressChartEntry;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class UserLanguageProgressChartEntry {

    /* JADX INFO: renamed from: a */
    public final String f21772a;

    /* JADX INFO: renamed from: b */
    public final String f21773b;

    /* JADX INFO: renamed from: c */
    public final String f21774c;

    /* JADX INFO: renamed from: d */
    public final double f21775d;

    /* JADX INFO: renamed from: e */
    public final double f21776e;

    public UserLanguageProgressChartEntry(String str, String str2, String str3, double d10, double d11) {
        C5207g.m11111f(str, "metric");
        C5207g.m11111f(str2, "languageCode");
        C5207g.m11111f(str3, "name");
        this.f21772a = str;
        this.f21773b = str2;
        this.f21774c = str3;
        this.f21775d = d10;
        this.f21776e = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserLanguageProgressChartEntry)) {
            return false;
        }
        UserLanguageProgressChartEntry userLanguageProgressChartEntry = (UserLanguageProgressChartEntry) obj;
        return C5207g.m11106a(this.f21772a, userLanguageProgressChartEntry.f21772a) && C5207g.m11106a(this.f21773b, userLanguageProgressChartEntry.f21773b) && C5207g.m11106a(this.f21774c, userLanguageProgressChartEntry.f21774c) && Double.compare(this.f21775d, userLanguageProgressChartEntry.f21775d) == 0 && Double.compare(this.f21776e, userLanguageProgressChartEntry.f21776e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f21776e) + C0141b.m609e(this.f21775d, C0166e.m758d(this.f21774c, C0166e.m758d(this.f21773b, this.f21772a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "UserLanguageProgressChartEntry(metric=" + this.f21772a + ", languageCode=" + this.f21773b + ", name=" + this.f21774c + ", daily=" + this.f21775d + ", cumulative=" + this.f21776e + ")";
    }
}

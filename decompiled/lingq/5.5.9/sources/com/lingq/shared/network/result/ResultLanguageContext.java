package com.lingq.shared.network.result;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Language;
import com.lingq.entity.LanguageContextNotification;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLanguageContext;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultLanguageContext {

    /* JADX INFO: renamed from: a */
    public final int f18441a;

    /* JADX INFO: renamed from: b */
    public final String f18442b;

    /* JADX INFO: renamed from: c */
    @InterfaceC9303g(name = "repetition_lingqs")
    public final int f18443c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "lotd_dates")
    public final List<String> f18444d;

    /* JADX INFO: renamed from: e */
    @InterfaceC9303g(name = "email_notifications")
    public final LanguageContextNotification f18445e;

    /* JADX INFO: renamed from: f */
    @InterfaceC9303g(name = "site_notifications")
    public final LanguageContextNotification f18446f;

    /* JADX INFO: renamed from: g */
    @InterfaceC9303g(name = "use_feed")
    public final Boolean f18447g;

    /* JADX INFO: renamed from: h */
    public final String f18448h;

    /* JADX INFO: renamed from: i */
    public final List<String> f18449i;

    /* JADX INFO: renamed from: j */
    public final Language f18450j;

    /* JADX INFO: renamed from: k */
    @InterfaceC9303g(name = "streak_days")
    public final int f18451k;

    /* JADX INFO: renamed from: l */
    @InterfaceC9303g(name = "feed_levels")
    public final List<Boolean> f18452l;

    public ResultLanguageContext(int i10, String str, int i11, List<String> list, LanguageContextNotification languageContextNotification, LanguageContextNotification languageContextNotification2, Boolean bool, String str2, List<String> list2, Language language, int i12, List<Boolean> list3) {
        C5207g.m11111f(list, "lotdDates");
        C5207g.m11111f(list2, "tags");
        this.f18441a = i10;
        this.f18442b = str;
        this.f18443c = i11;
        this.f18444d = list;
        this.f18445e = languageContextNotification;
        this.f18446f = languageContextNotification2;
        this.f18447g = bool;
        this.f18448h = str2;
        this.f18449i = list2;
        this.f18450j = language;
        this.f18451k = i12;
        this.f18452l = list3;
    }

    public ResultLanguageContext(int i10, String str, int i11, List list, LanguageContextNotification languageContextNotification, LanguageContextNotification languageContextNotification2, Boolean bool, String str2, List list2, Language language, int i12, List list3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i10, str, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? new ArrayList() : list, languageContextNotification, languageContextNotification2, (i13 & 64) != 0 ? Boolean.FALSE : bool, str2, (i13 & 256) != 0 ? new ArrayList() : list2, (i13 & 512) != 0 ? null : language, i12, (i13 & 2048) != 0 ? EmptyList.f38032a : list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLanguageContext)) {
            return false;
        }
        ResultLanguageContext resultLanguageContext = (ResultLanguageContext) obj;
        return this.f18441a == resultLanguageContext.f18441a && C5207g.m11106a(this.f18442b, resultLanguageContext.f18442b) && this.f18443c == resultLanguageContext.f18443c && C5207g.m11106a(this.f18444d, resultLanguageContext.f18444d) && C5207g.m11106a(this.f18445e, resultLanguageContext.f18445e) && C5207g.m11106a(this.f18446f, resultLanguageContext.f18446f) && C5207g.m11106a(this.f18447g, resultLanguageContext.f18447g) && C5207g.m11106a(this.f18448h, resultLanguageContext.f18448h) && C5207g.m11106a(this.f18449i, resultLanguageContext.f18449i) && C5207g.m11106a(this.f18450j, resultLanguageContext.f18450j) && this.f18451k == resultLanguageContext.f18451k && C5207g.m11106a(this.f18452l, resultLanguageContext.f18452l);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18441a) * 31;
        int iHashCode2 = 0;
        String str = this.f18442b;
        int iM848g = C0204c.m848g(this.f18444d, C0009a.m16d(this.f18443c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        LanguageContextNotification languageContextNotification = this.f18445e;
        int iHashCode3 = (iM848g + (languageContextNotification == null ? 0 : languageContextNotification.hashCode())) * 31;
        LanguageContextNotification languageContextNotification2 = this.f18446f;
        int iHashCode4 = (iHashCode3 + (languageContextNotification2 == null ? 0 : languageContextNotification2.hashCode())) * 31;
        Boolean bool = this.f18447g;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f18448h;
        int iM848g2 = C0204c.m848g(this.f18449i, (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Language language = this.f18450j;
        int iM16d = C0009a.m16d(this.f18451k, (iM848g2 + (language == null ? 0 : language.hashCode())) * 31, 31);
        List<Boolean> list = this.f18452l;
        if (list != null) {
            iHashCode2 = list.hashCode();
        }
        return iM16d + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultLanguageContext(pk=");
        sb2.append(this.f18441a);
        sb2.append(", url=");
        sb2.append(this.f18442b);
        sb2.append(", repetitionLingQs=");
        sb2.append(this.f18443c);
        sb2.append(", lotdDates=");
        sb2.append(this.f18444d);
        sb2.append(", emailNotifications=");
        sb2.append(this.f18445e);
        sb2.append(", siteNotifications=");
        sb2.append(this.f18446f);
        sb2.append(", isUseFeed=");
        sb2.append(this.f18447g);
        sb2.append(", intense=");
        sb2.append(this.f18448h);
        sb2.append(", tags=");
        sb2.append(this.f18449i);
        sb2.append(", language=");
        sb2.append(this.f18450j);
        sb2.append(", streakDays=");
        sb2.append(this.f18451k);
        sb2.append(", feedLevels=");
        return C0009a.m24m(sb2, this.f18452l, ")");
    }
}

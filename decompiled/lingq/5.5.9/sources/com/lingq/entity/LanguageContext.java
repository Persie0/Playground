package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/LanguageContext;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LanguageContext {

    /* JADX INFO: renamed from: a */
    public final String f16994a;

    /* JADX INFO: renamed from: b */
    public final int f16995b;

    /* JADX INFO: renamed from: c */
    public final String f16996c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "repetition_lingqs")
    public int f16997d;

    /* JADX INFO: renamed from: e */
    @InterfaceC9303g(name = "lotd_dates")
    public final List<String> f16998e;

    /* JADX INFO: renamed from: f */
    @InterfaceC9303g(name = "email_notifications")
    public LanguageContextNotification f16999f;

    /* JADX INFO: renamed from: g */
    @InterfaceC9303g(name = "site_notifications")
    public LanguageContextNotification f17000g;

    /* JADX INFO: renamed from: h */
    @InterfaceC9303g(name = "use_feed")
    public final Boolean f17001h;

    /* JADX INFO: renamed from: i */
    public String f17002i;

    /* JADX INFO: renamed from: j */
    @InterfaceC9303g(name = "streak_days")
    public final int f17003j;

    /* JADX INFO: renamed from: k */
    public final List<String> f17004k;

    /* JADX INFO: renamed from: l */
    public final Boolean f17005l;

    /* JADX INFO: renamed from: m */
    public final String f17006m;

    /* JADX INFO: renamed from: n */
    public final String f17007n;

    /* JADX INFO: renamed from: o */
    public final Integer f17008o;

    /* JADX INFO: renamed from: p */
    public final String f17009p;

    /* JADX INFO: renamed from: q */
    public List<String> f17010q;

    public LanguageContext(String str, int i10, String str2, int i11, List<String> list, LanguageContextNotification languageContextNotification, LanguageContextNotification languageContextNotification2, Boolean bool, String str3, int i12, List<String> list2, Boolean bool2, String str4, String str5, Integer num, String str6, List<String> list3) {
        C5207g.m11111f(str, "code");
        C5207g.m11111f(list, "lotdDates");
        C5207g.m11111f(list2, "tags");
        this.f16994a = str;
        this.f16995b = i10;
        this.f16996c = str2;
        this.f16997d = i11;
        this.f16998e = list;
        this.f16999f = languageContextNotification;
        this.f17000g = languageContextNotification2;
        this.f17001h = bool;
        this.f17002i = str3;
        this.f17003j = i12;
        this.f17004k = list2;
        this.f17005l = bool2;
        this.f17006m = str4;
        this.f17007n = str5;
        this.f17008o = num;
        this.f17009p = str6;
        this.f17010q = list3;
    }

    public /* synthetic */ LanguageContext(String str, int i10, String str2, int i11, List list, LanguageContextNotification languageContextNotification, LanguageContextNotification languageContextNotification2, Boolean bool, String str3, int i12, List list2, Boolean bool2, String str4, String str5, Integer num, String str6, List list3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0 : i10, str2, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? new ArrayList() : list, languageContextNotification, languageContextNotification2, (i13 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? Boolean.FALSE : bool, str3, i12, (i13 & 1024) != 0 ? new ArrayList() : list2, bool2, str4, str5, num, str6, (i13 & 65536) != 0 ? new ArrayList() : list3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Language)) {
            return false;
        }
        return C5207g.m11106a(this.f16994a, ((Language) obj).f16981a);
    }

    public final int hashCode() {
        int iHashCode = this.f16994a.hashCode() * 31;
        Boolean bool = this.f17005l;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f17006m;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17007n;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f17008o;
        int iIntValue = (iHashCode4 + (num != null ? num.intValue() : 0)) * 31;
        String str3 = this.f17009p;
        return iIntValue + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "LanguageContext(code=" + this.f16994a + ", pk=" + this.f16995b + ", url=" + this.f16996c + ", repetitionLingQs=" + this.f16997d + ", lotdDates=" + this.f16998e + ", emailNotifications=" + this.f16999f + ", siteNotifications=" + this.f17000g + ", isUseFeed=" + this.f17001h + ", intense=" + this.f17002i + ", streakDays=" + this.f17003j + ", tags=" + this.f17004k + ", supported=" + this.f17005l + ", title=" + this.f17006m + ", lastUsed=" + this.f17007n + ", knownWords=" + this.f17008o + ", grammarResourceSlug=" + this.f17009p + ", feedLevels=" + this.f17010q + ")";
    }
}

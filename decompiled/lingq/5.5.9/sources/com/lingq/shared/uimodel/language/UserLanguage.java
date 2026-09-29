package com.lingq.shared.uimodel.language;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class UserLanguage {

    /* JADX INFO: renamed from: a */
    public final String f21726a;

    /* JADX INFO: renamed from: b */
    public final int f21727b;

    /* JADX INFO: renamed from: c */
    public final String f21728c;

    /* JADX INFO: renamed from: d */
    public final List<String> f21729d;

    /* JADX INFO: renamed from: e */
    public final boolean f21730e;

    /* JADX INFO: renamed from: f */
    public final String f21731f;

    /* JADX INFO: renamed from: g */
    public final String f21732g;

    /* JADX INFO: renamed from: h */
    public final int f21733h;

    /* JADX INFO: renamed from: i */
    public final String f21734i;

    /* JADX INFO: renamed from: j */
    public final String f21735j;

    /* JADX INFO: renamed from: k */
    public final UserLanguageStudyStats f21736k;

    /* JADX INFO: renamed from: l */
    public final String f21737l;

    /* JADX INFO: renamed from: m */
    public final int f21738m;

    /* JADX INFO: renamed from: n */
    public final int f21739n;

    /* JADX INFO: renamed from: o */
    public final String f21740o;

    /* JADX INFO: renamed from: p */
    public final String f21741p;

    /* JADX INFO: renamed from: q */
    public final List<String> f21742q;

    public UserLanguage(String str, int i10, String str2, List<String> list, boolean z10, String str3, String str4, int i11, String str5, String str6, UserLanguageStudyStats userLanguageStudyStats, String str7, int i12, int i13, String str8, String str9, List<String> list2) {
        C5207g.m11111f(str, "code");
        C5207g.m11111f(list, "tags");
        C5207g.m11111f(str3, "title");
        this.f21726a = str;
        this.f21727b = i10;
        this.f21728c = str2;
        this.f21729d = list;
        this.f21730e = z10;
        this.f21731f = str3;
        this.f21732g = str4;
        this.f21733h = i11;
        this.f21734i = str5;
        this.f21735j = str6;
        this.f21736k = userLanguageStudyStats;
        this.f21737l = str7;
        this.f21738m = i12;
        this.f21739n = i13;
        this.f21740o = str8;
        this.f21741p = str9;
        this.f21742q = list2;
    }

    public /* synthetic */ UserLanguage(String str, int i10, String str2, List list, boolean z10, String str3, String str4, int i11, String str5, String str6, UserLanguageStudyStats userLanguageStudyStats, String str7, int i12, int i13, String str8, String str9, List list2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? 0 : i10, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? new ArrayList() : list, (i14 & 16) != 0 ? true : z10, (i14 & 32) != 0 ? "" : str3, (i14 & 64) != 0 ? "" : str4, (i14 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : i11, (i14 & 256) != 0 ? "" : str5, (i14 & 512) != 0 ? "" : str6, userLanguageStudyStats, str7, i12, (i14 & 8192) != 0 ? 0 : i13, (i14 & 16384) != 0 ? "" : str8, (32768 & i14) != 0 ? "" : str9, (i14 & 65536) != 0 ? new ArrayList() : list2);
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof UserLanguage)) {
            return false;
        }
        UserLanguage userLanguage = (UserLanguage) obj;
        if (C5207g.m11106a(this.f21726a, userLanguage.f21726a) && C5207g.m11106a(this.f21737l, userLanguage.f21737l) && this.f21739n == userLanguage.f21739n && C5207g.m11106a(this.f21740o, userLanguage.f21740o) && C5207g.m11106a(this.f21741p, userLanguage.f21741p) && C5207g.m11106a(this.f21742q, userLanguage.f21742q)) {
            z10 = true;
        }
        return z10;
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f21731f, (Boolean.hashCode(this.f21730e) + (this.f21726a.hashCode() * 31)) * 31, 31);
        int iHashCode = 0;
        String str = this.f21732g;
        int iHashCode2 = (((iM758d + (str != null ? str.hashCode() : 0)) * 31) + this.f21733h) * 31;
        String str2 = this.f21734i;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f21735j;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserLanguage(code=");
        sb2.append(this.f21726a);
        sb2.append(", pk=");
        sb2.append(this.f21727b);
        sb2.append(", url=");
        sb2.append(this.f21728c);
        sb2.append(", tags=");
        sb2.append(this.f21729d);
        sb2.append(", supported=");
        sb2.append(this.f21730e);
        sb2.append(", title=");
        sb2.append(this.f21731f);
        sb2.append(", lastUsed=");
        sb2.append(this.f21732g);
        sb2.append(", knownWords=");
        sb2.append(this.f21733h);
        sb2.append(", dictionaryLocaleActive=");
        sb2.append(this.f21734i);
        sb2.append(", grammarResourceSlug=");
        sb2.append(this.f21735j);
        sb2.append(", studyStats=");
        sb2.append(this.f21736k);
        sb2.append(", intense=");
        sb2.append(this.f21737l);
        sb2.append(", streakDays=");
        sb2.append(this.f21738m);
        sb2.append(", repetitionLingQs=");
        sb2.append(this.f21739n);
        sb2.append(", emailLotd=");
        sb2.append(this.f21740o);
        sb2.append(", siteLotd=");
        sb2.append(this.f21741p);
        sb2.append(", feedLevels=");
        return C0009a.m24m(sb2, this.f21742q, ")");
    }
}

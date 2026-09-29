package com.lingq.shared.domain;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/domain/Profile;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Profile {

    /* JADX INFO: renamed from: a */
    public final int f17781a;

    /* JADX INFO: renamed from: b */
    public final String f17782b;

    /* JADX INFO: renamed from: c */
    public final String f17783c;

    /* JADX INFO: renamed from: d */
    public final String f17784d;

    /* JADX INFO: renamed from: e */
    @InterfaceC9303g(name = "first_name")
    public final String f17785e;

    /* JADX INFO: renamed from: f */
    @InterfaceC9303g(name = "last_name")
    public final String f17786f;

    /* JADX INFO: renamed from: g */
    public final String f17787g;

    /* JADX INFO: renamed from: h */
    public final String f17788h;

    /* JADX INFO: renamed from: i */
    @InterfaceC9303g(name = "skype_name")
    public final String f17789i;

    /* JADX INFO: renamed from: j */
    public final String f17790j;

    /* JADX INFO: renamed from: k */
    public final String f17791k;

    /* JADX INFO: renamed from: l */
    public final String f17792l;

    /* JADX INFO: renamed from: m */
    public final String f17793m;

    /* JADX INFO: renamed from: n */
    public String f17794n;

    /* JADX INFO: renamed from: o */
    @InterfaceC9303g(name = "active_language")
    public String f17795o;

    /* JADX INFO: renamed from: p */
    @InterfaceC9303g(name = "dictionary_locale")
    public String f17796p;

    /* JADX INFO: renamed from: q */
    @InterfaceC9303g(name = "native_language")
    public final String f17797q;

    /* JADX INFO: renamed from: r */
    @InterfaceC9303g(name = "dictionary_languages")
    public List<String> f17798r;

    /* JADX INFO: renamed from: s */
    public final ProfileSetting f17799s;

    /* JADX INFO: renamed from: t */
    public int f17800t;

    public Profile() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048575, null);
    }

    public Profile(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List<String> list, ProfileSetting profileSetting, int i11) {
        C5207g.m11111f(str, "url");
        C5207g.m11111f(str2, "username");
        C5207g.m11111f(str4, "firstName");
        C5207g.m11111f(str5, "lastName");
        C5207g.m11111f(str6, "email");
        C5207g.m11111f(str7, "country");
        C5207g.m11111f(str8, "skypeName");
        C5207g.m11111f(str9, "province");
        C5207g.m11111f(str10, "timezone");
        C5207g.m11111f(str11, "photo");
        C5207g.m11111f(str12, "description");
        C5207g.m11111f(str13, "locale");
        C5207g.m11111f(str14, "activeLanguage");
        C5207g.m11111f(str15, "dictionaryLocale");
        C5207g.m11111f(str16, "nativeLanguage");
        C5207g.m11111f(list, "dictionaryLanguages");
        this.f17781a = i10;
        this.f17782b = str;
        this.f17783c = str2;
        this.f17784d = str3;
        this.f17785e = str4;
        this.f17786f = str5;
        this.f17787g = str6;
        this.f17788h = str7;
        this.f17789i = str8;
        this.f17790j = str9;
        this.f17791k = str10;
        this.f17792l = str11;
        this.f17793m = str12;
        this.f17794n = str13;
        this.f17795o = str14;
        this.f17796p = str15;
        this.f17797q = str16;
        this.f17798r = list;
        this.f17799s = profileSetting;
        this.f17800t = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Profile(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List list, ProfileSetting profileSetting, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        String str17 = "";
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? "" : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? "" : str4, (i12 & 32) != 0 ? "" : str5, (i12 & 64) != 0 ? "" : str6, (i12 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? "" : str7, (i12 & 256) != 0 ? "" : str8, (i12 & 512) != 0 ? "" : str9, (i12 & 1024) != 0 ? "" : str10, (i12 & 2048) != 0 ? "" : str11, (i12 & 4096) != 0 ? "" : str12, (i12 & 8192) != 0 ? "" : str13, (i12 & 16384) != 0 ? str17 : str14, (i12 & 32768) != 0 ? str17 : str15, (i12 & 65536) == 0 ? str16 : "", (i12 & 131072) != 0 ? EmptyList.f38032a : list, (i12 & 262144) != 0 ? null : profileSetting, (i12 & 524288) != 0 ? 0 : i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        return this.f17781a == profile.f17781a && C5207g.m11106a(this.f17782b, profile.f17782b) && C5207g.m11106a(this.f17783c, profile.f17783c) && C5207g.m11106a(this.f17784d, profile.f17784d) && C5207g.m11106a(this.f17785e, profile.f17785e) && C5207g.m11106a(this.f17786f, profile.f17786f) && C5207g.m11106a(this.f17787g, profile.f17787g) && C5207g.m11106a(this.f17788h, profile.f17788h) && C5207g.m11106a(this.f17789i, profile.f17789i) && C5207g.m11106a(this.f17790j, profile.f17790j) && C5207g.m11106a(this.f17791k, profile.f17791k) && C5207g.m11106a(this.f17792l, profile.f17792l) && C5207g.m11106a(this.f17793m, profile.f17793m) && C5207g.m11106a(this.f17794n, profile.f17794n) && C5207g.m11106a(this.f17795o, profile.f17795o) && C5207g.m11106a(this.f17796p, profile.f17796p) && C5207g.m11106a(this.f17797q, profile.f17797q) && C5207g.m11106a(this.f17798r, profile.f17798r) && C5207g.m11106a(this.f17799s, profile.f17799s) && this.f17800t == profile.f17800t;
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f17783c, C0166e.m758d(this.f17782b, Integer.hashCode(this.f17781a) * 31, 31), 31);
        int iHashCode = 0;
        String str = this.f17784d;
        int iM848g = C0204c.m848g(this.f17798r, C0166e.m758d(this.f17797q, C0166e.m758d(this.f17796p, C0166e.m758d(this.f17795o, C0166e.m758d(this.f17794n, C0166e.m758d(this.f17793m, C0166e.m758d(this.f17792l, C0166e.m758d(this.f17791k, C0166e.m758d(this.f17790j, C0166e.m758d(this.f17789i, C0166e.m758d(this.f17788h, C0166e.m758d(this.f17787g, C0166e.m758d(this.f17786f, C0166e.m758d(this.f17785e, (iM758d + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        ProfileSetting profileSetting = this.f17799s;
        if (profileSetting != null) {
            iHashCode = profileSetting.hashCode();
        }
        return Integer.hashCode(this.f17800t) + ((iM848g + iHashCode) * 31);
    }

    public final String toString() {
        String str = this.f17794n;
        String str2 = this.f17795o;
        String str3 = this.f17796p;
        List<String> list = this.f17798r;
        int i10 = this.f17800t;
        StringBuilder sb2 = new StringBuilder("Profile(id=");
        sb2.append(this.f17781a);
        sb2.append(", url=");
        sb2.append(this.f17782b);
        sb2.append(", username=");
        sb2.append(this.f17783c);
        sb2.append(", role=");
        sb2.append(this.f17784d);
        sb2.append(", firstName=");
        sb2.append(this.f17785e);
        sb2.append(", lastName=");
        sb2.append(this.f17786f);
        sb2.append(", email=");
        sb2.append(this.f17787g);
        sb2.append(", country=");
        sb2.append(this.f17788h);
        sb2.append(", skypeName=");
        sb2.append(this.f17789i);
        sb2.append(", province=");
        sb2.append(this.f17790j);
        sb2.append(", timezone=");
        sb2.append(this.f17791k);
        sb2.append(", photo=");
        sb2.append(this.f17792l);
        sb2.append(", description=");
        C0166e.m777x(sb2, this.f17793m, ", locale=", str, ", activeLanguage=");
        C0166e.m777x(sb2, str2, ", dictionaryLocale=", str3, ", nativeLanguage=");
        sb2.append(this.f17797q);
        sb2.append(", dictionaryLanguages=");
        sb2.append(list);
        sb2.append(", setting=");
        sb2.append(this.f17799s);
        sb2.append(", balance=");
        sb2.append(i10);
        sb2.append(")");
        return sb2.toString();
    }
}

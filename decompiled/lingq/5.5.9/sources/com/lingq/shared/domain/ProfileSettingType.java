package com.lingq.shared.domain;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/domain/ProfileSettingType;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ProfileSettingType {

    /* JADX INFO: renamed from: a */
    public final String f17838a;

    /* JADX INFO: renamed from: b */
    public final String f17839b;

    /* JADX INFO: renamed from: c */
    public final String f17840c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "autoplay_tts")
    public final String f17841d;

    /* JADX INFO: renamed from: e */
    @InterfaceC9303g(name = "remove_when_increase")
    public final String f17842e;

    /* JADX INFO: renamed from: f */
    @InterfaceC9303g(name = "front_status")
    public final String f17843f;

    /* JADX INFO: renamed from: g */
    @InterfaceC9303g(name = "front_fragment")
    public final String f17844g;

    /* JADX INFO: renamed from: h */
    @InterfaceC9303g(name = "front_hint")
    public final String f17845h;

    /* JADX INFO: renamed from: i */
    @InterfaceC9303g(name = "front_order")
    public final String f17846i;

    /* JADX INFO: renamed from: j */
    @InterfaceC9303g(name = "front_term")
    public final String f17847j;

    /* JADX INFO: renamed from: k */
    @InterfaceC9303g(name = "front_script")
    public final String f17848k;

    /* JADX INFO: renamed from: l */
    @InterfaceC9303g(name = "back_status")
    public final String f17849l;

    /* JADX INFO: renamed from: m */
    @InterfaceC9303g(name = "back_script")
    public final String f17850m;

    /* JADX INFO: renamed from: n */
    @InterfaceC9303g(name = "back_fragment")
    public final String f17851n;

    /* JADX INFO: renamed from: o */
    @InterfaceC9303g(name = "back_term")
    public final String f17852o;

    /* JADX INFO: renamed from: p */
    @InterfaceC9303g(name = "back_hint")
    public final String f17853p;

    /* JADX INFO: renamed from: q */
    @InterfaceC9303g(name = "front_script_ja")
    public final String f17854q;

    /* JADX INFO: renamed from: r */
    @InterfaceC9303g(name = "front_script_zh")
    public final String f17855r;

    /* JADX INFO: renamed from: s */
    @InterfaceC9303g(name = "back_script_ja")
    public final String f17856s;

    /* JADX INFO: renamed from: t */
    @InterfaceC9303g(name = "back_script_zh")
    public final String f17857t;

    public ProfileSettingType() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public ProfileSettingType(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        C5207g.m11111f(str, "repeat");
        C5207g.m11111f(str2, "shuffle");
        C5207g.m11111f(str3, "disabled");
        C5207g.m11111f(str4, "autoPlayTts");
        C5207g.m11111f(str5, "removeWhenIncrease");
        C5207g.m11111f(str6, "frontStatus");
        C5207g.m11111f(str7, "frontFragment");
        C5207g.m11111f(str8, "frontHint");
        C5207g.m11111f(str9, "frontOrder");
        C5207g.m11111f(str10, "frontTerm");
        C5207g.m11111f(str11, "frontScript");
        C5207g.m11111f(str12, "backStatus");
        C5207g.m11111f(str13, "backScript");
        C5207g.m11111f(str14, "backFragment");
        C5207g.m11111f(str15, "backTerm");
        C5207g.m11111f(str16, "backHint");
        C5207g.m11111f(str17, "frontScriptJa");
        C5207g.m11111f(str18, "frontScriptZh");
        C5207g.m11111f(str19, "backScriptJa");
        C5207g.m11111f(str20, "backScriptZh");
        this.f17838a = str;
        this.f17839b = str2;
        this.f17840c = str3;
        this.f17841d = str4;
        this.f17842e = str5;
        this.f17843f = str6;
        this.f17844g = str7;
        this.f17845h = str8;
        this.f17846i = str9;
        this.f17847j = str10;
        this.f17848k = str11;
        this.f17849l = str12;
        this.f17850m = str13;
        this.f17851n = str14;
        this.f17852o = str15;
        this.f17853p = str16;
        this.f17854q = str17;
        this.f17855r = str18;
        this.f17856s = str19;
        this.f17857t = str20;
    }

    public /* synthetic */ ProfileSettingType(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5, (i10 & 32) != 0 ? "" : str6, (i10 & 64) != 0 ? "" : str7, (i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? "" : str8, (i10 & 256) != 0 ? "" : str9, (i10 & 512) != 0 ? "" : str10, (i10 & 1024) != 0 ? "" : str11, (i10 & 2048) != 0 ? "" : str12, (i10 & 4096) != 0 ? "" : str13, (i10 & 8192) != 0 ? "" : str14, (i10 & 16384) != 0 ? "" : str15, (i10 & 32768) != 0 ? "" : str16, (i10 & 65536) != 0 ? "" : str17, (i10 & 131072) != 0 ? "" : str18, (i10 & 262144) != 0 ? "" : str19, (i10 & 524288) != 0 ? "" : str20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileSettingType)) {
            return false;
        }
        ProfileSettingType profileSettingType = (ProfileSettingType) obj;
        return C5207g.m11106a(this.f17838a, profileSettingType.f17838a) && C5207g.m11106a(this.f17839b, profileSettingType.f17839b) && C5207g.m11106a(this.f17840c, profileSettingType.f17840c) && C5207g.m11106a(this.f17841d, profileSettingType.f17841d) && C5207g.m11106a(this.f17842e, profileSettingType.f17842e) && C5207g.m11106a(this.f17843f, profileSettingType.f17843f) && C5207g.m11106a(this.f17844g, profileSettingType.f17844g) && C5207g.m11106a(this.f17845h, profileSettingType.f17845h) && C5207g.m11106a(this.f17846i, profileSettingType.f17846i) && C5207g.m11106a(this.f17847j, profileSettingType.f17847j) && C5207g.m11106a(this.f17848k, profileSettingType.f17848k) && C5207g.m11106a(this.f17849l, profileSettingType.f17849l) && C5207g.m11106a(this.f17850m, profileSettingType.f17850m) && C5207g.m11106a(this.f17851n, profileSettingType.f17851n) && C5207g.m11106a(this.f17852o, profileSettingType.f17852o) && C5207g.m11106a(this.f17853p, profileSettingType.f17853p) && C5207g.m11106a(this.f17854q, profileSettingType.f17854q) && C5207g.m11106a(this.f17855r, profileSettingType.f17855r) && C5207g.m11106a(this.f17856s, profileSettingType.f17856s) && C5207g.m11106a(this.f17857t, profileSettingType.f17857t);
    }

    public final int hashCode() {
        return this.f17857t.hashCode() + C0166e.m758d(this.f17856s, C0166e.m758d(this.f17855r, C0166e.m758d(this.f17854q, C0166e.m758d(this.f17853p, C0166e.m758d(this.f17852o, C0166e.m758d(this.f17851n, C0166e.m758d(this.f17850m, C0166e.m758d(this.f17849l, C0166e.m758d(this.f17848k, C0166e.m758d(this.f17847j, C0166e.m758d(this.f17846i, C0166e.m758d(this.f17845h, C0166e.m758d(this.f17844g, C0166e.m758d(this.f17843f, C0166e.m758d(this.f17842e, C0166e.m758d(this.f17841d, C0166e.m758d(this.f17840c, C0166e.m758d(this.f17839b, this.f17838a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileSettingType(repeat=");
        sb2.append(this.f17838a);
        sb2.append(", shuffle=");
        sb2.append(this.f17839b);
        sb2.append(", disabled=");
        sb2.append(this.f17840c);
        sb2.append(", autoPlayTts=");
        sb2.append(this.f17841d);
        sb2.append(", removeWhenIncrease=");
        sb2.append(this.f17842e);
        sb2.append(", frontStatus=");
        sb2.append(this.f17843f);
        sb2.append(", frontFragment=");
        sb2.append(this.f17844g);
        sb2.append(", frontHint=");
        sb2.append(this.f17845h);
        sb2.append(", frontOrder=");
        sb2.append(this.f17846i);
        sb2.append(", frontTerm=");
        sb2.append(this.f17847j);
        sb2.append(", frontScript=");
        sb2.append(this.f17848k);
        sb2.append(", backStatus=");
        sb2.append(this.f17849l);
        sb2.append(", backScript=");
        sb2.append(this.f17850m);
        sb2.append(", backFragment=");
        sb2.append(this.f17851n);
        sb2.append(", backTerm=");
        sb2.append(this.f17852o);
        sb2.append(", backHint=");
        sb2.append(this.f17853p);
        sb2.append(", frontScriptJa=");
        sb2.append(this.f17854q);
        sb2.append(", frontScriptZh=");
        sb2.append(this.f17855r);
        sb2.append(", backScriptJa=");
        sb2.append(this.f17856s);
        sb2.append(", backScriptZh=");
        return C0009a.m23l(sb2, this.f17857t, ")");
    }
}

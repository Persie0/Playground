package com.lingq.shared.uimodel.language;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mo.C7661i;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserDictionaryData;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class UserDictionaryData {

    /* JADX INFO: renamed from: a */
    public final int f21703a;

    /* JADX INFO: renamed from: b */
    public final String f21704b;

    /* JADX INFO: renamed from: c */
    public final int f21705c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "url_trans")
    public final String f21706d;

    /* JADX INFO: renamed from: e */
    @InterfaceC9303g(name = "url_def")
    public final String f21707e;

    /* JADX INFO: renamed from: f */
    @InterfaceC9303g(name = "popup_window")
    public final boolean f21708f;

    /* JADX INFO: renamed from: g */
    @InterfaceC9303g(name = "langTo")
    public final String f21709g;

    /* JADX INFO: renamed from: h */
    @InterfaceC9303g(name = "var1")
    public final String f21710h;

    /* JADX INFO: renamed from: i */
    @InterfaceC9303g(name = "var2")
    public final String f21711i;

    /* JADX INFO: renamed from: j */
    @InterfaceC9303g(name = "var3")
    public final String f21712j;

    /* JADX INFO: renamed from: k */
    @InterfaceC9303g(name = "var4")
    public final String f21713k;

    /* JADX INFO: renamed from: l */
    @InterfaceC9303g(name = "var5")
    public final String f21714l;

    /* JADX INFO: renamed from: m */
    @InterfaceC9303g(name = "override_url")
    public final String f21715m;

    public UserDictionaryData(int i10, String str, int i11, String str2, String str3, boolean z10, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        C5207g.m11111f(str, "name");
        C5207g.m11111f(str2, "urlToTransform");
        C5207g.m11111f(str3, "urlDefinition");
        C5207g.m11111f(str4, "languageTo");
        C5207g.m11111f(str5, "urlVar1");
        C5207g.m11111f(str6, "urlVar2");
        C5207g.m11111f(str7, "urlVar3");
        C5207g.m11111f(str8, "urlVar4");
        C5207g.m11111f(str9, "urlVar5");
        C5207g.m11111f(str10, "overrideUrl");
        this.f21703a = i10;
        this.f21704b = str;
        this.f21705c = i11;
        this.f21706d = str2;
        this.f21707e = str3;
        this.f21708f = z10;
        this.f21709g = str4;
        this.f21710h = str5;
        this.f21711i = str6;
        this.f21712j = str7;
        this.f21713k = str8;
        this.f21714l = str9;
        this.f21715m = str10;
    }

    public /* synthetic */ UserDictionaryData(int i10, String str, int i11, String str2, String str3, boolean z10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? -1 : i11, (i12 & 8) != 0 ? "" : str2, (i12 & 16) != 0 ? "" : str3, (i12 & 32) != 0 ? false : z10, (i12 & 64) != 0 ? "" : str4, (i12 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? "" : str5, (i12 & 256) != 0 ? "" : str6, (i12 & 512) != 0 ? "" : str7, (i12 & 1024) != 0 ? "" : str8, (i12 & 2048) != 0 ? "" : str9, (i12 & 4096) == 0 ? str10 : "");
    }

    /* JADX INFO: renamed from: a */
    public final String m9702a() {
        return C7661i.m15254T2(C7661i.m15254T2(this.f21704b, "(popup)", ""), "(Popup)", "");
    }

    /* JADX INFO: renamed from: b */
    public final String m9703b(String str) {
        C5207g.m11111f(str, "term");
        String str2 = this.f21715m;
        boolean z10 = !C7661i.m15250P2(str2);
        String str3 = this.f21714l;
        String str4 = this.f21713k;
        String str5 = this.f21712j;
        String str6 = this.f21711i;
        String str7 = this.f21710h;
        return z10 ? C7661i.m15254T2(C7661i.m15254T2(C7661i.m15254T2(C7661i.m15254T2(C7661i.m15254T2(C7661i.m15254T2(str2, "%(term)s", str), "%(var1)s", str7), "%(var2)s", str6), "%(var3)s", str5), "%(var4)s", str4), "%(var5)s", str3) : C7661i.m15254T2(C7661i.m15254T2(C7661i.m15254T2(C7661i.m15254T2(C7661i.m15254T2(C7661i.m15254T2(this.f21706d, "%(term)s", str), "%(var1)s", str7), "%(var2)s", str6), "%(var3)s", str5), "%(var4)s", str4), "%(var5)s", str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDictionaryData)) {
            return false;
        }
        UserDictionaryData userDictionaryData = (UserDictionaryData) obj;
        return this.f21703a == userDictionaryData.f21703a && C5207g.m11106a(this.f21704b, userDictionaryData.f21704b) && this.f21705c == userDictionaryData.f21705c && C5207g.m11106a(this.f21706d, userDictionaryData.f21706d) && C5207g.m11106a(this.f21707e, userDictionaryData.f21707e) && this.f21708f == userDictionaryData.f21708f && C5207g.m11106a(this.f21709g, userDictionaryData.f21709g) && C5207g.m11106a(this.f21710h, userDictionaryData.f21710h) && C5207g.m11106a(this.f21711i, userDictionaryData.f21711i) && C5207g.m11106a(this.f21712j, userDictionaryData.f21712j) && C5207g.m11106a(this.f21713k, userDictionaryData.f21713k) && C5207g.m11106a(this.f21714l, userDictionaryData.f21714l) && C5207g.m11106a(this.f21715m, userDictionaryData.f21715m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f21707e, C0166e.m758d(this.f21706d, C0009a.m16d(this.f21705c, C0166e.m758d(this.f21704b, Integer.hashCode(this.f21703a) * 31, 31), 31), 31), 31);
        boolean z10 = this.f21708f;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f21715m.hashCode() + C0166e.m758d(this.f21714l, C0166e.m758d(this.f21713k, C0166e.m758d(this.f21712j, C0166e.m758d(this.f21711i, C0166e.m758d(this.f21710h, C0166e.m758d(this.f21709g, (iM758d + r10) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserDictionaryData(id=");
        sb2.append(this.f21703a);
        sb2.append(", name=");
        sb2.append(this.f21704b);
        sb2.append(", order=");
        sb2.append(this.f21705c);
        sb2.append(", urlToTransform=");
        sb2.append(this.f21706d);
        sb2.append(", urlDefinition=");
        sb2.append(this.f21707e);
        sb2.append(", isPopUpWindow=");
        sb2.append(this.f21708f);
        sb2.append(", languageTo=");
        sb2.append(this.f21709g);
        sb2.append(", urlVar1=");
        sb2.append(this.f21710h);
        sb2.append(", urlVar2=");
        sb2.append(this.f21711i);
        sb2.append(", urlVar3=");
        sb2.append(this.f21712j);
        sb2.append(", urlVar4=");
        sb2.append(this.f21713k);
        sb2.append(", urlVar5=");
        sb2.append(this.f21714l);
        sb2.append(", overrideUrl=");
        return C0009a.m23l(sb2, this.f21715m, ")");
    }
}

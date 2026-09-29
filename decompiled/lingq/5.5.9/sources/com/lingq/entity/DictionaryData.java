package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/DictionaryData;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class DictionaryData {

    /* JADX INFO: renamed from: a */
    public final int f16950a;

    /* JADX INFO: renamed from: b */
    public final String f16951b;

    /* JADX INFO: renamed from: c */
    public int f16952c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "url_trans")
    public final String f16953d;

    /* JADX INFO: renamed from: e */
    @InterfaceC9303g(name = "url_def")
    public final String f16954e;

    /* JADX INFO: renamed from: f */
    @InterfaceC9303g(name = "popup_window")
    public final boolean f16955f;

    /* JADX INFO: renamed from: g */
    @InterfaceC9303g(name = "langTo")
    public final String f16956g;

    /* JADX INFO: renamed from: h */
    @InterfaceC9303g(name = "var1")
    public final String f16957h;

    /* JADX INFO: renamed from: i */
    @InterfaceC9303g(name = "var2")
    public final String f16958i;

    /* JADX INFO: renamed from: j */
    @InterfaceC9303g(name = "var3")
    public final String f16959j;

    /* JADX INFO: renamed from: k */
    @InterfaceC9303g(name = "var4")
    public final String f16960k;

    /* JADX INFO: renamed from: l */
    @InterfaceC9303g(name = "var5")
    public final String f16961l;

    /* JADX INFO: renamed from: m */
    @InterfaceC9303g(name = "override_url")
    public final String f16962m;

    public DictionaryData(int i10, String str, int i11, String str2, String str3, boolean z10, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
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
        this.f16950a = i10;
        this.f16951b = str;
        this.f16952c = i11;
        this.f16953d = str2;
        this.f16954e = str3;
        this.f16955f = z10;
        this.f16956g = str4;
        this.f16957h = str5;
        this.f16958i = str6;
        this.f16959j = str7;
        this.f16960k = str8;
        this.f16961l = str9;
        this.f16962m = str10;
    }

    public /* synthetic */ DictionaryData(int i10, String str, int i11, String str2, String str3, boolean z10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, i11, str2, str3, (i12 & 32) != 0 ? false : z10, str4, str5, str6, str7, str8, str9, str10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DictionaryData)) {
            return false;
        }
        DictionaryData dictionaryData = (DictionaryData) obj;
        return this.f16950a == dictionaryData.f16950a && C5207g.m11106a(this.f16951b, dictionaryData.f16951b) && this.f16952c == dictionaryData.f16952c && C5207g.m11106a(this.f16953d, dictionaryData.f16953d) && C5207g.m11106a(this.f16954e, dictionaryData.f16954e) && this.f16955f == dictionaryData.f16955f && C5207g.m11106a(this.f16956g, dictionaryData.f16956g) && C5207g.m11106a(this.f16957h, dictionaryData.f16957h) && C5207g.m11106a(this.f16958i, dictionaryData.f16958i) && C5207g.m11106a(this.f16959j, dictionaryData.f16959j) && C5207g.m11106a(this.f16960k, dictionaryData.f16960k) && C5207g.m11106a(this.f16961l, dictionaryData.f16961l) && C5207g.m11106a(this.f16962m, dictionaryData.f16962m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f16954e, C0166e.m758d(this.f16953d, C0009a.m16d(this.f16952c, C0166e.m758d(this.f16951b, Integer.hashCode(this.f16950a) * 31, 31), 31), 31), 31);
        boolean z10 = this.f16955f;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f16962m.hashCode() + C0166e.m758d(this.f16961l, C0166e.m758d(this.f16960k, C0166e.m758d(this.f16959j, C0166e.m758d(this.f16958i, C0166e.m758d(this.f16957h, C0166e.m758d(this.f16956g, (iM758d + r10) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        int i10 = this.f16952c;
        StringBuilder sb2 = new StringBuilder("DictionaryData(id=");
        sb2.append(this.f16950a);
        sb2.append(", name=");
        sb2.append(this.f16951b);
        sb2.append(", order=");
        sb2.append(i10);
        sb2.append(", urlToTransform=");
        sb2.append(this.f16953d);
        sb2.append(", urlDefinition=");
        sb2.append(this.f16954e);
        sb2.append(", isPopUpWindow=");
        sb2.append(this.f16955f);
        sb2.append(", languageTo=");
        sb2.append(this.f16956g);
        sb2.append(", urlVar1=");
        sb2.append(this.f16957h);
        sb2.append(", urlVar2=");
        sb2.append(this.f16958i);
        sb2.append(", urlVar3=");
        sb2.append(this.f16959j);
        sb2.append(", urlVar4=");
        sb2.append(this.f16960k);
        sb2.append(", urlVar5=");
        sb2.append(this.f16961l);
        sb2.append(", overrideUrl=");
        return C0009a.m23l(sb2, this.f16962m, ")");
    }
}

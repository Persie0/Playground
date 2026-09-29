package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultDictionaryData;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultDictionaryData {

    /* JADX INFO: renamed from: a */
    public final int f18395a;

    /* JADX INFO: renamed from: b */
    public final String f18396b;

    /* JADX INFO: renamed from: c */
    public final int f18397c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "url_trans")
    public final String f18398d;

    /* JADX INFO: renamed from: e */
    @InterfaceC9303g(name = "url_def")
    public final String f18399e;

    /* JADX INFO: renamed from: f */
    @InterfaceC9303g(name = "popup_window")
    public final boolean f18400f;

    /* JADX INFO: renamed from: g */
    @InterfaceC9303g(name = "langTo")
    public final String f18401g;

    /* JADX INFO: renamed from: h */
    @InterfaceC9303g(name = "var1")
    public final String f18402h;

    /* JADX INFO: renamed from: i */
    @InterfaceC9303g(name = "var2")
    public final String f18403i;

    /* JADX INFO: renamed from: j */
    @InterfaceC9303g(name = "var3")
    public final String f18404j;

    /* JADX INFO: renamed from: k */
    @InterfaceC9303g(name = "var4")
    public final String f18405k;

    /* JADX INFO: renamed from: l */
    @InterfaceC9303g(name = "var5")
    public final String f18406l;

    /* JADX INFO: renamed from: m */
    @InterfaceC9303g(name = "override_url")
    public final String f18407m;

    public ResultDictionaryData(int i10, String str, int i11, String str2, String str3, boolean z10, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f18395a = i10;
        this.f18396b = str;
        this.f18397c = i11;
        this.f18398d = str2;
        this.f18399e = str3;
        this.f18400f = z10;
        this.f18401g = str4;
        this.f18402h = str5;
        this.f18403i = str6;
        this.f18404j = str7;
        this.f18405k = str8;
        this.f18406l = str9;
        this.f18407m = str10;
    }

    public /* synthetic */ ResultDictionaryData(int i10, String str, int i11, String str2, String str3, boolean z10, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, (i12 & 4) != 0 ? -1 : i11, str2, str3, (i12 & 32) != 0 ? false : z10, str4, str5, str6, str7, str8, str9, str10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultDictionaryData)) {
            return false;
        }
        ResultDictionaryData resultDictionaryData = (ResultDictionaryData) obj;
        return this.f18395a == resultDictionaryData.f18395a && C5207g.m11106a(this.f18396b, resultDictionaryData.f18396b) && this.f18397c == resultDictionaryData.f18397c && C5207g.m11106a(this.f18398d, resultDictionaryData.f18398d) && C5207g.m11106a(this.f18399e, resultDictionaryData.f18399e) && this.f18400f == resultDictionaryData.f18400f && C5207g.m11106a(this.f18401g, resultDictionaryData.f18401g) && C5207g.m11106a(this.f18402h, resultDictionaryData.f18402h) && C5207g.m11106a(this.f18403i, resultDictionaryData.f18403i) && C5207g.m11106a(this.f18404j, resultDictionaryData.f18404j) && C5207g.m11106a(this.f18405k, resultDictionaryData.f18405k) && C5207g.m11106a(this.f18406l, resultDictionaryData.f18406l) && C5207g.m11106a(this.f18407m, resultDictionaryData.f18407m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v41 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18395a) * 31;
        int iHashCode2 = 0;
        String str = this.f18396b;
        int iM16d = C0009a.m16d(this.f18397c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f18398d;
        int iHashCode3 = (iM16d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18399e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z10 = this.f18400f;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode4 + r10) * 31;
        String str4 = this.f18401g;
        int iHashCode5 = (i10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18402h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18403i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f18404j;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f18405k;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f18406l;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f18407m;
        if (str10 != null) {
            iHashCode2 = str10.hashCode();
        }
        return iHashCode10 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultDictionaryData(id=");
        sb2.append(this.f18395a);
        sb2.append(", name=");
        sb2.append(this.f18396b);
        sb2.append(", order=");
        sb2.append(this.f18397c);
        sb2.append(", urlToTransform=");
        sb2.append(this.f18398d);
        sb2.append(", urlDefinition=");
        sb2.append(this.f18399e);
        sb2.append(", isPopUpWindow=");
        sb2.append(this.f18400f);
        sb2.append(", languageTo=");
        sb2.append(this.f18401g);
        sb2.append(", urlVar1=");
        sb2.append(this.f18402h);
        sb2.append(", urlVar2=");
        sb2.append(this.f18403i);
        sb2.append(", urlVar3=");
        sb2.append(this.f18404j);
        sb2.append(", urlVar4=");
        sb2.append(this.f18405k);
        sb2.append(", urlVar5=");
        sb2.append(this.f18406l);
        sb2.append(", overrideUrl=");
        return C0009a.m23l(sb2, this.f18407m, ")");
    }
}

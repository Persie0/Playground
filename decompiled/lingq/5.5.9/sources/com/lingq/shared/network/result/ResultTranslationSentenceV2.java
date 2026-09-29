package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultTranslationSentenceV2;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultTranslationSentenceV2 {

    /* JADX INFO: renamed from: a */
    public final int f19003a;

    /* JADX INFO: renamed from: b */
    public final Double f19004b;

    /* JADX INFO: renamed from: c */
    @InterfaceC9303g(name = "audio_end")
    public final Double f19005c;

    /* JADX INFO: renamed from: d */
    public final String f19006d;

    /* JADX INFO: renamed from: e */
    public final List<ResultTranslationV2> f19007e;

    public ResultTranslationSentenceV2(int i10, Double d10, Double d11, String str, List<ResultTranslationV2> list) {
        C5207g.m11111f(str, "text");
        C5207g.m11111f(list, "translation");
        this.f19003a = i10;
        this.f19004b = d10;
        this.f19005c = d11;
        this.f19006d = str;
        this.f19007e = list;
    }

    public ResultTranslationSentenceV2(int i10, Double d10, Double d11, String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, d10, d11, (i11 & 8) != 0 ? "" : str, (i11 & 16) != 0 ? EmptyList.f38032a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTranslationSentenceV2)) {
            return false;
        }
        ResultTranslationSentenceV2 resultTranslationSentenceV2 = (ResultTranslationSentenceV2) obj;
        return this.f19003a == resultTranslationSentenceV2.f19003a && C5207g.m11106a(this.f19004b, resultTranslationSentenceV2.f19004b) && C5207g.m11106a(this.f19005c, resultTranslationSentenceV2.f19005c) && C5207g.m11106a(this.f19006d, resultTranslationSentenceV2.f19006d) && C5207g.m11106a(this.f19007e, resultTranslationSentenceV2.f19007e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f19003a) * 31;
        Double d10 = this.f19004b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f19005c;
        return this.f19007e.hashCode() + C0166e.m758d(this.f19006d, (iHashCode2 + (d11 != null ? d11.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultTranslationSentenceV2(index=");
        sb2.append(this.f19003a);
        sb2.append(", audio=");
        sb2.append(this.f19004b);
        sb2.append(", audioEnd=");
        sb2.append(this.f19005c);
        sb2.append(", text=");
        sb2.append(this.f19006d);
        sb2.append(", translation=");
        return C0009a.m24m(sb2, this.f19007e, ")");
    }
}

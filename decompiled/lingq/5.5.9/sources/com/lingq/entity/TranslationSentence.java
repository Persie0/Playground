package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/TranslationSentence;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TranslationSentence {

    /* JADX INFO: renamed from: a */
    public final int f17533a;

    /* JADX INFO: renamed from: b */
    public final int f17534b;

    /* JADX INFO: renamed from: c */
    public final Double f17535c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "audio_end")
    public final Double f17536d;

    /* JADX INFO: renamed from: e */
    public final String f17537e;

    /* JADX INFO: renamed from: f */
    public final List<Translation> f17538f;

    public TranslationSentence(int i10, int i11, Double d10, Double d11, String str, List<Translation> list) {
        C5207g.m11111f(str, "text");
        C5207g.m11111f(list, "translations");
        this.f17533a = i10;
        this.f17534b = i11;
        this.f17535c = d10;
        this.f17536d = d11;
        this.f17537e = str;
        this.f17538f = list;
    }

    public TranslationSentence(int i10, int i11, Double d10, Double d11, String str, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, d10, d11, (i12 & 16) != 0 ? "" : str, (i12 & 32) != 0 ? EmptyList.f38032a : list);
    }

    /* JADX INFO: renamed from: a */
    public static TranslationSentence m9388a(TranslationSentence translationSentence, Double d10, Double d11, String str, ArrayList arrayList, int i10) {
        int i11 = (i10 & 1) != 0 ? translationSentence.f17533a : 0;
        int i12 = (i10 & 2) != 0 ? translationSentence.f17534b : 0;
        if ((i10 & 4) != 0) {
            d10 = translationSentence.f17535c;
        }
        Double d12 = d10;
        if ((i10 & 8) != 0) {
            d11 = translationSentence.f17536d;
        }
        Double d13 = d11;
        if ((i10 & 16) != 0) {
            str = translationSentence.f17537e;
        }
        String str2 = str;
        List<Translation> list = arrayList;
        if ((i10 & 32) != 0) {
            list = translationSentence.f17538f;
        }
        List<Translation> list2 = list;
        translationSentence.getClass();
        C5207g.m11111f(str2, "text");
        C5207g.m11111f(list2, "translations");
        return new TranslationSentence(i11, i12, d12, d13, str2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslationSentence)) {
            return false;
        }
        TranslationSentence translationSentence = (TranslationSentence) obj;
        return this.f17533a == translationSentence.f17533a && this.f17534b == translationSentence.f17534b && C5207g.m11106a(this.f17535c, translationSentence.f17535c) && C5207g.m11106a(this.f17536d, translationSentence.f17536d) && C5207g.m11106a(this.f17537e, translationSentence.f17537e) && C5207g.m11106a(this.f17538f, translationSentence.f17538f);
    }

    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f17534b, Integer.hashCode(this.f17533a) * 31, 31);
        int iHashCode = 0;
        Double d10 = this.f17535c;
        int iHashCode2 = (iM16d + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f17536d;
        if (d11 != null) {
            iHashCode = d11.hashCode();
        }
        return this.f17538f.hashCode() + C0166e.m758d(this.f17537e, (iHashCode2 + iHashCode) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TranslationSentence(index=");
        sb2.append(this.f17533a);
        sb2.append(", lessonId=");
        sb2.append(this.f17534b);
        sb2.append(", audio=");
        sb2.append(this.f17535c);
        sb2.append(", audioEnd=");
        sb2.append(this.f17536d);
        sb2.append(", text=");
        sb2.append(this.f17537e);
        sb2.append(", translations=");
        return C0009a.m24m(sb2, this.f17538f, ")");
    }
}

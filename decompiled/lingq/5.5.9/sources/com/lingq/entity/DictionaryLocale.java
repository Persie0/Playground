package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/DictionaryLocale;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class DictionaryLocale {

    /* JADX INFO: renamed from: a */
    public final String f16968a;

    /* JADX INFO: renamed from: b */
    public final String f16969b;

    public DictionaryLocale(String str, String str2) {
        C5207g.m11111f(str, "code");
        C5207g.m11111f(str2, "title");
        this.f16968a = str;
        this.f16969b = str2;
    }

    public /* synthetic */ DictionaryLocale(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DictionaryLocale)) {
            return false;
        }
        DictionaryLocale dictionaryLocale = (DictionaryLocale) obj;
        return C5207g.m11106a(this.f16968a, dictionaryLocale.f16968a) && C5207g.m11106a(this.f16969b, dictionaryLocale.f16969b);
    }

    public final int hashCode() {
        return this.f16969b.hashCode() + (this.f16968a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DictionaryLocale(code=");
        sb2.append(this.f16968a);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f16969b, ")");
    }
}

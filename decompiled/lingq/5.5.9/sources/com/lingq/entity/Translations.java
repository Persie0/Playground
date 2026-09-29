package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Translations;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Translations {

    /* JADX INFO: renamed from: a */
    public final String f17549a;

    /* JADX INFO: renamed from: b */
    public final List<TranslationSimple> f17550b;

    public Translations(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 2) != 0 ? EmptyList.f38032a : list, str);
    }

    public Translations(List list, String str) {
        C5207g.m11111f(str, "termWithLanguageAndTarget");
        C5207g.m11111f(list, "translations");
        this.f17549a = str;
        this.f17550b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Translations)) {
            return false;
        }
        Translations translations = (Translations) obj;
        return C5207g.m11106a(this.f17549a, translations.f17549a) && C5207g.m11106a(this.f17550b, translations.f17550b);
    }

    public final int hashCode() {
        return this.f17550b.hashCode() + (this.f17549a.hashCode() * 31);
    }

    public final String toString() {
        return "Translations(termWithLanguageAndTarget=" + this.f17549a + ", translations=" + this.f17550b + ")";
    }
}

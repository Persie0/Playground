package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/RelatedPhrase;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class RelatedPhrase {

    /* JADX INFO: renamed from: a */
    public final String f17387a;

    /* JADX INFO: renamed from: b */
    public final String f17388b;

    /* JADX INFO: renamed from: c */
    @InterfaceC9303g(name = "hints")
    public final List<Meaning> f17389c;

    public RelatedPhrase(String str, String str2, List<Meaning> list) {
        C5207g.m11111f(list, "meanings");
        this.f17387a = str;
        this.f17388b = str2;
        this.f17389c = list;
    }

    public RelatedPhrase(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? EmptyList.f38032a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedPhrase)) {
            return false;
        }
        RelatedPhrase relatedPhrase = (RelatedPhrase) obj;
        return C5207g.m11106a(this.f17387a, relatedPhrase.f17387a) && C5207g.m11106a(this.f17388b, relatedPhrase.f17388b) && C5207g.m11106a(this.f17389c, relatedPhrase.f17389c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f17387a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17388b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return this.f17389c.hashCode() + ((iHashCode2 + iHashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelatedPhrase(term=");
        sb2.append(this.f17387a);
        sb2.append(", normalizedTerm=");
        sb2.append(this.f17388b);
        sb2.append(", meanings=");
        return C0009a.m24m(sb2, this.f17389c, ")");
    }
}

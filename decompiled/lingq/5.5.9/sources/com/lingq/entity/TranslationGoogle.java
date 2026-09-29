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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/TranslationGoogle;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TranslationGoogle {

    /* JADX INFO: renamed from: a */
    public final List<TranslationSimple> f17526a;

    public TranslationGoogle() {
        this(null, 1, null);
    }

    public TranslationGoogle(List<TranslationSimple> list) {
        C5207g.m11111f(list, "translations");
        this.f17526a = list;
    }

    public TranslationGoogle(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EmptyList.f38032a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TranslationGoogle) && C5207g.m11106a(this.f17526a, ((TranslationGoogle) obj).f17526a);
    }

    public final int hashCode() {
        return this.f17526a.hashCode();
    }

    public final String toString() {
        return "TranslationGoogle(translations=" + this.f17526a + ")";
    }
}

package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/TranslationSimple;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TranslationSimple {

    /* JADX INFO: renamed from: a */
    public final String f17545a;

    /* JADX WARN: Multi-variable type inference failed */
    public TranslationSimple() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TranslationSimple(String str) {
        C5207g.m11111f(str, "translatedText");
        this.f17545a = str;
    }

    public /* synthetic */ TranslationSimple(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TranslationSimple) && C5207g.m11106a(this.f17545a, ((TranslationSimple) obj).f17545a);
    }

    public final int hashCode() {
        return this.f17545a.hashCode();
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("TranslationSimple(translatedText="), this.f17545a, ")");
    }
}

package com.lingq.shared.uimodel.token;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/token/TokenTranslations;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TokenTranslations {

    /* JADX INFO: renamed from: a */
    public final String f22121a;

    /* JADX INFO: renamed from: b */
    public final List<TokenTranslationSimple> f22122b;

    public TokenTranslations(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 2) != 0 ? EmptyList.f38032a : list, str);
    }

    public TokenTranslations(List list, String str) {
        C5207g.m11111f(str, "termWithLanguageAndTarget");
        C5207g.m11111f(list, "translations");
        this.f22121a = str;
        this.f22122b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenTranslations)) {
            return false;
        }
        TokenTranslations tokenTranslations = (TokenTranslations) obj;
        return C5207g.m11106a(this.f22121a, tokenTranslations.f22121a) && C5207g.m11106a(this.f22122b, tokenTranslations.f22122b);
    }

    public final int hashCode() {
        return this.f22122b.hashCode() + (this.f22121a.hashCode() * 31);
    }

    public final String toString() {
        return "TokenTranslations(termWithLanguageAndTarget=" + this.f22121a + ", translations=" + this.f22122b + ")";
    }
}

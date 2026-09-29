package com.lingq.shared.uimodel.token;

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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/token/TokenRelatedPhrase;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TokenRelatedPhrase {

    /* JADX INFO: renamed from: a */
    public final String f22110a;

    /* JADX INFO: renamed from: b */
    public final String f22111b;

    /* JADX INFO: renamed from: c */
    @InterfaceC9303g(name = "hints")
    public final List<TokenMeaning> f22112c;

    public TokenRelatedPhrase() {
        this(null, null, null, 7, null);
    }

    public TokenRelatedPhrase(String str, String str2, List<TokenMeaning> list) {
        C5207g.m11111f(str, "term");
        C5207g.m11111f(str2, "normalizedTerm");
        C5207g.m11111f(list, "meanings");
        this.f22110a = str;
        this.f22111b = str2;
        this.f22112c = list;
    }

    public TokenRelatedPhrase(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? EmptyList.f38032a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenRelatedPhrase)) {
            return false;
        }
        TokenRelatedPhrase tokenRelatedPhrase = (TokenRelatedPhrase) obj;
        return C5207g.m11106a(this.f22110a, tokenRelatedPhrase.f22110a) && C5207g.m11106a(this.f22111b, tokenRelatedPhrase.f22111b) && C5207g.m11106a(this.f22112c, tokenRelatedPhrase.f22112c);
    }

    public final int hashCode() {
        return this.f22112c.hashCode() + C0166e.m758d(this.f22111b, this.f22110a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenRelatedPhrase(term=");
        sb2.append(this.f22110a);
        sb2.append(", normalizedTerm=");
        sb2.append(this.f22111b);
        sb2.append(", meanings=");
        return C0009a.m24m(sb2, this.f22112c, ")");
    }
}

package com.lingq.shared.uimodel.language;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class UserDictionaryLocale {

    /* JADX INFO: renamed from: a */
    public final String f21721a;

    /* JADX INFO: renamed from: b */
    public final String f21722b;

    public UserDictionaryLocale(String str, String str2) {
        C5207g.m11111f(str, "code");
        C5207g.m11111f(str2, "title");
        this.f21721a = str;
        this.f21722b = str2;
    }

    public /* synthetic */ UserDictionaryLocale(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDictionaryLocale)) {
            return false;
        }
        UserDictionaryLocale userDictionaryLocale = (UserDictionaryLocale) obj;
        return C5207g.m11106a(this.f21721a, userDictionaryLocale.f21721a) && C5207g.m11106a(this.f21722b, userDictionaryLocale.f21722b);
    }

    public final int hashCode() {
        return this.f21722b.hashCode() + (this.f21721a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserDictionaryLocale(code=");
        sb2.append(this.f21721a);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f21722b, ")");
    }
}

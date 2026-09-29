package com.lingq.shared.uimodel.language;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/LanguageToLearn;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LanguageToLearn {

    /* JADX INFO: renamed from: a */
    public final String f21681a;

    /* JADX INFO: renamed from: b */
    public final boolean f21682b;

    /* JADX INFO: renamed from: c */
    public final String f21683c;

    /* JADX INFO: renamed from: d */
    public final int f21684d;

    /* JADX INFO: renamed from: e */
    public final String f21685e;

    /* JADX INFO: renamed from: f */
    public final String f21686f;

    public LanguageToLearn(String str, boolean z10, String str2, int i10, String str3, String str4) {
        C5207g.m11111f(str, "code");
        C5207g.m11111f(str2, "title");
        this.f21681a = str;
        this.f21682b = z10;
        this.f21683c = str2;
        this.f21684d = i10;
        this.f21685e = str3;
        this.f21686f = str4;
    }

    public /* synthetic */ LanguageToLearn(String str, boolean z10, String str2, int i10, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? true : z10, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? "" : str3, (i11 & 32) != 0 ? "" : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageToLearn)) {
            return false;
        }
        LanguageToLearn languageToLearn = (LanguageToLearn) obj;
        return C5207g.m11106a(this.f21681a, languageToLearn.f21681a) && this.f21682b == languageToLearn.f21682b && C5207g.m11106a(this.f21683c, languageToLearn.f21683c) && this.f21684d == languageToLearn.f21684d && C5207g.m11106a(this.f21685e, languageToLearn.f21685e) && C5207g.m11106a(this.f21686f, languageToLearn.f21686f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final int hashCode() {
        int iHashCode = this.f21681a.hashCode() * 31;
        boolean z10 = this.f21682b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM16d = C0009a.m16d(this.f21684d, C0166e.m758d(this.f21683c, (iHashCode + r10) * 31, 31), 31);
        int iHashCode2 = 0;
        String str = this.f21685e;
        int iHashCode3 = (iM16d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21686f;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        }
        return iHashCode3 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LanguageToLearn(code=");
        sb2.append(this.f21681a);
        sb2.append(", supported=");
        sb2.append(this.f21682b);
        sb2.append(", title=");
        sb2.append(this.f21683c);
        sb2.append(", knownWords=");
        sb2.append(this.f21684d);
        sb2.append(", dictionaryLocaleActive=");
        sb2.append(this.f21685e);
        sb2.append(", lastUsed=");
        return C0009a.m23l(sb2, this.f21686f, ")");
    }
}

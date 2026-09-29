package com.lingq.shared.uimodel.lesson;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/TranslationStudy;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TranslationStudy {

    /* JADX INFO: renamed from: a */
    public final String f21916a;

    /* JADX INFO: renamed from: b */
    public final String f21917b;

    /* JADX INFO: renamed from: c */
    @InterfaceC9303g(name = "is_google_translate")
    public final boolean f21918c;

    public TranslationStudy(String str, String str2, boolean z10) {
        this.f21916a = str;
        this.f21917b = str2;
        this.f21918c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslationStudy)) {
            return false;
        }
        TranslationStudy translationStudy = (TranslationStudy) obj;
        return C5207g.m11106a(this.f21916a, translationStudy.f21916a) && C5207g.m11106a(this.f21917b, translationStudy.f21917b) && this.f21918c == translationStudy.f21918c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f21917b, this.f21916a.hashCode() * 31, 31);
        boolean z10 = this.f21918c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iM758d + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TranslationStudy(text=");
        sb2.append(this.f21916a);
        sb2.append(", language=");
        sb2.append(this.f21917b);
        sb2.append(", isGoogleTranslated=");
        return C0166e.m769p(sb2, this.f21918c, ")");
    }
}

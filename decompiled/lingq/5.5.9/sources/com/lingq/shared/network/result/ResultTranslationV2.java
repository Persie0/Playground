package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultTranslationV2;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultTranslationV2 {

    /* JADX INFO: renamed from: a */
    public final String f19014a;

    /* JADX INFO: renamed from: b */
    public final String f19015b;

    /* JADX INFO: renamed from: c */
    @InterfaceC9303g(name = "is_google_translate")
    public final boolean f19016c;

    public ResultTranslationV2(String str, String str2, boolean z10) {
        C5207g.m11111f(str, "text");
        C5207g.m11111f(str2, "language");
        this.f19014a = str;
        this.f19015b = str2;
        this.f19016c = z10;
    }

    public /* synthetic */ ResultTranslationV2(String str, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? true : z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTranslationV2)) {
            return false;
        }
        ResultTranslationV2 resultTranslationV2 = (ResultTranslationV2) obj;
        if (C5207g.m11106a(this.f19014a, resultTranslationV2.f19014a) && C5207g.m11106a(this.f19015b, resultTranslationV2.f19015b) && this.f19016c == resultTranslationV2.f19016c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f19015b, this.f19014a.hashCode() * 31, 31);
        boolean z10 = this.f19016c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iM758d + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultTranslationV2(text=");
        sb2.append(this.f19014a);
        sb2.append(", language=");
        sb2.append(this.f19015b);
        sb2.append(", isGoogleTranslate=");
        return C0166e.m769p(sb2, this.f19016c, ")");
    }
}

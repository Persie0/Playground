package com.lingq.shared.network.requests;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestTranslation;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class RequestTranslation {

    /* JADX INFO: renamed from: a */
    public final String f18202a;

    /* JADX INFO: renamed from: b */
    public final String f18203b;

    /* JADX INFO: renamed from: c */
    public final String f18204c;

    public RequestTranslation(String str, String str2, String str3) {
        C5207g.m11111f(str, "text");
        C5207g.m11111f(str2, "language");
        this.f18202a = str;
        this.f18203b = str2;
        this.f18204c = str3;
    }

    public /* synthetic */ RequestTranslation(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestTranslation)) {
            return false;
        }
        RequestTranslation requestTranslation = (RequestTranslation) obj;
        return C5207g.m11106a(this.f18202a, requestTranslation.f18202a) && C5207g.m11106a(this.f18203b, requestTranslation.f18203b) && C5207g.m11106a(this.f18204c, requestTranslation.f18204c);
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f18203b, this.f18202a.hashCode() * 31, 31);
        String str = this.f18204c;
        return iM758d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RequestTranslation(text=");
        sb2.append(this.f18202a);
        sb2.append(", language=");
        sb2.append(this.f18203b);
        sb2.append(", type=");
        return C0009a.m23l(sb2, this.f18204c, ")");
    }
}

package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultTranslation;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultTranslation {

    /* JADX INFO: renamed from: a */
    public final String f18988a;

    /* JADX INFO: renamed from: b */
    public final String f18989b;

    /* JADX INFO: renamed from: c */
    public final String f18990c;

    public ResultTranslation(String str, String str2, String str3) {
        this.f18988a = str;
        this.f18989b = str2;
        this.f18990c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTranslation)) {
            return false;
        }
        ResultTranslation resultTranslation = (ResultTranslation) obj;
        return C5207g.m11106a(this.f18988a, resultTranslation.f18988a) && C5207g.m11106a(this.f18989b, resultTranslation.f18989b) && C5207g.m11106a(this.f18990c, resultTranslation.f18990c);
    }

    public final int hashCode() {
        return this.f18990c.hashCode() + C0166e.m758d(this.f18989b, this.f18988a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultTranslation(text=");
        sb2.append(this.f18988a);
        sb2.append(", language=");
        sb2.append(this.f18989b);
        sb2.append(", type=");
        return C0009a.m23l(sb2, this.f18990c, ")");
    }
}

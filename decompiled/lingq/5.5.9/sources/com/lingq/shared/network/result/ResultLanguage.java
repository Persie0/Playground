package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLanguage;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultLanguage {

    /* JADX INFO: renamed from: a */
    public final int f18437a;

    /* JADX INFO: renamed from: b */
    public final String f18438b;

    /* JADX INFO: renamed from: c */
    public final String f18439c;

    /* JADX INFO: renamed from: d */
    public final String f18440d;

    public ResultLanguage(String str, int i10, String str2, String str3) {
        this.f18437a = i10;
        this.f18438b = str;
        this.f18439c = str2;
        this.f18440d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLanguage)) {
            return false;
        }
        ResultLanguage resultLanguage = (ResultLanguage) obj;
        return this.f18437a == resultLanguage.f18437a && C5207g.m11106a(this.f18438b, resultLanguage.f18438b) && C5207g.m11106a(this.f18439c, resultLanguage.f18439c) && C5207g.m11106a(this.f18440d, resultLanguage.f18440d);
    }

    public final int hashCode() {
        return this.f18440d.hashCode() + C0166e.m758d(this.f18439c, C0166e.m758d(this.f18438b, Integer.hashCode(this.f18437a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultLanguage(id=");
        sb2.append(this.f18437a);
        sb2.append(", code=");
        sb2.append(this.f18438b);
        sb2.append(", url=");
        sb2.append(this.f18439c);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f18440d, ")");
    }
}

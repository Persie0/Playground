package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/FastSearch;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class FastSearch {

    /* JADX INFO: renamed from: a */
    public final String f16973a;

    /* JADX INFO: renamed from: b */
    public final String f16974b;

    /* JADX INFO: renamed from: c */
    public final String f16975c;

    /* JADX INFO: renamed from: d */
    public final String f16976d;

    /* JADX INFO: renamed from: e */
    public final String f16977e;

    public FastSearch(String str, String str2, String str3, String str4, String str5) {
        C5207g.m11111f(str, "id");
        C5207g.m11111f(str2, "language");
        C5207g.m11111f(str3, "query");
        C5207g.m11111f(str4, "type");
        this.f16973a = str;
        this.f16974b = str2;
        this.f16975c = str3;
        this.f16976d = str4;
        this.f16977e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FastSearch)) {
            return false;
        }
        FastSearch fastSearch = (FastSearch) obj;
        return C5207g.m11106a(this.f16973a, fastSearch.f16973a) && C5207g.m11106a(this.f16974b, fastSearch.f16974b) && C5207g.m11106a(this.f16975c, fastSearch.f16975c) && C5207g.m11106a(this.f16976d, fastSearch.f16976d) && C5207g.m11106a(this.f16977e, fastSearch.f16977e);
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f16976d, C0166e.m758d(this.f16975c, C0166e.m758d(this.f16974b, this.f16973a.hashCode() * 31, 31), 31), 31);
        String str = this.f16977e;
        return iM758d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FastSearch(id=");
        sb2.append(this.f16973a);
        sb2.append(", language=");
        sb2.append(this.f16974b);
        sb2.append(", query=");
        sb2.append(this.f16975c);
        sb2.append(", type=");
        sb2.append(this.f16976d);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f16977e, ")");
    }
}

package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Provider;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Provider {

    /* JADX INFO: renamed from: a */
    public final int f17361a;

    /* JADX INFO: renamed from: b */
    public final String f17362b;

    /* JADX INFO: renamed from: c */
    public final String f17363c;

    /* JADX INFO: renamed from: d */
    public final String f17364d;

    /* JADX INFO: renamed from: e */
    public final String f17365e;

    /* JADX INFO: renamed from: f */
    public final String f17366f;

    public Provider(int i10, String str, String str2, String str3, String str4, String str5) {
        this.f17361a = i10;
        this.f17362b = str;
        this.f17363c = str2;
        this.f17364d = str3;
        this.f17365e = str4;
        this.f17366f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Provider)) {
            return false;
        }
        Provider provider = (Provider) obj;
        return this.f17361a == provider.f17361a && C5207g.m11106a(this.f17362b, provider.f17362b) && C5207g.m11106a(this.f17363c, provider.f17363c) && C5207g.m11106a(this.f17364d, provider.f17364d) && C5207g.m11106a(this.f17365e, provider.f17365e) && C5207g.m11106a(this.f17366f, provider.f17366f);
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f17362b, Integer.hashCode(this.f17361a) * 31, 31);
        int iHashCode = 0;
        String str = this.f17363c;
        int iHashCode2 = (iM758d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17364d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17365e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17366f;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return iHashCode4 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Provider(id=");
        sb2.append(this.f17361a);
        sb2.append(", language=");
        sb2.append(this.f17362b);
        sb2.append(", description=");
        sb2.append(this.f17363c);
        sb2.append(", image=");
        sb2.append(this.f17364d);
        sb2.append(", title=");
        sb2.append(this.f17365e);
        sb2.append(", url=");
        return C0009a.m23l(sb2, this.f17366f, ")");
    }
}

package com.lingq.shared.network.requests;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestAppUsageStat;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class RequestAppUsageStat {

    /* JADX INFO: renamed from: a */
    public Double f18022a;

    /* JADX INFO: renamed from: b */
    public Double f18023b;

    /* JADX INFO: renamed from: c */
    public Double f18024c;

    /* JADX INFO: renamed from: d */
    public final String f18025d;

    public RequestAppUsageStat() {
        this(null, null, null, null, 15, null);
    }

    public RequestAppUsageStat(Double d10, Double d11, Double d12, String str) {
        C5207g.m11111f(str, "app");
        this.f18022a = d10;
        this.f18023b = d11;
        this.f18024c = d12;
        this.f18025d = str;
    }

    public /* synthetic */ RequestAppUsageStat(Double d10, Double d11, Double d12, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : d10, (i10 & 2) != 0 ? null : d11, (i10 & 4) != 0 ? null : d12, (i10 & 8) != 0 ? "Android" : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestAppUsageStat)) {
            return false;
        }
        RequestAppUsageStat requestAppUsageStat = (RequestAppUsageStat) obj;
        return C5207g.m11106a(this.f18022a, requestAppUsageStat.f18022a) && C5207g.m11106a(this.f18023b, requestAppUsageStat.f18023b) && C5207g.m11106a(this.f18024c, requestAppUsageStat.f18024c) && C5207g.m11106a(this.f18025d, requestAppUsageStat.f18025d);
    }

    public final int hashCode() {
        Double d10 = this.f18022a;
        int iHashCode = 0;
        int iHashCode2 = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.f18023b;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f18024c;
        if (d12 != null) {
            iHashCode = d12.hashCode();
        }
        return this.f18025d.hashCode() + ((iHashCode3 + iHashCode) * 31);
    }

    public final String toString() {
        return "RequestAppUsageStat(readingUsage=" + this.f18022a + ", listeningUsage=" + this.f18023b + ", reviewUsage=" + this.f18024c + ", app=" + this.f18025d + ")";
    }
}

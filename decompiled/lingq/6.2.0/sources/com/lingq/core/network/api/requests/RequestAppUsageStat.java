package com.lingq.core.network.api.requests;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestAppUsageStat {
    public static final C1555a Companion = new C1555a();

    /* JADX INFO: renamed from: a */
    public final Double f20308a;

    /* JADX INFO: renamed from: b */
    public final Double f20309b;

    /* JADX INFO: renamed from: c */
    public final Double f20310c;

    /* JADX INFO: renamed from: d */
    public final Double f20311d;

    /* JADX INFO: renamed from: e */
    public final String f20312e;

    public /* synthetic */ RequestAppUsageStat(int i, Double d, Double d2, Double d3, Double d4, String str) {
        if ((i & 1) == 0) {
            this.f20308a = null;
        } else {
            this.f20308a = d;
        }
        if ((i & 2) == 0) {
            this.f20309b = null;
        } else {
            this.f20309b = d2;
        }
        if ((i & 4) == 0) {
            this.f20310c = null;
        } else {
            this.f20310c = d3;
        }
        if ((i & 8) == 0) {
            this.f20311d = null;
        } else {
            this.f20311d = d4;
        }
        if ((i & 16) == 0) {
            this.f20312e = "Android";
        } else {
            this.f20312e = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestAppUsageStat)) {
            return false;
        }
        RequestAppUsageStat requestAppUsageStat = (RequestAppUsageStat) obj;
        return fa4.m11650l(this.f20308a, requestAppUsageStat.f20308a) && fa4.m11650l(this.f20309b, requestAppUsageStat.f20309b) && fa4.m11650l(this.f20310c, requestAppUsageStat.f20310c) && fa4.m11650l(this.f20311d, requestAppUsageStat.f20311d) && fa4.m11650l(this.f20312e, requestAppUsageStat.f20312e);
    }

    public final int hashCode() {
        Double d = this.f20308a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.f20309b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f20310c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f20311d;
        return this.f20312e.hashCode() + ((iHashCode3 + (d4 != null ? d4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestAppUsageStat(readingUsage=");
        sb.append(this.f20308a);
        sb.append(", listeningUsage=");
        sb.append(this.f20309b);
        sb.append(", reviewUsage=");
        sb.append(this.f20310c);
        sb.append(", speakingUsage=");
        sb.append(this.f20311d);
        sb.append(", app=");
        return AbstractC3393o1.m17738m(sb, this.f20312e, ")");
    }

    public RequestAppUsageStat(Double d, Double d2, Double d3, Double d4) {
        this.f20308a = d;
        this.f20309b = d2;
        this.f20310c = d3;
        this.f20311d = d4;
        this.f20312e = "Android";
    }
}

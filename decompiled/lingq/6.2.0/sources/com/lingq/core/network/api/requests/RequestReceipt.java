package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestReceipt {
    public static final C1601t0 Companion = new C1601t0();

    /* JADX INFO: renamed from: a */
    public final String f20440a;

    /* JADX INFO: renamed from: b */
    public final String f20441b;

    /* JADX INFO: renamed from: c */
    public final String f20442c;

    /* JADX INFO: renamed from: d */
    public final long f20443d;

    /* JADX INFO: renamed from: e */
    public final int f20444e;

    /* JADX INFO: renamed from: f */
    public final String f20445f;

    /* JADX INFO: renamed from: g */
    public final boolean f20446g;

    public /* synthetic */ RequestReceipt(int i, String str, String str2, String str3, long j, int i2, String str4, boolean z) {
        if ((i & 1) == 0) {
            this.f20440a = null;
        } else {
            this.f20440a = str;
        }
        if ((i & 2) == 0) {
            this.f20441b = null;
        } else {
            this.f20441b = str2;
        }
        if ((i & 4) == 0) {
            this.f20442c = null;
        } else {
            this.f20442c = str3;
        }
        if ((i & 8) == 0) {
            this.f20443d = 0L;
        } else {
            this.f20443d = j;
        }
        if ((i & 16) == 0) {
            this.f20444e = 0;
        } else {
            this.f20444e = i2;
        }
        if ((i & 32) == 0) {
            this.f20445f = null;
        } else {
            this.f20445f = str4;
        }
        if ((i & 64) == 0) {
            this.f20446g = false;
        } else {
            this.f20446g = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestReceipt)) {
            return false;
        }
        RequestReceipt requestReceipt = (RequestReceipt) obj;
        return fa4.m11650l(this.f20440a, requestReceipt.f20440a) && fa4.m11650l(this.f20441b, requestReceipt.f20441b) && fa4.m11650l(this.f20442c, requestReceipt.f20442c) && this.f20443d == requestReceipt.f20443d && this.f20444e == requestReceipt.f20444e && fa4.m11650l(this.f20445f, requestReceipt.f20445f) && this.f20446g == requestReceipt.f20446g;
    }

    public final int hashCode() {
        String str = this.f20440a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20441b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20442c;
        int iM24106b = wq1.m24106b(this.f20444e, ux5.m22981d(this.f20443d, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        String str4 = this.f20445f;
        return Boolean.hashCode(this.f20446g) + ((iM24106b + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("RequestReceipt(orderId=", this.f20440a, ", packageName=", this.f20441b, ", productId=");
        sbM23000w.append(this.f20442c);
        sbM23000w.append(", purchaseTime=");
        sbM23000w.append(this.f20443d);
        sbM23000w.append(", purchaseState=");
        sbM23000w.append(this.f20444e);
        sbM23000w.append(", purchaseToken=");
        sbM23000w.append(this.f20445f);
        sbM23000w.append(", isAutoRenewing=");
        sbM23000w.append(this.f20446g);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public RequestReceipt(String str, String str2, String str3, long j, int i, String str4, boolean z) {
        this.f20440a = str;
        this.f20441b = str2;
        this.f20442c = str3;
        this.f20443d = j;
        this.f20444e = i;
        this.f20445f = str4;
        this.f20446g = z;
    }
}

package com.lingq.core.domain.model.cup;

import kotlinx.serialization.descriptors.SerialDescriptor;
import p000.ey8;
import p000.fa4;
import p000.mk9;
import p000.n3c;
import p000.sk9;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CupClaim {
    public static final C1415g Companion = new C1415g();

    /* JADX INFO: renamed from: a */
    public final boolean f18973a;

    /* JADX INFO: renamed from: b */
    public final String f18974b;

    public /* synthetic */ CupClaim(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, CupClaim$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18973a = z;
        this.f18974b = str;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ void m8015a(CupClaim cupClaim, mk9 mk9Var, SerialDescriptor serialDescriptor) {
        mk9Var.m16873q(serialDescriptor, 0, cupClaim.f18973a);
        mk9Var.m16880x(serialDescriptor, 1, sk9.f60959a, cupClaim.f18974b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CupClaim)) {
            return false;
        }
        CupClaim cupClaim = (CupClaim) obj;
        return this.f18973a == cupClaim.f18973a && fa4.m11650l(this.f18974b, cupClaim.f18974b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f18973a) * 31;
        String str = this.f18974b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CupClaim(claimed=" + this.f18973a + ", claimedAt=" + this.f18974b + ")";
    }

    public CupClaim(boolean z, String str) {
        this.f18973a = z;
        this.f18974b = str;
    }
}

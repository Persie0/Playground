package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ProviderEntity {
    public static final C1339h0 Companion = new C1339h0();

    /* JADX INFO: renamed from: a */
    public final int f17429a;

    /* JADX INFO: renamed from: b */
    public final String f17430b;

    /* JADX INFO: renamed from: c */
    public final String f17431c;

    /* JADX INFO: renamed from: d */
    public final String f17432d;

    /* JADX INFO: renamed from: e */
    public final String f17433e;

    /* JADX INFO: renamed from: f */
    public final String f17434f;

    public /* synthetic */ ProviderEntity(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        if (63 != (i & 63)) {
            n3c.m17204b(i, 63, ProviderEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17429a = i2;
        this.f17430b = str;
        this.f17431c = str2;
        this.f17432d = str3;
        this.f17433e = str4;
        this.f17434f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderEntity)) {
            return false;
        }
        ProviderEntity providerEntity = (ProviderEntity) obj;
        return this.f17429a == providerEntity.f17429a && fa4.m11650l(this.f17430b, providerEntity.f17430b) && fa4.m11650l(this.f17431c, providerEntity.f17431c) && fa4.m11650l(this.f17432d, providerEntity.f17432d) && fa4.m11650l(this.f17433e, providerEntity.f17433e) && fa4.m11650l(this.f17434f, providerEntity.f17434f);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Integer.hashCode(this.f17429a) * 31, this.f17430b, 31);
        String str = this.f17431c;
        int iHashCode = (iM22980c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17432d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17433e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17434f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f17429a, "ProviderEntity(id=", ", language=", this.f17430b, ", description=");
        AbstractC3393o1.m17725C(sbM22995r, this.f17431c, ", image=", this.f17432d, ", title=");
        return wq1.m24125u(sbM22995r, this.f17433e, ", url=", this.f17434f, ")");
    }
}

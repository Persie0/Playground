package com.lingq.core.database.entity;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ReferralEntity {
    public static final C1341i0 Companion = new C1341i0();

    /* JADX INFO: renamed from: a */
    public final int f17435a;

    /* JADX INFO: renamed from: b */
    public final String f17436b;

    /* JADX INFO: renamed from: c */
    public final String f17437c;

    /* JADX INFO: renamed from: d */
    public final String f17438d;

    public /* synthetic */ ReferralEntity(int i, int i2, String str, String str2, String str3) {
        if (14 != (i & 14)) {
            n3c.m17204b(i, 14, ReferralEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f17435a = 0;
        } else {
            this.f17435a = i2;
        }
        this.f17436b = str;
        this.f17437c = str2;
        this.f17438d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralEntity)) {
            return false;
        }
        ReferralEntity referralEntity = (ReferralEntity) obj;
        return this.f17435a == referralEntity.f17435a && fa4.m11650l(this.f17436b, referralEntity.f17436b) && fa4.m11650l(this.f17437c, referralEntity.f17437c) && fa4.m11650l(this.f17438d, referralEntity.f17438d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17435a) * 31;
        String str = this.f17436b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17437c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17438d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return wq1.m24125u(ux5.m22995r(this.f17435a, "ReferralEntity(pk=", ", username=", this.f17436b, ", photo="), this.f17437c, ", dateJoined=", this.f17438d, ")");
    }

    public ReferralEntity(String str, int i, String str2, String str3) {
        this.f17435a = i;
        this.f17436b = str;
        this.f17437c = str2;
        this.f17438d = str3;
    }
}

package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class SharedByUserEntity {
    public static final C1345k0 Companion = new C1345k0();

    /* JADX INFO: renamed from: a */
    public final int f17442a;

    /* JADX INFO: renamed from: b */
    public final String f17443b;

    /* JADX INFO: renamed from: c */
    public final String f17444c;

    /* JADX INFO: renamed from: d */
    public final String f17445d;

    /* JADX INFO: renamed from: e */
    public final String f17446e;

    /* JADX INFO: renamed from: f */
    public final String f17447f;

    /* JADX INFO: renamed from: g */
    public final String f17448g;

    public /* synthetic */ SharedByUserEntity(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        if (62 != (i & 62)) {
            n3c.m17204b(i, 62, SharedByUserEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17442a = (i & 1) == 0 ? 0 : i2;
        this.f17443b = str;
        this.f17444c = str2;
        this.f17445d = str3;
        this.f17446e = str4;
        this.f17447f = str5;
        if ((i & 64) == 0) {
            this.f17448g = null;
        } else {
            this.f17448g = str6;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m7801a() {
        return this.f17444c;
    }

    /* JADX INFO: renamed from: b */
    public final int m7802b() {
        return this.f17442a;
    }

    /* JADX INFO: renamed from: c */
    public final String m7803c() {
        return this.f17443b;
    }

    /* JADX INFO: renamed from: d */
    public final String m7804d() {
        return this.f17445d;
    }

    /* JADX INFO: renamed from: e */
    public final String m7805e() {
        return this.f17446e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedByUserEntity)) {
            return false;
        }
        SharedByUserEntity sharedByUserEntity = (SharedByUserEntity) obj;
        return this.f17442a == sharedByUserEntity.f17442a && fa4.m11650l(this.f17443b, sharedByUserEntity.f17443b) && fa4.m11650l(this.f17444c, sharedByUserEntity.f17444c) && fa4.m11650l(this.f17445d, sharedByUserEntity.f17445d) && fa4.m11650l(this.f17446e, sharedByUserEntity.f17446e) && fa4.m11650l(this.f17447f, sharedByUserEntity.f17447f) && fa4.m11650l(this.f17448g, sharedByUserEntity.f17448g);
    }

    /* JADX INFO: renamed from: f */
    public final String m7806f() {
        return this.f17448g;
    }

    /* JADX INFO: renamed from: g */
    public final String m7807g() {
        return this.f17447f;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17442a) * 31;
        String str = this.f17443b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17444c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17445d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17446e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17447f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17448g;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f17442a, "SharedByUserEntity(id=", ", language=", this.f17443b, ", firstName=");
        AbstractC3393o1.m17725C(sbM22995r, this.f17444c, ", lastName=", this.f17445d, ", photo=");
        AbstractC3393o1.m17725C(sbM22995r, this.f17446e, ", username=", this.f17447f, ", role=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f17448g, ")");
    }

    public SharedByUserEntity(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f17442a = i;
        this.f17443b = str;
        this.f17444c = str2;
        this.f17445d = str3;
        this.f17446e = str4;
        this.f17447f = str5;
        this.f17448g = str6;
    }
}

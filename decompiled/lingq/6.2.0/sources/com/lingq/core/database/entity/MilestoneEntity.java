package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class MilestoneEntity {
    public static final C1327b0 Companion = new C1327b0();

    /* JADX INFO: renamed from: a */
    public final String f17392a;

    /* JADX INFO: renamed from: b */
    public final String f17393b;

    /* JADX INFO: renamed from: c */
    public final String f17394c;

    /* JADX INFO: renamed from: d */
    public final String f17395d;

    /* JADX INFO: renamed from: e */
    public final int f17396e;

    /* JADX INFO: renamed from: f */
    public final String f17397f;

    /* JADX INFO: renamed from: g */
    public final String f17398g;

    public /* synthetic */ MilestoneEntity(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        if (47 != (i & 47)) {
            n3c.m17204b(i, 47, MilestoneEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17392a = str;
        this.f17393b = str2;
        this.f17394c = str3;
        this.f17395d = str4;
        this.f17396e = (i & 16) == 0 ? 0 : i2;
        this.f17397f = str5;
        if ((i & 64) == 0) {
            this.f17398g = null;
        } else {
            this.f17398g = str6;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m7761a() {
        return this.f17398g;
    }

    /* JADX INFO: renamed from: b */
    public final int m7762b() {
        return this.f17396e;
    }

    /* JADX INFO: renamed from: c */
    public final String m7763c() {
        return this.f17393b;
    }

    /* JADX INFO: renamed from: d */
    public final String m7764d() {
        return this.f17392a;
    }

    /* JADX INFO: renamed from: e */
    public final String m7765e() {
        return this.f17395d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MilestoneEntity)) {
            return false;
        }
        MilestoneEntity milestoneEntity = (MilestoneEntity) obj;
        return fa4.m11650l(this.f17392a, milestoneEntity.f17392a) && fa4.m11650l(this.f17393b, milestoneEntity.f17393b) && fa4.m11650l(this.f17394c, milestoneEntity.f17394c) && fa4.m11650l(this.f17395d, milestoneEntity.f17395d) && this.f17396e == milestoneEntity.f17396e && fa4.m11650l(this.f17397f, milestoneEntity.f17397f) && fa4.m11650l(this.f17398g, milestoneEntity.f17398g);
    }

    /* JADX INFO: renamed from: f */
    public final String m7766f() {
        return this.f17394c;
    }

    /* JADX INFO: renamed from: g */
    public final String m7767g() {
        return this.f17397f;
    }

    public final int hashCode() {
        int iHashCode = this.f17392a.hashCode() * 31;
        String str = this.f17393b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17394c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17395d;
        int iM24106b = wq1.m24106b(this.f17396e, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f17397f;
        int iHashCode4 = (iM24106b + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17398g;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("MilestoneEntity(languageAndSlug=", this.f17392a, ", language=", this.f17393b, ", slug=");
        AbstractC3393o1.m17725C(sbM23000w, this.f17394c, ", name=", this.f17395d, ", goal=");
        hn1.m13361k(this.f17396e, ", stat=", this.f17397f, ", date=", sbM23000w);
        return AbstractC3393o1.m17738m(sbM23000w, this.f17398g, ")");
    }

    public MilestoneEntity(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f17392a = str;
        this.f17393b = str2;
        this.f17394c = str3;
        this.f17395d = str4;
        this.f17396e = i;
        this.f17397f = str5;
        this.f17398g = str6;
    }
}

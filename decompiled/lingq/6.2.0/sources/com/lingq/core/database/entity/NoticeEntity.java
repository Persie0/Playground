package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class NoticeEntity {
    public static final C1333e0 Companion = new C1333e0();

    /* JADX INFO: renamed from: a */
    public final int f17405a;

    /* JADX INFO: renamed from: b */
    public final String f17406b;

    /* JADX INFO: renamed from: c */
    public final String f17407c;

    /* JADX INFO: renamed from: d */
    public final String f17408d;

    /* JADX INFO: renamed from: e */
    public final String f17409e;

    /* JADX INFO: renamed from: f */
    public final String f17410f;

    /* JADX INFO: renamed from: g */
    public final boolean f17411g;

    public /* synthetic */ NoticeEntity(int i, int i2, String str, String str2, String str3, String str4, String str5, boolean z) {
        if (127 != (i & 127)) {
            n3c.m17204b(i, 127, NoticeEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17405a = i2;
        this.f17406b = str;
        this.f17407c = str2;
        this.f17408d = str3;
        this.f17409e = str4;
        this.f17410f = str5;
        this.f17411g = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m7774a() {
        return this.f17409e;
    }

    /* JADX INFO: renamed from: b */
    public final int m7775b() {
        return this.f17405a;
    }

    /* JADX INFO: renamed from: c */
    public final String m7776c() {
        return this.f17406b;
    }

    /* JADX INFO: renamed from: d */
    public final String m7777d() {
        return this.f17410f;
    }

    /* JADX INFO: renamed from: e */
    public final String m7778e() {
        return this.f17408d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeEntity)) {
            return false;
        }
        NoticeEntity noticeEntity = (NoticeEntity) obj;
        return this.f17405a == noticeEntity.f17405a && fa4.m11650l(this.f17406b, noticeEntity.f17406b) && fa4.m11650l(this.f17407c, noticeEntity.f17407c) && fa4.m11650l(this.f17408d, noticeEntity.f17408d) && fa4.m11650l(this.f17409e, noticeEntity.f17409e) && fa4.m11650l(this.f17410f, noticeEntity.f17410f) && this.f17411g == noticeEntity.f17411g;
    }

    /* JADX INFO: renamed from: f */
    public final String m7779f() {
        return this.f17407c;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7780g() {
        return this.f17411g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17411g) + ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f17405a) * 31, this.f17406b, 31), this.f17407c, 31), this.f17408d, 31), this.f17409e, 31), this.f17410f, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f17405a, "NoticeEntity(id=", ", language=", this.f17406b, ", title=");
        AbstractC3393o1.m17725C(sbM22995r, this.f17407c, ", startDate=", this.f17408d, ", endDate=");
        AbstractC3393o1.m17725C(sbM22995r, this.f17409e, ", noticeType=", this.f17410f, ", isShown=");
        return AbstractC3393o1.m17740o(sbM22995r, this.f17411g, ")");
    }

    public NoticeEntity(String str, int i, String str2, String str3, String str4, String str5) {
        ux5.m22975B(str, str2, str3, str4, str5);
        this.f17405a = i;
        this.f17406b = str;
        this.f17407c = str2;
        this.f17408d = str3;
        this.f17409e = str4;
        this.f17410f = str5;
        this.f17411g = false;
    }
}

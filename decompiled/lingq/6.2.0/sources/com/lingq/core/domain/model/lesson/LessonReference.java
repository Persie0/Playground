package com.lingq.core.domain.model.lesson;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonReference {
    public static final C1445j Companion = new C1445j();

    /* JADX INFO: renamed from: a */
    public final int f19241a;

    /* JADX INFO: renamed from: b */
    public final int f19242b;

    /* JADX INFO: renamed from: c */
    public final String f19243c;

    /* JADX INFO: renamed from: d */
    public final boolean f19244d;

    /* JADX INFO: renamed from: e */
    public final Integer f19245e;

    /* JADX INFO: renamed from: f */
    public final String f19246f;

    /* JADX INFO: renamed from: g */
    public final String f19247g;

    /* JADX INFO: renamed from: h */
    public final String f19248h;

    /* JADX INFO: renamed from: i */
    public final Integer f19249i;

    /* JADX INFO: renamed from: j */
    public final String f19250j;

    /* JADX INFO: renamed from: k */
    public final String f19251k;

    public /* synthetic */ LessonReference(int i, int i2, int i3, String str, boolean z, Integer num, String str2, String str3, String str4, Integer num2, String str5, String str6) {
        if (229 != (i & 229)) {
            n3c.m17204b(i, 229, LessonReference$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19241a = i2;
        if ((i & 2) == 0) {
            this.f19242b = 0;
        } else {
            this.f19242b = i3;
        }
        this.f19243c = str;
        if ((i & 8) == 0) {
            this.f19244d = false;
        } else {
            this.f19244d = z;
        }
        if ((i & 16) == 0) {
            this.f19245e = 0;
        } else {
            this.f19245e = num;
        }
        this.f19246f = str2;
        this.f19247g = str3;
        this.f19248h = str4;
        if ((i & 256) == 0) {
            this.f19249i = null;
        } else {
            this.f19249i = num2;
        }
        if ((i & 512) == 0) {
            this.f19250j = null;
        } else {
            this.f19250j = str5;
        }
        if ((i & 1024) == 0) {
            this.f19251k = null;
        } else {
            this.f19251k = str6;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8049a() {
        return this.f19243c;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m8050b() {
        return this.f19249i;
    }

    /* JADX INFO: renamed from: c */
    public final int m8051c() {
        return this.f19241a;
    }

    /* JADX INFO: renamed from: d */
    public final String m8052d() {
        return this.f19248h;
    }

    /* JADX INFO: renamed from: e */
    public final int m8053e() {
        return this.f19242b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonReference)) {
            return false;
        }
        LessonReference lessonReference = (LessonReference) obj;
        return this.f19241a == lessonReference.f19241a && this.f19242b == lessonReference.f19242b && fa4.m11650l(this.f19243c, lessonReference.f19243c) && this.f19244d == lessonReference.f19244d && fa4.m11650l(this.f19245e, lessonReference.f19245e) && fa4.m11650l(this.f19246f, lessonReference.f19246f) && fa4.m11650l(this.f19247g, lessonReference.f19247g) && fa4.m11650l(this.f19248h, lessonReference.f19248h) && fa4.m11650l(this.f19249i, lessonReference.f19249i) && fa4.m11650l(this.f19250j, lessonReference.f19250j) && fa4.m11650l(this.f19251k, lessonReference.f19251k);
    }

    /* JADX INFO: renamed from: f */
    public final Integer m8054f() {
        return this.f19245e;
    }

    /* JADX INFO: renamed from: g */
    public final String m8055g() {
        return this.f19250j;
    }

    /* JADX INFO: renamed from: h */
    public final String m8056h() {
        return this.f19246f;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f19242b, Integer.hashCode(this.f19241a) * 31, 31);
        String str = this.f19243c;
        int iM12428e = g9a.m12428e((iM24106b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f19244d);
        Integer num = this.f19245e;
        int iHashCode = (iM12428e + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f19246f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19247g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19248h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f19249i;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.f19250j;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f19251k;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final String m8057i() {
        return this.f19247g;
    }

    /* JADX INFO: renamed from: j */
    public final String m8058j() {
        return this.f19251k;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m8059k() {
        return this.f19244d;
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f19241a, this.f19242b, "LessonReference(id=", ", price=", ", collectionTitle=");
        ux5.m22976C(this.f19243c, ", isTaken=", ", sharedById=", sbM22994q, this.f19244d);
        sbM22994q.append(this.f19245e);
        sbM22994q.append(", status=");
        sbM22994q.append(this.f19246f);
        sbM22994q.append(", title=");
        AbstractC3393o1.m17725C(sbM22994q, this.f19247g, ", image=", this.f19248h, ", duration=");
        sbM22994q.append(this.f19249i);
        sbM22994q.append(", source=");
        sbM22994q.append(this.f19250j);
        sbM22994q.append(", url=");
        return AbstractC3393o1.m17738m(sbM22994q, this.f19251k, ")");
    }

    public LessonReference(int i, int i2, String str, boolean z, Integer num, String str2, String str3, String str4, Integer num2, String str5, String str6) {
        this.f19241a = i;
        this.f19242b = i2;
        this.f19243c = str;
        this.f19244d = z;
        this.f19245e = num;
        this.f19246f = str2;
        this.f19247g = str3;
        this.f19248h = str4;
        this.f19249i = num2;
        this.f19250j = str5;
        this.f19251k = str6;
    }

    public /* synthetic */ LessonReference(int i, int i2, String str, boolean z, Integer num, String str2, String str3, String str4, Integer num2, String str5, String str6, int i3) {
        this(i, (i3 & 2) != 0 ? 0 : i2, str, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? 0 : num, str2, str3, str4, (i3 & 256) != 0 ? null : num2, (i3 & 512) != 0 ? null : str5, (i3 & 1024) != 0 ? null : str6);
    }
}

package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLessonReference {
    public static final C1631c2 Companion = new C1631c2();

    /* JADX INFO: renamed from: a */
    public final int f21099a;

    /* JADX INFO: renamed from: b */
    public final int f21100b;

    /* JADX INFO: renamed from: c */
    public final String f21101c;

    /* JADX INFO: renamed from: d */
    public final boolean f21102d;

    /* JADX INFO: renamed from: e */
    public final Integer f21103e;

    /* JADX INFO: renamed from: f */
    public final String f21104f;

    /* JADX INFO: renamed from: g */
    public final String f21105g;

    /* JADX INFO: renamed from: h */
    public final String f21106h;

    /* JADX INFO: renamed from: i */
    public final Integer f21107i;

    public /* synthetic */ ResultLessonReference(int i, int i2, int i3, String str, boolean z, Integer num, String str2, String str3, String str4, Integer num2) {
        if ((i & 1) == 0) {
            this.f21099a = 0;
        } else {
            this.f21099a = i2;
        }
        if ((i & 2) == 0) {
            this.f21100b = 0;
        } else {
            this.f21100b = i3;
        }
        if ((i & 4) == 0) {
            this.f21101c = null;
        } else {
            this.f21101c = str;
        }
        if ((i & 8) == 0) {
            this.f21102d = false;
        } else {
            this.f21102d = z;
        }
        if ((i & 16) == 0) {
            this.f21103e = null;
        } else {
            this.f21103e = num;
        }
        if ((i & 32) == 0) {
            this.f21104f = null;
        } else {
            this.f21104f = str2;
        }
        if ((i & 64) == 0) {
            this.f21105g = null;
        } else {
            this.f21105g = str3;
        }
        if ((i & 128) == 0) {
            this.f21106h = null;
        } else {
            this.f21106h = str4;
        }
        if ((i & 256) == 0) {
            this.f21107i = null;
        } else {
            this.f21107i = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLessonReference)) {
            return false;
        }
        ResultLessonReference resultLessonReference = (ResultLessonReference) obj;
        return this.f21099a == resultLessonReference.f21099a && this.f21100b == resultLessonReference.f21100b && fa4.m11650l(this.f21101c, resultLessonReference.f21101c) && this.f21102d == resultLessonReference.f21102d && fa4.m11650l(this.f21103e, resultLessonReference.f21103e) && fa4.m11650l(this.f21104f, resultLessonReference.f21104f) && fa4.m11650l(this.f21105g, resultLessonReference.f21105g) && fa4.m11650l(this.f21106h, resultLessonReference.f21106h) && fa4.m11650l(this.f21107i, resultLessonReference.f21107i);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f21100b, Integer.hashCode(this.f21099a) * 31, 31);
        String str = this.f21101c;
        int iM12428e = g9a.m12428e((iM24106b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f21102d);
        Integer num = this.f21103e;
        int iHashCode = (iM12428e + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f21104f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21105g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21106h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f21107i;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f21099a, this.f21100b, "ResultLessonReference(id=", ", price=", ", collectionTitle=");
        ux5.m22976C(this.f21101c, ", isTaken=", ", sharedById=", sbM22994q, this.f21102d);
        sbM22994q.append(this.f21103e);
        sbM22994q.append(", status=");
        sbM22994q.append(this.f21104f);
        sbM22994q.append(", title=");
        AbstractC3393o1.m17725C(sbM22994q, this.f21105g, ", image=", this.f21106h, ", duration=");
        sbM22994q.append(this.f21107i);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}

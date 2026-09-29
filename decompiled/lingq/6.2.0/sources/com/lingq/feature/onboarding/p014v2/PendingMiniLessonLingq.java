package com.lingq.feature.onboarding.p014v2;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes3.dex */
@ey8
public final class PendingMiniLessonLingq {
    public static final C2227e Companion = new C2227e();

    /* JADX INFO: renamed from: a */
    public final String f27356a;

    /* JADX INFO: renamed from: b */
    public final String f27357b;

    /* JADX INFO: renamed from: c */
    public final String f27358c;

    /* JADX INFO: renamed from: d */
    public final String f27359d;

    public /* synthetic */ PendingMiniLessonLingq(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            n3c.m17204b(i, 15, PendingMiniLessonLingq$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f27356a = str;
        this.f27357b = str2;
        this.f27358c = str3;
        this.f27359d = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m9153a() {
        return this.f27358c;
    }

    /* JADX INFO: renamed from: b */
    public final String m9154b() {
        return this.f27359d;
    }

    /* JADX INFO: renamed from: c */
    public final String m9155c() {
        return this.f27356a;
    }

    /* JADX INFO: renamed from: d */
    public final String m9156d() {
        return this.f27357b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingMiniLessonLingq)) {
            return false;
        }
        PendingMiniLessonLingq pendingMiniLessonLingq = (PendingMiniLessonLingq) obj;
        return fa4.m11650l(this.f27356a, pendingMiniLessonLingq.f27356a) && fa4.m11650l(this.f27357b, pendingMiniLessonLingq.f27357b) && fa4.m11650l(this.f27358c, pendingMiniLessonLingq.f27358c) && fa4.m11650l(this.f27359d, pendingMiniLessonLingq.f27359d);
    }

    public final int hashCode() {
        return this.f27359d.hashCode() + ux5.m22980c(ux5.m22980c(this.f27356a.hashCode() * 31, this.f27357b, 31), this.f27358c, 31);
    }

    public final String toString() {
        return wq1.m24125u(ux5.m23000w("PendingMiniLessonLingq(term=", this.f27356a, ", translation=", this.f27357b, ", language="), this.f27358c, ", sentenceFragment=", this.f27359d, ")");
    }

    public PendingMiniLessonLingq(String str, String str2, String str3, String str4) {
        ux5.m22974A(str, str3, str4);
        this.f27356a = str;
        this.f27357b = str2;
        this.f27358c = str3;
        this.f27359d = str4;
    }
}

package com.lingq.core.domain.model.library;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonMediaSource {
    public static final C1463e Companion = new C1463e();

    /* JADX INFO: renamed from: a */
    public final String f19391a;

    /* JADX INFO: renamed from: b */
    public final String f19392b;

    /* JADX INFO: renamed from: c */
    public final String f19393c;

    public /* synthetic */ LessonMediaSource(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, LessonMediaSource$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19391a = str;
        this.f19392b = str2;
        this.f19393c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonMediaSource)) {
            return false;
        }
        LessonMediaSource lessonMediaSource = (LessonMediaSource) obj;
        return fa4.m11650l(this.f19391a, lessonMediaSource.f19391a) && fa4.m11650l(this.f19392b, lessonMediaSource.f19392b) && fa4.m11650l(this.f19393c, lessonMediaSource.f19393c);
    }

    public final int hashCode() {
        String str = this.f19391a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19392b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19393c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("LessonMediaSource(type=", this.f19391a, ", name=", this.f19392b, ", url="), this.f19393c, ")");
    }
}

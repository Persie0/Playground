package com.lingq.core.domain.model.lesson;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonCompleteNext {
    public static final C1440e Companion = new C1440e();

    /* JADX INFO: renamed from: a */
    public final int f19222a;

    /* JADX INFO: renamed from: b */
    public final String f19223b;

    /* JADX INFO: renamed from: c */
    public final String f19224c;

    /* JADX INFO: renamed from: d */
    public final String f19225d;

    /* JADX INFO: renamed from: e */
    public final String f19226e;

    /* JADX INFO: renamed from: f */
    public final String f19227f;

    /* JADX INFO: renamed from: g */
    public final String f19228g;

    public /* synthetic */ LessonCompleteNext(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, LessonCompleteNext$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19222a = i2;
        this.f19223b = str;
        if ((i & 4) == 0) {
            this.f19224c = null;
        } else {
            this.f19224c = str2;
        }
        if ((i & 8) == 0) {
            this.f19225d = null;
        } else {
            this.f19225d = str3;
        }
        if ((i & 16) == 0) {
            this.f19226e = null;
        } else {
            this.f19226e = str4;
        }
        if ((i & 32) == 0) {
            this.f19227f = null;
        } else {
            this.f19227f = str5;
        }
        if ((i & 64) == 0) {
            this.f19228g = null;
        } else {
            this.f19228g = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonCompleteNext)) {
            return false;
        }
        LessonCompleteNext lessonCompleteNext = (LessonCompleteNext) obj;
        return this.f19222a == lessonCompleteNext.f19222a && fa4.m11650l(this.f19223b, lessonCompleteNext.f19223b) && fa4.m11650l(this.f19224c, lessonCompleteNext.f19224c) && fa4.m11650l(this.f19225d, lessonCompleteNext.f19225d) && fa4.m11650l(this.f19226e, lessonCompleteNext.f19226e) && fa4.m11650l(this.f19227f, lessonCompleteNext.f19227f) && fa4.m11650l(this.f19228g, lessonCompleteNext.f19228g);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Integer.hashCode(this.f19222a) * 31, this.f19223b, 31);
        String str = this.f19224c;
        int iHashCode = (iM22980c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19225d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19226e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19227f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f19228g;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f19222a, "LessonCompleteNext(id=", ", title=", this.f19223b, ", image=");
        AbstractC3393o1.m17725C(sbM22995r, this.f19224c, ", status=", this.f19225d, ", sourceType=");
        AbstractC3393o1.m17725C(sbM22995r, this.f19226e, ", sourceName=", this.f19227f, ", sourceUrl=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f19228g, ")");
    }

    public LessonCompleteNext(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        this.f19222a = i;
        this.f19223b = str;
        this.f19224c = str2;
        this.f19225d = str3;
        this.f19226e = str4;
        this.f19227f = str5;
        this.f19228g = str6;
    }
}

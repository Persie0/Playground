package com.lingq.core.domain.model.lesson;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonPromotedCourse {
    public static final C1444i Companion = new C1444i();

    /* JADX INFO: renamed from: a */
    public final String f19238a;

    /* JADX INFO: renamed from: b */
    public final String f19239b;

    /* JADX INFO: renamed from: c */
    public final String f19240c;

    public /* synthetic */ LessonPromotedCourse(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f19238a = null;
        } else {
            this.f19238a = str;
        }
        if ((i & 2) == 0) {
            this.f19239b = null;
        } else {
            this.f19239b = str2;
        }
        if ((i & 4) == 0) {
            this.f19240c = null;
        } else {
            this.f19240c = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8046a() {
        return this.f19238a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8047b() {
        return this.f19240c;
    }

    /* JADX INFO: renamed from: c */
    public final String m8048c() {
        return this.f19239b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonPromotedCourse)) {
            return false;
        }
        LessonPromotedCourse lessonPromotedCourse = (LessonPromotedCourse) obj;
        return fa4.m11650l(this.f19238a, lessonPromotedCourse.f19238a) && fa4.m11650l(this.f19239b, lessonPromotedCourse.f19239b) && fa4.m11650l(this.f19240c, lessonPromotedCourse.f19240c);
    }

    public final int hashCode() {
        String str = this.f19238a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19239b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19240c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("LessonPromotedCourse(ctaText=", this.f19238a, ", description=", this.f19239b, ", ctaUrl="), this.f19240c, ")");
    }

    public LessonPromotedCourse(String str, String str2, String str3) {
        this.f19238a = str;
        this.f19239b = str2;
        this.f19240c = str3;
    }
}

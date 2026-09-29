package com.lingq.core.domain.model.lesson;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonMetadata {
    public static final C1443h Companion = new C1443h();

    /* JADX INFO: renamed from: a */
    public final String f19234a;

    /* JADX INFO: renamed from: b */
    public final String f19235b;

    /* JADX INFO: renamed from: c */
    public final String f19236c;

    public /* synthetic */ LessonMetadata(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f19234a = null;
        } else {
            this.f19234a = str;
        }
        if ((i & 2) == 0) {
            this.f19235b = null;
        } else {
            this.f19235b = str2;
        }
        if ((i & 4) == 0) {
            this.f19236c = null;
        } else {
            this.f19236c = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8043a() {
        return this.f19234a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8044b() {
        return this.f19235b;
    }

    /* JADX INFO: renamed from: c */
    public final String m8045c() {
        return this.f19236c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonMetadata)) {
            return false;
        }
        LessonMetadata lessonMetadata = (LessonMetadata) obj;
        return fa4.m11650l(this.f19234a, lessonMetadata.f19234a) && fa4.m11650l(this.f19235b, lessonMetadata.f19235b) && fa4.m11650l(this.f19236c, lessonMetadata.f19236c);
    }

    public final int hashCode() {
        String str = this.f19234a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19235b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19236c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("LessonMetadata(importLesson=", this.f19234a, ", importMethod=", this.f19235b, ", splittingMethod="), this.f19236c, ")");
    }

    public LessonMetadata(String str, String str2, String str3) {
        this.f19234a = str;
        this.f19235b = str2;
        this.f19236c = str3;
    }
}

package com.lingq.core.domain.model.lesson;

import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonSimplifiedOf {
    public static final C1448m Companion = new C1448m();

    /* JADX INFO: renamed from: a */
    public final String f19264a;

    /* JADX INFO: renamed from: b */
    public final String f19265b;

    /* JADX INFO: renamed from: c */
    public final int f19266c;

    public /* synthetic */ LessonSimplifiedOf(String str, int i, int i2, String str2) {
        if ((i & 1) == 0) {
            this.f19264a = null;
        } else {
            this.f19264a = str;
        }
        if ((i & 2) == 0) {
            this.f19265b = null;
        } else {
            this.f19265b = str2;
        }
        if ((i & 4) == 0) {
            this.f19266c = 0;
        } else {
            this.f19266c = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8062a() {
        return this.f19266c;
    }

    /* JADX INFO: renamed from: b */
    public final String m8063b() {
        return this.f19264a;
    }

    /* JADX INFO: renamed from: c */
    public final String m8064c() {
        return this.f19265b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonSimplifiedOf)) {
            return false;
        }
        LessonSimplifiedOf lessonSimplifiedOf = (LessonSimplifiedOf) obj;
        return fa4.m11650l(this.f19264a, lessonSimplifiedOf.f19264a) && fa4.m11650l(this.f19265b, lessonSimplifiedOf.f19265b) && this.f19266c == lessonSimplifiedOf.f19266c;
    }

    public final int hashCode() {
        String str = this.f19264a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19265b;
        return Integer.hashCode(this.f19266c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m23000w("LessonSimplifiedOf(status=", this.f19264a, ", isLocked=", this.f19265b, ", id="), this.f19266c, ")");
    }

    public LessonSimplifiedOf(String str, int i, String str2) {
        this.f19264a = str;
        this.f19265b = str2;
        this.f19266c = i;
    }
}

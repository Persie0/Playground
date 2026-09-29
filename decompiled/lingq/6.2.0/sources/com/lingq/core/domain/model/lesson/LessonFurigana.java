package com.lingq.core.domain.model.lesson;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonFurigana {
    public static final C1441f Companion = new C1441f();

    /* JADX INFO: renamed from: a */
    public final String f19229a;

    /* JADX INFO: renamed from: b */
    public final String f19230b;

    public /* synthetic */ LessonFurigana(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f19229a = null;
        } else {
            this.f19229a = str;
        }
        if ((i & 2) == 0) {
            this.f19230b = null;
        } else {
            this.f19230b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonFurigana)) {
            return false;
        }
        LessonFurigana lessonFurigana = (LessonFurigana) obj;
        return fa4.m11650l(this.f19229a, lessonFurigana.f19229a) && fa4.m11650l(this.f19230b, lessonFurigana.f19230b);
    }

    public final int hashCode() {
        String str = this.f19229a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19230b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22991n("LessonFurigana(chunk=", this.f19229a, ", furigana=", this.f19230b, ")");
    }

    public LessonFurigana(String str, String str2) {
        this.f19229a = str;
        this.f19230b = str2;
    }
}

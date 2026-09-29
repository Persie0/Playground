package com.lingq.core.domain.model.lesson;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.b25;
import p000.cs4;
import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonSentencesTranslation {
    public static final C1447l Companion = new C1447l();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f19261c = {null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new b25(8))};

    /* JADX INFO: renamed from: a */
    public final String f19262a;

    /* JADX INFO: renamed from: b */
    public final List f19263b;

    public /* synthetic */ LessonSentencesTranslation(int i, String str, List list) {
        if ((i & 1) == 0) {
            this.f19262a = null;
        } else {
            this.f19262a = str;
        }
        if ((i & 2) == 0) {
            this.f19263b = null;
        } else {
            this.f19263b = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8060a() {
        return this.f19262a;
    }

    /* JADX INFO: renamed from: b */
    public final List m8061b() {
        return this.f19263b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonSentencesTranslation)) {
            return false;
        }
        LessonSentencesTranslation lessonSentencesTranslation = (LessonSentencesTranslation) obj;
        return fa4.m11650l(this.f19262a, lessonSentencesTranslation.f19262a) && fa4.m11650l(this.f19263b, lessonSentencesTranslation.f19263b);
    }

    public final int hashCode() {
        String str = this.f19262a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f19263b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "LessonSentencesTranslation(language=" + this.f19262a + ", sentences=" + this.f19263b + ")";
    }

    public LessonSentencesTranslation(String str, List list) {
        this.f19262a = str;
        this.f19263b = list;
    }
}

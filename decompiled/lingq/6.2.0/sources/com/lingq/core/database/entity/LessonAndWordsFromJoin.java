package com.lingq.core.database.entity;

import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonAndWordsFromJoin {
    public static final C1356q Companion = new C1356q();

    /* JADX INFO: renamed from: a */
    public final int f17230a;

    /* JADX INFO: renamed from: b */
    public final String f17231b;

    public /* synthetic */ LessonAndWordsFromJoin(int i, String str, int i2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, LessonAndWordsFromJoin$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17230a = i2;
        this.f17231b = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m7633a() {
        return this.f17230a;
    }

    /* JADX INFO: renamed from: b */
    public final String m7634b() {
        return this.f17231b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonAndWordsFromJoin)) {
            return false;
        }
        LessonAndWordsFromJoin lessonAndWordsFromJoin = (LessonAndWordsFromJoin) obj;
        return this.f17230a == lessonAndWordsFromJoin.f17230a && fa4.m11650l(this.f17231b, lessonAndWordsFromJoin.f17231b);
    }

    public final int hashCode() {
        return this.f17231b.hashCode() + (Integer.hashCode(this.f17230a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f17230a, "LessonAndWordsFromJoin(contentId=", ", termWithLanguage=", this.f17231b, ")");
    }

    public LessonAndWordsFromJoin(int i, String str) {
        str.getClass();
        this.f17230a = i;
        this.f17231b = str;
    }
}

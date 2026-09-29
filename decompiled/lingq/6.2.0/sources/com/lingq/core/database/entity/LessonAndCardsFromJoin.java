package com.lingq.core.database.entity;

import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonAndCardsFromJoin {
    public static final C1354p Companion = new C1354p();

    /* JADX INFO: renamed from: a */
    public final int f17228a;

    /* JADX INFO: renamed from: b */
    public final String f17229b;

    public /* synthetic */ LessonAndCardsFromJoin(int i, String str, int i2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, LessonAndCardsFromJoin$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17228a = i2;
        this.f17229b = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m7631a() {
        return this.f17228a;
    }

    /* JADX INFO: renamed from: b */
    public final String m7632b() {
        return this.f17229b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonAndCardsFromJoin)) {
            return false;
        }
        LessonAndCardsFromJoin lessonAndCardsFromJoin = (LessonAndCardsFromJoin) obj;
        return this.f17228a == lessonAndCardsFromJoin.f17228a && fa4.m11650l(this.f17229b, lessonAndCardsFromJoin.f17229b);
    }

    public final int hashCode() {
        return this.f17229b.hashCode() + (Integer.hashCode(this.f17228a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f17228a, "LessonAndCardsFromJoin(contentId=", ", termWithLanguage=", this.f17229b, ")");
    }

    public LessonAndCardsFromJoin(int i, String str) {
        str.getClass();
        this.f17228a = i;
        this.f17229b = str;
    }
}

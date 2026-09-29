package com.lingq.core.domain.model.milestones;

import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonAchievementData$KnownWords extends AbstractC1479h {
    public static final C1476e Companion = new C1476e();

    /* JADX INFO: renamed from: b */
    public final int f19527b;

    /* JADX INFO: renamed from: c */
    public final String f19528c;

    public /* synthetic */ LessonAchievementData$KnownWords(int i, String str, int i2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, LessonAchievementData$KnownWords$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19527b = i2;
        this.f19528c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonAchievementData$KnownWords)) {
            return false;
        }
        LessonAchievementData$KnownWords lessonAchievementData$KnownWords = (LessonAchievementData$KnownWords) obj;
        return this.f19527b == lessonAchievementData$KnownWords.f19527b && fa4.m11650l(this.f19528c, lessonAchievementData$KnownWords.f19528c);
    }

    public final int hashCode() {
        return this.f19528c.hashCode() + (Integer.hashCode(this.f19527b) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f19527b, "KnownWords(words=", ", language=", this.f19528c, ")");
    }

    public LessonAchievementData$KnownWords(int i, String str) {
        this.f19527b = i;
        this.f19528c = str;
    }
}

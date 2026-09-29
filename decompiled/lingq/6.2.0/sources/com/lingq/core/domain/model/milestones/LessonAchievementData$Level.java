package com.lingq.core.domain.model.milestones;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonAchievementData$Level extends AbstractC1479h {
    public static final C1477f Companion = new C1477f();

    /* JADX INFO: renamed from: b */
    public final String f19529b;

    /* JADX INFO: renamed from: c */
    public final String f19530c;

    public /* synthetic */ LessonAchievementData$Level(String str, int i, String str2) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, LessonAchievementData$Level$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19529b = str;
        if ((i & 2) == 0) {
            this.f19530c = "";
        } else {
            this.f19530c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonAchievementData$Level)) {
            return false;
        }
        LessonAchievementData$Level lessonAchievementData$Level = (LessonAchievementData$Level) obj;
        return fa4.m11650l(this.f19529b, lessonAchievementData$Level.f19529b) && fa4.m11650l(this.f19530c, lessonAchievementData$Level.f19530c);
    }

    public final int hashCode() {
        return this.f19530c.hashCode() + (this.f19529b.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("Level(levelName=", this.f19529b, ", slug=", this.f19530c, ")");
    }

    public LessonAchievementData$Level(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f19529b = str;
        this.f19530c = str2;
    }
}

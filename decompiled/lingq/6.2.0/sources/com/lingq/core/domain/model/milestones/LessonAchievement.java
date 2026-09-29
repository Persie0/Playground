package com.lingq.core.domain.model.milestones;

import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wf1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonAchievement {
    public static final C1474c Companion = new C1474c();

    /* JADX INFO: renamed from: e */
    public static final cs4[] f19521e;

    /* JADX INFO: renamed from: a */
    public final int f19522a;

    /* JADX INFO: renamed from: b */
    public final String f19523b;

    /* JADX INFO: renamed from: c */
    public final LessonAchievementType f19524c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1479h f19525d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f19521e = new cs4[]{null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new wf1(21)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new wf1(22))};
    }

    public /* synthetic */ LessonAchievement(int i, int i2, String str, LessonAchievementType lessonAchievementType, AbstractC1479h abstractC1479h) {
        if (15 != (i & 15)) {
            n3c.m17204b(i, 15, LessonAchievement$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19522a = i2;
        this.f19523b = str;
        this.f19524c = lessonAchievementType;
        this.f19525d = abstractC1479h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonAchievement)) {
            return false;
        }
        LessonAchievement lessonAchievement = (LessonAchievement) obj;
        return this.f19522a == lessonAchievement.f19522a && fa4.m11650l(this.f19523b, lessonAchievement.f19523b) && this.f19524c == lessonAchievement.f19524c && fa4.m11650l(this.f19525d, lessonAchievement.f19525d);
    }

    public final int hashCode() {
        return this.f19525d.hashCode() + ((this.f19524c.hashCode() + ux5.m22980c(Integer.hashCode(this.f19522a) * 31, this.f19523b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f19522a, "LessonAchievement(lessonId=", ", language=", this.f19523b, ", type=");
        sbM22995r.append(this.f19524c);
        sbM22995r.append(", data=");
        sbM22995r.append(this.f19525d);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }

    public LessonAchievement(int i, String str, LessonAchievementType lessonAchievementType, AbstractC1479h abstractC1479h) {
        str.getClass();
        lessonAchievementType.getClass();
        abstractC1479h.getClass();
        this.f19522a = i;
        this.f19523b = str;
        this.f19524c = lessonAchievementType;
        this.f19525d = abstractC1479h;
    }
}

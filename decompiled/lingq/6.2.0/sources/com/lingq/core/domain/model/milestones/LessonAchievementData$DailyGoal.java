package com.lingq.core.domain.model.milestones;

import p000.ey8;
import p000.fa4;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonAchievementData$DailyGoal extends AbstractC1479h {
    public static final C1475d Companion = new C1475d();

    /* JADX INFO: renamed from: b */
    public final DailyGoalMet f19526b;

    public /* synthetic */ LessonAchievementData$DailyGoal(int i, DailyGoalMet dailyGoalMet) {
        if (1 == (i & 1)) {
            this.f19526b = dailyGoalMet;
        } else {
            n3c.m17204b(i, 1, LessonAchievementData$DailyGoal$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LessonAchievementData$DailyGoal) && fa4.m11650l(this.f19526b, ((LessonAchievementData$DailyGoal) obj).f19526b);
    }

    public final int hashCode() {
        return this.f19526b.hashCode();
    }

    public final String toString() {
        return "DailyGoal(dailyGoalMet=" + this.f19526b + ")";
    }

    public LessonAchievementData$DailyGoal(DailyGoalMet dailyGoalMet) {
        this.f19526b = dailyGoalMet;
    }
}

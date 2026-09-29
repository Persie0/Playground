package com.lingq.core.domain.model.milestones;

import p000.ey8;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonAchievementData$StreakMilestone extends AbstractC1479h {
    public static final C1478g Companion = new C1478g();

    /* JADX INFO: renamed from: b */
    public final int f19531b;

    public /* synthetic */ LessonAchievementData$StreakMilestone(int i, int i2) {
        if (1 == (i & 1)) {
            this.f19531b = i2;
        } else {
            n3c.m17204b(i, 1, LessonAchievementData$StreakMilestone$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LessonAchievementData$StreakMilestone) && this.f19531b == ((LessonAchievementData$StreakMilestone) obj).f19531b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19531b);
    }

    public final String toString() {
        return ux5.m22989l("StreakMilestone(days=", this.f19531b, ")");
    }

    public LessonAchievementData$StreakMilestone(int i) {
        this.f19531b = i;
    }
}

package p000;

import com.lingq.core.domain.model.milestones.DailyGoalMet;

/* JADX INFO: renamed from: a5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0007a5 extends AbstractC2952e5 {

    /* JADX INFO: renamed from: a */
    public final DailyGoalMet f246a;

    public C0007a5(DailyGoalMet dailyGoalMet) {
        dailyGoalMet.getClass();
        this.f246a = dailyGoalMet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0007a5) && fa4.m11650l(this.f246a, ((C0007a5) obj).f246a);
    }

    public final int hashCode() {
        return this.f246a.hashCode();
    }

    public final String toString() {
        return "DailyGoal(goalMet=" + this.f246a + ")";
    }
}

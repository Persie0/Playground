package p000;

import com.lingq.core.achievements.DailyGoal;

/* JADX INFO: loaded from: classes3.dex */
public final class qy1 {

    /* JADX INFO: renamed from: a */
    public final DailyGoal f58368a;

    public qy1(DailyGoal dailyGoal) {
        dailyGoal.getClass();
        this.f58368a = dailyGoal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qy1) && this.f58368a == ((qy1) obj).f58368a;
    }

    public final int hashCode() {
        return this.f58368a.hashCode();
    }

    public final String toString() {
        return "OnDailyGoalSelected(goal=" + this.f58368a + ")";
    }
}

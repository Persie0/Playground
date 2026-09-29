package p000;

import com.lingq.core.achievements.DailyGoal;
import com.lingq.core.domain.model.LearningLevel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zy1 {

    /* JADX INFO: renamed from: a */
    public final String f72373a;

    /* JADX INFO: renamed from: b */
    public final LearningLevel f72374b;

    /* JADX INFO: renamed from: c */
    public final List f72375c;

    /* JADX INFO: renamed from: d */
    public final DailyGoal f72376d;

    public zy1(String str, LearningLevel learningLevel, List list, DailyGoal dailyGoal) {
        str.getClass();
        learningLevel.getClass();
        list.getClass();
        this.f72373a = str;
        this.f72374b = learningLevel;
        this.f72375c = list;
        this.f72376d = dailyGoal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy1)) {
            return false;
        }
        zy1 zy1Var = (zy1) obj;
        return fa4.m11650l(this.f72373a, zy1Var.f72373a) && this.f72374b == zy1Var.f72374b && fa4.m11650l(this.f72375c, zy1Var.f72375c) && this.f72376d == zy1Var.f72376d;
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b((this.f72374b.hashCode() + (this.f72373a.hashCode() * 31)) * 31, 31, this.f72375c);
        DailyGoal dailyGoal = this.f72376d;
        return iM22979b + (dailyGoal == null ? 0 : dailyGoal.hashCode());
    }

    public final String toString() {
        return "DailyGoalUiState(languageCode=" + this.f72373a + ", learningLevel=" + this.f72374b + ", dailyGoals=" + this.f72375c + ", dailyGoalSelected=" + this.f72376d + ")";
    }
}

package p000;

import com.lingq.core.domain.model.milestones.DailyGoalMet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ty1 {

    /* JADX INFO: renamed from: a */
    public final DailyGoalMet f63087a;

    /* JADX INFO: renamed from: b */
    public final int f63088b;

    /* JADX INFO: renamed from: c */
    public final List f63089c;

    /* JADX INFO: renamed from: d */
    public final boolean f63090d;

    public ty1(DailyGoalMet dailyGoalMet, int i, List list) {
        list.getClass();
        this.f63087a = dailyGoalMet;
        this.f63088b = i;
        this.f63089c = list;
        this.f63090d = dailyGoalMet.f19520g > 0;
    }

    /* JADX INFO: renamed from: a */
    public final DailyGoalMet m22349a() {
        return this.f63087a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty1)) {
            return false;
        }
        ty1 ty1Var = (ty1) obj;
        return this.f63087a.equals(ty1Var.f63087a) && this.f63088b == ty1Var.f63088b && fa4.m11650l(this.f63089c, ty1Var.f63089c);
    }

    public final int hashCode() {
        return this.f63089c.hashCode() + wq1.m24106b(this.f63088b, this.f63087a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyGoalNotificationData(dailyGoalMet=");
        sb.append(this.f63087a);
        sb.append(", streak=");
        sb.append(this.f63088b);
        sb.append(", entries=");
        return hn1.m13356f(sb, this.f63089c, ")");
    }
}

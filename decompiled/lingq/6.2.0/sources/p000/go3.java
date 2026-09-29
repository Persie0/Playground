package p000;

import com.lingq.core.domain.model.milestones.GoalMetType;

/* JADX INFO: loaded from: classes3.dex */
public final class go3 {

    /* JADX INFO: renamed from: a */
    public final GoalMetType f41066a;

    /* JADX INFO: renamed from: b */
    public final Object f41067b;

    public go3(GoalMetType goalMetType, Object obj) {
        goalMetType.getClass();
        obj.getClass();
        this.f41066a = goalMetType;
        this.f41067b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m12781a() {
        return this.f41067b;
    }

    /* JADX INFO: renamed from: b */
    public final GoalMetType m12782b() {
        return this.f41066a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go3)) {
            return false;
        }
        go3 go3Var = (go3) obj;
        return this.f41066a == go3Var.f41066a && fa4.m11650l(this.f41067b, go3Var.f41067b);
    }

    public final int hashCode() {
        return this.f41067b.hashCode() + (this.f41066a.hashCode() * 31);
    }

    public final String toString() {
        return "GoalMet(goalMetType=" + this.f41066a + ", data=" + this.f41067b + ")";
    }
}

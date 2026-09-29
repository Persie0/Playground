package p000;

import com.lingq.core.domain.model.LearningLevel;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class sy1 {

    /* JADX INFO: renamed from: a */
    public final Set f61579a;

    /* JADX INFO: renamed from: b */
    public final LearningLevel f61580b;

    /* JADX INFO: renamed from: c */
    public final double f61581c;

    /* JADX INFO: renamed from: d */
    public final double f61582d;

    /* JADX INFO: renamed from: e */
    public final double f61583e;

    /* JADX INFO: renamed from: f */
    public final double f61584f;

    public sy1(Set set, LearningLevel learningLevel, double d, double d2, double d3, double d4) {
        learningLevel.getClass();
        this.f61579a = set;
        this.f61580b = learningLevel;
        this.f61581c = d;
        this.f61582d = d2;
        this.f61583e = d3;
        this.f61584f = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy1)) {
            return false;
        }
        sy1 sy1Var = (sy1) obj;
        return this.f61579a.equals(sy1Var.f61579a) && this.f61580b == sy1Var.f61580b && Double.compare(this.f61581c, sy1Var.f61581c) == 0 && Double.compare(this.f61582d, sy1Var.f61582d) == 0 && Double.compare(this.f61583e, sy1Var.f61583e) == 0 && Double.compare(this.f61584f, sy1Var.f61584f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f61584f) + g9a.m12424a(this.f61583e, g9a.m12424a(this.f61582d, g9a.m12424a(this.f61581c, (this.f61580b.hashCode() + (this.f61579a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyGoalLanguageData(language=");
        sb.append(this.f61579a);
        sb.append(", level=");
        sb.append(this.f61580b);
        sb.append(", casual=");
        sb.append(this.f61581c);
        hn1.m13370t(sb, ", steady=", this.f61582d, ", keen=");
        sb.append(this.f61583e);
        sb.append(", intense=");
        sb.append(this.f61584f);
        sb.append(")");
        return sb.toString();
    }
}

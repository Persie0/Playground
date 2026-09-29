package p000;

import com.lingq.core.domain.model.language.LanguageProgressMetric;

/* JADX INFO: loaded from: classes2.dex */
public final class yl4 {

    /* JADX INFO: renamed from: a */
    public final LanguageProgressMetric f69988a;

    /* JADX INFO: renamed from: b */
    public final double f69989b;

    /* JADX INFO: renamed from: c */
    public final double f69990c;

    public yl4(LanguageProgressMetric languageProgressMetric, double d, double d2) {
        languageProgressMetric.getClass();
        this.f69988a = languageProgressMetric;
        this.f69989b = d;
        this.f69990c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl4)) {
            return false;
        }
        yl4 yl4Var = (yl4) obj;
        return this.f69988a == yl4Var.f69988a && Double.compare(this.f69989b, yl4Var.f69989b) == 0 && Double.compare(this.f69990c, yl4Var.f69990c) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + g9a.m12424a(this.f69990c, g9a.m12424a(this.f69989b, this.f69988a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "LanguageGoal(key=" + this.f69988a + ", progress=" + this.f69989b + ", goal=" + this.f69990c + ", isMini=false)";
    }
}

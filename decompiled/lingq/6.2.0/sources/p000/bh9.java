package p000;

import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageStatValue;

/* JADX INFO: loaded from: classes2.dex */
public final class bh9 {

    /* JADX INFO: renamed from: a */
    public final LanguageProgressMetric f8547a;

    /* JADX INFO: renamed from: b */
    public final int f8548b;

    /* JADX INFO: renamed from: c */
    public final LanguageStatValue f8549c;

    public bh9(LanguageProgressMetric languageProgressMetric, int i, LanguageStatValue languageStatValue) {
        languageStatValue.getClass();
        this.f8547a = languageProgressMetric;
        this.f8548b = i;
        this.f8549c = languageStatValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh9)) {
            return false;
        }
        bh9 bh9Var = (bh9) obj;
        return this.f8547a == bh9Var.f8547a && this.f8548b == bh9Var.f8548b && fa4.m11650l(this.f8549c, bh9Var.f8549c);
    }

    public final int hashCode() {
        LanguageProgressMetric languageProgressMetric = this.f8547a;
        return this.f8549c.hashCode() + wq1.m24106b(this.f8548b, (languageProgressMetric == null ? 0 : languageProgressMetric.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "StatAll(metric=" + this.f8547a + ", label=" + this.f8548b + ", value=" + this.f8549c + ")";
    }
}

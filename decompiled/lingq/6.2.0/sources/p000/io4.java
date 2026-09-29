package p000;

import com.lingq.core.domain.model.language.LanguageProgressPeriod;

/* JADX INFO: loaded from: classes2.dex */
public final class io4 implements ko4 {

    /* JADX INFO: renamed from: a */
    public final cn4 f44355a;

    /* JADX INFO: renamed from: b */
    public final LanguageProgressPeriod f44356b;

    public io4(cn4 cn4Var, LanguageProgressPeriod languageProgressPeriod) {
        cn4Var.getClass();
        languageProgressPeriod.getClass();
        this.f44355a = cn4Var;
        this.f44356b = languageProgressPeriod;
    }

    @Override // p000.ko4
    /* JADX INFO: renamed from: a */
    public final LanguageProgressPeriod mo14049a() {
        return this.f44356b;
    }

    @Override // p000.ko4
    /* JADX INFO: renamed from: b */
    public final cn4 mo14050b() {
        return this.f44355a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io4)) {
            return false;
        }
        io4 io4Var = (io4) obj;
        return fa4.m11650l(this.f44355a, io4Var.f44355a) && this.f44356b == io4Var.f44356b;
    }

    public final int hashCode() {
        return this.f44356b.hashCode() + (this.f44355a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(stat=" + this.f44355a + ", period=" + this.f44356b + ")";
    }
}

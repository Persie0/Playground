package p000;

import com.lingq.core.domain.model.language.LanguageProgressPeriod;

/* JADX INFO: loaded from: classes3.dex */
public final class xh9 implements zh9 {

    /* JADX INFO: renamed from: a */
    public final LanguageProgressPeriod f68213a;

    public xh9(LanguageProgressPeriod languageProgressPeriod) {
        languageProgressPeriod.getClass();
        this.f68213a = languageProgressPeriod;
    }

    @Override // p000.zh9
    /* JADX INFO: renamed from: a */
    public final LanguageProgressPeriod mo24520a() {
        return this.f68213a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh9) && this.f68213a == ((xh9) obj).f68213a;
    }

    public final int hashCode() {
        return this.f68213a.hashCode();
    }

    public final String toString() {
        return "Loading(period=" + this.f68213a + ")";
    }
}

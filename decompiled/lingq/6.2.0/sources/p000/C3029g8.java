package p000;

import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.language.LanguageStats;

/* JADX INFO: renamed from: g8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3029g8 implements InterfaceC3066h8 {

    /* JADX INFO: renamed from: a */
    public final LanguageProgressPeriod f40369a;

    /* JADX INFO: renamed from: b */
    public final LanguageStats f40370b;

    public C3029g8(LanguageProgressPeriod languageProgressPeriod, LanguageStats languageStats) {
        languageProgressPeriod.getClass();
        languageStats.getClass();
        this.f40369a = languageProgressPeriod;
        this.f40370b = languageStats;
    }

    @Override // p000.InterfaceC3066h8
    /* JADX INFO: renamed from: a */
    public final LanguageProgressPeriod mo11591a() {
        return this.f40369a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3029g8)) {
            return false;
        }
        C3029g8 c3029g8 = (C3029g8) obj;
        return this.f40369a == c3029g8.f40369a && fa4.m11650l(this.f40370b, c3029g8.f40370b);
    }

    public final int hashCode() {
        return this.f40370b.hashCode() + (this.f40369a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(period=" + this.f40369a + ", stats=" + this.f40370b + ")";
    }
}

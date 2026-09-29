package p000;

import com.lingq.core.domain.model.language.LanguageProgressPeriod;

/* JADX INFO: renamed from: f8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2992f8 implements InterfaceC3066h8 {

    /* JADX INFO: renamed from: a */
    public final LanguageProgressPeriod f38605a;

    public C2992f8(LanguageProgressPeriod languageProgressPeriod) {
        languageProgressPeriod.getClass();
        this.f38605a = languageProgressPeriod;
    }

    @Override // p000.InterfaceC3066h8
    /* JADX INFO: renamed from: a */
    public final LanguageProgressPeriod mo11591a() {
        return this.f38605a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2992f8) && this.f38605a == ((C2992f8) obj).f38605a;
    }

    public final int hashCode() {
        return this.f38605a.hashCode();
    }

    public final String toString() {
        return "Loading(period=" + this.f38605a + ")";
    }
}

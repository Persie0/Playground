package p000;

import com.lingq.core.domain.model.language.LanguageToLearn;

/* JADX INFO: loaded from: classes2.dex */
public final class go6 {

    /* JADX INFO: renamed from: a */
    public final LanguageToLearn f41082a;

    public go6(LanguageToLearn languageToLearn) {
        this.f41082a = languageToLearn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof go6) && this.f41082a.equals(((go6) obj).f41082a);
    }

    public final int hashCode() {
        return this.f41082a.hashCode();
    }

    public final String toString() {
        return "OnLanguageSelected(language=" + this.f41082a + ")";
    }
}

package p000;

import com.lingq.core.domain.model.language.LanguageToLearn;

/* JADX INFO: loaded from: classes2.dex */
public final class in6 extends kn6 {

    /* JADX INFO: renamed from: a */
    public final LanguageToLearn f44308a;

    public in6(LanguageToLearn languageToLearn) {
        this.f44308a = languageToLearn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in6) && this.f44308a.equals(((in6) obj).f44308a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f44308a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(language=" + this.f44308a + ", shouldShowKnownWords=false)";
    }
}

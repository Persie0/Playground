package p000;

import com.lingq.core.domain.model.language.LanguageToLearn;

/* JADX INFO: loaded from: classes2.dex */
public final class wm4 extends ym4 {

    /* JADX INFO: renamed from: a */
    public final LanguageToLearn f67053a;

    public wm4(LanguageToLearn languageToLearn) {
        languageToLearn.getClass();
        this.f67053a = languageToLearn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wm4) && fa4.m11650l(this.f67053a, ((wm4) obj).f67053a);
    }

    public final int hashCode() {
        return this.f67053a.hashCode();
    }

    public final String toString() {
        return "Content(language=" + this.f67053a + ")";
    }
}

package p000;

import com.lingq.core.domain.model.language.LanguageToLearn;

/* JADX INFO: loaded from: classes2.dex */
public final class sm4 extends tm4 {

    /* JADX INFO: renamed from: a */
    public final LanguageToLearn f61023a;

    public sm4(LanguageToLearn languageToLearn) {
        languageToLearn.getClass();
        this.f61023a = languageToLearn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm4) && fa4.m11650l(this.f61023a, ((sm4) obj).f61023a);
    }

    public final int hashCode() {
        return this.f61023a.hashCode();
    }

    public final String toString() {
        return "OnLanguageSelected(language=" + this.f61023a + ")";
    }
}

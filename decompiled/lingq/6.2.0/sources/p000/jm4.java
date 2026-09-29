package p000;

import com.lingq.core.p012ui.sheet.LanguageProgressInputType;

/* JADX INFO: loaded from: classes3.dex */
public final class jm4 {

    /* JADX INFO: renamed from: a */
    public final String f45823a;

    /* JADX INFO: renamed from: b */
    public final LanguageProgressInputType f45824b;

    public jm4(String str, LanguageProgressInputType languageProgressInputType) {
        languageProgressInputType.getClass();
        this.f45823a = str;
        this.f45824b = languageProgressInputType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm4)) {
            return false;
        }
        jm4 jm4Var = (jm4) obj;
        return this.f45823a.equals(jm4Var.f45823a) && this.f45824b == jm4Var.f45824b;
    }

    public final int hashCode() {
        return this.f45824b.hashCode() + (this.f45823a.hashCode() * 31);
    }

    public final String toString() {
        return "LanguageProgressUiState(title=" + this.f45823a + ", inputType=" + this.f45824b + ")";
    }
}

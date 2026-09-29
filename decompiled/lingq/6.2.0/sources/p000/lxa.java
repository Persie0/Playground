package p000;

import com.lingq.core.domain.model.lesson.TokenType;

/* JADX INFO: loaded from: classes3.dex */
public final class lxa {

    /* JADX INFO: renamed from: a */
    public final String f50278a;

    /* JADX INFO: renamed from: b */
    public final TokenType f50279b;

    public lxa(String str, TokenType tokenType) {
        str.getClass();
        tokenType.getClass();
        this.f50278a = str;
        this.f50279b = tokenType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxa)) {
            return false;
        }
        lxa lxaVar = (lxa) obj;
        return fa4.m11650l(this.f50278a, lxaVar.f50278a) && this.f50279b == lxaVar.f50279b;
    }

    public final int hashCode() {
        return this.f50279b.hashCode() + (this.f50278a.hashCode() * 31);
    }

    public final String toString() {
        return "VocabularyAddedTermState(term=" + this.f50278a + ", tokenType=" + this.f50279b + ")";
    }
}

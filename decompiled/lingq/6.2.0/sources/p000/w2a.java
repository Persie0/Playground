package p000;

import com.lingq.core.domain.model.token.TokenMeaning;

/* JADX INFO: loaded from: classes2.dex */
public final class w2a implements j3a {

    /* JADX INFO: renamed from: a */
    public final TokenMeaning f66308a;

    /* JADX INFO: renamed from: b */
    public final String f66309b;

    public w2a(TokenMeaning tokenMeaning, String str) {
        tokenMeaning.getClass();
        this.f66308a = tokenMeaning;
        this.f66309b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2a)) {
            return false;
        }
        w2a w2aVar = (w2a) obj;
        return fa4.m11650l(this.f66308a, w2aVar.f66308a) && this.f66309b.equals(w2aVar.f66309b);
    }

    public final int hashCode() {
        return this.f66309b.hashCode() + (this.f66308a.hashCode() * 31);
    }

    public final String toString() {
        return "RequestDictionaryLocaleSelection(meaning=" + this.f66308a + ", locale=" + this.f66309b + ")";
    }
}

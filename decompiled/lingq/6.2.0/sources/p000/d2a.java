package p000;

import com.lingq.core.domain.model.token.TokenMeaning;

/* JADX INFO: loaded from: classes2.dex */
public final class d2a implements j3a {

    /* JADX INFO: renamed from: a */
    public final TokenMeaning f34875a;

    public d2a(TokenMeaning tokenMeaning) {
        tokenMeaning.getClass();
        this.f34875a = tokenMeaning;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2a) && fa4.m11650l(this.f34875a, ((d2a) obj).f34875a);
    }

    public final int hashCode() {
        return this.f34875a.hashCode();
    }

    public final String toString() {
        return "AddMeaning(meaning=" + this.f34875a + ")";
    }
}

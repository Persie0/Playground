package p000;

import com.lingq.core.domain.model.token.TokenMeaning;

/* JADX INFO: loaded from: classes2.dex */
public final class q2a implements j3a {

    /* JADX INFO: renamed from: a */
    public final TokenMeaning f57172a;

    public q2a(TokenMeaning tokenMeaning) {
        tokenMeaning.getClass();
        this.f57172a = tokenMeaning;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2a) && fa4.m11650l(this.f57172a, ((q2a) obj).f57172a);
    }

    public final int hashCode() {
        return this.f57172a.hashCode();
    }

    public final String toString() {
        return "FlagMeaning(meaning=" + this.f57172a + ")";
    }
}

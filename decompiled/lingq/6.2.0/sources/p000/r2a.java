package p000;

import com.lingq.core.domain.model.token.TokenMeaning;

/* JADX INFO: loaded from: classes2.dex */
public final class r2a implements j3a {

    /* JADX INFO: renamed from: a */
    public final TokenMeaning f58537a;

    public r2a(TokenMeaning tokenMeaning) {
        tokenMeaning.getClass();
        this.f58537a = tokenMeaning;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2a) && fa4.m11650l(this.f58537a, ((r2a) obj).f58537a);
    }

    public final int hashCode() {
        return this.f58537a.hashCode();
    }

    public final String toString() {
        return "GiveFocusToMeaning(meaning=" + this.f58537a + ")";
    }
}

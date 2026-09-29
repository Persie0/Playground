package p000;

import com.lingq.core.domain.model.token.TokenMeaning;

/* JADX INFO: loaded from: classes2.dex */
public final class u2a implements j3a {

    /* JADX INFO: renamed from: a */
    public final TokenMeaning f63329a;

    /* JADX INFO: renamed from: b */
    public final int f63330b;

    public u2a(TokenMeaning tokenMeaning, int i) {
        tokenMeaning.getClass();
        this.f63329a = tokenMeaning;
        this.f63330b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2a)) {
            return false;
        }
        u2a u2aVar = (u2a) obj;
        return fa4.m11650l(this.f63329a, u2aVar.f63329a) && this.f63330b == u2aVar.f63330b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63330b) + (this.f63329a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoveMeaning(meaning=" + this.f63329a + ", index=" + this.f63330b + ")";
    }
}

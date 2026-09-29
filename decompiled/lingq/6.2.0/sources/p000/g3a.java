package p000;

import com.lingq.core.domain.model.token.TokenMeaning;

/* JADX INFO: loaded from: classes2.dex */
public final class g3a implements j3a {

    /* JADX INFO: renamed from: a */
    public final TokenMeaning f40135a;

    /* JADX INFO: renamed from: b */
    public final String f40136b;

    public g3a(TokenMeaning tokenMeaning, String str) {
        tokenMeaning.getClass();
        str.getClass();
        this.f40135a = tokenMeaning;
        this.f40136b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3a)) {
            return false;
        }
        g3a g3aVar = (g3a) obj;
        return fa4.m11650l(this.f40135a, g3aVar.f40135a) && fa4.m11650l(this.f40136b, g3aVar.f40136b);
    }

    public final int hashCode() {
        return this.f40136b.hashCode() + (this.f40135a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateMeaning(oldMeaning=" + this.f40135a + ", newText=" + this.f40136b + ")";
    }
}

package p000;

import com.lingq.core.domain.model.token.TokenMeaning;

/* JADX INFO: loaded from: classes2.dex */
public final class f3a implements j3a {

    /* JADX INFO: renamed from: a */
    public final e28 f38369a;

    /* JADX INFO: renamed from: b */
    public final TokenMeaning f38370b;

    public f3a(e28 e28Var, TokenMeaning tokenMeaning) {
        e28Var.getClass();
        tokenMeaning.getClass();
        this.f38369a = e28Var;
        this.f38370b = tokenMeaning;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3a)) {
            return false;
        }
        f3a f3aVar = (f3a) obj;
        return fa4.m11650l(this.f38369a, f3aVar.f38369a) && fa4.m11650l(this.f38370b, f3aVar.f38370b);
    }

    public final int hashCode() {
        return this.f38370b.hashCode() + (this.f38369a.hashCode() * 31);
    }

    public final String toString() {
        return "TooltipAnchorReady(bounds=" + this.f38369a + ", meaning=" + this.f38370b + ")";
    }
}

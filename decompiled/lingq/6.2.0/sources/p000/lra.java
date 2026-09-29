package p000;

import com.lingq.core.domain.model.lesson.TokenType;

/* JADX INFO: loaded from: classes3.dex */
public final class lra extends qra {

    /* JADX INFO: renamed from: a */
    public final int f50047a;

    /* JADX INFO: renamed from: b */
    public final xz7 f50048b;

    /* JADX INFO: renamed from: c */
    public final TokenType f50049c;

    /* JADX INFO: renamed from: d */
    public final boolean f50050d;

    /* JADX INFO: renamed from: e */
    public final e28 f50051e;

    public lra(int i, xz7 xz7Var, TokenType tokenType, boolean z, e28 e28Var) {
        xz7Var.getClass();
        tokenType.getClass();
        e28Var.getClass();
        this.f50047a = i;
        this.f50048b = xz7Var;
        this.f50049c = tokenType;
        this.f50050d = z;
        this.f50051e = e28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lra)) {
            return false;
        }
        lra lraVar = (lra) obj;
        return this.f50047a == lraVar.f50047a && fa4.m11650l(this.f50048b, lraVar.f50048b) && this.f50049c == lraVar.f50049c && this.f50050d == lraVar.f50050d && fa4.m11650l(this.f50051e, lraVar.f50051e);
    }

    public final int hashCode() {
        return this.f50051e.hashCode() + g9a.m12428e((this.f50049c.hashCode() + ((this.f50048b.hashCode() + (Integer.hashCode(this.f50047a) * 31)) * 31)) * 31, 31, this.f50050d);
    }

    public final String toString() {
        return "TokenTapped(paragraphIndex=" + this.f50047a + ", token=" + this.f50048b + ", tokenType=" + this.f50049c + ", isInsideSelectedPhrase=" + this.f50050d + ", anchor=" + this.f50051e + ")";
    }
}

package p000;

import com.lingq.core.domain.model.lesson.TokenType;

/* JADX INFO: loaded from: classes3.dex */
public final class xqa extends qra {

    /* JADX INFO: renamed from: a */
    public final iy7 f68550a;

    /* JADX INFO: renamed from: b */
    public final TokenType f68551b;

    /* JADX INFO: renamed from: c */
    public final e28 f68552c;

    public xqa(iy7 iy7Var, TokenType tokenType, e28 e28Var) {
        tokenType.getClass();
        e28Var.getClass();
        this.f68550a = iy7Var;
        this.f68551b = tokenType;
        this.f68552c = e28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqa)) {
            return false;
        }
        xqa xqaVar = (xqa) obj;
        return this.f68550a.equals(xqaVar.f68550a) && this.f68551b == xqaVar.f68551b && fa4.m11650l(this.f68552c, xqaVar.f68552c);
    }

    public final int hashCode() {
        return this.f68552c.hashCode() + ((this.f68551b.hashCode() + (this.f68550a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PhraseTapped(phrase=" + this.f68550a + ", tokenType=" + this.f68551b + ", anchor=" + this.f68552c + ")";
    }
}

package p000;

import com.lingq.core.domain.model.lesson.TokenType;

/* JADX INFO: loaded from: classes3.dex */
public final class js7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final iy7 f46077a;

    /* JADX INFO: renamed from: b */
    public final TokenType f46078b;

    /* JADX INFO: renamed from: c */
    public final e28 f46079c;

    public js7(iy7 iy7Var, TokenType tokenType, e28 e28Var) {
        tokenType.getClass();
        e28Var.getClass();
        this.f46077a = iy7Var;
        this.f46078b = tokenType;
        this.f46079c = e28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js7)) {
            return false;
        }
        js7 js7Var = (js7) obj;
        return this.f46077a.equals(js7Var.f46077a) && this.f46078b == js7Var.f46078b && fa4.m11650l(this.f46079c, js7Var.f46079c);
    }

    public final int hashCode() {
        return this.f46079c.hashCode() + ((this.f46078b.hashCode() + (this.f46077a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PhraseTapped(phrase=" + this.f46077a + ", tokenType=" + this.f46078b + ", anchor=" + this.f46079c + ")";
    }
}

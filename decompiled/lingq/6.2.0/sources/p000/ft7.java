package p000;

import com.lingq.core.domain.model.lesson.TokenType;

/* JADX INFO: loaded from: classes3.dex */
public final class ft7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final xz7 f39627a;

    /* JADX INFO: renamed from: b */
    public final TokenType f39628b;

    /* JADX INFO: renamed from: c */
    public final boolean f39629c;

    /* JADX INFO: renamed from: d */
    public final e28 f39630d;

    public ft7(xz7 xz7Var, TokenType tokenType, boolean z, e28 e28Var) {
        xz7Var.getClass();
        tokenType.getClass();
        e28Var.getClass();
        this.f39627a = xz7Var;
        this.f39628b = tokenType;
        this.f39629c = z;
        this.f39630d = e28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft7)) {
            return false;
        }
        ft7 ft7Var = (ft7) obj;
        return fa4.m11650l(this.f39627a, ft7Var.f39627a) && this.f39628b == ft7Var.f39628b && this.f39629c == ft7Var.f39629c && fa4.m11650l(this.f39630d, ft7Var.f39630d);
    }

    public final int hashCode() {
        return this.f39630d.hashCode() + g9a.m12428e((this.f39628b.hashCode() + (this.f39627a.hashCode() * 31)) * 31, 31, this.f39629c);
    }

    public final String toString() {
        return "TokenTapped(token=" + this.f39627a + ", tokenType=" + this.f39628b + ", isInsideSelectedPhrase=" + this.f39629c + ", anchor=" + this.f39630d + ")";
    }
}

package p000;

import com.lingq.core.domain.model.lesson.TokenType;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fy7 {

    /* JADX INFO: renamed from: a */
    public final xz7 f39928a;

    /* JADX INFO: renamed from: b */
    public final TokenType f39929b;

    /* JADX INFO: renamed from: c */
    public final List f39930c;

    /* JADX INFO: renamed from: d */
    public final iy7 f39931d;

    /* JADX INFO: renamed from: e */
    public final boolean f39932e;

    public fy7(xz7 xz7Var, TokenType tokenType, List list, iy7 iy7Var, boolean z) {
        xz7Var.getClass();
        tokenType.getClass();
        list.getClass();
        this.f39928a = xz7Var;
        this.f39929b = tokenType;
        this.f39930c = list;
        this.f39931d = iy7Var;
        this.f39932e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy7)) {
            return false;
        }
        fy7 fy7Var = (fy7) obj;
        return fa4.m11650l(this.f39928a, fy7Var.f39928a) && this.f39929b == fy7Var.f39929b && fa4.m11650l(this.f39930c, fy7Var.f39930c) && fa4.m11650l(this.f39931d, fy7Var.f39931d) && this.f39932e == fy7Var.f39932e;
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b((this.f39929b.hashCode() + (this.f39928a.hashCode() * 31)) * 31, 31, this.f39930c);
        iy7 iy7Var = this.f39931d;
        return Boolean.hashCode(this.f39932e) + ((iM22979b + (iy7Var == null ? 0 : iy7Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickedTokenData(selectedToken=");
        sb.append(this.f39928a);
        sb.append(", type=");
        sb.append(this.f39929b);
        sb.append(", selectionTokens=");
        sb.append(this.f39930c);
        sb.append(", phrase=");
        sb.append(this.f39931d);
        sb.append(", isPhraseSelected=");
        return AbstractC3393o1.m17740o(sb, this.f39932e, ")");
    }
}

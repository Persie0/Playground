package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ce9 implements mf1, Iterable, tg4 {

    /* JADX INFO: renamed from: a */
    public final cb9 f9988a;

    /* JADX INFO: renamed from: b */
    public final int f9989b;

    /* JADX INFO: renamed from: c */
    public final q48 f9990c;

    public ce9(cb9 cb9Var, int i, vj3 vj3Var, q48 q48Var) {
        this.f9988a = cb9Var;
        this.f9989b = i;
        this.f9990c = q48Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ce9)) {
            return false;
        }
        ce9 ce9Var = (ce9) obj;
        return ce9Var.f9989b == this.f9989b && ce9Var.f9988a == this.f9988a && ce9Var.f9990c.equals(this.f9990c);
    }

    public final int hashCode() {
        return this.f9990c.hashCode() + ((this.f9988a.hashCode() + (this.f9989b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new be9(this.f9988a, this.f9989b, null, this.f9990c);
    }
}

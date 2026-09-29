package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class db9 implements mf1, Iterable, tg4 {

    /* JADX INFO: renamed from: a */
    public final cb9 f35362a;

    /* JADX INFO: renamed from: b */
    public final int f35363b;

    /* JADX INFO: renamed from: c */
    public final int f35364c;

    public db9(cb9 cb9Var, int i, int i2) {
        this.f35362a = cb9Var;
        this.f35363b = i;
        this.f35364c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof db9)) {
            return false;
        }
        db9 db9Var = (db9) obj;
        return db9Var.f35363b == this.f35363b && db9Var.f35364c == this.f35364c && db9Var.f35362a == this.f35362a;
    }

    public final int hashCode() {
        return (this.f35362a.hashCode() * 31) + this.f35363b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        cb9 cb9Var = this.f35362a;
        if (cb9Var.f9849h != this.f35364c) {
            eb9.m11015f();
        }
        int i = this.f35363b;
        cb9Var.m4494j(i);
        return new eq3(cb9Var, i + 1, cb9Var.f9842a[(i * 5) + 3] + i);
    }
}

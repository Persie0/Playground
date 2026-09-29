package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class eq3 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final cb9 f37704a;

    /* JADX INFO: renamed from: b */
    public final int f37705b;

    /* JADX INFO: renamed from: c */
    public int f37706c;

    /* JADX INFO: renamed from: d */
    public final int f37707d;

    public eq3(cb9 cb9Var, int i, int i2) {
        this.f37704a = cb9Var;
        this.f37705b = i2;
        this.f37706c = i;
        this.f37707d = cb9Var.f9849h;
        if (cb9Var.f9848g) {
            eb9.m11015f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37706c < this.f37705b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        cb9 cb9Var = this.f37704a;
        int i = cb9Var.f9849h;
        int i2 = this.f37707d;
        if (i != i2) {
            eb9.m11015f();
        }
        int i3 = this.f37706c;
        this.f37706c = cb9Var.f9842a[(i3 * 5) + 3] + i3;
        return new db9(cb9Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

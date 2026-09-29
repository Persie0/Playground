package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ah8 implements Iterator, tg4 {

    /* JADX INFO: renamed from: a */
    public int f667a;

    /* JADX INFO: renamed from: b */
    public Object f668b;

    /* JADX INFO: renamed from: c */
    public int f669c;

    /* JADX INFO: renamed from: d */
    public int f670d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bh8 f671e;

    public ah8(bh8 bh8Var) {
        this.f671e = bh8Var;
        this.f669c = bh8Var.f8546d;
        this.f670d = bh8Var.f8545c;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m404a() {
        this.f667a = 3;
        int i = this.f669c;
        if (i == 0) {
            this.f667a = 2;
        } else {
            bh8 bh8Var = this.f671e;
            Object[] objArr = bh8Var.f8543a;
            int i2 = this.f670d;
            this.f668b = objArr[i2];
            this.f667a = 1;
            this.f670d = (i2 + 1) % bh8Var.f8544b;
            this.f669c = i - 1;
        }
        return this.f667a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f667a;
        if (i == 0) {
            return m404a();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        C3386nv.m17626m("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f667a;
        if (i == 1) {
            this.f667a = 0;
            return this.f668b;
        }
        if (i == 2 || !m404a()) {
            uk9.m22784s();
            return null;
        }
        this.f667a = 0;
        return this.f668b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

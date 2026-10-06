package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: xb */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1113xb implements Iterator {

    /* JADX INFO: renamed from: a */
    private int f47986a;

    /* JADX INFO: renamed from: b */
    private int f47987b;

    /* JADX INFO: renamed from: c */
    private boolean f47988c;

    public AbstractC1113xb(int i) {
        this.f47986a = i;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo19533a(int i);

    /* JADX INFO: renamed from: b */
    protected abstract void mo19534b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47987b < this.f47986a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objMo19533a = mo19533a(this.f47987b);
        this.f47987b++;
        this.f47988c = true;
        return objMo19533a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f47988c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f47987b - 1;
        this.f47987b = i;
        mo19534b(i);
        this.f47986a--;
        this.f47988c = false;
    }
}

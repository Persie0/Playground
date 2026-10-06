package p000;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mtu extends naz {

    /* JADX INFO: renamed from: a */
    private Object f41608a;

    protected mtu(Object obj) {
        this.f41608a = obj;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo16924a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41608a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f41608a;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.f41608a = mo16924a(obj);
        return obj;
    }
}

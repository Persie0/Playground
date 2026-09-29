package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a84 implements Iterator, tg4 {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

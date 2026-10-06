package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class okm extends okl implements ListIterator {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ oko f46203c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okm(oko okoVar, int i) {
        super(okoVar);
        this.f46203c = okoVar;
        lkm.m15588o(i, okoVar.mo18591a());
        this.f46201a = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f46201a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f46201a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        oko okoVar = this.f46203c;
        int i = this.f46201a - 1;
        this.f46201a = i;
        return okoVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f46201a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

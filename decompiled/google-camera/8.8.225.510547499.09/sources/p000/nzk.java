package p000;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nzk implements Iterator {

    /* JADX INFO: renamed from: a */
    private final ArrayDeque f45073a;

    /* JADX INFO: renamed from: b */
    private nwp f45074b;

    public nzk(nwr nwrVar) {
        if (!(nwrVar instanceof nzl)) {
            this.f45073a = null;
            this.f45074b = (nwp) nwrVar;
            return;
        }
        nzl nzlVar = (nzl) nwrVar;
        ArrayDeque arrayDeque = new ArrayDeque(nzlVar.f45079g);
        this.f45073a = arrayDeque;
        arrayDeque.push(nzlVar);
        this.f45074b = m18264b(nzlVar.f45077e);
    }

    /* JADX INFO: renamed from: b */
    private final nwp m18264b(nwr nwrVar) {
        while (nwrVar instanceof nzl) {
            nzl nzlVar = (nzl) nwrVar;
            this.f45073a.push(nzlVar);
            int[] iArr = nzl.f45075a;
            nwrVar = nzlVar.f45077e;
        }
        return (nwp) nwrVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nwp next() {
        nwp nwpVarM18264b;
        nwp nwpVar = this.f45074b;
        if (nwpVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f45073a;
            nwpVarM18264b = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            nzl nzlVar = (nzl) this.f45073a.pop();
            int[] iArr = nzl.f45075a;
            nwpVarM18264b = m18264b(nzlVar.f45078f);
        } while (nwpVarM18264b.mo17783d() == 0);
        this.f45074b = nwpVarM18264b;
        return nwpVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45074b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

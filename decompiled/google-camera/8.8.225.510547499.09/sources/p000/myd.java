package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class myd implements Iterator {

    /* JADX INFO: renamed from: a */
    private Iterator f41799a;

    /* JADX INFO: renamed from: b */
    private Iterator f41800b = myc.f41797a;

    /* JADX INFO: renamed from: c */
    private Iterator f41801c;

    /* JADX INFO: renamed from: d */
    private Deque f41802d;

    public myd(Iterator it) {
        this.f41801c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.f41800b;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.f41801c;
                if (it3 != null && it3.hasNext()) {
                    it = this.f41801c;
                    break;
                }
                Deque deque = this.f41802d;
                if (deque == null) {
                    it = null;
                    break;
                }
                if (deque.isEmpty()) {
                    it = null;
                    break;
                }
                this.f41801c = (Iterator) this.f41802d.removeFirst();
            }
            this.f41801c = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.f41800b = it4;
            if (it4 instanceof myd) {
                myd mydVar = (myd) it4;
                this.f41800b = mydVar.f41800b;
                if (this.f41802d == null) {
                    this.f41802d = new ArrayDeque();
                }
                this.f41802d.addFirst(this.f41801c);
                if (mydVar.f41802d != null) {
                    while (!mydVar.f41802d.isEmpty()) {
                        this.f41802d.addFirst((Iterator) mydVar.f41802d.removeLast());
                    }
                }
                this.f41801c = mydVar.f41801c;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.f41800b;
        this.f41799a = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.f41799a;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.f41799a = null;
    }
}

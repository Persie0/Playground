package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class opb extends opc implements Iterator, ols {

    /* JADX INFO: renamed from: a */
    public ols f46365a;

    /* JADX INFO: renamed from: b */
    private int f46366b;

    /* JADX INFO: renamed from: c */
    private Object f46367c;

    /* JADX INFO: renamed from: d */
    private Iterator f46368d;

    @Override // p000.opc
    /* JADX INFO: renamed from: a */
    public final Object mo18838a(Object obj, ols olsVar) {
        this.f46367c = obj;
        this.f46366b = 3;
        this.f46365a = olsVar;
        return oma.COROUTINE_SUSPENDED;
    }

    @Override // p000.opc
    /* JADX INFO: renamed from: b */
    public final Object mo18839b(Iterator it, ols olsVar) {
        if (!it.hasNext()) {
            return oki.f46196a;
        }
        this.f46368d = it;
        this.f46366b = 2;
        this.f46365a = olsVar;
        return oma.COROUTINE_SUSPENDED;
    }

    @Override // p000.ols
    /* JADX INFO: renamed from: d */
    public final oly mo18639d() {
        return olz.f46282a;
    }

    @Override // p000.ols
    /* JADX INFO: renamed from: e */
    public final void mo18640e(Object obj) {
        lkm.m15592s(obj);
        this.f46366b = 4;
    }

    @Override // java.util.Iterator
    public final Object next() throws Throwable {
        switch (this.f46366b) {
            case 0:
            case 1:
                if (hasNext()) {
                    return next();
                }
                throw new NoSuchElementException();
            case 2:
                this.f46366b = 1;
                Iterator it = this.f46368d;
                it.getClass();
                return it.next();
            case 3:
                this.f46366b = 0;
                Object obj = this.f46367c;
                this.f46367c = null;
                return obj;
            default:
                throw m18837f();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: f */
    private final Throwable m18837f() {
        switch (this.f46366b) {
            case 4:
                return new NoSuchElementException();
            case 5:
                return new IllegalStateException("Iterator has failed.");
            default:
                return new IllegalStateException("Unexpected state of the iterator: " + this.f46366b);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        while (true) {
            switch (this.f46366b) {
                case 0:
                    break;
                case 1:
                    Iterator it = this.f46368d;
                    it.getClass();
                    if (it.hasNext()) {
                        this.f46366b = 2;
                        return true;
                    }
                    this.f46368d = null;
                    break;
                case 2:
                case 3:
                    return true;
                case 4:
                    return false;
                default:
                    throw m18837f();
            }
            this.f46366b = 5;
            ols olsVar = this.f46365a;
            olsVar.getClass();
            this.f46365a = null;
            olsVar.mo18640e(oki.f46196a);
        }
    }
}

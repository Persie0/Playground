package p249lo;

import dm.C5207g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p100em.InterfaceC5429a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: lo.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C7416i<T> extends AbstractC7417j<T> implements Iterator<T>, InterfaceC9968c<C9072e>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public int f41254a;

    /* JADX INFO: renamed from: b */
    public T f41255b;

    /* JADX INFO: renamed from: c */
    public Iterator<? extends T> f41256c;

    /* JADX INFO: renamed from: d */
    public InterfaceC9968c<? super C9072e> f41257d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p249lo.AbstractC7417j
    /* JADX INFO: renamed from: a */
    public final CoroutineSingletons mo14819a(Object obj, InterfaceC9968c interfaceC9968c) {
        this.f41255b = obj;
        this.f41254a = 3;
        this.f41257d = interfaceC9968c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C5207g.m11111f(interfaceC9968c, "frame");
        return coroutineSingletons;
    }

    @Override // p249lo.AbstractC7417j
    /* JADX INFO: renamed from: c */
    public final Object mo14820c(Iterator<? extends T> it, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        if (!it.hasNext()) {
            return C9072e.f47360a;
        }
        this.f41256c = it;
        this.f41254a = 2;
        this.f41257d = interfaceC9968c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C5207g.m11111f(interfaceC9968c, "frame");
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: d */
    public final RuntimeException m14821d() {
        int i10 = this.f41254a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f41254a);
    }

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: e */
    public final CoroutineContext mo2029e() {
        return EmptyCoroutineContext.f38093a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i10 = this.f41254a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw m14821d();
                }
                Iterator<? extends T> it = this.f41256c;
                C5207g.m11108c(it);
                if (it.hasNext()) {
                    this.f41254a = 2;
                    return true;
                }
                this.f41256c = null;
            }
            this.f41254a = 5;
            InterfaceC9968c<? super C9072e> interfaceC9968c = this.f41257d;
            C5207g.m11108c(interfaceC9968c);
            this.f41257d = null;
            interfaceC9968c.mo2031y(C9072e.f47360a);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.util.Iterator
    public final T next() {
        int i10 = this.f41254a;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f41254a = 1;
            Iterator<? extends T> it = this.f41256c;
            C5207g.m11108c(it);
            return it.next();
        }
        if (i10 != 3) {
            throw m14821d();
        }
        this.f41254a = 0;
        T t10 = this.f41255b;
        this.f41255b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: y */
    public final void mo2031y(Object obj) throws Throwable {
        C7499b.m14977z0(obj);
        this.f41254a = 4;
    }
}

package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class vx8 implements Iterator, Continuation, tg4 {

    /* JADX INFO: renamed from: a */
    public int f66060a;

    /* JADX INFO: renamed from: b */
    public Object f66061b;

    /* JADX INFO: renamed from: c */
    public Iterator f66062c;

    /* JADX INFO: renamed from: d */
    public Continuation f66063d;

    /* JADX INFO: renamed from: a */
    public final RuntimeException m23581a() {
        int i = this.f66060a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f66060a);
    }

    /* JADX INFO: renamed from: b */
    public final CoroutineSingletons m23582b(Object obj, Continuation continuation) {
        this.f66061b = obj;
        this.f66060a = 3;
        this.f66063d = continuation;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        continuation.getClass();
        return coroutineSingletons;
    }

    @Override // kotlin.coroutines.Continuation
    public final kn1 getContext() {
        return EmptyCoroutineContext.f47685a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f66060a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m23581a();
                }
                Iterator it = this.f66062c;
                it.getClass();
                if (it.hasNext()) {
                    this.f66060a = 2;
                    return true;
                }
                this.f66062c = null;
            }
            this.f66060a = 5;
            Continuation continuation = this.f66063d;
            continuation.getClass();
            this.f66063d = null;
            continuation.resumeWith(xfa.f68157a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f66060a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            uk9.m22784s();
            return null;
        }
        if (i == 2) {
            this.f66060a = 1;
            Iterator it = this.f66062c;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw m23581a();
        }
        this.f66060a = 0;
        Object obj = this.f66061b;
        this.f66061b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) throws Throwable {
        AbstractC3193b.m15359b(obj);
        this.f66060a = 4;
    }
}

package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.i */
/* JADX INFO: loaded from: classes2.dex */
public class C7159i<E> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40429a = AtomicReferenceFieldUpdater.newUpdater(C7159i.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new C7160j(8, false);

    /* JADX INFO: renamed from: a */
    public final boolean m14448a(E e10) {
        while (true) {
            C7160j c7160j = (C7160j) this._cur;
            int iM14452a = c7160j.m14452a(e10);
            if (iM14452a == 0) {
                return true;
            }
            if (iM14452a == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40429a;
                C7160j<E> c7160jM14456e = c7160j.m14456e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c7160j, c7160jM14456e) && atomicReferenceFieldUpdater.get(this) == c7160j) {
                }
            } else if (iM14452a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14449b() {
        while (true) {
            C7160j c7160j = (C7160j) this._cur;
            if (c7160j.m14453b()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40429a;
            C7160j<E> c7160jM14456e = c7160j.m14456e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c7160j, c7160jM14456e) && atomicReferenceFieldUpdater.get(this) == c7160j) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m14450c() {
        return ((C7160j) this._cur).m14454c();
    }

    /* JADX INFO: renamed from: d */
    public final E m14451d() {
        while (true) {
            C7160j c7160j = (C7160j) this._cur;
            E e10 = (E) c7160j.m14457f();
            if (e10 != C7160j.f40432g) {
                return e10;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40429a;
            C7160j<E> c7160jM14456e = c7160j.m14456e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c7160j, c7160jM14456e) && atomicReferenceFieldUpdater.get(this) == c7160j) {
            }
        }
    }
}

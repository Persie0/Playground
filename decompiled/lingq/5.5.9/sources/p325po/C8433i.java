package p325po;

import cm.InterfaceC2052l;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.C7192d;
import kotlinx.coroutines.selects.InterfaceC7191c;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: po.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C8433i<E> extends AbstractChannel<E> {

    /* JADX INFO: renamed from: d */
    public final ReentrantLock f45570d;

    /* JADX INFO: renamed from: e */
    public Object f45571e;

    public C8433i(InterfaceC2052l<? super E, C9072e> interfaceC2052l) {
        super(interfaceC2052l);
        this.f45570d = new ReentrantLock();
        this.f45571e = C8573r0.f45975l;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p325po.AbstractC8425a
    /* JADX INFO: renamed from: e */
    public final String mo16476e() {
        ReentrantLock reentrantLock = this.f45570d;
        reentrantLock.lock();
        try {
            return "(value=" + this.f45571e + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p325po.AbstractC8425a
    /* JADX INFO: renamed from: n */
    public final boolean mo16481n() {
        return false;
    }

    @Override // p325po.AbstractC8425a
    /* JADX INFO: renamed from: o */
    public final boolean mo16482o() {
        return false;
    }

    @Override // p325po.AbstractC8425a
    /* JADX INFO: renamed from: p */
    public final Object mo16483p(E e10) {
        InterfaceC2052l<E, C9072e> interfaceC2052l;
        ReentrantLock reentrantLock = this.f45570d;
        reentrantLock.lock();
        try {
            C8432h<?> c8432hM16478i = m16478i();
            if (c8432hM16478i != null) {
                reentrantLock.unlock();
                return c8432hM16478i;
            }
            Object obj = this.f45571e;
            C7168r c7168r = C8573r0.f45975l;
            if (obj == c7168r) {
                while (true) {
                    InterfaceC8439o<E> interfaceC8439oMo14339q = mo14339q();
                    if (interfaceC8439oMo14339q == null) {
                        break;
                    }
                    if (interfaceC8439oMo14339q instanceof C8432h) {
                        reentrantLock.unlock();
                        return interfaceC8439oMo14339q;
                    }
                    if (interfaceC8439oMo14339q.mo14350c(e10) != null) {
                        C9072e c9072e = C9072e.f47360a;
                        reentrantLock.unlock();
                        interfaceC8439oMo14339q.mo14351p(e10);
                        return interfaceC8439oMo14339q.mo16491g();
                    }
                }
            }
            Object obj2 = this.f45571e;
            UndeliveredElementException undeliveredElementExceptionM14432b = null;
            if (obj2 != c7168r && (interfaceC2052l = this.f45552a) != null) {
                undeliveredElementExceptionM14432b = OnUndeliveredElementKt.m14432b(interfaceC2052l, obj2, null);
            }
            this.f45571e = e10;
            if (undeliveredElementExceptionM14432b != null) {
                throw undeliveredElementExceptionM14432b;
            }
            C7168r c7168r2 = C8573r0.f45956H;
            reentrantLock.unlock();
            return c7168r2;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: s */
    public final boolean mo14340s(AbstractC8437m<? super E> abstractC8437m) {
        ReentrantLock reentrantLock = this.f45570d;
        reentrantLock.lock();
        try {
            boolean zMo14340s = super.mo14340s(abstractC8437m);
            reentrantLock.unlock();
            return zMo14340s;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: t */
    public final boolean mo14341t() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: u */
    public final boolean mo14342u() {
        ReentrantLock reentrantLock = this.f45570d;
        reentrantLock.lock();
        try {
            boolean z10 = this.f45571e == C8573r0.f45975l;
            reentrantLock.unlock();
            return z10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: w */
    public final void mo14344w(boolean z10) {
        InterfaceC2052l<E, C9072e> interfaceC2052l;
        ReentrantLock reentrantLock = this.f45570d;
        reentrantLock.lock();
        try {
            C7168r c7168r = C8573r0.f45975l;
            Object obj = this.f45571e;
            UndeliveredElementException undeliveredElementExceptionM14432b = null;
            if (obj != c7168r && (interfaceC2052l = this.f45552a) != null) {
                undeliveredElementExceptionM14432b = OnUndeliveredElementKt.m14432b(interfaceC2052l, obj, null);
            }
            this.f45571e = c7168r;
            C9072e c9072e = C9072e.f47360a;
            reentrantLock.unlock();
            super.mo14344w(z10);
            if (undeliveredElementExceptionM14432b != null) {
                throw undeliveredElementExceptionM14432b;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: y */
    public final Object mo14346y() {
        ReentrantLock reentrantLock = this.f45570d;
        reentrantLock.lock();
        try {
            Object obj = this.f45571e;
            C7168r c7168r = C8573r0.f45975l;
            if (obj != c7168r) {
                this.f45571e = c7168r;
                C9072e c9072e = C9072e.f47360a;
                reentrantLock.unlock();
                return obj;
            }
            Object objM16478i = m16478i();
            if (objM16478i == null) {
                objM16478i = C8573r0.f45958J;
            }
            reentrantLock.unlock();
            return objM16478i;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: z */
    public final Object mo14347z(InterfaceC7191c<?> interfaceC7191c) {
        ReentrantLock reentrantLock = this.f45570d;
        reentrantLock.lock();
        try {
            Object obj = this.f45571e;
            C7168r c7168r = C8573r0.f45975l;
            if (obj == c7168r) {
                Object objM16478i = m16478i();
                if (objM16478i == null) {
                    objM16478i = C8573r0.f45958J;
                }
                reentrantLock.unlock();
                return objM16478i;
            }
            if (!interfaceC7191c.mo14503i()) {
                C7168r c7168r2 = C7192d.f40506b;
                reentrantLock.unlock();
                return c7168r2;
            }
            Object obj2 = this.f45571e;
            this.f45571e = c7168r;
            C9072e c9072e = C9072e.f47360a;
            reentrantLock.unlock();
            return obj2;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}

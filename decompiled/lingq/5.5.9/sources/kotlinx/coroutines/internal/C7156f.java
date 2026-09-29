package kotlinx.coroutines.internal;

import ae.C0062b;
import dm.C5207g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import no.AbstractC7826e0;
import no.AbstractC7847l0;
import no.C7814a0;
import no.C7843k;
import no.C7857o1;
import no.C7870t;
import no.C7872u;
import no.InterfaceC7840j;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10223b;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C7156f<T> extends AbstractC7826e0<T> implements InterfaceC10223b, InterfaceC9968c<T> {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40419h = AtomicReferenceFieldUpdater.newUpdater(C7156f.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: d */
    public final CoroutineDispatcher f40420d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9968c<T> f40421e;

    /* JADX INFO: renamed from: f */
    public Object f40422f;

    /* JADX INFO: renamed from: g */
    public final Object f40423g;

    public C7156f(CoroutineDispatcher coroutineDispatcher, ContinuationImpl continuationImpl) {
        super(-1);
        this.f40420d = coroutineDispatcher;
        this.f40421e = continuationImpl;
        this.f40422f = C0062b.f164k;
        this.f40423g = ThreadContextKt.m14434b(mo2029e());
        this._reusableCancellableContinuation = null;
    }

    @Override // no.AbstractC7826e0
    /* JADX INFO: renamed from: a */
    public final void mo14440a(Object obj, CancellationException cancellationException) {
        if (obj instanceof C7872u) {
            ((C7872u) obj).f42973b.mo528n(cancellationException);
        }
    }

    @Override // no.AbstractC7826e0
    /* JADX INFO: renamed from: c */
    public final InterfaceC9968c<T> mo14441c() {
        return this;
    }

    @Override // p490xl.InterfaceC10223b
    /* JADX INFO: renamed from: d */
    public final InterfaceC10223b mo13473d() {
        InterfaceC9968c<T> interfaceC9968c = this.f40421e;
        if (interfaceC9968c instanceof InterfaceC10223b) {
            return (InterfaceC10223b) interfaceC9968c;
        }
        return null;
    }

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: e */
    public final CoroutineContext mo2029e() {
        return this.f40421e.mo2029e();
    }

    @Override // no.AbstractC7826e0
    /* JADX INFO: renamed from: i */
    public final Object mo14442i() {
        Object obj = this.f40422f;
        this.f40422f = C0062b.f164k;
        return obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final C7843k<T> m14443j() {
        boolean z10;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C7168r c7168r = C0062b.f165l;
            if (obj == null) {
                this._reusableCancellableContinuation = c7168r;
                return null;
            }
            if (obj instanceof C7843k) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40419h;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c7168r)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return (C7843k) obj;
                }
            } else if (obj != c7168r && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m14444k() {
        return this._reusableCancellableContinuation != null;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m14445l(Throwable th2) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C7168r c7168r = C0062b.f165l;
            boolean z10 = false;
            boolean z11 = true;
            if (C5207g.m11106a(obj, c7168r)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40419h;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c7168r, th2)) {
                        z10 = true;
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == c7168r);
                if (z10) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f40419h;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        z11 = false;
                        break;
                    }
                }
                if (z11) {
                    return false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m14446m() {
        Object obj = this._reusableCancellableContinuation;
        C7843k c7843k = obj instanceof C7843k ? (C7843k) obj : null;
        if (c7843k != null) {
            c7843k.m15590m();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n */
    public final Throwable m14447n(InterfaceC7840j<?> interfaceC7840j) {
        boolean z10;
        do {
            Object obj = this._reusableCancellableContinuation;
            C7168r c7168r = C0062b.f165l;
            z10 = false;
            if (obj != c7168r) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40419h;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        if (z10) {
                            return (Throwable) obj;
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                z10 = true;
                if (z10) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f40419h;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, c7168r, interfaceC7840j)) {
                    z10 = true;
                    break;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == c7168r);
        } while (!z10);
        return null;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f40420d + ", " + C7814a0.m15552e(this.f40421e) + ']';
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: y */
    public final void mo2031y(Object obj) {
        InterfaceC9968c<T> interfaceC9968c = this.f40421e;
        CoroutineContext coroutineContextMo2029e = interfaceC9968c.mo2029e();
        Throwable thM13371a = Result.m13371a(obj);
        Object c7870t = thM13371a == null ? obj : new C7870t(thM13371a, false);
        CoroutineDispatcher coroutineDispatcher = this.f40420d;
        if (coroutineDispatcher.mo3964B1(coroutineContextMo2029e)) {
            this.f40422f = c7870t;
            this.f42924c = 0;
            coroutineDispatcher.mo2307z1(coroutineContextMo2029e, this);
            return;
        }
        AbstractC7847l0 abstractC7847l0M15607a = C7857o1.m15607a();
        if (abstractC7847l0M15607a.m15603F1()) {
            this.f40422f = c7870t;
            this.f42924c = 0;
            abstractC7847l0M15607a.m15601D1(this);
            return;
        }
        abstractC7847l0M15607a.m15602E1(true);
        try {
            CoroutineContext coroutineContextMo2029e2 = mo2029e();
            Object objM14435c = ThreadContextKt.m14435c(coroutineContextMo2029e2, this.f40423g);
            try {
                interfaceC9968c.mo2031y(obj);
                C9072e c9072e = C9072e.f47360a;
                ThreadContextKt.m14433a(coroutineContextMo2029e2, objM14435c);
                while (abstractC7847l0M15607a.m15604H1()) {
                }
            } catch (Throwable th2) {
                ThreadContextKt.m14433a(coroutineContextMo2029e2, objM14435c);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                m15565h(th3, null);
            } finally {
                abstractC7847l0M15607a.m15600C1(true);
            }
        }
    }
}

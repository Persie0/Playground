package no;

import ae.C0062b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.C7166p;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: no.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7823d0<T> extends C7166p<T> {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42922d = AtomicIntegerFieldUpdater.newUpdater(C7823d0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public C7823d0(InterfaceC9968c interfaceC9968c, CoroutineContext coroutineContext) {
        super(interfaceC9968c, coroutineContext);
        this._decision = 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l0 */
    public final Object m15560l0() throws Throwable {
        boolean z10;
        while (true) {
            int i10 = this._decision;
            z10 = false;
            if (i10 != 0) {
                if (i10 == 2) {
                    break;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
            if (f42922d.compareAndSet(this, 0, 1)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        Object objM14907H0 = C7499b.m14907H0(m15634M());
        if (objM14907H0 instanceof C7870t) {
            throw ((C7870t) objM14907H0).f42969a;
        }
        return objM14907H0;
    }

    @Override // kotlinx.coroutines.internal.C7166p, no.C7883z0
    /* JADX INFO: renamed from: n */
    public final void mo14466n(Object obj) {
        mo14467o(obj);
    }

    @Override // kotlinx.coroutines.internal.C7166p, no.C7883z0
    /* JADX INFO: renamed from: o */
    public final void mo14467o(Object obj) {
        boolean z10;
        while (true) {
            int i10 = this._decision;
            z10 = false;
            if (i10 != 0) {
                if (i10 == 1) {
                    break;
                } else {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (f42922d.compareAndSet(this, 0, 2)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        C0062b.m308S1(C8656b.m16874A(this.f40440c), C7828f.m15571e(obj), null);
    }
}

package no;

import dm.C5207g;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutinesInternalError;
import kotlinx.coroutines.internal.C7156f;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.AbstractRunnableC7182f;
import kotlinx.coroutines.scheduling.InterfaceC7183g;
import p260m8.C7499b;
import p338qd.C8573r0;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: no.e0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7826e0<T> extends AbstractRunnableC7182f {

    /* JADX INFO: renamed from: c */
    public int f42924c;

    public AbstractC7826e0(int i10) {
        this.f42924c = i10;
    }

    /* JADX INFO: renamed from: a */
    public void mo14440a(Object obj, CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC9968c<T> mo14441c();

    /* JADX INFO: renamed from: f */
    public Throwable mo15563f(Object obj) {
        C7870t c7870t = obj instanceof C7870t ? (C7870t) obj : null;
        if (c7870t != null) {
            return c7870t.f42969a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public <T> T mo15564g(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public final void m15565h(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            C8656b.m16899g(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        C5207g.m11108c(th2);
        C8573r0.m16769x0(mo14441c().mo2029e(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo14442i();

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM14967u;
        InterfaceC7875v0 interfaceC7875v0;
        Object objM14967u2;
        InterfaceC7183g interfaceC7183g = this.f40479b;
        try {
            C7156f c7156f = (C7156f) mo14441c();
            InterfaceC9968c<T> interfaceC9968c = c7156f.f40421e;
            Object obj = c7156f.f40423g;
            CoroutineContext coroutineContextMo2029e = interfaceC9968c.mo2029e();
            Object objM14435c = ThreadContextKt.m14435c(coroutineContextMo2029e, obj);
            C7863q1<?> c7863q1M14309c = objM14435c != ThreadContextKt.f40405a ? CoroutineContextKt.m14309c(interfaceC9968c, coroutineContextMo2029e, objM14435c) : null;
            try {
                CoroutineContext coroutineContextMo2029e2 = interfaceC9968c.mo2029e();
                Object objMo14442i = mo14442i();
                Throwable thMo15563f = mo15563f(objMo14442i);
                if (thMo15563f == null) {
                    int i10 = this.f42924c;
                    boolean z10 = true;
                    if (i10 != 1 && i10 != 2) {
                        z10 = false;
                    }
                    if (z10) {
                        interfaceC7875v0 = (InterfaceC7875v0) coroutineContextMo2029e2.mo1474w(InterfaceC7875v0.b.f42976a);
                    } else {
                        interfaceC7875v0 = null;
                    }
                } else {
                    interfaceC7875v0 = null;
                }
                if (interfaceC7875v0 != null && !interfaceC7875v0.mo15547b()) {
                    CancellationException cancellationExceptionMo15617Q = interfaceC7875v0.mo15617Q();
                    mo14440a(objMo14442i, cancellationExceptionMo15617Q);
                    interfaceC9968c.mo2031y(C7499b.m14967u(cancellationExceptionMo15617Q));
                } else if (thMo15563f != null) {
                    interfaceC9968c.mo2031y(C7499b.m14967u(thMo15563f));
                } else {
                    interfaceC9968c.mo2031y(mo15564g(objMo14442i));
                }
                C9072e c9072e = C9072e.f47360a;
                if (c7863q1M14309c == null || c7863q1M14309c.m15611l0()) {
                    ThreadContextKt.m14433a(coroutineContextMo2029e, objM14435c);
                }
                try {
                    interfaceC7183g.mo14491a();
                    objM14967u2 = C9072e.f47360a;
                } catch (Throwable th2) {
                    objM14967u2 = C7499b.m14967u(th2);
                }
                m15565h(null, Result.m13371a(objM14967u2));
            } catch (Throwable th3) {
                if (c7863q1M14309c == null || c7863q1M14309c.m15611l0()) {
                    ThreadContextKt.m14433a(coroutineContextMo2029e, objM14435c);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                interfaceC7183g.mo14491a();
                objM14967u = C9072e.f47360a;
            } catch (Throwable th5) {
                objM14967u = C7499b.m14967u(th5);
            }
            m15565h(th4, Result.m13371a(objM14967u));
        }
    }
}

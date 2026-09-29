package no;

import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CompletionHandlerException;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: no.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7813a<T> extends C7883z0 implements InterfaceC9968c<T>, InterfaceC7882z {

    /* JADX INFO: renamed from: b */
    public final CoroutineContext f42914b;

    public AbstractC7813a(CoroutineContext coroutineContext, boolean z10) {
        super(z10);
        m15635P((InterfaceC7875v0) coroutineContext.mo1474w(InterfaceC7875v0.b.f42976a));
        this.f42914b = coroutineContext.mo1471C(this);
    }

    @Override // no.InterfaceC7882z
    /* JADX INFO: renamed from: G0 */
    public final CoroutineContext mo3889G0() {
        return this.f42914b;
    }

    @Override // no.C7883z0
    /* JADX INFO: renamed from: O */
    public final void mo15544O(CompletionHandlerException completionHandlerException) {
        C8573r0.m16769x0(this.f42914b, completionHandlerException);
    }

    @Override // no.C7883z0
    /* JADX INFO: renamed from: W */
    public String mo15545W() {
        return super.mo15545W();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // no.C7883z0
    /* JADX INFO: renamed from: a0 */
    public final void mo15546a0(Object obj) {
        if (!(obj instanceof C7870t)) {
            mo15549k0(obj);
        } else {
            C7870t c7870t = (C7870t) obj;
            mo15548j0(c7870t.f42969a, c7870t.m15614a());
        }
    }

    @Override // no.C7883z0, no.InterfaceC7875v0
    /* JADX INFO: renamed from: b */
    public boolean mo15547b() {
        return super.mo15547b();
    }

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: e */
    public final CoroutineContext mo2029e() {
        return this.f42914b;
    }

    /* JADX INFO: renamed from: j0 */
    public void mo15548j0(Throwable th2, boolean z10) {
    }

    /* JADX INFO: renamed from: k0 */
    public void mo15549k0(T t10) {
    }

    @Override // no.C7883z0
    /* JADX INFO: renamed from: v */
    public final String mo15550v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p464wl.InterfaceC9968c
    /* JADX INFO: renamed from: y */
    public final void mo2031y(Object obj) {
        Throwable thM13371a = Result.m13371a(obj);
        if (thM13371a != null) {
            obj = new C7870t(thM13371a, false);
        }
        Object objM15638V = m15638V(obj);
        if (objM15638V == C7499b.f41419I) {
            return;
        }
        mo14467o(objM15638V);
    }
}

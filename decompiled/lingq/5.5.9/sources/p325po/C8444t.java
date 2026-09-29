package p325po;

import cm.InterfaceC2052l;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import no.C7843k;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: po.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C8444t<E> extends C8443s<E> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC2052l<E, C9072e> f45574f;

    public C8444t(Object obj, C7843k c7843k, InterfaceC2052l interfaceC2052l) {
        super(obj, c7843k);
        this.f45574f = interfaceC2052l;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    /* JADX INFO: renamed from: F */
    public final boolean mo14408F() {
        if (!super.mo14408F()) {
            return false;
        }
        mo16492P();
        return true;
    }

    @Override // p325po.AbstractC8441q
    /* JADX INFO: renamed from: P */
    public final void mo16492P() {
        CoroutineContext coroutineContextMo2029e = this.f45573e.mo2029e();
        UndeliveredElementException undeliveredElementExceptionM14432b = OnUndeliveredElementKt.m14432b(this.f45574f, this.f45572d, null);
        if (undeliveredElementExceptionM14432b != null) {
            C8573r0.m16769x0(coroutineContextMo2029e, undeliveredElementExceptionM14432b);
        }
    }
}

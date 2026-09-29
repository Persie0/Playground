package androidx.compose.p017ui.platform;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import p284o0.InterfaceC7887c;
import p338qd.C8573r0;

/* JADX INFO: renamed from: androidx.compose.ui.platform.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0670v0 implements InterfaceC7887c {

    /* JADX INFO: renamed from: a */
    public final ParcelableSnapshotMutableState f4356a = C8573r0.m16684L0(Float.valueOf(1.0f));

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: C */
    public final CoroutineContext mo1471C(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "context");
        return CoroutineContext.DefaultImpls.m13470a(this, coroutineContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p284o0.InterfaceC7887c
    /* JADX INFO: renamed from: d0 */
    public final float mo1472d0() {
        return ((Number) this.f4356a.getValue()).floatValue();
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: m0 */
    public final CoroutineContext mo1473m0(CoroutineContext.InterfaceC6758b<?> interfaceC6758b) {
        C5207g.m11111f(interfaceC6758b, "key");
        return CoroutineContext.InterfaceC6757a.a.m13472b(this, interfaceC6758b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: w */
    public final <E extends CoroutineContext.InterfaceC6757a> E mo1474w(CoroutineContext.InterfaceC6758b<E> interfaceC6758b) {
        C5207g.m11111f(interfaceC6758b, "key");
        return (E) CoroutineContext.InterfaceC6757a.a.m13471a(this, interfaceC6758b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* JADX INFO: renamed from: y0 */
    public final <R> R mo1475y0(R r10, InterfaceC2056p<? super R, ? super CoroutineContext.InterfaceC6757a, ? extends R> interfaceC2056p) {
        C5207g.m11111f(interfaceC2056p, "operation");
        return interfaceC2056p.mo1337m0(r10, this);
    }
}

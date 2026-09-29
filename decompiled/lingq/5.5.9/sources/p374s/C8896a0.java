package p374s;

import androidx.compose.animation.core.Transition;
import dm.C5207g;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5327o;

/* JADX INFO: renamed from: s.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8896a0 implements InterfaceC5327o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Transition f46781a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Transition.C0364a f46782b;

    public C8896a0(Transition transition, Transition.C0364a c0364a) {
        this.f46781a = transition;
        this.f46782b = c0364a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.InterfaceC5327o
    /* JADX INFO: renamed from: a */
    public final void mo2504a() {
        InterfaceC5301c1 interfaceC5301c1;
        Transition transition = this.f46781a;
        transition.getClass();
        Transition.C0364a c0364a = this.f46782b;
        C5207g.m11111f(c0364a, "deferredAnimation");
        Transition.C0364a.a aVar = (Transition.C0364a.a) c0364a.f1587c.getValue();
        if (aVar == null || (interfaceC5301c1 = aVar.f1589a) == null) {
            return;
        }
        transition.f1580h.remove(interfaceC5301c1);
    }
}

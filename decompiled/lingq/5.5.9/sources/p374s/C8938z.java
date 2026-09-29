package p374s;

import androidx.compose.animation.core.Transition;
import dm.C5207g;
import p081e0.InterfaceC5327o;

/* JADX INFO: renamed from: s.z */
/* JADX INFO: loaded from: classes.dex */
public final class C8938z implements InterfaceC5327o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Transition f46880a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Transition f46881b;

    public C8938z(Transition transition, Transition transition2) {
        this.f46880a = transition;
        this.f46881b = transition2;
    }

    @Override // p081e0.InterfaceC5327o
    /* JADX INFO: renamed from: a */
    public final void mo2504a() {
        Transition transition = this.f46880a;
        transition.getClass();
        Transition transition2 = this.f46881b;
        C5207g.m11111f(transition2, "transition");
        transition.f1581i.remove(transition2);
    }
}

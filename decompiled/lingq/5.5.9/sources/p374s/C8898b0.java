package p374s;

import androidx.compose.animation.core.Transition;
import dm.C5207g;
import p081e0.InterfaceC5327o;

/* JADX INFO: renamed from: s.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8898b0 implements InterfaceC5327o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Transition f46785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Transition.C0368d f46786b;

    public C8898b0(Transition transition, Transition.C0368d c0368d) {
        this.f46785a = transition;
        this.f46786b = c0368d;
    }

    @Override // p081e0.InterfaceC5327o
    /* JADX INFO: renamed from: a */
    public final void mo2504a() {
        Transition transition = this.f46785a;
        transition.getClass();
        Transition.C0368d c0368d = this.f46786b;
        C5207g.m11111f(c0368d, "animation");
        transition.f1580h.remove(c0368d);
    }
}

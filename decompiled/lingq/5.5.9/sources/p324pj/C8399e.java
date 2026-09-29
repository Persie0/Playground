package p324pj;

import com.lingq.commons.p053ui.views.NumberStepper;
import kotlin.Pair;
import p278nh.C7780g;

/* JADX INFO: renamed from: pj.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C8399e implements NumberStepper.InterfaceC3278a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8398d f45523a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7780g f45524b;

    public C8399e(C8398d c8398d, C7780g c7780g) {
        this.f45523a = c8398d;
        this.f45524b = c7780g;
    }

    @Override // com.lingq.commons.p053ui.views.NumberStepper.InterfaceC3278a
    /* JADX INFO: renamed from: a */
    public final void mo9357a(int i10) {
        this.f45523a.f45521e.mo9795a(new Pair<>(this.f45524b.f42717a, Integer.valueOf(i10)));
    }
}

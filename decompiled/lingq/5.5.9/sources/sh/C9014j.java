package sh;

import ae.C0062b;
import com.lingq.player.PlayingFrom;
import dm.C5207g;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StateFlowImpl;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: sh.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9014j implements InterfaceC9013i {

    /* JADX INFO: renamed from: a */
    public final StateFlowImpl f47235a;

    /* JADX INFO: renamed from: b */
    public final C7135p f47236b;

    /* JADX INFO: renamed from: c */
    public final StateFlowImpl f47237c;

    /* JADX INFO: renamed from: d */
    public final C7135p f47238d;

    /* JADX INFO: renamed from: e */
    public final AbstractChannel f47239e;

    /* JADX INFO: renamed from: f */
    public final C7114a f47240f;

    public C9014j() {
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(null);
        this.f47235a = stateFlowImplM14379a;
        this.f47236b = C0062b.m306S(stateFlowImplM14379a);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(null);
        this.f47237c = stateFlowImplM14379a2;
        this.f47238d = C0062b.m306S(stateFlowImplM14379a2);
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
        this.f47239e = abstractChannelM16738m;
        this.f47240f = C0062b.m287L1(abstractChannelM16738m);
        C0062b.m287L1(C8573r0.m16738m(-1, null, 6));
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: E */
    public final void mo9720E(PlayingFrom playingFrom) {
        C5207g.m11111f(playingFrom, "playingFrom");
        this.f47235a.setValue(playingFrom);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: F0 */
    public final InterfaceC7142w<C9015k> mo9721F0() {
        return this.f47238d;
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: R1 */
    public final InterfaceC7142w<PlayingFrom> mo9726R1() {
        return this.f47236b;
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: b1 */
    public final void mo9732b1() {
        this.f47239e.mo16479j(C9072e.f47360a);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: p */
    public final InterfaceC7116c<C9072e> mo9740p() {
        return this.f47240f;
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: z1 */
    public final void mo9747z1(int i10, long j10, boolean z10) {
        this.f47237c.setValue(new C9015k(i10, j10, z10));
    }
}

package p205jk;

import ae.C0062b;
import com.lingq.p055ui.upgrade.UpgradeReason;
import dm.C5207g;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: renamed from: jk.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C6516l implements InterfaceC6515k {

    /* JADX INFO: renamed from: a */
    public final AbstractChannel f37149a;

    /* JADX INFO: renamed from: b */
    public final C7114a f37150b;

    /* JADX INFO: renamed from: c */
    public final AbstractChannel f37151c;

    /* JADX INFO: renamed from: d */
    public final C7114a f37152d;

    /* JADX INFO: renamed from: e */
    public final C7114a f37153e;

    public C6516l() {
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
        this.f37149a = abstractChannelM16738m;
        this.f37150b = C0062b.m287L1(abstractChannelM16738m);
        AbstractChannel abstractChannelM16738m2 = C8573r0.m16738m(-1, null, 6);
        this.f37151c = abstractChannelM16738m2;
        this.f37152d = C0062b.m287L1(abstractChannelM16738m2);
        this.f37153e = C0062b.m287L1(C8573r0.m16738m(-1, null, 6));
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: A */
    public final void mo9771A(UpgradeReason upgradeReason) {
        C5207g.m11111f(upgradeReason, "reason");
        this.f37149a.mo16479j(upgradeReason);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: G1 */
    public final void mo9772G1(String str) {
        this.f37151c.mo16479j(str);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: S0 */
    public final InterfaceC7116c<UpgradeReason> mo9773S0() {
        return this.f37150b;
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: X */
    public final InterfaceC7116c<String> mo9774X() {
        return this.f37152d;
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC7116c<C9072e> mo9775i0() {
        return this.f37153e;
    }
}

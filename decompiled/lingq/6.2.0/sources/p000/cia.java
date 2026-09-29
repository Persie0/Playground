package p000;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.p012ui.UpgradeReason;
import kotlin.Triple;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class cia implements bia {

    /* JADX INFO: renamed from: a */
    public final hm5 f10139a;

    /* JADX INFO: renamed from: b */
    public final C3244l f10140b;

    /* JADX INFO: renamed from: c */
    public final c18 f10141c;

    /* JADX INFO: renamed from: d */
    public final C3211a f10142d;

    /* JADX INFO: renamed from: e */
    public final du0 f10143e;

    /* JADX INFO: renamed from: f */
    public final du0 f10144f;

    public cia(C3509qs c3509qs, hm5 hm5Var) {
        c3509qs.getClass();
        hm5Var.getClass();
        this.f10139a = hm5Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(qha.f57796a);
        this.f10140b = c3244lM17114d;
        this.f10141c = AbstractC3224d.m15524c(c3244lM17114d);
        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
        this.f10142d = c3211aM10525a;
        this.f10143e = AbstractC3224d.m15519A(c3211aM10525a);
        this.f10144f = AbstractC3224d.m15519A(do7.m10525a(-1, 6, null));
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        String strM25660c = zha.m25660c(upgradeReason);
        if (strM25660c.length() > 0) {
            ((C1240a) this.f10139a).m7025f("Upgrade message activated", g9a.m12429f("Attempted prior action", strM25660c));
        }
        rha rhaVar = new rha(upgradeReason);
        C3244l c3244l = this.f10140b;
        c3244l.getClass();
        c3244l.m15572j(null, rhaVar);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f10143e;
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        C3244l c3244l = this.f10140b;
        c3244l.getClass();
        c3244l.m15572j(null, qha.f57796a);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f10141c;
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f10142d.mo4677k(new Triple(str, Boolean.valueOf(z), upgradeReason));
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f10144f;
    }
}

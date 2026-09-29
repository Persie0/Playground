package p000;

import com.lingq.core.player.service.PlayingFrom;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class ec7 implements dc7 {

    /* JADX INFO: renamed from: a */
    public final C3244l f36997a;

    /* JADX INFO: renamed from: b */
    public final c18 f36998b;

    /* JADX INFO: renamed from: c */
    public final C3244l f36999c;

    /* JADX INFO: renamed from: d */
    public final c18 f37000d;

    /* JADX INFO: renamed from: e */
    public final C3211a f37001e;

    /* JADX INFO: renamed from: f */
    public final du0 f37002f;

    public ec7() {
        C3244l c3244lM17114d = AbstractC3352my.m17114d(null);
        this.f36997a = c3244lM17114d;
        this.f36998b = AbstractC3224d.m15524c(c3244lM17114d);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f36999c = c3244lM17114d2;
        this.f37000d = AbstractC3224d.m15524c(c3244lM17114d2);
        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
        this.f37001e = c3211aM10525a;
        this.f37002f = AbstractC3224d.m15519A(c3211aM10525a);
        AbstractC3224d.m15519A(do7.m10525a(-1, 6, null));
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: M0 */
    public final eh9 mo9201M0() {
        return this.f37000d;
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: T1 */
    public final void mo9202T1(int i, long j, boolean z) {
        fc7 fc7Var = new fc7(i, j, z);
        C3244l c3244l = this.f36999c;
        c3244l.getClass();
        c3244l.m15572j(null, fc7Var);
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: g0 */
    public final void mo9211g0(PlayingFrom playingFrom) {
        playingFrom.getClass();
        C3244l c3244l = this.f36997a;
        c3244l.getClass();
        c3244l.m15572j(null, playingFrom);
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: j1 */
    public final void mo9212j1() {
        this.f37001e.mo4677k(xfa.f68157a);
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: q */
    public final c83 mo9213q() {
        return this.f37002f;
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: t2 */
    public final eh9 mo9214t2() {
        return this.f36998b;
    }
}

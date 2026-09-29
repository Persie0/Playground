package p000;

import com.lingq.core.common.AbstractC1261a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final class kka implements jka {

    /* JADX INFO: renamed from: a */
    public final c18 f47458a;

    /* JADX INFO: renamed from: b */
    public final C3244l f47459b;

    /* JADX INFO: renamed from: c */
    public final c18 f47460c;

    public kka() {
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        this.f47458a = AbstractC3224d.m15524c(AbstractC3352my.m17114d(Boolean.FALSE));
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new ika(1023));
        this.f47459b = c3244lM17114d;
        this.f47460c = AbstractC3224d.m15524c(c3244lM17114d);
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: N0 */
    public final void mo9011N0(ika ikaVar) {
        C3244l c3244l = this.f47459b;
        c3244l.getClass();
        c3244l.m15572j(null, ikaVar);
    }

    @Override // p000.jka
    public final void clear() {
        ika ikaVar = new ika(1023);
        C3244l c3244l = this.f47459b;
        c3244l.getClass();
        c3244l.m15572j(null, ikaVar);
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: l0 */
    public final eh9 mo9013l0() {
        return this.f47458a;
    }

    @Override // p000.jka
    /* JADX INFO: renamed from: u2 */
    public final eh9 mo9014u2() {
        return this.f47460c;
    }
}

package p000;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.settings.FilterType;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;

/* JADX INFO: loaded from: classes3.dex */
public final class rya implements qya {

    /* JADX INFO: renamed from: a */
    public final C3211a f60050a;

    /* JADX INFO: renamed from: b */
    public final du0 f60051b;

    /* JADX INFO: renamed from: c */
    public final C3211a f60052c;

    /* JADX INFO: renamed from: d */
    public final du0 f60053d;

    public rya() {
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f60050a = c3211aM7042a;
        this.f60051b = AbstractC3224d.m15519A(c3211aM7042a);
        C3211a c3211aM7042a2 = AbstractC1261a.m7042a();
        this.f60052c = c3211aM7042a2;
        this.f60053d = AbstractC3224d.m15519A(c3211aM7042a2);
    }

    @Override // p000.qya
    /* JADX INFO: renamed from: J1 */
    public final c83 mo20215J1() {
        return this.f60051b;
    }

    @Override // p000.qya
    /* JADX INFO: renamed from: M */
    public final void mo20216M(FilterType filterType) {
        this.f60050a.mo4677k(filterType);
    }

    @Override // p000.qya
    /* JADX INFO: renamed from: N2 */
    public final c83 mo20217N2() {
        return this.f60053d;
    }

    @Override // p000.qya
    /* JADX INFO: renamed from: x1 */
    public final void mo20218x1() {
        this.f60052c.mo4677k(Boolean.TRUE);
    }
}

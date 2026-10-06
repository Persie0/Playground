package p000;

import android.view.View;
import android.view.WindowInsets;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class agh extends agm {

    /* JADX INFO: renamed from: a */
    final WindowInsets f297a;

    /* JADX INFO: renamed from: b */
    acr f298b;

    /* JADX INFO: renamed from: c */
    private acr f299c;

    /* JADX INFO: renamed from: f */
    private ago f300f;

    public agh(ago agoVar, WindowInsets windowInsets) {
        super(agoVar);
        this.f299c = null;
        this.f297a = windowInsets;
    }

    /* JADX INFO: renamed from: s */
    private acr m578s(int i, boolean z) {
        acr acrVarM220c = acr.f102a;
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((i & i2) != 0) {
                acr acrVarM582b = m582b(i2, false);
                acrVarM220c = acr.m220c(Math.max(acrVarM220c.f103b, acrVarM582b.f103b), Math.max(acrVarM220c.f104c, acrVarM582b.f104c), Math.max(acrVarM220c.f105d, acrVarM582b.f105d), Math.max(acrVarM220c.f106e, acrVarM582b.f106e));
            }
        }
        return acrVarM220c;
    }

    /* JADX INFO: renamed from: t */
    private acr m579t() {
        ago agoVar = this.f300f;
        return agoVar != null ? agoVar.m609g() : acr.f102a;
    }

    /* JADX INFO: renamed from: u */
    private acr m580u(View view) {
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: a */
    public acr mo581a(int i) {
        return m578s(i, false);
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: c */
    public final acr mo583c() {
        if (this.f299c == null) {
            this.f299c = acr.m220c(this.f297a.getSystemWindowInsetLeft(), this.f297a.getSystemWindowInsetTop(), this.f297a.getSystemWindowInsetRight(), this.f297a.getSystemWindowInsetBottom());
        }
        return this.f299c;
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: d */
    public ago mo584d(int i, int i2, int i3, int i4) {
        agf agfVar = new agf(ago.m601m(this.f297a));
        agfVar.mo577c(ago.m600h(mo583c(), i, i2, i3, i4));
        agfVar.mo576b(ago.m600h(mo590j(), i, i2, i3, i4));
        return agfVar.mo575a();
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: e */
    public void mo585e(View view) {
        acr acrVarM580u = m580u(view);
        if (acrVarM580u == null) {
            acrVarM580u = acr.f102a;
        }
        m587g(acrVarM580u);
    }

    @Override // p000.agm
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f298b, ((agh) obj).f298b);
        }
        return false;
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: f */
    public void mo586f(acr[] acrVarArr) {
    }

    /* JADX INFO: renamed from: g */
    public void m587g(acr acrVar) {
        this.f298b = acrVar;
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: h */
    public void mo588h(ago agoVar) {
        this.f300f = agoVar;
    }

    @Override // p000.agm
    /* JADX INFO: renamed from: i */
    public boolean mo589i() {
        return this.f297a.isRound();
    }

    /* JADX INFO: renamed from: b */
    protected acr m582b(int i, boolean z) {
        int i2;
        switch (i) {
            case 1:
                return acr.m220c(0, mo583c().f104c, 0, 0);
            case 2:
                acr acrVarMo583c = mo583c();
                ago agoVar = this.f300f;
                acr acrVarM609g = agoVar != null ? agoVar.m609g() : null;
                int iMin = acrVarMo583c.f106e;
                if (acrVarM609g != null) {
                    iMin = Math.min(iMin, acrVarM609g.f106e);
                }
                return acr.m220c(acrVarMo583c.f103b, 0, acrVarMo583c.f105d, iMin);
            case 8:
                acr acrVarMo583c2 = mo583c();
                acr acrVarM579t = m579t();
                int i3 = acrVarMo583c2.f106e;
                if (i3 > acrVarM579t.f106e) {
                    return acr.m220c(0, 0, 0, i3);
                }
                acr acrVar = this.f298b;
                return (acrVar == null || acrVar.equals(acr.f102a) || (i2 = this.f298b.f106e) <= acrVarM579t.f106e) ? acr.f102a : acr.m220c(0, 0, 0, i2);
            case 16:
                return mo597q();
            case 32:
                return mo596p();
            case 64:
                return mo598r();
            case 128:
                ago agoVar2 = this.f300f;
                ael aelVarMo594n = agoVar2 != null ? agoVar2.f309b.mo594n() : mo594n();
                return aelVarMo594n != null ? acr.m220c(aek.m343b(aelVarMo594n.f257a), aek.m345d(aelVarMo594n.f257a), aek.m344c(aelVarMo594n.f257a), aek.m342a(aelVarMo594n.f257a)) : acr.f102a;
            default:
                return acr.f102a;
        }
    }
}

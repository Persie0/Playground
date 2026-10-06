package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ago {

    /* JADX INFO: renamed from: a */
    public static final ago f308a = agl.f305c;

    /* JADX INFO: renamed from: b */
    public final agm f309b;

    private ago(WindowInsets windowInsets) {
        this.f309b = new agl(this, windowInsets);
    }

    /* JADX INFO: renamed from: h */
    static acr m600h(acr acrVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, acrVar.f103b - i);
        int iMax2 = Math.max(0, acrVar.f104c - i2);
        int iMax3 = Math.max(0, acrVar.f105d - i3);
        int iMax4 = Math.max(0, acrVar.f106e - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? acrVar : acr.m220c(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: m */
    public static ago m601m(WindowInsets windowInsets) {
        return m602n(windowInsets, null);
    }

    /* JADX INFO: renamed from: n */
    public static ago m602n(WindowInsets windowInsets, View view) {
        abf.m90c(windowInsets);
        ago agoVar = new ago(windowInsets);
        if (view != null && afe.m461e(view)) {
            agoVar.m615p(afi.m497b(view));
            agoVar.m614o(view.getRootView());
        }
        return agoVar;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public final int m603a() {
        return this.f309b.mo583c().f106e;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public final int m604b() {
        return this.f309b.mo583c().f103b;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public final int m605c() {
        return this.f309b.mo583c().f105d;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public final int m606d() {
        return this.f309b.mo583c().f104c;
    }

    /* JADX INFO: renamed from: e */
    public final WindowInsets m607e() {
        agm agmVar = this.f309b;
        if (agmVar instanceof agh) {
            return ((agh) agmVar).f297a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ago) {
            return aeb.m318b(this.f309b, ((ago) obj).f309b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final acr m608f(int i) {
        return this.f309b.mo581a(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public final acr m609g() {
        return this.f309b.mo590j();
    }

    public final int hashCode() {
        agm agmVar = this.f309b;
        if (agmVar == null) {
            return 0;
        }
        return agmVar.hashCode();
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public final ago m610i() {
        return this.f309b.mo595o();
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public final ago m611j() {
        return this.f309b.mo591k();
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public final ago m612k() {
        return this.f309b.mo592l();
    }

    /* JADX INFO: renamed from: l */
    public final ago m613l(int i, int i2, int i3, int i4) {
        return this.f309b.mo584d(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: o */
    final void m614o(View view) {
        this.f309b.mo585e(view);
    }

    /* JADX INFO: renamed from: p */
    final void m615p(ago agoVar) {
        this.f309b.mo588h(agoVar);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m616q() {
        return this.f309b.mo593m();
    }

    public ago() {
        this.f309b = new agm(this);
    }
}

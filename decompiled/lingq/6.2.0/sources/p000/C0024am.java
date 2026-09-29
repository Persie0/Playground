package p000;

import java.util.List;

/* JADX INFO: renamed from: am */
/* JADX INFO: loaded from: classes2.dex */
public final class C0024am implements InterfaceC2969em {

    /* JADX INFO: renamed from: a */
    public final C3763xl f820a;

    /* JADX INFO: renamed from: b */
    public final C3763xl f821b;

    public C0024am(C3763xl c3763xl, C3763xl c3763xl2) {
        this.f820a = c3763xl;
        this.f821b = c3763xl2;
    }

    @Override // p000.InterfaceC2969em
    /* JADX INFO: renamed from: a */
    public final m90 mo550a() {
        return new tf9(this.f820a.mo550a(), this.f821b.mo550a());
    }

    @Override // p000.InterfaceC2969em
    /* JADX INFO: renamed from: c */
    public final List mo551c() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p000.InterfaceC2969em
    /* JADX INFO: renamed from: d */
    public final boolean mo552d() {
        return this.f820a.mo552d() && this.f821b.mo552d();
    }
}

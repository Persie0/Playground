package p000;

import androidx.compose.material3.C0254m;

/* JADX INFO: loaded from: classes2.dex */
public final class ps2 implements k7a {

    /* JADX INFO: renamed from: a */
    public final l7a f56737a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0025an f56738b;

    /* JADX INFO: renamed from: c */
    public final f32 f56739c;

    /* JADX INFO: renamed from: d */
    public final ui3 f56740d;

    /* JADX INFO: renamed from: e */
    public final C0254m f56741e;

    public ps2(l7a l7aVar, l43 l43Var, f32 f32Var, ui3 ui3Var) {
        C3288l7 c3288l7 = new C3288l7(16);
        this.f56737a = l7aVar;
        this.f56738b = l43Var;
        this.f56739c = f32Var;
        this.f56740d = ui3Var;
        l7aVar.f49258c = c3288l7;
        this.f56741e = new C0254m(this, 0);
    }

    @Override // p000.k7a
    /* JADX INFO: renamed from: a */
    public final f32 mo14943a() {
        return this.f56739c;
    }

    @Override // p000.k7a
    /* JADX INFO: renamed from: b */
    public final InterfaceC0025an mo14944b() {
        return this.f56738b;
    }

    @Override // p000.k7a
    /* JADX INFO: renamed from: c */
    public final boolean mo14945c() {
        return false;
    }

    @Override // p000.k7a
    public final l7a getState() {
        return this.f56737a;
    }
}

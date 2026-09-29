package p000;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class it0 extends laa {

    /* JADX INFO: renamed from: a */
    public boolean f44517a = false;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f44518b;

    public it0(ViewGroup viewGroup) {
        this.f44518b = viewGroup;
    }

    @Override // p000.laa, p000.caa
    /* JADX INFO: renamed from: a */
    public final void mo4474a(daa daaVar) {
        if (!this.f44517a) {
            kta.m15689b(this.f44518b, false);
        }
        daaVar.mo10189I(this);
    }

    @Override // p000.laa, p000.caa
    /* JADX INFO: renamed from: b */
    public final void mo4475b() {
        kta.m15689b(this.f44518b, false);
    }

    @Override // p000.laa, p000.caa
    /* JADX INFO: renamed from: f */
    public final void mo4479f() {
        kta.m15689b(this.f44518b, true);
    }

    @Override // p000.laa, p000.caa
    /* JADX INFO: renamed from: g */
    public final void mo4480g(daa daaVar) {
        kta.m15689b(this.f44518b, false);
        this.f44517a = true;
    }
}

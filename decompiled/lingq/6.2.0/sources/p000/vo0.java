package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vo0 extends n32 implements wm9 {

    /* JADX INFO: renamed from: e */
    public wm9 f65686e;

    /* JADX INFO: renamed from: f */
    public long f65687f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f65688g = 0;

    /* JADX INFO: renamed from: h */
    public Object f65689h;

    public vo0(qa2 qa2Var) {
        this.f65689h = qa2Var;
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: b */
    public final int mo4446b(long j) {
        wm9 wm9Var = this.f65686e;
        wm9Var.getClass();
        return wm9Var.mo4446b(j - this.f65687f);
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: c */
    public final long mo4447c(int i) {
        wm9 wm9Var = this.f65686e;
        wm9Var.getClass();
        return wm9Var.mo4447c(i) + this.f65687f;
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: i */
    public final List mo4453i(long j) {
        wm9 wm9Var = this.f65686e;
        wm9Var.getClass();
        return wm9Var.mo4453i(j - this.f65687f);
    }

    @Override // p000.n32
    /* JADX INFO: renamed from: k */
    public final void mo10291k() {
        this.f8576b = 0;
        this.f52260c = 0L;
        this.f52261d = false;
        this.f65686e = null;
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: l */
    public final int mo4454l() {
        wm9 wm9Var = this.f65686e;
        wm9Var.getClass();
        return wm9Var.mo4454l();
    }

    @Override // p000.n32
    /* JADX INFO: renamed from: m */
    public final void mo10292m() {
        switch (this.f65688g) {
            case 0:
                wo0 wo0Var = (wo0) ((C3440oy) this.f65689h).f55160b;
                mo10291k();
                wo0Var.f67112b.add(this);
                break;
            default:
                ((qa2) this.f65689h).m17835o(this);
                break;
        }
    }

    public /* synthetic */ vo0() {
    }
}

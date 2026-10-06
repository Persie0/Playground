package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ccr implements guj {

    /* JADX INFO: renamed from: a */
    private final guk f5192a;

    /* JADX INFO: renamed from: b */
    private final kfk f5193b;

    public ccr(guk gukVar, kfk kfkVar) {
        this.f5192a = gukVar;
        this.f5193b = kfkVar;
    }

    /* JADX INFO: renamed from: e */
    private final void m3460e(int i) {
        if (ivw.f32421g != null) {
            this.f5193b.mo14122i(ivw.f32421g, Integer.valueOf(i));
        }
    }

    @Override // p000.guj
    /* JADX INFO: renamed from: a */
    public final void mo3461a(int i) {
    }

    @Override // p000.guj
    /* JADX INFO: renamed from: b */
    public final void mo3462b(boolean z) {
        if (!z) {
            m3460e(0);
        } else {
            if (this.f5192a.m9779d()) {
                return;
            }
            m3460e(Integer.MAX_VALUE);
        }
    }

    @Override // p000.guj
    /* JADX INFO: renamed from: c */
    public final void mo3463c(float f) {
        guk gukVar = this.f5192a;
        if (gukVar.f26433a && gukVar.m9779d()) {
            m3460e(Math.round(f) * 100);
        }
    }

    @Override // p000.guj
    /* JADX INFO: renamed from: d */
    public final void mo3464d(float f) {
    }
}

package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jfh extends jfa {

    /* JADX INFO: renamed from: e */
    public final C1112xa f33867e;

    /* JADX INFO: renamed from: g */
    private final jfm f33868g;

    public jfh(jft jftVar, jfm jfmVar) {
        super(jftVar, jcy.f33766a);
        this.f33867e = new C1112xa();
        this.f33868g = jfmVar;
        this.f7622f.mo13118b(this);
    }

    @Override // p000.jfa
    /* JADX INFO: renamed from: e */
    protected final void mo13012e(jcu jcuVar, int i) {
        this.f33868g.m13046d(jcuVar, i);
    }

    @Override // p000.jfa
    /* JADX INFO: renamed from: f */
    protected final void mo13013f() {
        this.f33868g.m13047e();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: h */
    public final void mo4656h() {
        m13016k();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: i */
    public final void mo4657i() {
        this.f33858a = true;
        m13016k();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: j */
    public final void mo4658j() {
        this.f33858a = false;
        jfm jfmVar = this.f33868g;
        synchronized (jfm.f33892c) {
            if (jfmVar.f33901l == this) {
                jfmVar.f33901l = null;
                jfmVar.f33902m.clear();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m13016k() {
        if (this.f33867e.isEmpty()) {
            return;
        }
        this.f33868g.m13048f(this);
    }
}

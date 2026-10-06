package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hua extends htx implements hjq {

    /* JADX INFO: renamed from: a */
    public final jvd f29559a;

    /* JADX INFO: renamed from: b */
    public final dox f29560b;

    /* JADX INFO: renamed from: c */
    public final mrm f29561c;

    /* JADX INFO: renamed from: d */
    public fvu f29562d = null;

    /* JADX INFO: renamed from: e */
    public final hjp f29563e;

    /* JADX INFO: renamed from: f */
    public final hjr f29564f;

    /* JADX INFO: renamed from: g */
    public final hjr f29565g;

    /* JADX INFO: renamed from: h */
    public final drj f29566h;

    /* JADX INFO: renamed from: i */
    public final bkn f29567i;

    public hua(jvd jvdVar, drj drjVar, bkn bknVar, dox doxVar, mrm mrmVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f29559a = jvdVar;
        this.f29566h = drjVar;
        this.f29567i = bknVar;
        this.f29560b = doxVar;
        this.f29561c = mrmVar;
        hjr hjrVar = new hjr(new hvd(this), new hjn[0]);
        this.f29564f = hjrVar;
        this.f29565g = new hjr(new hve(this), new hjn[0]);
        hjp hjpVar = new hjp(hjrVar, false);
        this.f29563e = hjpVar;
        hjpVar.m10391f();
    }

    @Override // p000.htx
    /* JADX INFO: renamed from: a */
    public final void mo10752a() {
        if (this.f29563e.m10386a() == null) {
            return;
        }
        ((htx) this.f29563e.m10386a().f28059a).mo10752a();
    }

    @Override // p000.htx
    /* JADX INFO: renamed from: b */
    public final void mo10753b(fvu fvuVar, jvb jvbVar) {
        if (this.f29563e.m10386a() == null) {
            return;
        }
        ((htx) this.f29563e.m10386a().f28059a).mo10753b(fvuVar, jvbVar);
    }

    @Override // p000.hjq
    /* JADX INFO: renamed from: e */
    public final void mo5710e() {
        this.f29563e.m10387b();
        this.f29564f.mo5710e();
        this.f29565g.mo5710e();
    }

    @Override // p000.htx, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f29563e.m10388c();
    }

    @Override // p000.htx, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f29563e.m10389d();
    }

    @Override // p000.htx, p000.hjn
    /* JADX INFO: renamed from: h */
    public final void mo5713h() {
        jbx.m12868m(this);
    }
}

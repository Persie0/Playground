package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fmd implements fuc {

    /* JADX INFO: renamed from: a */
    public final jvb f22541a;

    /* JADX INFO: renamed from: b */
    public final flz f22542b;

    /* JADX INFO: renamed from: c */
    public final fvu f22543c;

    /* JADX INFO: renamed from: d */
    private final fuc f22544d;

    public fmd(fuc fucVar, jvb jvbVar, flz flzVar, fvu fvuVar) {
        fucVar.getClass();
        flzVar.getClass();
        fvuVar.getClass();
        this.f22544d = fucVar;
        this.f22541a = jvbVar;
        this.f22542b = flzVar;
        this.f22543c = fvuVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jwn] */
    /* JADX INFO: renamed from: b */
    public final jwn m8568b() {
        return this.f22544d.mo8575i().f39918f;
    }

    @Override // p000.cbu
    /* JADX INFO: renamed from: bh */
    public final cdj mo3409bh(bko bkoVar) {
        return this.f22544d.mo3409bh(bkoVar);
    }

    @Override // p000.fuc
    /* JADX INFO: renamed from: c */
    public final kba mo8569c(kev kevVar) {
        return this.f22544d.mo8569c(kevVar);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f22544d.close();
        this.f22541a.close();
    }

    @Override // p000.fuc
    /* JADX INFO: renamed from: d */
    public final mrm mo8570d() {
        return this.f22544d.mo8570d();
    }

    @Override // p000.fuc
    /* JADX INFO: renamed from: e */
    public final nps mo8571e() {
        return this.f22544d.mo8571e();
    }

    @Override // p000.fuc
    /* JADX INFO: renamed from: f */
    public final nps mo8572f(fua fuaVar, gyh gyhVar) {
        return this.f22544d.mo8572f(fuaVar, gyhVar);
    }

    @Override // p000.fuc
    /* JADX INFO: renamed from: g */
    public final boolean mo8573g() {
        return this.f22541a.mo8995b();
    }

    @Override // p000.fuc
    /* JADX INFO: renamed from: h */
    public final jvb mo8574h() {
        return this.f22544d.mo8574h();
    }

    @Override // p000.fuc
    /* JADX INFO: renamed from: i */
    public final mca mo8575i() {
        return this.f22544d.mo8575i();
    }
}

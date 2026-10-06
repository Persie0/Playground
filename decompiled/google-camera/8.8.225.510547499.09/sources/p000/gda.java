package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gda implements jww {

    /* JADX INFO: renamed from: a */
    public final fvu f24260a;

    /* JADX INFO: renamed from: b */
    private final boolean f24261b;

    /* JADX INFO: renamed from: c */
    private final gcz f24262c;

    /* JADX INFO: renamed from: d */
    private final gcz f24263d;

    public gda(jww jwwVar, jww jwwVar2, fvu fvuVar, gcy gcyVar) {
        this.f24260a = fvuVar;
        this.f24262c = new gcz(jwwVar, gcyVar);
        this.f24263d = new gcz(jwwVar2, gcyVar);
        this.f24261b = fvuVar.mo14540I();
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        jvb jvbVar = new jvb();
        jvbVar.m13537d(this.f24262c.mo3830a(new ecr(this, kbgVar, 12), executor));
        jvbVar.m13537d(this.f24263d.mo3830a(new ecr(this, kbgVar, 13), executor));
        return jvbVar;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final /* bridge */ /* synthetic */ Object mo3831be() {
        if (this.f24261b) {
            return this.f24260a.mo14558k() == kmq.f36557a ? (gcy) this.f24263d.mo3831be() : (gcy) this.f24262c.mo3831be();
        }
        return gcy.OFF;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* bridge */ /* synthetic */ void mo3415bf(Object obj) {
        gcy gcyVar = (gcy) obj;
        if (this.f24260a.mo14558k() == kmq.f36557a) {
            this.f24263d.mo3415bf(gcyVar);
        } else {
            this.f24262c.mo3415bf(gcyVar);
        }
    }
}

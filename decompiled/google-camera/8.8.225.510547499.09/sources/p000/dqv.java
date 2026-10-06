package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqv implements AutoCloseable, jwn {

    /* JADX INFO: renamed from: a */
    private static final kba f12362a = cgw.f5698k;

    /* JADX INFO: renamed from: b */
    private jwn f12363b;

    /* JADX INFO: renamed from: c */
    private kba f12364c;

    /* JADX INFO: renamed from: d */
    private jww f12365d;

    /* JADX INFO: renamed from: e */
    private kba f12366e;

    /* JADX INFO: renamed from: f */
    private kmq f12367f;

    /* JADX INFO: renamed from: g */
    private final Executor f12368g;

    /* JADX INFO: renamed from: h */
    private final jww f12369h;

    /* JADX INFO: renamed from: i */
    private final jwn f12370i;

    public dqv(Executor executor) {
        kba kbaVar = f12362a;
        this.f12364c = kbaVar;
        this.f12365d = jwv.m13644a(ikw.PHOTO);
        this.f12366e = kbaVar;
        this.f12367f = kmq.BACK;
        jwf jwfVar = new jwf(false);
        this.f12369h = jwfVar;
        this.f12370i = jwj.m13624c(jwfVar);
        this.f12368g = executor;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        return this.f12370i.mo3830a(kbgVar, executor);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean mo3831be() {
        return (Boolean) this.f12370i.mo3831be();
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        this.f12366e.close();
        kba kbaVar = f12362a;
        this.f12366e = kbaVar;
        this.f12364c.close();
        this.f12364c = kbaVar;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m6607d() {
        ikw ikwVar = (ikw) this.f12365d.mo3831be();
        boolean zBooleanValue = ((Boolean) this.f12363b.mo3831be()).booleanValue();
        kmq kmqVar = this.f12367f;
        boolean z = false;
        if (zBooleanValue) {
            if (ikwVar == ikw.PHOTO && kmqVar == kmq.f36557a) {
                z = true;
            } else if ((ikwVar == ikw.LONG_EXPOSURE && kmqVar == kmq.f36557a) || ikwVar == ikw.PORTRAIT) {
                z = true;
            }
        }
        this.f12369h.mo3415bf(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m6608e(jww jwwVar) {
        this.f12365d = jwwVar;
        this.f12366e.close();
        this.f12366e = jwwVar.mo3830a(new czq(this, 20), this.f12368g);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m6609f(kmq kmqVar) {
        this.f12367f = kmqVar;
        m6607d();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m6610g(jwn jwnVar) {
        this.f12363b = jwnVar;
        this.f12364c.close();
        this.f12364c = jwnVar.mo3830a(new czq(this, 19), this.f12368g);
    }
}

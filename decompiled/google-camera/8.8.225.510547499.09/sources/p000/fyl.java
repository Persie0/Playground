package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fyl implements fyr, kba {

    /* JADX INFO: renamed from: a */
    public final Executor f23911a;

    /* JADX INFO: renamed from: c */
    public final gve f23913c;

    /* JADX INFO: renamed from: d */
    public final kbz f23914d;

    /* JADX INFO: renamed from: e */
    public final jfs f23915e;

    /* JADX INFO: renamed from: f */
    private final gvw f23916f;

    /* JADX INFO: renamed from: h */
    private final AtomicBoolean f23918h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    private final jww f23917g = new jwf(2);

    /* JADX INFO: renamed from: b */
    public final gsa f23912b = new gry();

    /* JADX INFO: renamed from: i */
    private final fxs f23919i = new fxs(2);

    public fyl(Executor executor, jfs jfsVar, gve gveVar, gvw gvwVar, kbz kbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f23911a = executor;
        this.f23915e = jfsVar;
        this.f23913c = gveVar;
        this.f23916f = gvwVar;
        this.f23914d = kbzVar;
    }

    @Override // p000.fyq
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nps mo8942a(grm grmVar) {
        if (grmVar.f26152a.mo7245a() != 35) {
            grmVar.f26152a.close();
            return kxk.m14964J(new kec("Only YUV_420_888 images are supported"));
        }
        gvw gvwVar = this.f23916f;
        kmq kmqVar = grmVar.f26158g;
        kmqVar.getClass();
        if (gvwVar.mo9812h(kmqVar)) {
            this.f23916f.mo9808d(grmVar.f26152a, grmVar.f26153b);
        }
        return this.f23919i.m8939a(new dqr(this, grmVar, 4));
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f23918h.compareAndSet(false, true)) {
            this.f23919i.close();
            this.f23917g.mo3415bf(0);
        }
    }
}

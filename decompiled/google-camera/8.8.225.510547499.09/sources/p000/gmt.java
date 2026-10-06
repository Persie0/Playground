package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gmt implements fuc {

    /* JADX INFO: renamed from: f */
    private static final AtomicInteger f25614f = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final jvb f25615a;

    /* JADX INFO: renamed from: b */
    public final jvb f25616b;

    /* JADX INFO: renamed from: c */
    public final kbo f25617c;

    /* JADX INFO: renamed from: d */
    public final jvz f25618d;

    /* JADX INFO: renamed from: e */
    public nps f25619e;

    /* JADX INFO: renamed from: g */
    private final kfk f25620g;

    /* JADX INFO: renamed from: h */
    private final Executor f25621h;

    /* JADX INFO: renamed from: i */
    private final AtomicBoolean f25622i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j */
    private final cbu f25623j;

    /* JADX INFO: renamed from: k */
    private final dni f25624k;

    /* JADX INFO: renamed from: l */
    private final cie f25625l;

    /* JADX INFO: renamed from: m */
    private final gmk f25626m;

    /* JADX INFO: renamed from: n */
    private final fzw f25627n;

    /* JADX INFO: renamed from: o */
    private final gtd f25628o;

    /* JADX INFO: renamed from: p */
    private final mca f25629p;

    public gmt(jvb jvbVar, jvb jvbVar2, kfk kfkVar, kbo kboVar, gax gaxVar, jvd jvdVar, fup fupVar, jwn jwnVar, jwn jwnVar2, jwn jwnVar3, jwn jwnVar4, nps npsVar, Executor executor, fzw fzwVar, jvz jvzVar, cbu cbuVar, gcx gcxVar, dni dniVar, jwn jwnVar5, cie cieVar, gmk gmkVar) {
        this.f25615a = jvbVar;
        this.f25616b = jvbVar2;
        this.f25620g = kfkVar;
        this.f25617c = kboVar.mo6314a("PckOneCamera-" + f25614f.getAndIncrement());
        this.f25628o = new gtd(gaxVar, jvdVar);
        this.f25621h = executor;
        this.f25627n = fzwVar;
        this.f25618d = jvzVar;
        this.f25623j = cbuVar;
        this.f25624k = dniVar;
        this.f25625l = cieVar;
        this.f25626m = gmkVar;
        this.f25629p = new mca(gaxVar, fupVar.f23601a, jwnVar, jwnVar2, jwnVar3, jwnVar4, npsVar, gcxVar, jwnVar5);
    }

    @Override // p000.cbu
    /* JADX INFO: renamed from: bh */
    public final cdj mo3409bh(bko bkoVar) {
        return this.f25623j.mo3409bh(bkoVar);
    }

    @Override // p000.fuc
    /* JADX INFO: renamed from: c */
    public final kba mo8569c(kev kevVar) {
        return this.f25624k.m6433c(kevVar);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f25622i.compareAndSet(false, true)) {
            this.f25620g.close();
            this.f25621h.execute(new ghv(this, 10));
        }
    }

    @Override // p000.fuc
    /* JADX INFO: renamed from: d */
    public final mrm mo8570d() {
        return mrm.m16829i(this.f25620g);
    }

    @Override // p000.fuc
    /* JADX INFO: renamed from: e */
    public final nps mo8571e() {
        this.f25617c.mo13940b("start");
        this.f25620g.mo14120g();
        nps npsVarM14966L = kxk.m14966L(this.f25627n.m8986a());
        this.f25615a.m13537d(this.f25625l.m3798a(this.f25626m));
        try {
            synchronized (this) {
                dkm.m6315a(this.f25617c, npsVarM14966L, "OneCamera started.", "OneCamera failed to start!");
                this.f25619e = npsVarM14966L;
            }
            this.f25624k.m6433c(new gms(this));
            return npsVarM14966L;
        } catch (Throwable th) {
            this.f25624k.m6433c(new gms(this));
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gax, java.lang.Object] */
    @Override // p000.fuc
    /* JADX INFO: renamed from: f */
    public final nps mo8572f(fua fuaVar, gyh gyhVar) {
        gtd gtdVar = this.f25628o;
        ?? r1 = gtdVar.f26335b;
        jvd jvdVar = (jvd) gtdVar.f26334a;
        return r1.mo9019c(new glk(fuaVar, gyhVar, new gar(fuaVar, jvdVar, gyhVar), new gay(gyhVar, jvdVar)));
    }

    @Override // p000.fuc
    /* JADX INFO: renamed from: g */
    public final boolean mo8573g() {
        return this.f25622i.get();
    }

    @Override // p000.fuc
    /* JADX INFO: renamed from: h */
    public final jvb mo8574h() {
        return this.f25615a;
    }

    @Override // p000.fuc
    /* JADX INFO: renamed from: i */
    public final mca mo8575i() {
        return this.f25629p;
    }
}

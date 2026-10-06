package p000;

import android.graphics.PointF;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ghq implements cbu {

    /* JADX INFO: renamed from: a */
    public final kfk f24787a;

    /* JADX INFO: renamed from: b */
    public final jvs f24788b;

    /* JADX INFO: renamed from: c */
    public final jww f24789c;

    /* JADX INFO: renamed from: d */
    public nqf f24790d;

    /* JADX INFO: renamed from: e */
    public final drj f24791e;

    /* JADX INFO: renamed from: f */
    public final bkn f24792f;

    /* JADX INFO: renamed from: g */
    private final jvb f24793g;

    /* JADX INFO: renamed from: h */
    private final glu f24794h;

    /* JADX INFO: renamed from: i */
    private final jwf f24795i;

    /* JADX INFO: renamed from: j */
    private final jwn f24796j;

    /* JADX INFO: renamed from: k */
    private final int f24797k;

    /* JADX INFO: renamed from: l */
    private volatile boolean f24798l;

    /* JADX INFO: renamed from: m */
    private final dfn f24799m;

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, jww] */
    public ghq(kfk kfkVar, dfn dfnVar, jvb jvbVar, jvs jvsVar, drj drjVar, bkn bknVar, djm djmVar, glu gluVar, jwf jwfVar, int i, jww jwwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.f24787a = kfkVar;
        this.f24799m = dfnVar;
        this.f24793g = jvbVar;
        this.f24788b = jvsVar;
        this.f24791e = drjVar;
        this.f24792f = bknVar;
        this.f24789c = djmVar.f11788b;
        this.f24794h = gluVar;
        this.f24795i = jwfVar;
        this.f24796j = jwwVar;
        this.f24797k = i;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, jww] */
    /* JADX INFO: renamed from: b */
    public final void m9257b(boolean z, boolean z2) {
        if (z2) {
            this.f24794h.mo9463g();
            this.f24791e.m6626f();
        }
        if (z) {
            this.f24792f.f3651a.mo3415bf(false);
        }
        this.f24787a.mo14126m(z, z2, false);
        kew kewVarMo14115b = this.f24787a.mo14115b();
        if (z) {
            kgo kgoVar = (kgo) kewVarMo14115b;
            kgoVar.f35937h = this.f24799m.m6072h();
            kgoVar.f35933d = Integer.valueOf(((gss) this.f24795i.f34942d).f26275h);
        }
        if (z2) {
            ((kgo) kewVarMo14115b).f35938i = this.f24799m.m6072h();
        }
        ((kgo) kewVarMo14115b).f35939j = this.f24799m.m6072h();
        this.f24787a.mo14127n(kewVarMo14115b.mo14090a());
    }

    @Override // p000.cbu
    /* JADX INFO: renamed from: bh */
    public final cdj mo3409bh(bko bkoVar) {
        jvd.m13538a();
        this.f24788b.m13585b();
        if (!((Boolean) ((jwf) this.f24791e.f12398d).f34942d).booleanValue()) {
            this.f24794h.mo9465i();
        }
        if (!this.f24798l) {
            this.f24798l = true;
            this.f24793g.m13537d(this.f24789c.mo3830a(new gcu(this, 19), not.INSTANCE));
        }
        kew kewVarMo14115b = this.f24787a.mo14115b();
        int i = ((gss) this.f24795i.f34942d).f26275h;
        if (i != 0) {
            i = 1;
        }
        boolean zBooleanValue = true ^ ((Boolean) ((jwf) this.f24791e.f12398d).f34942d).booleanValue();
        kgo kgoVar = (kgo) kewVarMo14115b;
        kgoVar.f35933d = Integer.valueOf(i);
        kgoVar.f35937h = this.f24799m.m6073i((PointF) bkoVar.f3652a);
        if (zBooleanValue) {
            kgoVar.f35938i = this.f24799m.m6073i((PointF) bkoVar.f3652a);
        }
        this.f24787a.mo14125l(kewVarMo14115b.mo14090a(), bzq.m3271k());
        m9258c();
        nqf nqfVarM17621g = nqf.m17621g();
        this.f24790d = nqfVarM17621g;
        return new ghp(this, nqfVarM17621g, bkoVar, null, null, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m9258c() {
        gzp gzpVar = (gzp) this.f24796j.mo3831be();
        long j = this.f24797k;
        if (!gzpVar.equals(gzp.AUTO)) {
            j += (long) gzpVar.f26960g;
        }
        try {
            this.f24788b.m13584a(new ghv(this, 1), j, TimeUnit.SECONDS);
        } catch (RejectedExecutionException e) {
        }
    }
}

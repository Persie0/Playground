package p000;

import android.graphics.drawable.Drawable;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dep implements hes, hdo, dej, dfa {

    /* JADX INFO: renamed from: A */
    public final ddw f10672A;

    /* JADX INFO: renamed from: B */
    public final dec f10673B;

    /* JADX INFO: renamed from: C */
    public final hnw f10674C;

    /* JADX INFO: renamed from: D */
    public final long f10675D;

    /* JADX INFO: renamed from: E */
    public mrm f10676E;

    /* JADX INFO: renamed from: F */
    public long f10677F;

    /* JADX INFO: renamed from: G */
    public hnu f10678G;

    /* JADX INFO: renamed from: H */
    public final cwd f10679H;

    /* JADX INFO: renamed from: I */
    private final Executor f10680I;

    /* JADX INFO: renamed from: J */
    private final dhv f10681J;

    /* JADX INFO: renamed from: b */
    public final dek f10683b;

    /* JADX INFO: renamed from: c */
    public final dgn f10684c;

    /* JADX INFO: renamed from: d */
    public final dgg f10685d;

    /* JADX INFO: renamed from: f */
    public boolean f10687f;

    /* JADX INFO: renamed from: g */
    public boolean f10688g;

    /* JADX INFO: renamed from: h */
    public boolean f10689h;

    /* JADX INFO: renamed from: i */
    public boolean f10690i;

    /* JADX INFO: renamed from: j */
    public final jvb f10691j;

    /* JADX INFO: renamed from: k */
    public final Executor f10692k;

    /* JADX INFO: renamed from: l */
    public hew f10693l;

    /* JADX INFO: renamed from: m */
    public mrm f10694m;

    /* JADX INFO: renamed from: n */
    public mrm f10695n;

    /* JADX INFO: renamed from: o */
    public final jvd f10696o;

    /* JADX INFO: renamed from: p */
    public final fly f10697p;

    /* JADX INFO: renamed from: q */
    public final iad f10698q;

    /* JADX INFO: renamed from: r */
    public final oju f10699r;

    /* JADX INFO: renamed from: s */
    public final hdp f10700s;

    /* JADX INFO: renamed from: t */
    public final ggm f10701t;

    /* JADX INFO: renamed from: u */
    public final jwn f10702u;

    /* JADX INFO: renamed from: v */
    public boolean f10703v;

    /* JADX INFO: renamed from: w */
    public final ScheduledExecutorService f10704w;

    /* JADX INFO: renamed from: x */
    public final ckp f10705x;

    /* JADX INFO: renamed from: y */
    public final hnv f10706y;

    /* JADX INFO: renamed from: z */
    public final dfb f10707z;

    /* JADX INFO: renamed from: a */
    public kba f10682a = cgw.f5697j;

    /* JADX INFO: renamed from: e */
    public final Map f10686e = new ConcurrentHashMap();

    public dep(dek dekVar, kcf kcfVar, jvd jvdVar, fly flyVar, iad iadVar, oju ojuVar, hdp hdpVar, ggm ggmVar, jwn jwnVar, dgn dgnVar, dgg dggVar, dhv dhvVar, ScheduledExecutorService scheduledExecutorService, Executor executor, cwd cwdVar, ckp ckpVar, dec decVar, hnw hnwVar, hnv hnvVar, dfb dfbVar, ddw ddwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        mqu mquVar = mqu.f41450a;
        this.f10694m = mquVar;
        this.f10695n = mquVar;
        this.f10676E = mquVar;
        this.f10683b = dekVar;
        this.f10684c = dgnVar;
        this.f10685d = dggVar;
        this.f10692k = kcfVar;
        this.f10696o = jvdVar;
        this.f10697p = flyVar;
        this.f10698q = iadVar;
        this.f10699r = ojuVar;
        this.f10700s = hdpVar;
        this.f10701t = ggmVar;
        this.f10702u = jwnVar;
        this.f10703v = ((Boolean) jwnVar.mo3831be()).booleanValue();
        this.f10680I = executor;
        this.f10681J = dhvVar;
        this.f10704w = scheduledExecutorService;
        this.f10679H = cwdVar;
        this.f10673B = decVar;
        this.f10674C = hnwVar;
        this.f10705x = ckpVar;
        this.f10706y = hnvVar;
        this.f10707z = dfbVar;
        this.f10672A = ddwVar;
        this.f10691j = new jvb();
        this.f10675D = TimeUnit.SECONDS.toMillis(1L) / ((long) ((Integer) dhvVar.mo6173a(dig.f11490d).get()).intValue());
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: a */
    public final void mo3950a() {
        this.f10692k.execute(new czx(this.f10691j, 10));
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: b */
    public final void mo3951b(hew hewVar) {
        this.f10692k.execute(new cuq(this, hewVar, 15));
    }

    @Override // p000.dej
    /* JADX INFO: renamed from: c */
    public final void mo5993c(long j) {
        kpw kpwVar = (kpw) this.f10686e.remove(Long.valueOf(j));
        if (kpwVar != null) {
            kpwVar.close();
        }
    }

    @Override // p000.dej
    /* JADX INFO: renamed from: d */
    public final void mo5994d(des desVar) {
        this.f10692k.execute(new cuq(this, desVar, 14));
    }

    /* JADX INFO: renamed from: e */
    public final hev m6009e(deb debVar) {
        heu heuVarM10165a = hev.m10165a();
        String str = debVar.f10632b;
        if (str != null) {
            heuVarM10165a.f27492a = str;
        }
        Drawable drawable = debVar.f10634d;
        if (drawable != null) {
            heuVarM10165a.f27493b = drawable;
        }
        heuVarM10165a.f27494c = new cuq(this, debVar, 17);
        int i = 18;
        heuVarM10165a.f27498g = new cuq(this, debVar, i);
        heuVarM10165a.f27499h = new czx(debVar, i);
        return heuVarM10165a.m10160a();
    }

    @Override // p000.hdo
    /* JADX INFO: renamed from: g */
    public final void mo6011g(kmd kmdVar) {
        this.f10683b.mo6004j(new oyo(kmdVar.mo14553f()));
    }

    /* JADX INFO: renamed from: h */
    public final void m6012h() {
        if (this.f10676E.mo16813g()) {
            ((ScheduledFuture) this.f10676E.mo16809c()).cancel(false);
        }
        this.f10682a.close();
        this.f10678G = null;
        if (this.f10687f) {
            this.f10683b.mo6000f();
            mqu mquVar = mqu.f41450a;
            this.f10695n = mquVar;
            this.f10694m = mquVar;
            this.f10687f = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6013i() {
        if (this.f10688g && this.f10703v && !this.f10690i && this.f10689h && !this.f10687f) {
            this.f10683b.mo5998d();
            this.f10680I.execute(new czx(this, 14));
            this.f10687f = true;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m6014j(deb debVar) {
        hev hevVarM6009e = m6009e(debVar);
        if (this.f10695n.mo16813g() && ((deb) this.f10695n.mo16809c()).f10631a == debVar.f10631a) {
            hew hewVar = this.f10693l;
            if (hewVar != null) {
                hewVar.mo10132c(hevVarM6009e);
                return;
            }
            return;
        }
        this.f10695n = mrm.m16829i(debVar);
        dhv dhvVar = this.f10681J;
        String[] strArr = dig.f11487a;
        dhvVar.mo6177e();
        m6015k(hevVarM6009e);
    }

    /* JADX INFO: renamed from: k */
    public final void m6015k(hev hevVar) {
        hew hewVar = this.f10693l;
        if (hewVar != null) {
            hewVar.mo10130a();
            this.f10693l.mo10131b(hevVar);
        }
    }

    @Override // p000.hdo
    /* JADX INFO: renamed from: l */
    public final void mo6016l(kpw kpwVar) {
        this.f10692k.execute(new cuq(this, kpwVar, 13));
    }

    @Override // p000.hdo
    /* JADX INFO: renamed from: m */
    public final void mo6017m() {
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: v */
    public final void mo3969v() {
        this.f10692k.execute(new czx(this, 17));
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: w */
    public final void mo3970w() {
        this.f10692k.execute(new czx(this, 11));
    }

    @Override // p000.dfa
    /* JADX INFO: renamed from: f */
    public final void mo6010f(deb debVar) {
        nqf nqfVar;
        int i = debVar.f10641k;
        if (i == 4) {
            if (this.f10695n.mo16813g() && ((deb) this.f10695n.mo16809c()).f10631a == debVar.f10631a) {
                this.f10695n = mqu.f41450a;
                hew hewVar = this.f10693l;
                if (hewVar != null) {
                    hewVar.mo10130a();
                    return;
                }
                return;
            }
            return;
        }
        if (debVar.f10642l != 3) {
            m6014j(debVar);
            return;
        }
        if (i == 3) {
            m6014j(debVar);
            return;
        }
        boolean z = true;
        if (i == 1) {
            ddw ddwVar = this.f10672A;
            synchronized (ddwVar) {
                if (ddwVar.f10606a == null) {
                    ddwVar.f10606a = nqf.m17621g();
                } else {
                    z = false;
                }
                nqfVar = ddwVar.f10606a;
            }
            if (z) {
                jvh.m13561i(nnj.m17523i(nod.m17553i(ddwVar.f10607b.m10978d(), ddu.f10585b, not.INSTANCE), Throwable.class, ddu.f10584a, not.INSTANCE), new cis(ddwVar, 6));
            }
            jvh.m13562j(nqfVar, new cdc(this, debVar, 4), this.f10692k);
        }
    }
}

package p000;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.wear.ambient.AmbientDelegate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hru implements hsd {

    /* JADX INFO: renamed from: a */
    private static final nbh f29350a = nbh.m17259h("com/google/android/apps/camera/tracking/TrackingControllerImpl");

    /* JADX INFO: renamed from: b */
    private final hnu f29351b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f29352c;

    /* JADX INFO: renamed from: d */
    private volatile boolean f29353d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f29354e;

    /* JADX INFO: renamed from: f */
    private boolean f29355f;

    /* JADX INFO: renamed from: g */
    private int f29356g;

    /* JADX INFO: renamed from: h */
    private jwf f29357h;

    /* JADX INFO: renamed from: i */
    private mrm f29358i;

    /* JADX INFO: renamed from: j */
    private volatile PointF f29359j;

    /* JADX INFO: renamed from: k */
    private volatile mrm f29360k;

    /* JADX INFO: renamed from: l */
    private final AtomicInteger f29361l;

    /* JADX INFO: renamed from: m */
    private final Executor f29362m;

    /* JADX INFO: renamed from: n */
    private final Executor f29363n;

    /* JADX INFO: renamed from: o */
    private final List f29364o;

    /* JADX INFO: renamed from: p */
    private final kbz f29365p;

    /* JADX INFO: renamed from: q */
    private final AmbientDelegate f29366q;

    public hru(AmbientDelegate ambientDelegate, hnw hnwVar, Executor executor, hnv hnvVar, Executor executor2, Executor executor3, dhv dhvVar, kbz kbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        dhx dhxVar = diu.f11711a;
        dhvVar.mo6177e();
        this.f29352c = false;
        this.f29353d = false;
        this.f29354e = false;
        this.f29355f = false;
        this.f29356g = 2;
        mqu mquVar = mqu.f41450a;
        this.f29358i = mquVar;
        this.f29360k = mquVar;
        this.f29361l = new AtomicInteger(0);
        this.f29364o = new ArrayList();
        this.f29357h = new jwf(hsg.m10693b());
        hny hnyVarM10529a = hnz.m10529a();
        hnyVarM10529a.m10524c(executor);
        hnyVarM10529a.m10525d("FocusTracking");
        hnyVarM10529a.m10526e(new hps(this, 17));
        hnyVarM10529a.m10527f(new hps(this, 18));
        hnyVarM10529a.m10528g(hnvVar);
        this.f29351b = hnyVarM10529a.m10522a();
        this.f29362m = executor2;
        this.f29363n = executor3;
        this.f29365p = kbzVar;
        this.f29356g = 2;
        hnwVar.mo10519f(this);
        this.f29366q = ambientDelegate;
    }

    @Override // p000.hsb
    /* JADX INFO: renamed from: b */
    public final jwn mo10657b(PointF pointF) {
        ArrayList arrayList;
        this.f29365p.mo13961e("startTracking");
        synchronized (this) {
            String strM1586Q = this.f29366q.m1586Q();
            this.f29358i = mro.m16832b(strM1586Q) ? mqu.f41450a : mrm.m16829i(strM1586Q);
            jwf jwfVar = new jwf(hsg.m10693b());
            this.f29357h = jwfVar;
            if (this.f29360k.mo16813g() && !this.f29352c) {
                this.f29353d = true;
                this.f29354e = true;
                this.f29359j = pointF;
                this.f29361l.set(0);
                synchronized (this) {
                    arrayList = new ArrayList(this.f29364o);
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((hsh) arrayList.get(i)).mo3966s();
                }
                hsf hsfVarM10692a = hsg.m10692a();
                hsfVarM10692a.f29396a = 2;
                hsfVarM10692a.m10691f(hsa.f29385a);
                hsfVarM10692a.m10689d(new RectF(pointF.x, pointF.y, pointF.x, pointF.y));
                hsfVarM10692a.m10687b(1.0f);
                hsfVarM10692a.m10690e(0L);
                jwfVar.mo3415bf(hsfVarM10692a.m10686a());
                this.f29365p.mo13962f();
                return jwj.m13624c(jwfVar);
            }
            this.f29360k.mo16813g();
            return jwfVar;
        }
    }

    @Override // p000.hnu
    /* JADX INFO: renamed from: by */
    public final void mo5538by(hnv hnvVar) {
        this.f29351b.mo5538by(hnvVar);
    }

    @Override // p000.kpy
    /* JADX INFO: renamed from: ca */
    public final void mo8395ca() {
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: d */
    public final synchronized kba mo10658d(mrm mrmVar, mrm mrmVar2) {
        mo10662h();
        this.f29360k = mrmVar2;
        this.f29355f = false;
        return new gto(this, mrmVar2, 15);
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: e */
    public final synchronized void mo10659e(hsh hshVar) {
        this.f29364o.add(hshVar);
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: f */
    public final void mo10660f(kpw kpwVar) {
        hsg hsgVarMo10666c;
        jwf jwfVar;
        ArrayList arrayList;
        synchronized (this) {
            int i = this.f29356g;
            this.f29356g = i - 1;
            if (i > 0) {
                return;
            }
            if (this.f29360k.mo16813g()) {
                if (!this.f29355f) {
                    this.f29355f = true;
                }
                if (this.f29354e) {
                    if (this.f29353d) {
                        this.f29353d = false;
                        hsgVarMo10666c = ((hrz) this.f29360k.mo16809c()).mo10665b(kpwVar, this.f29359j);
                    } else {
                        String strM1586Q = this.f29366q.m1586Q();
                        if (!this.f29358i.mo16813g() || mro.m16832b(strM1586Q) || strM1586Q.equals(this.f29358i.mo16809c())) {
                            hsgVarMo10666c = ((hrz) this.f29360k.mo16809c()).mo10666c(kpwVar);
                        } else {
                            this.f29358i.mo16809c();
                            hsgVarMo10666c = ((hrz) this.f29360k.mo16809c()).mo10666c(kpwVar);
                        }
                        this.f29358i = mro.m16832b(strM1586Q) ? mqu.f41450a : mrm.m16829i(strM1586Q);
                    }
                    if (this.f29352c) {
                        ((nbe) ((nbe) f29350a.m17252c()).mo17276G((char) 3928)).mo17290o("tracking is disabled due the thermal issue");
                    } else {
                        if (hsgVarMo10666c.f29405c < 0.6f) {
                            this.f29361l.incrementAndGet();
                        } else {
                            this.f29361l.set(0);
                        }
                        if (this.f29361l.get() <= 10) {
                            synchronized (this) {
                                jwfVar = this.f29357h;
                            }
                            synchronized (this) {
                                arrayList = new ArrayList(this.f29364o);
                            }
                            this.f29362m.execute(new gxn(jwfVar, hsgVarMo10666c, arrayList, 10));
                            return;
                        }
                    }
                    mo10662h();
                }
            }
        }
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: g */
    public final synchronized void mo10661g(hsh hshVar) {
        this.f29364o.remove(hshVar);
    }

    @Override // p000.hsb
    /* JADX INFO: renamed from: h */
    public final void mo10662h() {
        ArrayList arrayList;
        this.f29365p.mo13961e("stopTracking");
        synchronized (this) {
            if (this.f29360k.mo16813g() && this.f29354e) {
                jwf jwfVar = this.f29357h;
                this.f29354e = false;
                this.f29353d = false;
                this.f29358i = mqu.f41450a;
                ((hrz) this.f29360k.mo16809c()).mo10664a();
                hsg hsgVar = (hsg) jwfVar.f34942d;
                hsf hsfVarM10692a = hsg.m10692a();
                hsfVarM10692a.m10689d(hsgVar.f29404b);
                hsfVarM10692a.m10690e(hsgVar.f29407e);
                hsfVarM10692a.m10688c(hsgVar.f29406d);
                hsfVarM10692a.m10691f(hsgVar.f29403a);
                jwfVar.mo3415bf(hsfVarM10692a.m10686a());
                synchronized (this) {
                    arrayList = new ArrayList(this.f29364o);
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((hsh) arrayList.get(i)).mo3967t();
                }
                this.f29365p.mo13962f();
                return;
            }
            this.f29365p.mo13962f();
        }
    }

    @Override // p000.hsi
    /* JADX INFO: renamed from: i */
    public final boolean mo10663i() {
        return this.f29360k.mo16813g();
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m10667j(mrm mrmVar) {
        mrm mrmVar2 = this.f29360k;
        if (mrmVar.mo16813g()) {
            if (mrmVar2.mo16813g() && mrmVar2.mo16809c() == mrmVar.mo16809c()) {
                mo10662h();
                this.f29360k = mqu.f41450a;
            }
            this.f29363n.execute(new hps((hrz) mrmVar.mo16809c(), 16));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10668k(boolean z) {
        this.f29352c = z;
        if (z) {
            mo10662h();
        }
    }
}

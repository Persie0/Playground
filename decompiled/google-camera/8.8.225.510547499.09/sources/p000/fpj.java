package p000;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpj extends chw implements cre {

    /* JADX INFO: renamed from: b */
    public static final nbh f23082b = nbh.m17259h("com/google/android/apps/camera/modules/videointent/VideoIntentModule");

    /* JADX INFO: renamed from: c */
    public final cpj f23083c;

    /* JADX INFO: renamed from: d */
    public final cqm f23084d;

    /* JADX INFO: renamed from: f */
    public final chk f23086f;

    /* JADX INFO: renamed from: i */
    public csn f23089i;

    /* JADX INFO: renamed from: j */
    public final fws f23090j;

    /* JADX INFO: renamed from: k */
    private final Resources f23091k;

    /* JADX INFO: renamed from: l */
    private final BottomBarController f23092l;

    /* JADX INFO: renamed from: m */
    private final cvr f23093m;

    /* JADX INFO: renamed from: n */
    private final fna f23094n;

    /* JADX INFO: renamed from: p */
    private final Executor f23096p;

    /* JADX INFO: renamed from: q */
    private final dlw f23097q;

    /* JADX INFO: renamed from: r */
    private jvb f23098r;

    /* JADX INFO: renamed from: e */
    public final Object f23085e = new Object();

    /* JADX INFO: renamed from: g */
    public mrm f23087g = mqu.f41450a;

    /* JADX INFO: renamed from: h */
    public boolean f23088h = false;

    /* JADX INFO: renamed from: o */
    private final BottomBarListener f23095o = new fpi(this);

    public fpj(chk chkVar, cpj cpjVar, Resources resources, BottomBarController bottomBarController, oju ojuVar, fws fwsVar, Executor executor, cvr cvrVar, dlw dlwVar, fna fnaVar, byte[] bArr, byte[] bArr2) {
        this.f23086f = chkVar;
        this.f23083c = cpjVar;
        this.f23091k = resources;
        this.f23092l = bottomBarController;
        this.f23084d = (cqm) ojuVar.get();
        this.f23093m = cvrVar;
        this.f23094n = fnaVar;
        this.f23090j = fwsVar;
        this.f23096p = executor;
        this.f23097q = dlwVar;
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: bR */
    public final void mo5261bR() {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bU */
    public final void mo3769bU() {
        synchronized (this.f23085e) {
            this.f23084d.m5362c(this.f23086f.mo3693g(), ikw.VIDEO_INTENT);
            this.f23083c.m5232d();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bV */
    public final void mo3770bV() {
        synchronized (this.f23085e) {
            this.f23084d.m5364e();
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: c */
    public final String mo3773c() {
        return this.f23091k.getString(C0100R.string.video_accessibility_peek);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f23096p.execute(new fnx(this, 6));
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: f */
    public final void mo5264f() {
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: g */
    public final void mo5265g() {
        synchronized (this.f23085e) {
            if (this.f23083c.m5229a() != null) {
                this.f23089i = this.f23083c.m5229a().f8703s;
            }
        }
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: h */
    public final void mo5266h() {
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: i */
    public final void mo5267i(boolean z) {
        this.f23084d.m5373o();
        synchronized (this.f23085e) {
            if (this.f23084d.m5373o() == 4) {
                lku.m15614I(this.f23087g.mo16813g(), "URI not set.");
                Intent intent = new Intent();
                intent.setData((Uri) this.f23087g.mo16809c());
                intent.addFlags(1);
                this.f23088h = true;
                this.f23086f.mo3700n(intent);
            } else {
                this.f23083c.m5235g(z);
            }
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: k */
    public final void mo3777k() {
        if (this.f5764a) {
            this.f23083c.m5246r(true != this.f23083c.m5242n() ? 5 : 10);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: l */
    public final void mo3778l() {
        synchronized (this.f23085e) {
            this.f23083c.m5240l(this.f23084d.m5373o() != 4);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: n */
    public final void mo3780n() {
        synchronized (this.f23085e) {
            this.f23098r = new jvb();
            this.f23094n.m8602b(this, ikw.VIDEO_INTENT, this.f23098r);
            this.f23092l.addListener(this.f23095o);
            this.f23084d.m5367h();
            this.f23083c.m5230b(this);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // p000.cre
    /* JADX INFO: renamed from: o */
    public final void mo5273o(fta ftaVar) {
        synchronized (this.f23085e) {
            if (ftaVar.f23538d.isEmpty()) {
                jvh.m13554b().execute(new fnx(this, 5));
            } else {
                ctj ctjVar = (ctj) ftaVar.f23538d.get(0);
                csn csnVar = this.f23089i;
                if (csnVar == null) {
                    ((nbe) ((nbe) f23082b.m17251b()).mo17276G(2460)).mo17290o("Session config is null.");
                    this.f23097q.mo6357e(ctjVar.f9469t.f26876b);
                    return;
                }
                mrm mrmVar = csnVar.f9344i;
                this.f23087g = mrmVar;
                if (mrmVar.mo16813g()) {
                    this.f23097q.mo6361i(ctjVar.f9469t.f26876b);
                } else {
                    mrm mrmVarM16829i = mrm.m16829i(((gyj) ctjVar.f9450a.mo5499c().mo16809c()).f26832a.mo14682b());
                    this.f23087g = mrmVarM16829i;
                    ((Uri) mrmVarM16829i.mo16809c()).getPath();
                    this.f23093m.m5620d(ctjVar);
                }
                cqm cqmVar = this.f23084d;
                Object obj = ftaVar.f23537c;
                obj.getClass();
                cqmVar.f8953h.mo5254b((Bitmap) obj);
                this.f23084d.m5369j(true);
            }
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: p */
    public final void mo3781p() {
        synchronized (this.f23085e) {
            this.f23084d.m5368i();
            this.f23083c.m5241m();
            this.f23098r.close();
            this.f23083c.m5239k(this);
            this.f23092l.removeListener(this.f23095o);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: t */
    public final boolean mo3785t() {
        if (this.f23084d.m5373o() != 4) {
            return this.f23083c.m5243o();
        }
        m8664x();
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m8663w() {
        if (this.f23087g.mo16813g()) {
            this.f23096p.execute(new ewo(this, (Uri) this.f23087g.mo16809c(), 20));
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m8664x() {
        m8663w();
        this.f23084d.f8953h.mo5253a();
        jvh.m13554b().execute(new cmd(this.f23084d, 19));
        this.f23083c.m5246r(2);
    }
}

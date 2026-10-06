package p000;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hdk implements hen, hco, fbn, fbj, fbl, fbg {

    /* JADX INFO: renamed from: a */
    public static final nbh f27320a = nbh.m17259h("com/google/android/apps/camera/smarts/SmartsControllerImpl");

    /* JADX INFO: renamed from: A */
    public int f27321A;

    /* JADX INFO: renamed from: C */
    public final htb f27323C;

    /* JADX INFO: renamed from: D */
    private final hdt f27324D;

    /* JADX INFO: renamed from: b */
    public final jvd f27326b;

    /* JADX INFO: renamed from: c */
    public final Handler f27327c;

    /* JADX INFO: renamed from: d */
    public final gye f27328d;

    /* JADX INFO: renamed from: e */
    public final ccs f27329e;

    /* JADX INFO: renamed from: f */
    public final jww f27330f;

    /* JADX INFO: renamed from: g */
    public final jwn f27331g;

    /* JADX INFO: renamed from: h */
    public final jww f27332h;

    /* JADX INFO: renamed from: j */
    public final kbz f27334j;

    /* JADX INFO: renamed from: k */
    public final hec f27335k;

    /* JADX INFO: renamed from: q */
    public kmd f27341q;

    /* JADX INFO: renamed from: w */
    public View f27347w;

    /* JADX INFO: renamed from: x */
    public View f27348x;

    /* JADX INFO: renamed from: y */
    public ggm f27349y;

    /* JADX INFO: renamed from: z */
    public int f27350z;

    /* JADX INFO: renamed from: n */
    public final nqf f27338n = nqf.m17621g();

    /* JADX INFO: renamed from: i */
    public final Map f27333i = new HashMap();

    /* JADX INFO: renamed from: o */
    public ikw f27339o = ikw.UNINITIALIZED;

    /* JADX INFO: renamed from: p */
    public kmq f27340p = kmq.BACK;

    /* JADX INFO: renamed from: r */
    public boolean f27342r = false;

    /* JADX INFO: renamed from: s */
    public int f27343s = 0;

    /* JADX INFO: renamed from: E */
    private boolean f27325E = false;

    /* JADX INFO: renamed from: t */
    public boolean f27344t = false;

    /* JADX INFO: renamed from: u */
    public int f27345u = 0;

    /* JADX INFO: renamed from: v */
    public long f27346v = 0;

    /* JADX INFO: renamed from: B */
    public int f27322B = 0;

    /* JADX INFO: renamed from: l */
    public final Matrix f27336l = new Matrix();

    /* JADX INFO: renamed from: m */
    public final jvb f27337m = new jvb();

    public hdk(htb htbVar, hec hecVar, hdt hdtVar, jvd jvdVar, Handler handler, gye gyeVar, oju ojuVar, jww jwwVar, jww jwwVar2, jwn jwnVar, kbz kbzVar, byte[] bArr) {
        this.f27323C = htbVar;
        this.f27335k = hecVar;
        this.f27324D = hdtVar;
        this.f27326b = jvdVar;
        this.f27327c = handler;
        this.f27328d = gyeVar;
        this.f27329e = (ccs) ojuVar.get();
        this.f27330f = jwwVar;
        this.f27332h = jwwVar2;
        this.f27331g = jwnVar;
        this.f27334j = kbzVar;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m10120k(gzp gzpVar) {
        return !gzpVar.equals(gzp.OFF);
    }

    /* JADX INFO: renamed from: l */
    private static final RectF m10121l(View view) {
        Point pointM13568p = jvh.m13568p(view);
        return new RectF(pointM13568p.x, pointM13568p.y, pointM13568p.x + view.getWidth(), pointM13568p.y + view.getHeight());
    }

    @Override // p000.fbg
    /* JADX INFO: renamed from: bC */
    public final void mo3521bC() {
        lku.m15613H(!this.f27344t);
        m10122h(hdc.f27292a);
        this.f27337m.close();
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        this.f27344t = false;
        m10122h(hdc.f27293b);
        hec hecVar = this.f27335k;
        hecVar.f27430f.m13541c(new gxw(hecVar, 14));
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        this.f27334j.mo13961e("smartsProcessor#resume");
        m10122h(hdc.f27294c);
        this.f27334j.mo13962f();
        this.f27344t = true;
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        jvd.m13538a();
        if (this.f27325E) {
            return;
        }
        gxw gxwVar = new gxw(this, 6);
        this.f27329e.m3465b(gxwVar);
        this.f27337m.m13537d(new gto(this, gxwVar, 6));
        this.f27337m.m13537d(this.f27330f.mo3830a(new gmd(this, 15), this.f27326b));
        this.f27337m.m13537d(this.f27331g.mo3830a(new gmd(this, 16), this.f27326b));
        this.f27325E = true;
    }

    @Override // p000.hco
    /* JADX INFO: renamed from: e */
    public final void mo10113e(kmd kmdVar) {
        this.f27326b.m13541c(new gqn(this, kmdVar, 18));
    }

    @Override // p000.hco
    /* JADX INFO: renamed from: f */
    public final void mo10114f(kpp kppVar) {
        this.f27326b.m13541c(new gqn(this, kppVar, 17));
    }

    @Override // p000.hco
    /* JADX INFO: renamed from: g */
    public final void mo10115g(kiq kiqVar, kgg kggVar) {
        kfv.m14174w(kiqVar, new cts(this, kggVar, 5));
    }

    /* JADX INFO: renamed from: h */
    public final void m10122h(hdi hdiVar) {
        Iterator it = this.f27333i.values().iterator();
        while (it.hasNext()) {
            hdiVar.mo10117a((hdz) it.next());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m10123i() {
        jvd.m13538a();
        boolean z = this.f27343s > 0;
        if (this.f27342r != z) {
            this.f27342r = z;
            m10122h(new hdb(this, 6));
            if (!this.f27342r) {
                hdt hdtVar = this.f27324D;
                jvd.m13538a();
                hdtVar.f27385i = false;
            } else {
                hdt hdtVar2 = this.f27324D;
                jvd.m13538a();
                hdtVar2.m10128e();
                hdtVar2.f27385i = true;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10124j() {
        jvd.m13538a();
        int i = (this.f27349y.mo9216f().f35503e + 90) % 360;
        this.f27322B = i;
        int i2 = this.f27350z;
        int i3 = this.f27321A;
        int i4 = i % 180;
        int i5 = i4 != 0 ? i2 : i3;
        if (i4 != 0) {
            i2 = i3;
        }
        RectF rectFM10121l = m10121l(this.f27348x);
        RectF rectFM10121l2 = m10121l(this.f27347w);
        Matrix matrix = new Matrix();
        float f = i2;
        float f2 = i5;
        matrix.postScale(rectFM10121l.width() / f, rectFM10121l.height() / f2);
        matrix.postTranslate(rectFM10121l.left - rectFM10121l2.left, rectFM10121l.top - rectFM10121l2.top);
        this.f27336l.reset();
        this.f27336l.postTranslate(-rectFM10121l.left, -rectFM10121l.top);
        this.f27336l.postScale(f / rectFM10121l.width(), f2 / rectFM10121l.height());
    }
}

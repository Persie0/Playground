package p000;

import android.view.View;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ika implements ikg {

    /* JADX INFO: renamed from: A */
    private final BottomBarController f31272A;

    /* JADX INFO: renamed from: B */
    private final ohb f31273B;

    /* JADX INFO: renamed from: C */
    private final doe f31274C;

    /* JADX INFO: renamed from: D */
    private final nps f31275D;

    /* JADX INFO: renamed from: E */
    private final jvb f31276E;

    /* JADX INFO: renamed from: F */
    private final hyb f31277F;

    /* JADX INFO: renamed from: a */
    public final oju f31278a;

    /* JADX INFO: renamed from: b */
    public final jvd f31279b;

    /* JADX INFO: renamed from: c */
    public final mrm f31280c;

    /* JADX INFO: renamed from: d */
    public final ffq f31281d;

    /* JADX INFO: renamed from: e */
    public final jww f31282e;

    /* JADX INFO: renamed from: f */
    public final dqv f31283f;

    /* JADX INFO: renamed from: g */
    public final jwn f31284g;

    /* JADX INFO: renamed from: h */
    public final gfa f31285h;

    /* JADX INFO: renamed from: i */
    public final dbr f31286i;

    /* JADX INFO: renamed from: j */
    public final ohb f31287j;

    /* JADX INFO: renamed from: k */
    public final dhv f31288k;

    /* JADX INFO: renamed from: l */
    public final jwn f31289l;

    /* JADX INFO: renamed from: m */
    public final jwn f31290m;

    /* JADX INFO: renamed from: n */
    public final eby f31291n;

    /* JADX INFO: renamed from: o */
    public final hmw f31292o;

    /* JADX INFO: renamed from: p */
    public final hai f31293p;

    /* JADX INFO: renamed from: q */
    public final hah f31294q;

    /* JADX INFO: renamed from: r */
    public final jww f31295r;

    /* JADX INFO: renamed from: s */
    public final hsk f31296s;

    /* JADX INFO: renamed from: t */
    public final had f31297t;

    /* JADX INFO: renamed from: u */
    public final iuj f31298u;

    /* JADX INFO: renamed from: v */
    public final jww f31299v;

    /* JADX INFO: renamed from: w */
    public final jwn f31300w;

    /* JADX INFO: renamed from: x */
    public final fcp f31301x;

    /* JADX INFO: renamed from: y */
    public final cdu f31302y;

    /* JADX INFO: renamed from: z */
    public final jvh f31303z;

    public ika(oju ojuVar, cdu cduVar, jvd jvdVar, jww jwwVar, dqv dqvVar, jwn jwnVar, hyb hybVar, mrm mrmVar, ffq ffqVar, BottomBarController bottomBarController, gfa gfaVar, dbr dbrVar, ohb ohbVar, ohb ohbVar2, eby ebyVar, dhv dhvVar, doe doeVar, hai haiVar, hah hahVar, hmw hmwVar, jww jwwVar2, hsk hskVar, had hadVar, iuj iujVar, nps npsVar, jww jwwVar3, jwn jwnVar2, fcp fcpVar) {
        this.f31278a = ojuVar;
        this.f31302y = cduVar;
        this.f31276E = cduVar.m3529i();
        this.f31279b = jvdVar;
        this.f31277F = hybVar;
        this.f31280c = mrmVar;
        this.f31281d = ffqVar;
        this.f31283f = dqvVar;
        this.f31284g = jwnVar;
        this.f31282e = jwwVar;
        this.f31272A = bottomBarController;
        this.f31285h = gfaVar;
        this.f31286i = dbrVar;
        this.f31287j = ohbVar;
        this.f31273B = ohbVar2;
        this.f31288k = dhvVar;
        this.f31274C = doeVar;
        this.f31289l = hahVar.mo10029a(gzy.f27060s);
        this.f31290m = hahVar.mo10029a(gzy.f27061t);
        this.f31291n = ebyVar;
        this.f31292o = hmwVar;
        this.f31293p = haiVar;
        this.f31294q = hahVar;
        this.f31295r = jwwVar2;
        this.f31296s = hskVar;
        this.f31297t = hadVar;
        this.f31298u = iujVar;
        this.f31275D = npsVar;
        this.f31299v = jwwVar3;
        this.f31300w = jwnVar2;
        this.f31301x = fcpVar;
        this.f31303z = new ijw(gfaVar);
    }

    @Override // p000.ikg
    /* JADX INFO: renamed from: a */
    public final void mo6340a() {
        lku.m15613H(jvd.m13540d());
        this.f31285h.mo9139z(((iig) this.f31278a).get().f31071h, ((iig) this.f31278a).get().f31072i);
        int i = 2;
        this.f31285h.mo9121g(new hrj(this, 2));
        mrm mrmVarM5896e = this.f31286i.m5896e();
        if (mrmVarM5896e.mo16813g()) {
            this.f31285h.mo9111J((fvu) mrmVarM5896e.mo16809c());
        } else {
            this.f31274C.mo6457e(new doc("No " + this.f31286i.mo5895d().name() + " camera present", kcl.CAMERAS_NOT_ENUMERATED, this.f31286i.mo5895d()));
        }
        this.f31285h.mo9121g(new ijz(this));
        this.f31272A.addListener(new ijx(this));
        if (this.f31280c.mo16813g()) {
            this.f31276E.m13537d(this.f31294q.mo10029a(gzy.f27040ax).mo3830a(new ijp(this, 4), this.f31279b));
        }
        hyb hybVar = this.f31277F;
        idd iddVar = new idd(this, 9);
        idd iddVar2 = new idd(this, 10);
        synchronized (hybVar.f29893a) {
            hybVar.f29894b = iddVar;
            hybVar.f29895c = iddVar2;
        }
        if (this.f31288k.mo6184l(dhg.f11046a)) {
            this.f31276E.m13537d(this.f31282e.mo3830a(new ijp(this, i), this.f31279b));
            this.f31276E.m13537d(((igb) this.f31273B.get()).mo11233e(new ijy(this)));
        }
        ((iig) this.f31278a).get().f31066c.m4462c(this.f31285h);
        View view = (View) ((iig) this.f31278a).get().f31080q.m13100f(C0100R.id.uncovered_preview_layout);
        view.setFocusable(true);
        int i2 = 3;
        this.f31285h.mo9121g(new hrj(view, 3));
        if (this.f31288k.mo6184l(dib.f11351ce) && this.f31288k.mo6184l(dib.f11353cg) && ((Integer) this.f31288k.mo6173a(dib.f11228O).get()).intValue() == -1) {
            this.f31276E.m13537d(this.f31294q.mo10029a(gzy.f27028al).mo3830a(new ijp(this, i2), this.f31279b));
        }
        jvh.m13562j(this.f31275D, new gjd(this, 12), this.f31279b);
    }
}
